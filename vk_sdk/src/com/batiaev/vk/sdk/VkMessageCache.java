package com.batiaev.vk.sdk;

import com.batiaev.vk.api.VKApi;
import com.batiaev.vk.api.VKAuthorization;
import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.consts.VkApiMessagesParams;
import com.batiaev.vk.api.dataTypes.VKMessageList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TimerTask;

/**
 * @author batiaev
 * Created by batiaev on 10/14/15.
 */
public class VkMessageCache {
    private long waitingTime;
    private String fileName;
    private static final Logger LOG = LogManager.getLogger(VkMessageCache.class);

    public VkMessageCache() {
        waitingTime = 3000;
    }

    public long waitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(long waitingTime) {
        this.waitingTime = waitingTime;
    }

    public boolean cachingMassages(long userId) {

        VKAuthorization.loadProperties();

        fileName = VKApi.home() + VKAuthorization.userId() + File.separator + "messages";

        File file = new File(fileName);
        if (!file.exists()) file.mkdirs();
        fileName += File.separator + String.valueOf(userId) + ".msg";
        file = new File(fileName);
        if (file.exists()) file.delete();

        long packSize = 200;
        VKParameters parameters = new VKParameters();
        parameters.setValue(VkApiMessagesParams.COUNT, packSize);
        parameters.setValue(VkApiMessagesParams.USER_ID, userId);

        VKMessageList messages = VKApi.messages().getHistory(parameters);

        if (messages == null) return false;
        writeToFile(messages.plainText());

        long count = messages.totalCount();
        long loaded = packSize;
        while (loaded < count) {
            parameters.setValue(VkApiMessagesParams.OFFSET, loaded);
            VKMessageList packNewMessages = VKApi.messages().getHistory(parameters);
            messages.addAll(packNewMessages);
            loaded += packSize;
            LOG.info(String.format("Loaded %s from %s", loaded, count));
            try {
                Thread.sleep(waitingTime);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
                return false;
            }
            writeToFile(packNewMessages.plainText());
        }
        return true;
    }

    private void writeToFile(String data) {
        writeToFile(data, true);
    }

    private void writeToFile(String data, boolean append) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(fileName, append);
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
