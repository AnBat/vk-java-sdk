package com.vk.api.methods;

/**
 * Created by anton on 14/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */
 
import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;

/**
 * Builds requests for API.friends part
 * 
 * https://vk.com/dev/friends
 */
public class VKApiFriends extends VKApiBase {

    /**
     * https://vk.com/dev/friends.get
     *
     * 
     */
    public VKRequest get(VKParameters params) {
        return prepareRequest("get", params);
    }

    /**
     * https://vk.com/dev/friends.getOnline
     *
     * 
     */
    public VKRequest getOnline(VKParameters params) {
        return prepareRequest("getOnline", params);
    }

    /**
     * https://vk.com/dev/friends.getMutual
     *
     * 
     */
    public VKRequest getMutual(VKParameters params) {
        return prepareRequest("getMutual", params);
    }

    /**
     * https://vk.com/dev/friends.getRecent
     *
     * 
     */
    public VKRequest getRecent(VKParameters params) {
        return prepareRequest("getRecent", params);
    }

    /**
     * https://vk.com/dev/friends.getRequests
     *
     * 
     */
    public VKRequest getRequests(VKParameters params) {
        return prepareRequest("getRequests", params);
    }

    /**
     * https://vk.com/dev/friends.add
     *
     * 
     */
    public VKRequest add(VKParameters params) {
        return prepareRequest("add", params);
    }

    /**
     * https://vk.com/dev/friends.edit
     *
     * 
     */
    public VKRequest edit(VKParameters params) {
        return prepareRequest("edit", params);
    }

    /**
     * https://vk.com/dev/friends.delete
     *
     * 
     */
    public VKRequest delete(VKParameters params) {
        return prepareRequest("delete", params);
    }

    /**
     * https://vk.com/dev/friends.getLists
     *
     * 
     */
    public VKRequest getLists(VKParameters params) {
        return prepareRequest("getLists", params);
    }

    /**
     * https://vk.com/dev/friends.addList
     *
     * 
     */
    public VKRequest addList(VKParameters params) {
        return prepareRequest("addList", params);
    }

    /**
     * https://vk.com/dev/friends.editList
     *
     * 
     */
    public VKRequest editList(VKParameters params) {
        return prepareRequest("editList", params);
    }

    /**
     * https://vk.com/dev/friends.deleteList
     *
     * 
     */
    public VKRequest deleteList(VKParameters params) {
        return prepareRequest("deleteList", params);
    }

    /**
     * https://vk.com/dev/friends.getAppUsers
     *
     * 
     */
    public VKRequest getAppUsers(VKParameters params) {
        return prepareRequest("getAppUsers", params);
    }

    /**
     * https://vk.com/dev/friends.getByPhones
     *
     * 
     */
    public VKRequest getByPhones(VKParameters params) {
        return prepareRequest("getByPhones", params);
    }

    /**
     * https://vk.com/dev/friends.deleteAllRequests
     *
     * 
     */
    public VKRequest deleteAllRequests(VKParameters params) {
        return prepareRequest("deleteAllRequests", params);
    }

    /**
     * https://vk.com/dev/friends.getSuggestions
     *
     * 
     */
    public VKRequest getSuggestions(VKParameters params) {
        return prepareRequest("getSuggestions", params);
    }

    /**
     * https://vk.com/dev/friends.areFriends
     *
     * 
     */
    public VKRequest areFriends(VKParameters params) {
        return prepareRequest("areFriends", params);
    }
}
