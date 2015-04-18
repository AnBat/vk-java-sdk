package com.batyaev.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batyaev.vk.api.VKParameters;
import com.batyaev.vk.api.VKRequest;

/**
 * Builds requests for API.account part
 * 
 * https://vk.com/dev/account
 */
public class VKApiAccount extends VKApiBase {

    /**
     * https://vk.com/dev/account.getCounters
     *
     * This method doesn't require any specific rights.  
     */
    public VKRequest getCounters(VKParameters params) {
        return prepareRequest("getCounters", params);
    }

    /**
     * https://vk.com/dev/account.setNameInMenu
     *
     * This method doesn't require any specific rights.  
     */
    public VKRequest setNameInMenu(VKParameters params) {
        return prepareRequest("setNameInMenu", params);
    }
    
    /**
     * https://vk.com/dev/account.setOnline
     *
     * This method is available only to standalone-applications. 
     */
    public VKRequest setOnline(VKParameters params) {
        return prepareRequest("setOnline", params);
    }
    
    /**
     * https://vk.com/dev/account.setOffline
     *
     * This method is available only to standalone-applications. 
     */
    public VKRequest setOffline(VKParameters params) {
        return prepareRequest("setOffline", params);
    }
    
    /**
     * https://vk.com/dev/account.lookupContacts
     *
     * You need the following rights to call this method: friends. (Read more on rights)
     * This method is available only to standalone-applications. 
     */
    public VKRequest lookupContacts(VKParameters params) {
        return prepareRequest("lookupContacts", params);
    }
    
    /**
     * https://vk.com/dev/account.registerDevice
     *
     * You need the following rights to call this method: messages. (Read more on rights)
     * This method is available only to standalone-applications. 
     */
    public VKRequest registerDevice(VKParameters params) {
        return prepareRequest("registerDevice", params);
    }
    
    /**
     * https://vk.com/dev/account.unregisterDevice
     *
     * You need the following rights to call this method: messages. (Read more on rights)
     * This method is available only to standalone-applications. 
     */
    public VKRequest unregisterDevice(VKParameters params) {
        return prepareRequest("unregisterDevice", params);
    }
    
    /**
     * https://vk.com/dev/account.setSilenceMode
     *
     * You need the following rights to call this method: messages. (Read more on rights)
     * This method is available only to standalone-applications.  
     */
    public VKRequest setSilenceMode(VKParameters params) {
        return prepareRequest("setSilenceMode", params);
    }
    
    /**
     * https://vk.com/dev/account.getPushSettings
     *
     * You need the following rights to call this method: messages. (Read more on rights)
     * This method is available only to standalone-applications.  
     */
    public VKRequest getPushSettings(VKParameters params) {
        return prepareRequest("getPushSettings", params);
    }
    
    /**
     * https://vk.com/dev/account.getAppPermissions
     *
     * This method doesn't require any specific rights.  
     */
    public VKRequest getAppPermissions(VKParameters params) {
        return prepareRequest("getAppPermissions", params);
    }
    
    /**
     * https://vk.com/dev/account.getActiveOffers
     *
     * This method doesn't require any specific rights. 
     */
    public VKRequest getActiveOffers(VKParameters params) {
        return prepareRequest("getActiveOffers", params);
    }
    
    /**
     * https://vk.com/dev/account.banUser
     *
     * This method is available only to standalone-applications.
     */
    public VKRequest banUser(VKParameters params) {
        return prepareRequest("banUser", params);
    }
    
    /**
     * https://vk.com/dev/account.unbanUser
     *
     * This method is available only to standalone-applications.  
     */
    public VKRequest unbanUser(VKParameters params) {
        return prepareRequest("unbanUser", params);
    }
    
    /**
     * https://vk.com/dev/account.getBanned
     *
     * This method is available only to standalone-applications.  
     */
    public VKRequest getBanned(VKParameters params) {
        return prepareRequest("getBanned", params);
    }
    
    /**
     * https://vk.com/dev/account.getInfo
     *
     * This method is available only to standalone-applications.  
     */
    public VKRequest getInfo(VKParameters params) {
        return prepareRequest("getInfo", params);
    }
    
    /**
     * https://vk.com/dev/account.setInfo
     *
     * This method is available only to standalone-applications.  
     */
    public VKRequest setInfo(VKParameters params) {
        return prepareRequest("setInfo", params);
    }
    
    /**
     * https://vk.com/dev/account.changePassword
     *
     * This method is available only to standalone-applications.  
     */
    public VKRequest changePassword(VKParameters params) {
        return prepareRequest("changePassword", params);
    }
    
    /**
     * https://vk.com/dev/account.getProfileInfo
     *
     * This method is available only to standalone-applications.  
     */
    public VKRequest getProfileInfo(VKParameters params) {
        return prepareRequest("getProfileInfo", params);
    }
    
    /**
     * https://vk.com/dev/account.saveProfileInfo
     *
     * This method is available only to standalone-applications.  
     */
    public VKRequest saveProfileInfo(VKParameters params) {
        return prepareRequest("saveProfileInfo", params);
    }

    @Override
    protected String getMethodsGroup() {
        return "account";
    }
}
