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
     * @link https://vk.com/dev/account.getCounters
     */
    @Rights(VKApiRigths.NOTHING)
    public String getCounters(VKParameters params) {
        return prepareRequest("getCounters", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/account.setNameInMenu
     */
    @Rights(VKApiRigths.NOTHING)
    public String setNameInMenu(VKParameters params) {
        return prepareRequest("setNameInMenu", params).getRequest();
    }
    
    /**
     * @link https://vk.com/dev/account.setOnline
     */
    @Rights(standAloneOnly = true)
    public String setOnline(VKParameters params) {
        return prepareRequest("setOnline", params).getRequest();
    }
    
    /**
     * @link https://vk.com/dev/account.setOffline
     */
    @Rights(standAloneOnly = true)
    public String setOffline(VKParameters params) {
        return prepareRequest("setOffline", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/account.lookupContacts
     */
    @Rights(value = VKApiRigths.FRIENDS, standAloneOnly = true)
    public String lookupContacts(VKParameters params) {
        return prepareRequest("lookupContacts", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/account.registerDevice
     */
    @Rights(value = VKApiRigths.MESSAGES, standAloneOnly = true)
    public String registerDevice(VKParameters params) {
        return prepareRequest("registerDevice", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/account.unregisterDevice
     */
    @Rights(value = VKApiRigths.MESSAGES, standAloneOnly = true)
    public String unregisterDevice(VKParameters params) {
        return prepareRequest("unregisterDevice", params).getRequest();
    }
    
    /**
     * @link https://vk.com/dev/account.setSilenceMode
     */
    @Rights(value = VKApiRigths.MESSAGES, standAloneOnly = true)
    public String setSilenceMode(VKParameters params) {
        return prepareRequest("setSilenceMode", params).getRequest();
    }
    
    /**
     * @link https://vk.com/dev/account.getPushSettings
     */
    @Rights(value = VKApiRigths.MESSAGES, standAloneOnly = true)
    public String getPushSettings(VKParameters params) {
        return prepareRequest("getPushSettings", params).getRequest();
    }
    
    /**
     * @link https://vk.com/dev/account.getAppPermissions
     */
    @Rights(VKApiRigths.NOTHING)
    public String getAppPermissions(VKParameters params) {
        return prepareRequest("getAppPermissions", params).getRequest();
    }
    
    /**
     * @link https://vk.com/dev/account.getActiveOffers
     */
    @Rights(VKApiRigths.NOTHING)
    public String getActiveOffers(VKParameters params) {
        return prepareRequest("getActiveOffers", params).getRequest();
    }
    
    /**
     * @link https://vk.com/dev/account.banUser
     */
    @Rights(standAloneOnly = true)
    public String banUser(VKParameters params) {
        return prepareRequest("banUser", params).getRequest();
    }
    
    /**
     * @link https://vk.com/dev/account.unbanUser
     */
    @Rights(standAloneOnly = true)
    public String unbanUser(VKParameters params) {
        return prepareRequest("unbanUser", params).getRequest();
    }

    /**
     * @link https://vk.com/dev/account.getBanned
     */
    @Rights(standAloneOnly = true)
    public String getBanned(VKParameters params) {
        return prepareRequest("getBanned", params).getRequest();
    }
    
    /**
     * @link https://vk.com/dev/account.getInfo
     */
    @Rights(standAloneOnly = true)
    public String getInfo(VKParameters params) {
        return prepareRequest("getInfo", params).getRequest();
    }
    
    /**
     * @link https://vk.com/dev/account.setInfo
     */
    @Rights(standAloneOnly = true)
    public String setInfo(VKParameters params) {
        return prepareRequest("setInfo", params).getRequest();
    }
    
    /**
     * @link https://vk.com/dev/account.changePassword
     */
    @Rights(standAloneOnly = true)
    public String changePassword(VKParameters params) {
        return prepareRequest("changePassword", params).getRequest();
    }
    
    /**
     * @link https://vk.com/dev/account.getProfileInfo
     */
    @Rights(standAloneOnly = true)
    public String getProfileInfo(VKParameters params) {
        return prepareRequest("getProfileInfo", params).getRequest();
    }
    
    /**
     * @link https://vk.com/dev/account.saveProfileInfo
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
