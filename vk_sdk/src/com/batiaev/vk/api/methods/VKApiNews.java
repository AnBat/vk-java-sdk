package com.batiaev.vk.api.methods;

/**
 * @author batiaev
 * Created by batiaev on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKParameters;

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
    public String get(VKParameters params) {
        return prepareRequest("get", params).getRequest();
    }
	
    /**
     * https://vk.com/dev/newsfeed.getRecommended
     *
     * You need the following rights to call this method: wall and friends. 
     */
    public String getRecommended(VKParameters params) {
        return prepareRequest("getRecommended", params).getRequest();
    }
	
    /**
     * https://vk.com/dev/newsfeed.getComments
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications. 
     */
    public String getComments(VKParameters params) {
        return prepareRequest("getComments", params).getRequest();
    }
	
    /**
     * https://vk.com/dev/newsfeed.getMentions
     *
     * You need the following rights to call this method: wall.
     */
    public String getMentions(VKParameters params) {
        return prepareRequest("getMentions", params).getRequest();
    }
	
    /**
     * https://vk.com/dev/newsfeed.getBanned
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications. 
     */
    public String getBanned(VKParameters params) {
        return prepareRequest("getBanned", params).getRequest();
    }
	
    /**
     * https://vk.com/dev/newsfeed.addBan
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.  
     */
    public String addBan(VKParameters params) {
        return prepareRequest("addBan", params).getRequest();
    }
	
    /**
     * https://vk.com/dev/newsfeed.deleteBan
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String deleteBan(VKParameters params) {
        return prepareRequest("deleteBan", params).getRequest();
    }
	
    /**
     * https://vk.com/dev/newsfeed.ignoreItem
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String ignoreItem(VKParameters params) {
        return prepareRequest("ignoreItem", params).getRequest();
    }
	
    /**
     * https://vk.com/dev/newsfeed.unignoreItem
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String unignoreItem(VKParameters params) {
        return prepareRequest("unignoreItem", params).getRequest();
    }
	
    /**
     * https://vk.com/dev/newsfeed.search
     *
     * This is an open method; it does not require an access_token. 
     */
    public String search(VKParameters params) {
        return prepareRequest("search", params).getRequest();
    }
	
    /**
     * https://vk.com/dev/newsfeed.getLists
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String getLists(VKParameters params) {
        return prepareRequest("getLists", params).getRequest();
    }
	
    /**
     * https://vk.com/dev/newsfeed.saveList
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String saveList(VKParameters params) {
        return prepareRequest("saveList", params).getRequest();
    }
	
    /**
     * https://vk.com/dev/newsfeed.deleteList
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String deleteList(VKParameters params) {
        return prepareRequest("deleteList", params).getRequest();
    }
	
    /**
     * https://vk.com/dev/newsfeed.unsubscribe
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String unsubscribe(VKParameters params) {
        return prepareRequest("unsubscribe", params).getRequest();
    }
	
    /**
     * https://vk.com/dev/newsfeed.getSuggestedSources
     *
     * This method doesn't require any specific rights. 
     */
    public String getSuggestedSources(VKParameters params) {
        return prepareRequest("getSuggestedSources", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "news";
    }
}
