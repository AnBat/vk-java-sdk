import com.batiaev.vk.api.VKApi;
import com.batiaev.vk.api.VKAuthorization;
import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.consts.VkApiMessagesParams;
import com.batiaev.vk.api.dataTypes.VKMessage;
import com.batiaev.vk.api.dataTypes.VKMessageList;
import com.batiaev.vk.api.dataTypes.VKUserList;
import com.batiaev.vk.sdk.VkLocalCache;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.SimpleDateFormat;

/**
 * @author batiaev
 * Created by batiaev on 28/06/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */
public class TestApp {
    private static final Logger LOG = LogManager.getLogger(TestApp.class);

    public static void main(String[] args) {

        VKAuthorization.loadProperties();
        VkLocalCache.cachingFriends();
//        authorization.serverAuth();
//        authorization.clientAuth();

        LOG.error("Friends requests count: " + VKApi.friends().getRequests(new VKParameters()).size());

        VKParameters parameters = new VKParameters();
        parameters.setValue(VkApiMessagesParams.COUNT, 20);
        parameters.setValue(VkApiMessagesParams.USER_ID, "8475109");
        VKMessageList messages = VKApi.messages().getHistory(parameters);

        LOG.info("Total count of messages: " + messages.totalCount());
        LOG.info("Count of unread messages: " + messages.upreadCount());
        for (VKMessage message : messages) {
            int userId = message.userId();
            if (!VkLocalCache.hasUser(userId)) {
                VKParameters userParams = new VKParameters();
                userParams.setValue("userId", userId);
                userParams.setValue("fields", "first_name, last_name");
                VKUserList users = VKApi.users().get(userParams);

                VkLocalCache.setUser(userId, users.get(0).fullName());
            }
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            LOG.info(VkLocalCache.getUser(userId) + " " + dateFormat.format(message.getDate()) + " " + message.body());
        }
    }
}
