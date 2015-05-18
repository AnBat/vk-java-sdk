package com.batiaev.vk.api.methods;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.VKRequest;

/**
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
    public VKRequest getUsers(VKParameters params) {
        return prepareRequest("getUsers", params);
    }
    
    /**
	 * https://vk.com/dev/fave.getPhotos
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     */
    public VKRequest getPhotos(VKParameters params) {
        return prepareRequest("getPhotos", params);
    }
    
    /**
	 * https://vk.com/dev/fave.getPosts
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     */
    public VKRequest getPosts(VKParameters params) {
        return prepareRequest("getPosts", params);
    }
    
    /**
	 * https://vk.com/dev/fave.getVideos
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     */
    public VKRequest getVideos(VKParameters params) {
        return prepareRequest("getVideos", params);
    }

    /**
     * https://vk.com/dev/fave.getLinks
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     */
    public VKRequest getLinks(VKParameters params) {
        return prepareRequest("getLinks", params);
    }

    /**
     * https://vk.com/dev/fave.addUser
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     */
    public VKRequest addUser(VKParameters params) {
        return prepareRequest("addUser", params);
    }

    /**
     * https://vk.com/dev/fave.removeUser
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     */
    public VKRequest removeUser(VKParameters params) {
        return prepareRequest("removeUser", params);
    }

    /**
     * https://vk.com/dev/fave.addGroup
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     */
    public VKRequest addGroup(VKParameters params) {
        return prepareRequest("addGroup", params);
    }

    /**
     * https://vk.com/dev/fave.removeGroup
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     */
    public VKRequest removeGroup(VKParameters params) {
        return prepareRequest("removeGroup", params);
    }

    /**
     * https://vk.com/dev/fave.addLink
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     */
    public VKRequest addLink(VKParameters params) {
        return prepareRequest("addLink", params);
    }

    /**
     * https://vk.com/dev/fave.removeLink
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     */
    public VKRequest removeLink(VKParameters params) {
        return prepareRequest("removeLink", params);
    }

    @Override
    protected String getMethodsGroup() {
        return "farovites";
    }
}
