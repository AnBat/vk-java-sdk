package com.batiaev.vk.api.methods;

/**
 * Created by batiaev on 14/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */

import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.annotation.Rights;
import com.batiaev.vk.api.consts.VKApiConst;
import com.batiaev.vk.api.consts.VKApiJsonConst;
import com.batiaev.vk.api.consts.VKApiRigths;
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
 * <a href="https://vk.com/dev/friends">API friends()</a>
 */
public class VKApiFriends extends VKApiBase {

    private static final Logger LOG = LogManager.getLogger(VKApiFriends.class);

    /**
     * <a href="https://vk.com/dev/friends.get">API friends.get()</a>
     * @param params method parameters
     * @return list of required friends
     */
    @Rights(VKApiRigths.OPEN_METHOD)
    public VKUserList get(VKParameters params) {

        JSONObject obj = new JSONObject(prepareRequest(VKApiConst.GET, params).getRequest());

        final JSONArray friendList = obj.getJSONObject(VKApiJsonConst.RESPONSE).getJSONArray(VKApiConst.ITEMS);
        VKUserList result = new VKUserList(obj.getJSONObject(VKApiJsonConst.RESPONSE).getInt(VKApiConst.COUNT));
        for (int i = 0; i < friendList.length(); ++i) {
            JSONObject userJson = friendList.getJSONObject(i);
            VKUser user = VkJsonParser.parseUser(userJson);
            result.add(user);
        }
        return result;
    }

    /**
     * <a href="https://vk.com/dev/friends.getOnline">API friends.getOnline()</a>
     *
     * You need the following rights to call this method: friends.
     * @param params method parameters
     * @return String with json respond
     */
    public String getOnline(VKParameters params) {
        return prepareRequest("getOnline", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/friends.getMutual">API friends.getMutual()</a>
     *
     * You need the following rights to call this method: friends.
     * @param params method parameters
     * @return String with json respond
     */
    public String getMutual(VKParameters params) {
        return prepareRequest("getMutual", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/friends.getRecent">API friends.getRecent()</a>
     *
     * You need the following rights to call this method: friends.
     * @param params method parameters
     * @return String with json respond
     */
    public String getRecent(VKParameters params) {
        return prepareRequest("getRecent", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/friends.getRequests">API friends.getRequests()</a>
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return List of users wich send friend requests
     */
    public VKUserList getRequests(VKParameters params) {

        //some magic for getting method name
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        JSONObject obj = new JSONObject(prepareRequest("getRequests", params).getRequest());

        final JSONArray friendList = obj.getJSONObject(VKApiJsonConst.RESPONSE).getJSONArray(VKApiConst.ITEMS);
        VKUserList result = new VKUserList(obj.getJSONObject(VKApiJsonConst.RESPONSE).getInt(VKApiConst.COUNT));
        for (int i = 0; i < friendList.length(); ++i) {
            JSONObject userJson = friendList.getJSONObject(i);
            VKUser user = VkJsonParser.parseUser(userJson);
            result.add(user);
        }
        return result;
    }

    /**
     * <a href="https://vk.com/dev/friends.add">API friends.add()</a>
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String add(VKParameters params) {
        return prepareRequest("add", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/friends.edit">API friends.edit()</a>
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String edit(VKParameters params) {
        return prepareRequest("edit", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/friends.delete">API friends.delete()</a>
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String delete(VKParameters params) {
        return prepareRequest("delete", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/friends.getLists">API friends.getLists()</a>
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String getLists(VKParameters params) {
        return prepareRequest("getLists", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/friends.addList">API friends.addList()</a>
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String addList(VKParameters params) {
        return prepareRequest("addList", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/friends.editList">API friends.editList()</a>
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String editList(VKParameters params) {
        return prepareRequest("editList", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/friends.deleteList">API friends.deleteList()</a>
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String deleteList(VKParameters params) {
        return prepareRequest("deleteList", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/friends.getAppUsers">API friends.getAppUsers()</a>
     *
     * You need the following rights to call this method: friends.
     * @param params method parameters
     * @return String with json respond
     */
    public String getAppUsers(VKParameters params) {
        return prepareRequest("getAppUsers", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/friends.getByPhones">API friends.getByPhones()</a>
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String getByPhones(VKParameters params) {
        return prepareRequest("getByPhones", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/friends.deleteAllRequests">API friends.deleteAllRequests()</a>
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String deleteAllRequests(VKParameters params) {
        return prepareRequest("deleteAllRequests", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/friends.getSuggestions">API friends.getSuggestions()</a>
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String getSuggestions(VKParameters params) {
        return prepareRequest("getSuggestions", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/friends.areFriends">API friends.areFriends()</a>
     *
     * You need the following rights to call this method: friends.
     * @param params method parameters
     * @return String with json respond
     */
    public String areFriends(VKParameters params) {
        return prepareRequest("areFriends", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/friends.getAvailableForCall">API friends.getAvailableForCall()</a>
     *
     * You need the following rights to call this method: friends.
     * @param params method parameters
     * @return String with json respond
     */
    public String getAvailableForCall(VKParameters params) {
        return prepareRequest("getAvailableForCall", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/friends.search">API friends.search()</a>
     *
     * You need the following rights to call this method: friends.
     * @param params method parameters
     * @return String with json respond
     */
    public String search(VKParameters params) {
        return prepareRequest("search", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "friends";
    }
}
