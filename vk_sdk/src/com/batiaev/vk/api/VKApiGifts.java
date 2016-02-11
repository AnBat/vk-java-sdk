package com.batiaev.vk.api;

/**
 * Created by batiaev on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.annotation.Rights;

/**
 * @author batiaev
 *
 * Builds requests for API.gifts part
 *
 * @see <a href="https://vk.com/dev/gifts">API gifts</a>
 */
public class VKApiGifts extends VKApiBase {

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/gifts.get">API gifts.get()</a>
     */
    @Rights(standAloneOnly = true)
    public String get(VKParameters params) {
        return execute("get", params).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "gifts";
    }
}
