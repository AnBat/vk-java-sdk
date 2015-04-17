package com.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.vk.api.VKParameters;
import com.vk.api.VKRequest;

/**
 * Builds requests for API.auth part
 * 
 * https://vk.com/dev/auth
 */
public class VKApiAuth extends VKApiBase {

    /**
     * https://vk.com/dev/auth.checkPhone
     *
     * This is an open method; it does not require an access_token. 
     */
    public VKRequest checkPhone(VKParameters params) {
        return prepareRequest("checkPhone", params);
    }

    /**
     * https://vk.com/dev/auth.signup
     *
     * This is an open method; it does not require an access_token. 
     */
    public VKRequest signup(VKParameters params) {
        return prepareRequest("signup", params);
    }

    /**
     * https://vk.com/dev/auth.confirm
     *
     * This is an open method; it does not require an access_token. 
     */
    public VKRequest confirm(VKParameters params) {
        return prepareRequest("confirm", params);
    }

    /**
     * https://vk.com/dev/auth.restore
     *
     * This method is only available for apps with Direct authorization access.
     * This is an open method; it does not require an access_token. 
     */
    public VKRequest restore(VKParameters params) {
        return prepareRequest("restore", params);
    }
}
