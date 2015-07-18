package com.batiaev.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.annotation.Rights;
import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.consts.VKApiRigths;

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
        return prepareRequest("getCounters", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.setNameInMenu">API account.setNameInMenu()</a>
     */
    @Rights(VKApiRigths.NOTHING)
    public String setNameInMenu(VKParameters params) {
        return prepareRequest("setNameInMenu", params).getRequest();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.setOnline">API account.setOnline()</a>
     */
    @Rights(standAloneOnly = true)
    public String setOnline(VKParameters params) {
        return prepareRequest("setOnline", params).getRequest();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.setOffline">API account.setOffline()</a>
     */
    @Rights(standAloneOnly = true)
    public String setOffline(VKParameters params) {
        return prepareRequest("setOffline", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.lookupContacts">API account.lookupContacts()</a>
     */
    @Rights(value = VKApiRigths.FRIENDS, standAloneOnly = true)
    public String lookupContacts(VKParameters params) {
        return prepareRequest("lookupContacts", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.registerDevice">API account.registerDevice()</a>
     */
    @Rights(value = VKApiRigths.MESSAGES, standAloneOnly = true)
    public String registerDevice(VKParameters params) {
        return prepareRequest("registerDevice", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.unregisterDevice">API account.unregisterDevice()</a>
     */
    @Rights(value = VKApiRigths.MESSAGES, standAloneOnly = true)
    public String unregisterDevice(VKParameters params) {
        return prepareRequest("unregisterDevice", params).getRequest();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.setSilenceMode">API account.setSilenceMode()</a>
     */
    @Rights(value = VKApiRigths.MESSAGES, standAloneOnly = true)
    public String setSilenceMode(VKParameters params) {
        return prepareRequest("setSilenceMode", params).getRequest();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.getPushSettings">API account.getPushSettings()</a>
     */
    @Rights(value = VKApiRigths.MESSAGES, standAloneOnly = true)
    public String getPushSettings(VKParameters params) {
        return prepareRequest("getPushSettings", params).getRequest();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.getAppPermissions">API account.getAppPermissions()</a>
     */
    @Rights(VKApiRigths.NOTHING)
    public String getAppPermissions(VKParameters params) {
        return prepareRequest("getAppPermissions", params).getRequest();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.getActiveOffers">API account.getActiveOffers()</a>
     */
    @Rights(VKApiRigths.NOTHING)
    public String getActiveOffers(VKParameters params) {
        return prepareRequest("getActiveOffers", params).getRequest();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.banUser">API account.banUser()</a>
     */
    @Rights(standAloneOnly = true)
    public String banUser(VKParameters params) {
        return prepareRequest("banUser", params).getRequest();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.unbanUser">API account.unbanUser()</a>
     */
    @Rights(standAloneOnly = true)
    public String unbanUser(VKParameters params) {
        return prepareRequest("unbanUser", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.getBanned">API account.getBanned()</a>
     */
    @Rights(standAloneOnly = true)
    public String getBanned(VKParameters params) {
        return prepareRequest("getBanned", params).getRequest();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.getInfo">API account.getInfo()</a>
     */
    @Rights(standAloneOnly = true)
    public String getInfo(VKParameters params) {
        return prepareRequest("getInfo", params).getRequest();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.setInfo">API account.setInfo()</a>
     */
    @Rights(standAloneOnly = true)
    public String setInfo(VKParameters params) {
        return prepareRequest("setInfo", params).getRequest();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.changePassword">API account.changePassword()</a>
     */
    @Rights(standAloneOnly = true)
    public String changePassword(VKParameters params) {
        return prepareRequest("changePassword", params).getRequest();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.getProfileInfo">API account.getProfileInfo()</a>
     */
    @Rights(standAloneOnly = true)
    public String getProfileInfo(VKParameters params) {
        return prepareRequest("getProfileInfo", params).getRequest();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/account.saveProfileInfo">API account.saveProfileInfo()</a>
     */
    @Rights(standAloneOnly = true)
    public String saveProfileInfo(VKParameters params) {
        return prepareRequest("saveProfileInfo", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "account";
    }
}
