package com.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.vk.api.VKParameters;
import com.vk.api.VKRequest;

/**
 * Builds requests for API.storage part
 * 
 * https://vk.com/dev/storage
 */
public class VKApiStorage extends VKApiBase {

    /**
     * https://vk.com/dev/storage.get
     *
     * This method doesn't require any specific rights.
     */
    public VKRequest get(VKParameters params) {
        return prepareRequest("get", params);
    }

    /**
     * https://vk.com/dev/storage.set
     *
     * This method doesn't require any specific rights. 
     */
    public VKRequest set(VKParameters params) {
        return prepareRequest("set", params);
    }

    /**
     * https://vk.com/dev/storage.getKeys
     *
     * This method doesn't require any specific rights. 
     */
    public VKRequest getKeys(VKParameters params) {
        return prepareRequest("getKeys", params);
    }
}
