import com.batiaev.vk.api.VKApi;
import com.batiaev.vk.api.VKAuthorization;
import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.dataTypes.VKMessage;
import com.batiaev.vk.api.dataTypes.VKMessageList;
import com.batiaev.vk.api.dataTypes.VKUserList;
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
        VKAuthorization authorization = new VKAuthorization();
//        authorization.serverAuth();
        authorization.clientAuth();

        VKParameters parameters = new VKParameters();
        parameters.setValue("count", 20);
        parameters.setValue("user_id", "8475109");
        parameters.setValue("access_token", VKAuthorization.accessToken());
        VKMessageList messages = VKApi.messages().getHistory(parameters);
        LOG.info("Total count of messages: " + messages.totalCount);
        LOG.info("Count of unread messages: " + messages.upreadCount);
        HashMap<Integer, String> userCache = new HashMap<>();
        for (VKMessage message : messages) {
            if (!userCache.containsKey(message.user_id)) {
                VKParameters userParams = new VKParameters();
                userParams.setValue("user_id", message.user_id);
                userParams.setValue("fields", "first_name, last_name");
                VKUserList users = VKApi.users().get(userParams);

                userCache.put(message.user_id, users.get(0).fullName());
            }
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            LOG.info(userCache.get(message.user_id) + " " + dateFormat.format(message.date) + " " + message.body);
        }
    }
}
