package com.batiaev.vk.api;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.common.annotation.Rights;
import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.consts.VKApiRigths;

/**
 * @author batiaev
 *
 * Builds requests for API.account part
 * 
 * https://vk.com/dev/account
 */
public class VKApiAccount extends VKApiBase {

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.getCounters">API account.getCounters()</a>
     */
    @Rights(VKApiRigths.NOTHING)
    public String getCounters(VKParameters params) {
        return execute("getCounters", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.setNameInMenu">API account.setNameInMenu()</a>
     */
    @Rights(VKApiRigths.NOTHING)
    public String setNameInMenu(VKParameters params) {
        return execute("setNameInMenu", params).toString();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.setOnline">API account.setOnline()</a>
     */
    @Rights(standAloneOnly = true)
    public String setOnline(VKParameters params) {
        return execute("setOnline", params).toString();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.setOffline">API account.setOffline()</a>
     */
    @Rights(standAloneOnly = true)
    public String setOffline(VKParameters params) {
        return execute("setOffline", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.lookupContacts">API account.lookupContacts()</a>
     */
    @Rights(value = VKApiRigths.FRIENDS, standAloneOnly = true)
    public String lookupContacts(VKParameters params) {
        return execute("lookupContacts", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.registerDevice">API account.registerDevice()</a>
     */
    @Rights(value = VKApiRigths.MESSAGES, standAloneOnly = true)
    public String registerDevice(VKParameters params) {
        return execute("registerDevice", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.unregisterDevice">API account.unregisterDevice()</a>
     */
    @Rights(value = VKApiRigths.MESSAGES, standAloneOnly = true)
    public String unregisterDevice(VKParameters params) {
        return execute("unregisterDevice", params).toString();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.setSilenceMode">API account.setSilenceMode()</a>
     */
    @Rights(value = VKApiRigths.MESSAGES, standAloneOnly = true)
    public String setSilenceMode(VKParameters params) {
        return execute("setSilenceMode", params).toString();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.getPushSettings">API account.getPushSettings()</a>
     */
    @Rights(value = VKApiRigths.MESSAGES, standAloneOnly = true)
    public String getPushSettings(VKParameters params) {
        return execute("getPushSettings", params).toString();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.getAppPermissions">API account.getAppPermissions()</a>
     */
    @Rights(VKApiRigths.NOTHING)
    public String getAppPermissions(VKParameters params) {
        return execute("getAppPermissions", params).toString();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.getActiveOffers">API account.getActiveOffers()</a>
     */
    @Rights(VKApiRigths.NOTHING)
    public String getActiveOffers(VKParameters params) {
        return execute("getActiveOffers", params).toString();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.banUser">API account.banUser()</a>
     */
    @Rights(standAloneOnly = true)
    public String banUser(VKParameters params) {
        return execute("banUser", params).toString();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.unbanUser">API account.unbanUser()</a>
     */
    @Rights(standAloneOnly = true)
    public String unbanUser(VKParameters params) {
        return execute("unbanUser", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.getBanned">API account.getBanned()</a>
     */
    @Rights(standAloneOnly = true)
    public String getBanned(VKParameters params) {
        return execute("getBanned", params).toString();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.getInfo">API account.getInfo()</a>
     */
    @Rights(standAloneOnly = true)
    public String getInfo(VKParameters params) {
        return execute("getInfo", params).toString();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.setInfo">API account.setInfo()</a>
     */
    @Rights(standAloneOnly = true)
    public String setInfo(VKParameters params) {
        return execute("setInfo", params).toString();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.changePassword">API account.changePassword()</a>
     */
    @Rights(standAloneOnly = true)
    public String changePassword(VKParameters params) {
        return execute("changePassword", params).toString();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.getProfileInfo">API account.getProfileInfo()</a>
     */
    @Rights(standAloneOnly = true)
    public String getProfileInfo(VKParameters params) {
        return execute("getProfileInfo", params).toString();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.saveProfileInfo">API account.saveProfileInfo()</a>
     */
    @Rights(standAloneOnly = true)
    public String saveProfileInfo(VKParameters params) {
        return execute("saveProfileInfo", params).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "account";
    }
}
