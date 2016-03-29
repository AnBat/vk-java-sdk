package com.batiaev.vk.sdk;

import com.batiaev.vk.common.VKApi;
import com.batiaev.vk.common.VKAuthorization;
import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.consts.VkApiMessagesParams;
import com.batiaev.vk.common.entity.VKMessage;
import com.batiaev.vk.common.entity.VKMessageList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author batiaev
 * Created by batiaev on 10/14/15.
 */
public class VkMessageCache {
    public static final long MAX_PACK_SIZE = 200;
    public static final long DEFAULT_WT = 2500;
    public static final String EXT = ".log";
    private long waitingTime;
    private String friendsCacheDir;
    private static final Logger LOG = LogManager.getLogger(VkMessageCache.class);

    public VkMessageCache() {
        waitingTime = DEFAULT_WT;
    }

    public long waitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(long waitingTime) {
        this.waitingTime = waitingTime;
    }

    public boolean cachingMassages(long userId) {
        friendsCacheDir = createFriendDir(String.valueOf(userId));
        //FIXME cleanup cache folder

        VKParameters parameters = VKParameters.create()
                .add(VkApiMessagesParams.COUNT, MAX_PACK_SIZE)
                .add(VkApiMessagesParams.USER_ID, userId);

        VKMessageList messages = VKApi.messages().getHistory(parameters);

        if (messages == null) return false;
        saveMessagesToFile(messages);

        long count = messages.totalCount();
        long loaded = MAX_PACK_SIZE;
        while (loaded < count) {
            parameters.setValue(VkApiMessagesParams.OFFSET, loaded);
            VKMessageList packNewMessages = VKApi.messages().getHistory(parameters);
            messages.addAll(packNewMessages);
            loaded += MAX_PACK_SIZE;
            LOG.info(String.format("Loaded %s from %s", loaded, count));
            try {
                Thread.sleep(waitingTime);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
                return false;
            }
            saveMessagesToFile(packNewMessages);
        }
        return true;
    }

    /**
     *
     * @param userId - id of friend
     * @return path to friend cache folder
     */
    private String createFriendDir(String userId) {
        String folder = VKApi.home() + VKAuthorization.userId() + File.separator + "friends" + File.separator + userId;
        File file = new File(folder);
        if (!file.exists()) {
            final boolean isCreated = file.mkdirs();
            if (isCreated) LOG.debug("Cannot create folder: " + folder);
        } else {
            LOG.debug("folder " + folder + " already exist!");
        }
        return folder;
    }

    /**
     * Saving list of massages to files rotating by date
     * @param messages contain current pack of messages for saving
     */
    private void saveMessagesToFile(VKMessageList messages) {

        if (messages == null || messages.isEmpty()) return;

        StringBuilder builder = new StringBuilder();
        String date = messages.get(0).getDate("yyyy-MM-dd");
        for (VKMessage msg : messages) {
            String msgDate = msg.getDate("yyyy-MM-dd");
            if (!date.equals(msgDate)) {
                writeToFile(date, builder.toString());
                builder = new StringBuilder();
                date = msgDate;
            }
            String msgText = msg.getDate("HH:mm:ss ") + (msg.isOut() ? ">" : "<") + "\t"
                    + msg.body().replace("\n","\\n") + System.lineSeparator();
            builder.append(msgText);
        }
    }

    private void writeToFile(String filename, String data) {
        writeToFile(filename, data, true);
    }

    private void writeToFile(String filename, String data, boolean append) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(friendsCacheDir + File.separator + filename + EXT, append);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (writer == null) return;
        try {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
