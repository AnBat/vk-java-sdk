package com.vk.api.methods;

/**
 * Created by anton on 13/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;

/**
 * Builds requests for API.users part
 * 
 * https://vk.com/dev/users
 */
public class VKApiUsers extends VKApiBase {

    /**
     * https://vk.com/dev/users.get
     *
     * This is an open method; it does not require an access_token.
     *
     */
    public VKRequest get(VKParameters params) {
        return prepareRequest("get", params);
    }

    /**
     * https://vk.com/dev/users.search
     *
     * This method doesn't require any specific rights.
     *
     */
    public VKRequest search(VKParameters params) {
        return prepareRequest("search", params);
    }

    /**
     * https://vk.com/dev/users.isAppUser
     *
     * This method doesn't require any specific rights.
     */
    public VKRequest isAppUser(VKParameters params) {
        return prepareRequest("isAppUser", params);
    }

    /**
     * https://vk.com/dev/users.getSubscriptions
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest getSubscriptions(VKParameters params) {
        return prepareRequest("getSubscriptions", params);
    }

    /**
     * https://vk.com/dev/users.getFollowers
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest getFollowers(VKParameters params) {
        return prepareRequest("getFollowers", params);
    }

    /**
     * https://vk.com/dev/users.report
     * Created on 29.01.14.
     *
     * This method is available only to standalone-applications.
     */
    public VKRequest report(VKParameters params) {
        return prepareRequest("report", params);
    }

    /**
     * https://vk.com/dev/users.getNearby
     *
     * This method is available only to standalone-applications.
     */
    public VKRequest getNearby(VKParameters params) {
        return prepareRequest("getNearby", params);
    }
}
