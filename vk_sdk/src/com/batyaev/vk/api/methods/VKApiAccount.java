package com.batyaev.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batyaev.vk.annotation.Rights;
import com.batyaev.vk.annotation.StandAloneAppOnly;
import com.batyaev.vk.api.VKParameters;
import com.batyaev.vk.api.VKRequest;
import com.batyaev.vk.api.consts.VKApiRigths;

/**
 * Builds requests for API.account part
 * 
 * https://vk.com/dev/account
 */
public class VKApiAccount extends VKApiBase {

    /**
     * @link https://vk.com/dev/account.getCounters
     *
     * This method doesn't require any specific rights.  
     */
    public VKRequest getCounters(VKParameters params) {
        return prepareRequest("getCounters", params);
    }

    /**
     * @link https://vk.com/dev/account.setNameInMenu
     *
     * This method doesn't require any specific rights.  
     */
    public VKRequest setNameInMenu(VKParameters params) {
        return prepareRequest("setNameInMenu", params);
    }
    
    /**
     * @link https://vk.com/dev/account.setOnline
     */
    @StandAloneAppOnly
    public VKRequest setOnline(VKParameters params) {
        return prepareRequest("setOnline", params);
    }
    
    /**
     * @link https://vk.com/dev/account.setOffline
     */
    @StandAloneAppOnly
    public VKRequest setOffline(VKParameters params) {
        return prepareRequest("setOffline", params);
    }

    /**
     * @link https://vk.com/dev/account.lookupContacts
     */
    @StandAloneAppOnly
    @Rights(VKApiRigths.FRIENDS)
    public VKRequest lookupContacts(VKParameters params) {
        return prepareRequest("lookupContacts", params);
    }

    /**
     * @link https://vk.com/dev/account.registerDevice
     */
    @StandAloneAppOnly
    @Rights(VKApiRigths.MESSAGES)
    public VKRequest registerDevice(VKParameters params) {
        return prepareRequest("registerDevice", params);
    }

    /**
     * @link https://vk.com/dev/account.unregisterDevice
     */
    @StandAloneAppOnly
    @Rights(VKApiRigths.MESSAGES)
    public VKRequest unregisterDevice(VKParameters params) {
        return prepareRequest("unregisterDevice", params);
    }
    
    /**
     * @link https://vk.com/dev/account.setSilenceMode
     */
    @StandAloneAppOnly
    @Rights(VKApiRigths.MESSAGES)
    public VKRequest setSilenceMode(VKParameters params) {
        return prepareRequest("setSilenceMode", params);
    }
    
    /**
     * @link https://vk.com/dev/account.getPushSettings
     */
    @StandAloneAppOnly
    @Rights(VKApiRigths.MESSAGES)
    public VKRequest getPushSettings(VKParameters params) {
        return prepareRequest("getPushSettings", params);
    }
    
    /**
     * @link https://vk.com/dev/account.getAppPermissions
     *
     * This method doesn't require any specific rights.  
     */
    public VKRequest getAppPermissions(VKParameters params) {
        return prepareRequest("getAppPermissions", params);
    }
    
    /**
     * @link https://vk.com/dev/account.getActiveOffers
     *
     * This method doesn't require any specific rights. 
     */
    public VKRequest getActiveOffers(VKParameters params) {
        return prepareRequest("getActiveOffers", params);
    }
    
    /**
     * @link https://vk.com/dev/account.banUser
     */
    @StandAloneAppOnly
    public VKRequest banUser(VKParameters params) {
        return prepareRequest("banUser", params);
    }
    
    /**
     * @link https://vk.com/dev/account.unbanUser
     */
    @StandAloneAppOnly
    public VKRequest unbanUser(VKParameters params) {
        return prepareRequest("unbanUser", params);
    }
    
    /**
     * @link https://vk.com/dev/account.getBanned
     */
    @StandAloneAppOnly
    public VKRequest getBanned(VKParameters params) {
        return prepareRequest("getBanned", params);
    }
    
    /**
     * @link https://vk.com/dev/account.getInfo
     */
    @StandAloneAppOnly
    public VKRequest getInfo(VKParameters params) {
        return prepareRequest("getInfo", params);
    }
    
    /**
     * @link https://vk.com/dev/account.setInfo
     */
    @StandAloneAppOnly
    public VKRequest setInfo(VKParameters params) {
        return prepareRequest("setInfo", params);
    }
    
    /**
     * @link https://vk.com/dev/account.changePassword
     */
    @StandAloneAppOnly
    public VKRequest changePassword(VKParameters params) {
        return prepareRequest("changePassword", params);
    }
    
    /**
     * @link https://vk.com/dev/account.getProfileInfo
     */
    @StandAloneAppOnly
    public VKRequest getProfileInfo(VKParameters params) {
        return prepareRequest("getProfileInfo", params);
    }
    
    /**
     * @link https://vk.com/dev/account.saveProfileInfo
     */
    @StandAloneAppOnly
    public VKRequest saveProfileInfo(VKParameters params) {
        return prepareRequest("saveProfileInfo", params);
    }

    @Override
    protected String getMethodsGroup() {
        return "account";
    }
}
