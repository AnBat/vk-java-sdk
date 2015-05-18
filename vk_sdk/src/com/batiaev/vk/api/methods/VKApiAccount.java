package com.batiaev.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.annotation.Rights;
import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.VKRequest;
import com.batiaev.vk.api.consts.VKApiRigths;

/**
 * Builds requests for API.account part
 * 
 * https://vk.com/dev/account
 */
public class VKApiAccount extends VKApiBase {

    /**
     * @link https://vk.com/dev/account.getCounters
     */
    @Rights(VKApiRigths.NOTHING)
    public VKRequest getCounters(VKParameters params) {
        return prepareRequest("getCounters", params);
    }

    /**
     * @link https://vk.com/dev/account.setNameInMenu
     */
    @Rights(VKApiRigths.NOTHING)
    public VKRequest setNameInMenu(VKParameters params) {
        return prepareRequest("setNameInMenu", params);
    }
    
    /**
     * @link https://vk.com/dev/account.setOnline
     */
    @Rights(standAloneOnly = true)
    public VKRequest setOnline(VKParameters params) {
        return prepareRequest("setOnline", params);
    }
    
    /**
     * @link https://vk.com/dev/account.setOffline
     */
    @Rights(standAloneOnly = true)
    public VKRequest setOffline(VKParameters params) {
        return prepareRequest("setOffline", params);
    }

    /**
     * @link https://vk.com/dev/account.lookupContacts
     */
    @Rights(value = VKApiRigths.FRIENDS, standAloneOnly = true)
    public VKRequest lookupContacts(VKParameters params) {
        return prepareRequest("lookupContacts", params);
    }

    /**
     * @link https://vk.com/dev/account.registerDevice
     */
    @Rights(value = VKApiRigths.MESSAGES, standAloneOnly = true)
    public VKRequest registerDevice(VKParameters params) {
        return prepareRequest("registerDevice", params);
    }

    /**
     * @link https://vk.com/dev/account.unregisterDevice
     */
    @Rights(value = VKApiRigths.MESSAGES, standAloneOnly = true)
    public VKRequest unregisterDevice(VKParameters params) {
        return prepareRequest("unregisterDevice", params);
    }
    
    /**
     * @link https://vk.com/dev/account.setSilenceMode
     */
    @Rights(value = VKApiRigths.MESSAGES, standAloneOnly = true)
    public VKRequest setSilenceMode(VKParameters params) {
        return prepareRequest("setSilenceMode", params);
    }
    
    /**
     * @link https://vk.com/dev/account.getPushSettings
     */
    @Rights(value = VKApiRigths.MESSAGES, standAloneOnly = true)
    public VKRequest getPushSettings(VKParameters params) {
        return prepareRequest("getPushSettings", params);
    }
    
    /**
     * @link https://vk.com/dev/account.getAppPermissions
     */
    @Rights(VKApiRigths.NOTHING)
    public VKRequest getAppPermissions(VKParameters params) {
        return prepareRequest("getAppPermissions", params);
    }
    
    /**
     * @link https://vk.com/dev/account.getActiveOffers
     */
    @Rights(VKApiRigths.NOTHING)
    public VKRequest getActiveOffers(VKParameters params) {
        return prepareRequest("getActiveOffers", params);
    }
    
    /**
     * @link https://vk.com/dev/account.banUser
     */
    @Rights(standAloneOnly = true)
    public VKRequest banUser(VKParameters params) {
        return prepareRequest("banUser", params);
    }
    
    /**
     * @link https://vk.com/dev/account.unbanUser
     */
    @Rights(standAloneOnly = true)
    public VKRequest unbanUser(VKParameters params) {
        return prepareRequest("unbanUser", params);
    }
    
    /**
     * @link https://vk.com/dev/account.getBanned
     */
    @Rights(standAloneOnly = true)
    public VKRequest getBanned(VKParameters params) {
        return prepareRequest("getBanned", params);
    }
    
    /**
     * @link https://vk.com/dev/account.getInfo
     */
    @Rights(standAloneOnly = true)
    public VKRequest getInfo(VKParameters params) {
        return prepareRequest("getInfo", params);
    }
    
    /**
     * @link https://vk.com/dev/account.setInfo
     */
    @Rights(standAloneOnly = true)
    public VKRequest setInfo(VKParameters params) {
        return prepareRequest("setInfo", params);
    }
    
    /**
     * @link https://vk.com/dev/account.changePassword
     */
    @Rights(standAloneOnly = true)
    public VKRequest changePassword(VKParameters params) {
        return prepareRequest("changePassword", params);
    }
    
    /**
     * @link https://vk.com/dev/account.getProfileInfo
     */
    @Rights(standAloneOnly = true)
    public VKRequest getProfileInfo(VKParameters params) {
        return prepareRequest("getProfileInfo", params);
    }
    
    /**
     * @link https://vk.com/dev/account.saveProfileInfo
     */
    @Rights(standAloneOnly = true)
    public VKRequest saveProfileInfo(VKParameters params) {
        return prepareRequest("saveProfileInfo", params);
    }

    @Override
    protected String getMethodsGroup() {
        return "account";
    }
}
