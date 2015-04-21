package com.batyaev.vk.api.methods;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batyaev.vk.annotation.Rights;
import com.batyaev.vk.api.VKParameters;
import com.batyaev.vk.api.VKRequest;
import com.batyaev.vk.api.consts.VKApiRigths;

/**
 * Builds requests for API.apps part
 * 
 * https://vk.com/dev/apps
 */
public class VKApiApps extends VKApiBase {
	
    /**
	 * @link https://vk.com/dev/apps.getCatalog
     */
    @Rights(VKApiRigths.OPEN_METHOD)
    public VKRequest getCatalog(VKParameters params) {
        return prepareRequest("getCatalog", params);
    }

    /**
     * @link https://vk.com/dev/apps.get
     */
    @Rights(VKApiRigths.OPEN_METHOD)
    public VKRequest get(VKParameters params) {
        return prepareRequest("get", params);
    }
    
    /**
	 * @link https://vk.com/dev/apps.sendRequest
     */
    @Rights(standAloneOnly = true)
    public VKRequest sendRequest(VKParameters params) {
        return prepareRequest("sendRequest", params);
    }

    /**
     * @link https://vk.com/dev/apps.deleteAppRequests
     */
    @Rights(standAloneOnly = true)
    public VKRequest deleteAppRequests(VKParameters params) {
        return prepareRequest("deleteAppRequests", params);
    }

    /**
     * @link https://vk.com/dev/apps.getFriendsList
     */
    @Rights(standAloneOnly = true)
    public VKRequest getFriendsList(VKParameters params) {
        return prepareRequest("getFriendsList", params);
    }

    @Override
    protected String getMethodsGroup() {
        return "apps";
    }
}
