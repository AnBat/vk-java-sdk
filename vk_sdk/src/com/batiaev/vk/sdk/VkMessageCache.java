package com.batiaev.vk.sdk;

import com.batiaev.vk.api.VKApi;
import com.batiaev.vk.api.VKAuthorization;
import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.consts.VkApiMessagesParams;
import com.batiaev.vk.api.dataTypes.VKMessageList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author batiaev
 * Created by batiaev on 10/14/15.
 */
public class VkMessageCache {
    private static final Logger LOG = LogManager.getLogger(VkMessageCache.class);

    public void cachingMassages(long userId) {
        VKAuthorization.loadProperties();
        long packSize = 200;
        VKParameters parameters = new VKParameters();
        parameters.setValue(VkApiMessagesParams.COUNT, packSize);
        parameters.setValue(VkApiMessagesParams.USER_ID, userId);
        VKMessageList messages = VKApi.messages().getHistory(parameters);

        long count = messages.totalCount();
        long loaded = packSize;
        while (loaded < count) {
            parameters.setValue(VkApiMessagesParams.OFFSET, loaded);
//            messages.addAll(VKApi.messages().getHistory(parameters));
            loaded += packSize;
            LOG.info(String.format("Loaded %s from %s", loaded, count));
        }
    }
}
