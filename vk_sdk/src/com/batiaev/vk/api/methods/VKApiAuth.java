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
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/auth.checkPhone
     *
     * This is an open method; it does not require an access_token. 
     */
    public String checkPhone(VKParameters params) {
        return prepareRequest("checkPhone", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/auth.signup
     *
     * This is an open method; it does not require an access_token. 
     */
    public String signup(VKParameters params) {
        return prepareRequest("signup", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/auth.confirm
     *
     * This is an open method; it does not require an access_token. 
     */
    public String confirm(VKParameters params) {
        return prepareRequest("confirm", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/auth.restore
     *
     * This method is only available for apps with Direct authorization access.
     * This is an open method; it does not require an access_token. 
     */
    public String restore(VKParameters params) {
        return prepareRequest("restore", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "auth";
    }
}
