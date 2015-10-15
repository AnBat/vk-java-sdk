package com.batiaev.vk.api.methods;

/**
 * Created by batiaev on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */

import com.batiaev.vk.api.VKParameters;

/**
 * @author batiaev
 *
 * Builds requests for API.storage part
 *
 * <a href="https://vk.com/dev/storage">API storage</a>
 */
public class VKApiStorage extends VKApiBase {

    /**
     * <a href="https://vk.com/dev/storage.get">API storage.get()</a>
     *
     * This method doesn't require any specific rights.
     * @param params method parameters
     * @return String with json respond
     */
    public String get(VKParameters params) {
        return prepareRequest("get", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/storage.set">API storage.set()</a>
     *
     * This method doesn't require any specific rights.
     * @param params method parameters
     * @return String with json respond
     */
    public String set(VKParameters params) {
        return prepareRequest("set", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/storage.getKeys">API storage.getKeys()</a>
     *
     * This method doesn't require any specific rights.
     * @param params method parameters
     * @return String with json respond
     */
    public String getKeys(VKParameters params) {
        return prepareRequest("getKeys", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "storage";
    }
}
