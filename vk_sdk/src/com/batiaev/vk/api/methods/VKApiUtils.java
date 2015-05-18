package com.batiaev.vk.api.methods;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.VKRequest;

/**
 * Builds requests for API.utils part
 * 
 * https://vk.com/dev/utils
 */
public class VKApiUtils extends VKApiBase {
	
    /**
	 * https://vk.com/dev/utils.checkLink
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest checkLink(VKParameters params) {
        return prepareRequest("checkLink", params);
    }
    
    /**
	 * https://vk.com/dev/utils.resolveScreenName
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest resolveScreenName(VKParameters params) {
        return prepareRequest("resolveScreenName", params);
    }

    /**
     * https://vk.com/dev/utils.getServerTime
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest getServerTime(VKParameters params) {
        return prepareRequest("getServerTime", params);
    }

    @Override
    protected String getMethodsGroup() {
        return "utils";
    }
}
