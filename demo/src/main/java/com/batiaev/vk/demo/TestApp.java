/**
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */

package com.batiaev.vk.demo;

import com.batiaev.vk.common.VKApi;
import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.consts.VkApiMessagesParams;
import com.batiaev.vk.common.entity.VKMessage;
import com.batiaev.vk.common.entity.VKMessageList;
import com.batiaev.vk.common.entity.VKUserList;
import com.batiaev.vk.sdk.VkLocalCache;
import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;

/**
 * @author batiaev
 * @since 28/06/15
 */
@Slf4j
public class TestApp {

    public static void main(String[] args) {

        VkLocalCache.cachingFriends();
//        authorization.serverAuth();
//        authorization.clientAuth();

        log.error("Friends requests count: " + VKApi.friends().getRequests(new VKParameters()).size());

        VKParameters parameters = VKParameters.create()
                .add(VkApiMessagesParams.COUNT, 20)
                .add(VkApiMessagesParams.USER_ID, "8475109");
        VKMessageList messages = VKApi.messages().getHistory(parameters);

        log.info("Total count of messages: " + messages.totalCount());
        log.info("Count of unread messages: " + messages.upreadCount());
        for (VKMessage message : messages) {
            long userId = message.userId();
            if (!VkLocalCache.hasUser(userId)) {
                VKParameters userParams = VKParameters.create()
                        .add("user_id", userId)
                        .add("fields", "first_name, last_name");
                VKUserList users = VKApi.users().get(userParams);

                VkLocalCache.setUser(userId, users.get(0).fullName());
            }
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            log.info(VkLocalCache.getUser(userId) + " " + dateFormat.format(message.getDate()) + " " + message.body());
        }
    }
}
