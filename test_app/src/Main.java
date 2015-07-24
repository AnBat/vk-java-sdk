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
 * @author batiaev
 * Created by batiaev on 28/06/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */
public class Main {
    private static final Logger LOG = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws IOException {

        VKAuthorization.loadProperties();
//        authorization.serverAuth();
//        authorization.clientAuth();

        LOG.error("Friends requests count: " + VKApi.friends().getRequests(new VKParameters()).size());

        VKParameters parameters = new VKParameters();
        parameters.setValue(VkApiMessagesParams.COUNT, 20);
        parameters.setValue(VkApiMessagesParams.USER_ID, "8475109");
        VKMessageList messages = VKApi.messages().getHistory(parameters);

        LOG.info("Total count of messages: " + messages.totalCount);
        LOG.info("Count of unread messages: " + messages.upreadCount);
        for (VKMessage message : messages) {
            if (!VkLocalCache.hasUser(message.user_id)) {
                VKParameters userParams = new VKParameters();
                userParams.setValue("user_id", message.user_id);
                userParams.setValue("fields", "first_name, last_name");
                VKUserList users = VKApi.users().get(userParams);

                VkLocalCache.setUser(message.user_id, users.get(0).fullName());
            }
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            LOG.info(VkLocalCache.getUser(message.user_id) + " " + dateFormat.format(message.date) + " " + message.body);
        }
    }
}
