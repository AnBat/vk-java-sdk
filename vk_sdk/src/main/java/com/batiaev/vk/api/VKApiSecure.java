/*
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk.api;

import com.batiaev.vk.common.VKParameters;

/**
 * Builds requests for API.secure part
 * <p>
 * https://vk.com/dev/secure
 *
 * @author batiaev
 * @since 15/04/15
 */
public class VKApiSecure extends VKApiBase {

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/secure.getAppBalance
     * <p>
     * This is a server method. It may only be called from your server.
     * This method doesn't require any specific rights.
     */
    public String getAppBalance(VKParameters params) {
        return execute(getUrl("getAppBalance", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/secure.getTransactionsHistory
     * <p>
     * This is a server method. It may only be called from your server.
     * This method doesn't require any specific rights.
     */
    public String getTransactionsHistory(VKParameters params) {
        return execute(getUrl("getTransactionsHistory", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/secure.getSMSHistory
     * <p>
     * This is a server method. It may only be called from your server.
     * This method doesn't require any specific rights.
     */
    public String getSMSHistory(VKParameters params) {
        return execute(getUrl("getSMSHistory", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/secure.sendSMSNotification
     * <p>
     * This is a server method. It may only be called from your server.
     * This method doesn't require any specific rights.
     */
    public String sendSMSNotification(VKParameters params) {
        return execute(getUrl("sendSMSNotification", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/secure.sendNotification
     * <p>
     * This is a server method. It may only be called from your server.
     * This method doesn't require any specific rights.
     */
    public String sendNotification(VKParameters params) {
        return execute(getUrl("sendNotification", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/secure.setCounter
     * <p>
     * This is a server method. It may only be called from your server.
     * This method doesn't require any specific rights.
     */
    public String setCounter(VKParameters params) {
        return execute(getUrl("setCounter", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/secure.setUserLevel
     * <p>
     * This is a server method. It may only be called from your server.
     * This method doesn't require any specific rights.
     */
    public String setUserLevel(VKParameters params) {
        return execute(getUrl("setUserLevel", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/secure.getUserLevel
     * <p>
     * This is a server method. It may only be called from your server.
     * This method doesn't require any specific rights.
     */
    public String getUserLevel(VKParameters params) {
        return execute(getUrl("getUserLevel", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/secure.checkToken
     * <p>
     * This is a server method. It may only be called from your server.
     * This method doesn't require any specific rights.
     */
    public String checkToken(VKParameters params) {
        return execute(getUrl("checkToken", params)).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "secure";
    }
}
