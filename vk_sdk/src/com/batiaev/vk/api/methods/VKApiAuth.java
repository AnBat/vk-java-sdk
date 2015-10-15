package com.batiaev.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKParameters;

/**
 * Builds requests for API.auth part
 * 
 * https://vk.com/dev/auth
 */
public class VKApiAuth extends VKApiBase {

    /**
     * <a href="https://vk.com/dev/auth.checkPhone">API auth.checkPhone()</a>
     *
     * This is an open method; it does not require an access_token.
     * @param params method parameters
     * @return String with json respond
     */
    public String checkPhone(VKParameters params) {
        return prepareRequest("checkPhone", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/auth.signup">API auth.signup()</a>
     *
     * This is an open method; it does not require an access_token.
     * @param params method parameters
     * @return String with json respond
     */
    public String signup(VKParameters params) {
        return prepareRequest("signup", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/auth.confirm">API auth.confirm()</a>
     *
     * This is an open method; it does not require an access_token.
     * @param params method parameters
     * @return String with json respond
     */
    public String confirm(VKParameters params) {
        return prepareRequest("confirm", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/auth.restore">API auth.restore()</a>
     *
     * This method is only available for apps with Direct authorization access.
     * This is an open method; it does not require an access_token.
     * @param params method parameters
     * @return String with json respond
     */
    public String restore(VKParameters params) {
        return prepareRequest("restore", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "auth";
    }
}
