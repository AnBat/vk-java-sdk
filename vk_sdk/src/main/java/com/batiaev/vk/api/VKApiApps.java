/*
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk.api;

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.annotation.Rights;
import com.batiaev.vk.common.consts.VKApiRigths;
import com.batiaev.vk.common.consts.VkApiMethods;

/**
 * Builds requests for API.apps part
 * <p>
 * <a href="https://vk.com/dev/apps">API apps</a>
 *
 * @author anbat
 * @since 17/04/15
 */
public class VKApiApps extends VKApiBase {

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/apps.getCatalog">API apps.getCatalog()</a>
     */
    @Rights(VKApiRigths.OPEN_METHOD)
    public String getCatalog(VKParameters params) {
        return execute(getUrl("getCatalog", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/apps.get">API apps.get()</a>
     */
    @Rights(VKApiRigths.OPEN_METHOD)
    public String get(VKParameters params) {
        return execute(getUrl(VkApiMethods.GET, params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/apps.sendRequest">API apps.sendRequest()</a>
     */
    @Rights(standAloneOnly = true)
    public String sendRequest(VKParameters params) {
        return execute(getUrl("sendRequest", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/apps.deleteAppRequests">API apps.deleteAppRequests()</a>
     */
    @Rights(standAloneOnly = true)
    public String deleteAppRequests(VKParameters params) {
        return execute(getUrl("deleteAppRequests", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/apps.getFriendsList">API apps.getFriendsList()</a>
     */
    @Rights(standAloneOnly = true)
    public String getFriendsList(VKParameters params) {
        return execute(getUrl("getFriendsList", params)).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "apps";
    }
}
