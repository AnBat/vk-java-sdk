package com.batiaev.vk.api.methods;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKParameters;

/**
 * @author batiaev
 *
 * Builds requests for API.gifts part
 * 
 * https://vk.com/dev/gifts
 */
public class VKApiGifts extends VKApiBase {

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/gifts.get
     *
     * This method is available only to standalone-applications.
     */
    public String get(VKParameters params) {
        return prepareRequest("get", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "gifts";
    }
}
