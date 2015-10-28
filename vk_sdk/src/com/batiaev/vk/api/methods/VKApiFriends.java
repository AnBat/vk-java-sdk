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

        JSONObject obj = execute(VKApiConst.GET, params);

        final JSONArray friendList = obj.getJSONArray(VKApiConst.ITEMS);
        VKUserList result = new VKUserList(obj.getInt(VKApiConst.COUNT));
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
        return execute("getOnline", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/friends.getMutual">API friends.getMutual()</a>
     *
     * You need the following rights to call this method: friends.
     * @param params method parameters
     * @return String with json respond
     */
    public String getMutual(VKParameters params) {
        return execute("getMutual", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/friends.getRecent">API friends.getRecent()</a>
     *
     * You need the following rights to call this method: friends.
     * @param params method parameters
     * @return String with json respond
     */
    public String getRecent(VKParameters params) {
        return execute("getRecent", params).toString();
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
        JSONObject obj = execute("getRequests", params);

        final JSONArray friendList = obj.getJSONArray(VKApiConst.ITEMS);
        VKUserList result = new VKUserList(obj.getInt(VKApiConst.COUNT));
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
        return execute("add", params).toString();
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
        return execute("edit", params).toString();
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
        return execute("delete", params).toString();
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
        return execute("getLists", params).toString();
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
        return execute("addList", params).toString();
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
        return execute("editList", params).toString();
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
        return execute("deleteList", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/friends.getAppUsers">API friends.getAppUsers()</a>
     *
     * You need the following rights to call this method: friends.
     * @param params method parameters
     * @return String with json respond
     */
    public String getAppUsers(VKParameters params) {
        return execute("getAppUsers", params).toString();
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
        return execute("getByPhones", params).toString();
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
        return execute("deleteAllRequests", params).toString();
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
        return execute("getSuggestions", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/friends.areFriends">API friends.areFriends()</a>
     *
     * You need the following rights to call this method: friends.
     * @param params method parameters
     * @return String with json respond
     */
    public String areFriends(VKParameters params) {
        return execute("areFriends", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/friends.getAvailableForCall">API friends.getAvailableForCall()</a>
     *
     * You need the following rights to call this method: friends.
     * @param params method parameters
     * @return String with json respond
     */
    public String getAvailableForCall(VKParameters params) {
        return execute("getAvailableForCall", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/friends.search">API friends.search()</a>
     *
     * You need the following rights to call this method: friends.
     * @param params method parameters
     * @return String with json respond
     */
    public String search(VKParameters params) {
        return execute("search", params).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "friends";
    }
}
