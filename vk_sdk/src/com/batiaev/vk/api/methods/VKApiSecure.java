package com.batiaev.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKParameters;

/**
 * @author batiaev
 *
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
    public String getAppBalance(VKParameters params) {
        return prepareRequest("getAppBalance", params).getRequest();
    }

    /**
     * https://vk.com/dev/secure.getTransactionsHistory
     *
     * This is a server method. It may only be called from your server.
     * This method doesn't require any specific rights.
     */
    public String getTransactionsHistory(VKParameters params) {
        return prepareRequest("getTransactionsHistory", params).getRequest();
    }

    /**
     * https://vk.com/dev/secure.getSMSHistory
     *
     * This is a server method. It may only be called from your server.
     * This method doesn't require any specific rights.
     */
    public String getSMSHistory(VKParameters params) {
        return prepareRequest("getSMSHistory", params).getRequest();
    }

    /**
     * https://vk.com/dev/secure.sendSMSNotification
     *
     * This is a server method. It may only be called from your server.
     * This method doesn't require any specific rights.
     */
    public String sendSMSNotification(VKParameters params) {
        return prepareRequest("sendSMSNotification", params).getRequest();
    }

    /**
     * https://vk.com/dev/secure.sendNotification
     *
     * This is a server method. It may only be called from your server.
     * This method doesn't require any specific rights.
     */
    public String sendNotification(VKParameters params) {
        return prepareRequest("sendNotification", params).getRequest();
    }

    /**
     * https://vk.com/dev/secure.setCounter
     *
     * This is a server method. It may only be called from your server.
     * This method doesn't require any specific rights.
     */
    public String setCounter(VKParameters params) {
        return prepareRequest("setCounter", params).getRequest();
    }

    /**
     * https://vk.com/dev/secure.setUserLevel
     *
     * This is a server method. It may only be called from your server.
     * This method doesn't require any specific rights.
     */
    public String setUserLevel(VKParameters params) {
        return prepareRequest("setUserLevel", params).getRequest();
    }

    /**
     * https://vk.com/dev/secure.getUserLevel
     *
     * This is a server method. It may only be called from your server.
     * This method doesn't require any specific rights.
     */
    public String getUserLevel(VKParameters params) {
        return prepareRequest("getUserLevel", params).getRequest();
    }

    /**
     * https://vk.com/dev/secure.checkToken
     *
     * This is a server method. It may only be called from your server.
     * This method doesn't require any specific rights.
     */
    public String checkToken(VKParameters params) {
        return prepareRequest("checkToken", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "secure";
    }
}
