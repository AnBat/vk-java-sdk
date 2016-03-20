package com.batiaev.vk.api;

/**
 * Created by batiaev on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */

import com.batiaev.vk.common.VKParameters;

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
        return execute(getUrl("checkLink", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/utils.resolveScreenName">API utils.resolveScreenName()</a>
     *
     * This is an open method; it does not require an access_token.
     * @param params method parameters
     * @return String with json respond
     */
    public String resolveScreenName(VKParameters params) {
        return execute(getUrl("resolveScreenName", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/utils.getServerTime">API utils.getServerTime()</a>
     *
     * This is an open method; it does not require an access_token.
     * @param params method parameters
     * @return String with json respond
     */
    public String getServerTime(VKParameters params) {
        return execute(getUrl("getServerTime", params)).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "utils";
    }
}
