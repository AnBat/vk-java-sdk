/*
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk.api;

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.annotation.Rights;
import com.batiaev.vk.common.consts.VKApiRigths;

/**
 * Builds requests for API.account part
 * <p>
 * https://vk.com/dev/account
 *
 * @author batiaev
 * @since 15/04/15
 */
public class VKApiAccount extends VKApiBase {

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.getCounters">API account.getCounters()</a>
     */
    @Rights(VKApiRigths.NOTHING)
    public String getCounters(VKParameters params) {
        return execute(getUrl("getCounters", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.setNameInMenu">API account.setNameInMenu()</a>
     */
    @Rights(VKApiRigths.NOTHING)
    public String setNameInMenu(VKParameters params) {
        return execute(getUrl("setNameInMenu", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.setOnline">API account.setOnline()</a>
     */
    @Rights(standAloneOnly = true)
    public String setOnline(VKParameters params) {
        return execute(getUrl("setOnline", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.setOffline">API account.setOffline()</a>
     */
    @Rights(standAloneOnly = true)
    public String setOffline(VKParameters params) {
        return execute(getUrl("setOffline", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.lookupContacts">API account.lookupContacts()</a>
     */
    @Rights(value = VKApiRigths.FRIENDS, standAloneOnly = true)
    public String lookupContacts(VKParameters params) {
        return execute(getUrl("lookupContacts", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.registerDevice">API account.registerDevice()</a>
     */
    @Rights(value = VKApiRigths.MESSAGES, standAloneOnly = true)
    public String registerDevice(VKParameters params) {
        return execute(getUrl("registerDevice", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.unregisterDevice">API account.unregisterDevice()</a>
     */
    @Rights(value = VKApiRigths.MESSAGES, standAloneOnly = true)
    public String unregisterDevice(VKParameters params) {
        return execute(getUrl("unregisterDevice", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.setSilenceMode">API account.setSilenceMode()</a>
     */
    @Rights(value = VKApiRigths.MESSAGES, standAloneOnly = true)
    public String setSilenceMode(VKParameters params) {
        return execute(getUrl("setSilenceMode", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.getPushSettings">API account.getPushSettings()</a>
     */
    @Rights(value = VKApiRigths.MESSAGES, standAloneOnly = true)
    public String getPushSettings(VKParameters params) {
        return execute(getUrl("getPushSettings", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.getAppPermissions">API account.getAppPermissions()</a>
     */
    @Rights(VKApiRigths.NOTHING)
    public String getAppPermissions(VKParameters params) {
        return execute(getUrl("getAppPermissions", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.getActiveOffers">API account.getActiveOffers()</a>
     */
    @Rights(VKApiRigths.NOTHING)
    public String getActiveOffers(VKParameters params) {
        return execute(getUrl("getActiveOffers", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.banUser">API account.banUser()</a>
     */
    @Rights(standAloneOnly = true)
    public String banUser(VKParameters params) {
        return execute(getUrl("banUser", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.unbanUser">API account.unbanUser()</a>
     */
    @Rights(standAloneOnly = true)
    public String unbanUser(VKParameters params) {
        return execute(getUrl("unbanUser", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.getBanned">API account.getBanned()</a>
     */
    @Rights(standAloneOnly = true)
    public String getBanned(VKParameters params) {
        return execute(getUrl("getBanned", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.getInfo">API account.getInfo()</a>
     */
    @Rights(standAloneOnly = true)
    public String getInfo(VKParameters params) {
        return execute(getUrl("getInfo", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.setInfo">API account.setInfo()</a>
     */
    @Rights(standAloneOnly = true)
    public String setInfo(VKParameters params) {
        return execute(getUrl("setInfo", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.changePassword">API account.changePassword()</a>
     */
    @Rights(standAloneOnly = true)
    public String changePassword(VKParameters params) {
        return execute(getUrl("changePassword", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.getProfileInfo">API account.getProfileInfo()</a>
     */
    @Rights(standAloneOnly = true)
    public String getProfileInfo(VKParameters params) {
        return execute(getUrl("getProfileInfo", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.saveProfileInfo">API account.saveProfileInfo()</a>
     */
    @Rights(standAloneOnly = true)
    public String saveProfileInfo(VKParameters params) {
        return execute(getUrl("saveProfileInfo", params)).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "account";
    }
}
