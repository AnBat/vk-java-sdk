package com.batiaev.vk.api.methods;

import com.batiaev.vk.api.annotation.Rights;
import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.consts.VKApiRigths;

/**
 * @author bataev
 * Created by anton on 17/04/15.
 *
 * Builds requests for API.apps part
 *
 * @see <a href="https://vk.com/dev/apps">API apps</a>
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */
public class VKApiApps extends VKApiBase {
	
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/apps.getCatalog">API apps.getCatalog()</a>
     */
    @Rights(VKApiRigths.OPEN_METHOD)
    public String getCatalog(VKParameters params) {
        return prepareRequest("getCatalog", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/apps.get">API apps.get()</a>
     */
    @Rights(VKApiRigths.OPEN_METHOD)
    public String get(VKParameters params) {
        return prepareRequest("get", params).getRequest();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/apps.sendRequest">API apps.sendRequest()</a>
     */
    @Rights(standAloneOnly = true)
    public String sendRequest(VKParameters params) {
        return prepareRequest("sendRequest", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/apps.deleteAppRequests">API apps.deleteAppRequests()</a>
     */
    @Rights(standAloneOnly = true)
    public String deleteAppRequests(VKParameters params) {
        return prepareRequest("deleteAppRequests", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/apps.getFriendsList">API apps.getFriendsList()</a>
     */
    @Rights(standAloneOnly = true)
    public String getFriendsList(VKParameters params) {
        return prepareRequest("getFriendsList", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "apps";
    }
}
