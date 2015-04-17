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
 * Builds requests for API.secure part
 * 
 * https://vk.com/dev/secure
 */
public class VKApiSecure extends VKApiBase {

    /**
     * https://vk.com/dev/secure.getAppBalance
     *
     * This is a server method. It may only be called from your server.
     * This method doesn't require any specific rights.
     */
    public VKRequest getAppBalance(VKParameters params) {
        return prepareRequest("getAppBalance", params);
    }

    /**
     * https://vk.com/dev/secure.getTransactionsHistory
     *
     * This is a server method. It may only be called from your server.
     * This method doesn't require any specific rights.
     */
    public VKRequest getTransactionsHistory(VKParameters params) {
        return prepareRequest("getTransactionsHistory", params);
    }

    /**
     * https://vk.com/dev/secure.getSMSHistory
     *
     * This is a server method. It may only be called from your server.
     * This method doesn't require any specific rights.
     */
    public VKRequest getSMSHistory(VKParameters params) {
        return prepareRequest("getSMSHistory", params);
    }

    /**
     * https://vk.com/dev/secure.sendSMSNotification
     *
     * This is a server method. It may only be called from your server.
     * This method doesn't require any specific rights.
     */
    public VKRequest sendSMSNotification(VKParameters params) {
        return prepareRequest("sendSMSNotification", params);
    }

    /**
     * https://vk.com/dev/secure.sendNotification
     *
     * This is a server method. It may only be called from your server.
     * This method doesn't require any specific rights.
     */
    public VKRequest sendNotification(VKParameters params) {
        return prepareRequest("sendNotification", params);
    }

    /**
     * https://vk.com/dev/secure.setCounter
     *
     * This is a server method. It may only be called from your server.
     * This method doesn't require any specific rights.
     */
    public VKRequest setCounter(VKParameters params) {
        return prepareRequest("setCounter", params);
    }

    /**
     * https://vk.com/dev/secure.setUserLevel
     *
     * This is a server method. It may only be called from your server.
     * This method doesn't require any specific rights.
     */
    public VKRequest setUserLevel(VKParameters params) {
        return prepareRequest("setUserLevel", params);
    }

    /**
     * https://vk.com/dev/secure.getUserLevel
     *
     * This is a server method. It may only be called from your server.
     * This method doesn't require any specific rights.
     */
    public VKRequest getUserLevel(VKParameters params) {
        return prepareRequest("getUserLevel", params);
    }

    /**
     * https://vk.com/dev/secure.checkToken
     *
     * This is a server method. It may only be called from your server.
     * This method doesn't require any specific rights.
     */
    public VKRequest checkToken(VKParameters params) {
        return prepareRequest("checkToken", params);
    }
}
