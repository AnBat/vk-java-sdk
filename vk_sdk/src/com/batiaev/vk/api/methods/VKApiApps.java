package com.batiaev.vk.api.methods;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.annotation.Rights;
import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.consts.VKApiRigths;

/**
 * @author bataev
 *
 * Builds requests for API.apps part
 * 
 * https://vk.com/dev/apps
 */
public class VKApiApps extends VKApiBase {
	
    /**
	 * @link https://vk.com/dev/apps.getCatalog
     */
    @Rights(VKApiRigths.OPEN_METHOD)
    public String getCatalog(VKParameters params) {
        return prepareRequest("getCatalog", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/apps.get
     */
    @Rights(VKApiRigths.OPEN_METHOD)
    public String get(VKParameters params) {
        return prepareRequest("get", params).getRequest();
    }
    
    /**
	 * @link https://vk.com/dev/apps.sendRequest
     */
    @Rights(standAloneOnly = true)
    public String sendRequest(VKParameters params) {
        return prepareRequest("sendRequest", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/apps.deleteAppRequests
     */
    @Rights(standAloneOnly = true)
    public String deleteAppRequests(VKParameters params) {
        return prepareRequest("deleteAppRequests", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/apps.getFriendsList
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
