package com.batyaev.vk.api;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batyaev.vk.api.methods.*;

/**
 * Common interface for VK API
 * 
 * https://vk.com/dev/openapi
 */
public class VKApi extends VKApiBase {

    /**
	 * https://vk.com/dev/auth
     */
    public VKApiBase auth(VKParameters params) {
        return new VKApiAuth();
    }

    @Override
    protected String getMethodsGroup() {
        return "api";
    }
}
