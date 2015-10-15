package com.batiaev.vk.api.methods;

/**
 * Created by batiaev on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */

import com.batiaev.vk.api.VKParameters;

/**
 * @author batiaev
 *
 * Builds requests for API.utils part
 *
 * <a href="https://vk.com/dev/utils">API utils</a>
 */
public class VKApiUtils extends VKApiBase {
	
    /**
     * <a href="https://vk.com/dev/utils.checkLink">API utils.checkLink()</a>
     *
     * This is an open method; it does not require an access_token.
     * @param params method parameters
     * @return String with json respond
     */
    public String checkLink(VKParameters params) {
        return prepareRequest("checkLink", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/utils.resolveScreenName">API utils.resolveScreenName()</a>
     *
     * This is an open method; it does not require an access_token.
     * @param params method parameters
     * @return String with json respond
     */
    public String resolveScreenName(VKParameters params) {
        return prepareRequest("resolveScreenName", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/utils.getServerTime">API utils.getServerTime()</a>
     *
     * This is an open method; it does not require an access_token.
     * @param params method parameters
     * @return String with json respond
     */
    public String getServerTime(VKParameters params) {
        return prepareRequest("getServerTime", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "utils";
    }
}
