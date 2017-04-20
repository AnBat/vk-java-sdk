/*
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk.api;

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.consts.VkApiMethods;

/**
 * Builds requests for API.storage part
 * <p>
 * <a href="https://vk.com/dev/storage">API storage</a>
 *
 * @author batiaev
 * @since 15/04/15
 */
public class VKApiStorage extends VKApiBase {

    /**
     * <a href="https://vk.com/dev/storage.get">API storage.get()</a>
     * <p>
     * This method doesn't require any specific rights.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String get(VKParameters params) {
        return execute(getUrl(VkApiMethods.GET, params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/storage.set">API storage.set()</a>
     * <p>
     * This method doesn't require any specific rights.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String set(VKParameters params) {
        return execute(getUrl("set", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/storage.getKeys">API storage.getKeys()</a>
     * <p>
     * This method doesn't require any specific rights.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String getKeys(VKParameters params) {
        return execute(getUrl("getKeys", params)).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "storage";
    }
}
