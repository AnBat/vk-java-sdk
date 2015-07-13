import com.batiaev.vk.api.VKApi;
import com.batiaev.vk.api.VKAuthorization;
import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.consts.VKApiConst;
import com.batiaev.vk.api.consts.VkApiMessagesParams;
import com.batiaev.vk.api.dataTypes.VKMessage;
import com.batiaev.vk.api.dataTypes.VKMessageList;
import com.batiaev.vk.api.dataTypes.VKUserList;
import com.batiaev.vk.sdk.VkLocalCache;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;

/**
 * Created by anton on 28/06/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */
public class Main {
    private static final Logger LOG = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws IOException {
        VkLocalCache.load();

        VKAuthorization authorization = new VKAuthorization();
//        authorization.serverAuth();
        authorization.clientAuth();

        VKParameters parameters = new VKParameters();
        parameters.setValue(VkApiMessagesParams.COUNT, 20);
        parameters.setValue(VkApiMessagesParams.USER_ID, "8475109");
        parameters.setValue(VKApiConst.ACCESS_TOKEN, VKAuthorization.accessToken());
        VKMessageList messages = VKApi.messages().getHistory(parameters);
        LOG.info("Total count of messages: " + messages.totalCount);
        LOG.info("Count of unread messages: " + messages.upreadCount);
        if (VkLocalCache.userCache == null)
            VkLocalCache.userCache = new HashMap<>();
        for (VKMessage message : messages) {
            if (!VkLocalCache.userCache.containsKey(message.user_id)) {
                VKParameters userParams = new VKParameters();
                userParams.setValue("user_id", message.user_id);
                userParams.setValue("fields", "first_name, last_name");
                VKUserList users = VKApi.users().get(userParams);

                VkLocalCache.userCache.put(message.user_id, users.get(0).fullName());
            }
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            LOG.info(VkLocalCache.userCache.get(message.user_id) + " " + dateFormat.format(message.date) + " " + message.body);
        }

        VkLocalCache.save();
    }
}
