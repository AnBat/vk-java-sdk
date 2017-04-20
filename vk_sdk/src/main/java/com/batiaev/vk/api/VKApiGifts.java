/*
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk.api;

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.annotation.Rights;
import com.batiaev.vk.common.consts.VkApiMethods;

/**
 * Builds requests for API.gifts part
 *
 * @author batiaev
 * @see <a href="https://vk.com/dev/gifts">API gifts</a>
 * @since 17/04/15
 */
public class VKApiGifts extends VKApiBase {

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/gifts.get">API gifts.get()</a>
     */
    @Rights(standAloneOnly = true)
    public String get(VKParameters params) {
        return execute(getUrl(VkApiMethods.GET, params)).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "gifts";
    }
}
