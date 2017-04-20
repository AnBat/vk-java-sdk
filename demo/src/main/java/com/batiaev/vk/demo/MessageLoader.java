package com.batiaev.vk.demo;

import com.batiaev.vk.common.VKApi;
import com.batiaev.vk.common.VKAuthorization;
import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.entity.VKUserList;
import com.batiaev.vk.sdk.VkMessageCache;
import lombok.extern.slf4j.Slf4j;

import java.util.TimerTask;

/**
 * @author batiaev
 * @since 10/14/15
 */
@Slf4j
public class MessageLoader extends TimerTask {
    private VKUserList friends;
    private VkMessageCache messageCache;

    public static void main(String[] args) {

        VkMessageCache messageCache = new VkMessageCache();
        boolean result = messageCache.cachingMassages(62311368);
        if (result) log.info("Caching messages is finished");
//
//        com.batiaev.vk.demo.MessageLoader loader = new com.batiaev.vk.demo.MessageLoader();
//        loader.run();
    }

    public void run() {
        VKParameters params = VKParameters.create()
                .add("user_id", VKAuthorization.userId())
                .add("order", "hints")
                .add("fields", "uid");
        friends = VKApi.friends().get(params);
        messageCache = new VkMessageCache();

        friends.forEach(friend -> {
            log.info(String.format("Load messages for %s", friend.fullName()));
            messageCache.cachingMassages(friend.userId());
        });
    }
}
