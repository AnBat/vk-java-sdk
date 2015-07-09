package com.batiaev.vk.api.methods;

/**
 * Created by anton on 14/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.VKRequest;
import com.batiaev.vk.api.consts.VKApiConst;
import com.batiaev.vk.api.dataTypes.VKUser;
import com.batiaev.vk.api.dataTypes.VKUserList;
import com.batiaev.vk.api.system.VkJsonParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Builds requests for API.friends part
 * 
 * https://vk.com/dev/friends
 */
public class VKApiFriends extends VKApiBase {

    private static final Logger LOG = LogManager.getLogger(VKApiFriends.class);

    /**
     * https://vk.com/dev/friends.get
     *
     * This is an open method; it does not require an access_token. 
     */
    public VKUserList get(VKParameters params) {

        String respond = prepareRequest(VKApiConst.GET, params).getRequest();

        JSONObject obj = new JSONObject(respond);
        final JSONArray friendList = obj.getJSONObject(VKApiConst.RESPONSE).getJSONArray(VKApiConst.ITEMS);
        VKUserList result = new VKUserList(obj.getJSONObject(VKApiConst.RESPONSE).getInt(VKApiConst.COUNT));
        for (int i = 0; i < friendList.length(); ++i) {
            JSONObject userJson = friendList.getJSONObject(i);
            VKUser user = VkJsonParser.parseUser(userJson);
            result.add(user);
        }
        return result;
    }

    /**
     * https://vk.com/dev/friends.getOnline
     *
     * You need the following rights to call this method: friends. 
     */
    public VKRequest getOnline(VKParameters params) {
        return prepareRequest("getOnline", params);
    }

    /**
     * https://vk.com/dev/friends.getMutual
     *
     * You need the following rights to call this method: friends. 
     */
    public VKRequest getMutual(VKParameters params) {
        return prepareRequest("getMutual", params);
    }

    /**
     * https://vk.com/dev/friends.getRecent
     *
     * You need the following rights to call this method: friends. 
     */
    public VKRequest getRecent(VKParameters params) {
        return prepareRequest("getRecent", params);
    }

    /**
     * https://vk.com/dev/friends.getRequests
     *
     * You need the following rights to call this method: friends. 
     * This method is available only to standalone-applications.
     */
    public VKRequest getRequests(VKParameters params) {
        return prepareRequest("getRequests", params);
    }

    /**
     * https://vk.com/dev/friends.add
     *
     * You need the following rights to call this method: friends. 
     * This method is available only to standalone-applications.
     */
    public VKRequest add(VKParameters params) {
        return prepareRequest("add", params);
    }

    /**
     * https://vk.com/dev/friends.edit
     *
     * You need the following rights to call this method: friends. 
     * This method is available only to standalone-applications.
     */
    public VKRequest edit(VKParameters params) {
        return prepareRequest("edit", params);
    }

    /**
     * https://vk.com/dev/friends.delete
     *
     * You need the following rights to call this method: friends. 
     * This method is available only to standalone-applications.
     */
    public VKRequest delete(VKParameters params) {
        return prepareRequest("delete", params);
    }

    /**
     * https://vk.com/dev/friends.getLists
     *
     * You need the following rights to call this method: friends. 
     * This method is available only to standalone-applications.
     */
    public VKRequest getLists(VKParameters params) {
        return prepareRequest("getLists", params);
    }

    /**
     * https://vk.com/dev/friends.addList
     *
     * You need the following rights to call this method: friends. 
     * This method is available only to standalone-applications.
     */
    public VKRequest addList(VKParameters params) {
        return prepareRequest("addList", params);
    }

    /**
     * https://vk.com/dev/friends.editList
     *
     * You need the following rights to call this method: friends. 
     * This method is available only to standalone-applications.
     */
    public VKRequest editList(VKParameters params) {
        return prepareRequest("editList", params);
    }

    /**
     * https://vk.com/dev/friends.deleteList
     *
     * You need the following rights to call this method: friends. 
     * This method is available only to standalone-applications.
     */
    public VKRequest deleteList(VKParameters params) {
        return prepareRequest("deleteList", params);
    }

    /**
     * https://vk.com/dev/friends.getAppUsers
     *
     * You need the following rights to call this method: friends.
     */
    public VKRequest getAppUsers(VKParameters params) {
        return prepareRequest("getAppUsers", params);
    }

    /**
     * https://vk.com/dev/friends.getByPhones
     *
     * You need the following rights to call this method: friends. 
     * This method is available only to standalone-applications.
     */
    public VKRequest getByPhones(VKParameters params) {
        return prepareRequest("getByPhones", params);
    }

    /**
     * https://vk.com/dev/friends.deleteAllRequests
     *
     * You need the following rights to call this method: friends. 
     * This method is available only to standalone-applications.
     */
    public VKRequest deleteAllRequests(VKParameters params) {
        return prepareRequest("deleteAllRequests", params);
    }

    /**
     * https://vk.com/dev/friends.getSuggestions
     *
     * You need the following rights to call this method: friends. 
     * This method is available only to standalone-applications.
     */
    public VKRequest getSuggestions(VKParameters params) {
        return prepareRequest("getSuggestions", params);
    }

    /**
     * https://vk.com/dev/friends.areFriends
     *
     * You need the following rights to call this method: friends.
     */
    public VKRequest areFriends(VKParameters params) {
        return prepareRequest("areFriends", params);
    }

    /**
     * https://vk.com/dev/friends.getAvailableForCall
     *
     * You need the following rights to call this method: friends.
     */
    public VKRequest getAvailableForCall(VKParameters params) {
        return prepareRequest("getAvailableForCall", params);
    }

    /**
     * https://vk.com/dev/friends.search
     *
     * You need the following rights to call this method: friends.
     */
    public VKRequest search(VKParameters params) {
        return prepareRequest("search", params);
    }

    @Override
    protected String getMethodsGroup() {
        return "friends";
    }
}
