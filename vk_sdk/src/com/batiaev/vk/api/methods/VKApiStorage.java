package com.batiaev.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKParameters;

/**
 * @author batiaev
 *
 * Builds requests for API.storage part
 * 
 * https://vk.com/dev/storage
 */
public class VKApiStorage extends VKApiBase {

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/storage.get
     *
     * This method doesn't require any specific rights.
     */
    public String get(VKParameters params) {
        return prepareRequest("get", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/storage.set
     *
     * This method doesn't require any specific rights. 
     */
    public String set(VKParameters params) {
        return prepareRequest("set", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/storage.getKeys
     *
     * This method doesn't require any specific rights. 
     */
    public String getKeys(VKParameters params) {
        return prepareRequest("getKeys", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "storage";
    }
}
