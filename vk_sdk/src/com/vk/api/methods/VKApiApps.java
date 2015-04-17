package com.vk.api.methods;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;

/**
 * Builds requests for API.apps part
 * 
 * https://vk.com/dev/apps
 */
public class VKApiApps extends VKApiBase {
	
    /**
	 * https://vk.com/dev/apps.getCatalog
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest getCatalog(VKParameters params) {
        return prepareRequest("getCatalog", params);
    }

    /**
     * https://vk.com/dev/apps.get
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest get(VKParameters params) {
        return prepareRequest("get", params);
    }
    
    /**
	 * https://vk.com/dev/apps.sendRequest
     *
     * This method is available only to standalone-applications.
     */
    public VKRequest sendRequest(VKParameters params) {
        return prepareRequest("sendRequest", params);
    }

    /**
     * https://vk.com/dev/apps.deleteAppRequests
     *
     * This method is available only to standalone-applications.
     */
    public VKRequest deleteAppRequests(VKParameters params) {
        return prepareRequest("deleteAppRequests", params);
    }

    /**
     * https://vk.com/dev/apps.getFriendsList
     *
     * This method is available only to standalone-applications.
     */
    public VKRequest getFriendsList(VKParameters params) {
        return prepareRequest("getFriendsList", params);
    }
}
