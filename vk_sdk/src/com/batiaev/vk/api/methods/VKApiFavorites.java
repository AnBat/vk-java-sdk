package com.batiaev.vk.api.methods;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKParameters;

/**
 * @author batiaev
 *
 * Builds requests for API.favorites part
 * 
 * https://vk.com/dev/favorites
 */
public class VKApiFavorites extends VKApiBase {
	
    /**
	 * https://vk.com/dev/fave.getUsers
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     */
    public String getUsers(VKParameters params) {
        return prepareRequest("getUsers", params).getRequest();
    }
    
    /**
	 * https://vk.com/dev/fave.getPhotos
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     */
    public String getPhotos(VKParameters params) {
        return prepareRequest("getPhotos", params).getRequest();
    }
    
    /**
	 * https://vk.com/dev/fave.getPosts
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     */
    public String getPosts(VKParameters params) {
        return prepareRequest("getPosts", params).getRequest();
    }
    
    /**
	 * https://vk.com/dev/fave.getVideos
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     */
    public String getVideos(VKParameters params) {
        return prepareRequest("getVideos", params).getRequest();
    }

    /**
     * https://vk.com/dev/fave.getLinks
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     */
    public String getLinks(VKParameters params) {
        return prepareRequest("getLinks", params).getRequest();
    }

    /**
     * https://vk.com/dev/fave.addUser
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     */
    public String addUser(VKParameters params) {
        return prepareRequest("addUser", params).getRequest();
    }

    /**
     * https://vk.com/dev/fave.removeUser
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     */
    public String removeUser(VKParameters params) {
        return prepareRequest("removeUser", params).getRequest();
    }

    /**
     * https://vk.com/dev/fave.addGroup
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     */
    public String addGroup(VKParameters params) {
        return prepareRequest("addGroup", params).getRequest();
    }

    /**
     * https://vk.com/dev/fave.removeGroup
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     */
    public String removeGroup(VKParameters params) {
        return prepareRequest("removeGroup", params).getRequest();
    }

    /**
     * https://vk.com/dev/fave.addLink
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     */
    public String addLink(VKParameters params) {
        return prepareRequest("addLink", params).getRequest();
    }

    /**
     * https://vk.com/dev/fave.removeLink
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     */
    public String removeLink(VKParameters params) {
        return prepareRequest("removeLink", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "farovites";
    }
}
