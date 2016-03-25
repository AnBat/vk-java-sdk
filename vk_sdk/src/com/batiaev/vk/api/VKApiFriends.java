package com.batiaev.vk.api;

/**
 * Created by batiaev on 14/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.annotation.Rights;
import com.batiaev.vk.common.consts.VKApiConst;
import com.batiaev.vk.common.consts.VKApiJsonConst;
import com.batiaev.vk.common.consts.VKApiRigths;
import com.batiaev.vk.common.consts.VkApiMethods;
import com.batiaev.vk.common.entity.VKUser;
import com.batiaev.vk.common.entity.VKUserList;
import com.batiaev.vk.common.system.VkJson2Class;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Builds requests for API.friends part
 *
 * <a href="https://vk.com/dev/friends">API friends()</a>
 */
public class VKApiFriends extends VKApiBase {

    private static final Logger LOG = LogManager.getLogger(VKApiFriends.class);

    public VKApiFriends() {
        methodsGroup = "friends";
    }

    /**
     * <a href="https://vk.com/dev/friends.get">API friends.get()</a>
     * @param params method parameters
     * @return list of required friends
     */
    @Rights(VKApiRigths.OPEN_METHOD)
    public VKUserList get(VKParameters params) {
        String url = getUrl(VkApiMethods.GET, params);

        JSONObject obj = execute(url);
        if (obj == null) return null;

        final JSONArray friendList = obj.getJSONArray(VKApiConst.ITEMS);
        VKUserList result = new VKUserList(obj.getInt(VKApiConst.COUNT));
        for (int i = 0; i < friendList.length(); ++i) {
            JSONObject userJson = friendList.getJSONObject(i);
            VKUser user = (VKUser) VkJson2Class.toClass(userJson, VKUser.class);
            result.add(user);
        }
        return result;
    }

    /**
     * <a href="https://vk.com/dev/friends.getOnline">API friends.getOnline()</a>
     *
     * You need the following rights to call this method: friends.
     * @param params method parameters
     * @return hash with two keys online and online_mobile with lists of id users
     */
    @Rights(VKApiRigths.FRIENDS)
    public HashMap<String, ArrayList<Long>> getOnline(VKParameters params) {
        JSONObject obj = execute(getUrl(VkApiMethods.GET_ONLINE, params));
        if (obj == null) return null;

        HashMap<String, ArrayList<Long>> result = new HashMap<>();
        if (obj.has(VKApiJsonConst.ONLINE)) {
            final JSONArray online = obj.getJSONArray(VKApiJsonConst.ONLINE);
            ArrayList<Long> onlineList = new ArrayList<>();
            for (int i = 0; i < online.length(); ++i) onlineList.add(online.getLong(i));
            result.put(VKApiJsonConst.ONLINE, onlineList);
        }
        else if (obj.has(VKApiJsonConst.ONLINE_MOBILE)) {
            final JSONArray onlineMobile = obj.getJSONArray(VKApiJsonConst.ONLINE_MOBILE);
            ArrayList<Long> onlineList = new ArrayList<>();
            for (int i = 0; i < onlineMobile.length(); ++i) onlineList.add(onlineMobile.getLong(i));
            result.put(VKApiJsonConst.ONLINE, onlineList);
        }
        else return null;

        return result;
    }

    /**
     * <a href="https://vk.com/dev/friends.getMutual">API friends.getMutual()</a>
     *
     * You need the following rights to call this method: friends.
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.FRIENDS)
    public String getMutual(VKParameters params) {
        JSONObject obj = execute(getUrl(VkApiMethods.GET_MUTUAL, params));
        if (obj == null) return null;
        return obj.toString();
    }

    /**
     * <a href="https://vk.com/dev/friends.getRecent">API friends.getRecent()</a>
     *
     * You need the following rights to call this method: friends.
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.FRIENDS)
    public String getRecent(VKParameters params) {
        JSONObject obj = execute(getUrl(VkApiMethods.GET_RECENT, params));
        if (obj == null) return null;
        return obj.toString();
    }

    /**
     * <a href="https://vk.com/dev/friends.getRequests">API friends.getRequests()</a>
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return List of users wich send friend requests
     */
    @Rights(VKApiRigths.FRIENDS)
    public VKUserList getRequests(VKParameters params) {

        //some magic for getting method name
//        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        JSONObject obj = execute(getUrl("getRequests", params));
        if (obj == null) return null;

        final JSONArray friendList = obj.getJSONArray(VKApiConst.ITEMS);
        VKUserList result = new VKUserList(obj.getInt(VKApiConst.COUNT));
        for (int i = 0; i < friendList.length(); ++i) {
            JSONObject userJson = friendList.getJSONObject(i);
            VKUser user = (VKUser) VkJson2Class.toClass(userJson, VKUser.class);
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
     * @return one of the following values:
     *  1 — Friend request sent.
     *  2 — Friend request from the user approved.
     *  4 — Request resending.
     */
    @Rights(VKApiRigths.FRIENDS)
    public int add(VKParameters params) {
        String url = getUrl(VkApiMethods.ADD, params);
        JSONObject obj = new JSONObject(executeRaw(url));
        return obj.getInt(VKApiJsonConst.RESPONSE);
    }

    /**
     * <a href="https://vk.com/dev/friends.edit">API friends.edit()</a>
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return 1
     */
    @Rights(VKApiRigths.FRIENDS)
    public int edit(VKParameters params) {
        String url = getUrl(VkApiMethods.EDIT, params);
        JSONObject obj = new JSONObject(executeRaw(url));
        return obj.getInt(VKApiJsonConst.RESPONSE);
    }

    /**
     * <a href="https://vk.com/dev/friends.delete">API friends.delete()</a>
     *
     * You need the following rights to call this method: friends.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(VKApiRigths.FRIENDS)
    public String delete(VKParameters params) {
        String url = getUrl(VkApiMethods.DELETE, params);
        return execute(url).toString();
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
        String url = getUrl("getLists", params);
        return execute(url).toString();
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
        return execute(getUrl("addList", params)).toString();
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
        return execute(getUrl("editList", params)).toString();
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
        return execute(getUrl("deleteList", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/friends.getAppUsers">API friends.getAppUsers()</a>
     *
     * You need the following rights to call this method: friends.
     * @param params method parameters
     * @return String with json respond
     */
    public String getAppUsers(VKParameters params) {
        return execute(getUrl("getAppUsers", params)).toString();
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
        return execute(getUrl("getByPhones", params)).toString();
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
        return execute(getUrl("deleteAllRequests", params)).toString();
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
        return execute(getUrl("getSuggestions", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/friends.areFriends">API friends.areFriends()</a>
     *
     * You need the following rights to call this method: friends.
     * @param params method parameters
     * @return String with json respond
     */
    public String areFriends(VKParameters params) {
        return execute(getUrl("areFriends", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/friends.getAvailableForCall">API friends.getAvailableForCall()</a>
     *
     * You need the following rights to call this method: friends.
     * @param params method parameters
     * @return String with json respond
     */
    public String getAvailableForCall(VKParameters params) {
        return execute(getUrl("getAvailableForCall", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/friends.search">API friends.search()</a>
     *
     * You need the following rights to call this method: friends.
     * @param params method parameters
     * @return String with json respond
     */
    public String search(VKParameters params) {
        return execute(getUrl(VkApiMethods.SEARCH, params)).toString();
    }
}
