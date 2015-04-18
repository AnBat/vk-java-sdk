package com.batyaev.vk.api.methods;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batyaev.vk.api.VKParameters;
import com.batyaev.vk.api.VKRequest;

/**
 * Builds requests for API.gifts part
 * 
 * https://vk.com/dev/gifts
 */
public class VKApiGifts extends VKApiBase {

    /**
     * https://vk.com/dev/gifts.get
     *
     * This method is available only to standalone-applications.
     */
    public VKRequest get(VKParameters params) {
        return prepareRequest("get", params);
    }

    @Override
    protected String getMethodsGroup() {
        return "gifts";
    }
}
