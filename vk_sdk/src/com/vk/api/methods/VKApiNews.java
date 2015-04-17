package com.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;

/**
 * Builds requests for API.newsfeed part
 * 
 * https://vk.com/dev/newsfeed
 */
public class VKApiNews extends VKApiBase {

    /**
     * https://vk.com/dev/newsfeed.get
     *
     * You need the following rights to call this method: wall and friends. 
     */
    public VKRequest get(VKParameters params) {
        return prepareRequest("get", params);
    }
	
    /**
     * https://vk.com/dev/newsfeed.getRecommended
     *
     * You need the following rights to call this method: wall and friends. 
     */
    public VKRequest getRecommended(VKParameters params) {
        return prepareRequest("getRecommended", params);
    }
	
    /**
     * https://vk.com/dev/newsfeed.getComments
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications. 
     */
    public VKRequest getComments(VKParameters params) {
        return prepareRequest("getComments", params);
    }
	
    /**
     * https://vk.com/dev/newsfeed.getMentions
     *
     * You need the following rights to call this method: wall.
     */
    public VKRequest getMentions(VKParameters params) {
        return prepareRequest("getMentions", params);
    }
	
    /**
     * https://vk.com/dev/newsfeed.getBanned
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications. 
     */
    public VKRequest getBanned(VKParameters params) {
        return prepareRequest("getBanned", params);
    }
	
    /**
     * https://vk.com/dev/newsfeed.addBan
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.  
     */
    public VKRequest addBan(VKParameters params) {
        return prepareRequest("addBan", params);
    }
	
    /**
     * https://vk.com/dev/newsfeed.deleteBan
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public VKRequest deleteBan(VKParameters params) {
        return prepareRequest("deleteBan", params);
    }
	
    /**
     * https://vk.com/dev/newsfeed.ignoreItem
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public VKRequest ignoreItem(VKParameters params) {
        return prepareRequest("ignoreItem", params);
    }
	
    /**
     * https://vk.com/dev/newsfeed.unignoreItem
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public VKRequest unignoreItem(VKParameters params) {
        return prepareRequest("unignoreItem", params);
    }
	
    /**
     * https://vk.com/dev/newsfeed.search
     *
     * This is an open method; it does not require an access_token. 
     */
    public VKRequest search(VKParameters params) {
        return prepareRequest("search", params);
    }
	
    /**
     * https://vk.com/dev/newsfeed.getLists
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public VKRequest getLists(VKParameters params) {
        return prepareRequest("getLists", params);
    }
	
    /**
     * https://vk.com/dev/newsfeed.saveList
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public VKRequest saveList(VKParameters params) {
        return prepareRequest("saveList", params);
    }
	
    /**
     * https://vk.com/dev/newsfeed.deleteList
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public VKRequest deleteList(VKParameters params) {
        return prepareRequest("deleteList", params);
    }
	
    /**
     * https://vk.com/dev/newsfeed.unsubscribe
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public VKRequest unsubscribe(VKParameters params) {
        return prepareRequest("unsubscribe", params);
    }
	
    /**
     * https://vk.com/dev/newsfeed.getSuggestedSources
     *
     * This method doesn't require any specific rights. 
     */
    public VKRequest getSuggestedSources(VKParameters params) {
        return prepareRequest("getSuggestedSources", params);
    }
}
