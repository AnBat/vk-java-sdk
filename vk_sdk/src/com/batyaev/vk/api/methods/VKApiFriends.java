package com.batyaev.vk.api.methods;

/**
 * Created by anton on 14/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */
 
import com.batyaev.vk.api.VKParameters;
import com.batyaev.vk.api.VKRequest;
import com.batyaev.vk.api.consts.VKApiConst;
import com.batyaev.vk.api.consts.VKApiDatabaseConsts;
import com.batyaev.vk.api.consts.VKApiUserConsts;
import com.batyaev.vk.api.dataTypes.VKUser;
import com.batyaev.vk.api.dataTypes.VKUserList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

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
    public VKUserList get(VKParameters params) throws IOException {

        String respond = prepareRequest(VKApiConst.GET, params).getRequest();

        JSONObject obj = new JSONObject(respond);
        final JSONArray friendList = obj.getJSONArray(VKApiConst.RESPONSE);
        VKUserList result = new VKUserList();
        for (int i = 0; i < friendList.length(); ++i) {
            VKUser user = new VKUser();
            JSONObject userJson = friendList.getJSONObject(i);

            user.user_id = userJson.getInt(VKApiUserConsts.UID);
            user.first_name = userJson.getString(VKApiUserConsts.FIRST_NAME);
            user.last_name = userJson.getString(VKApiUserConsts.LAST_NAME);
            user.sex = userJson.getInt(VKApiUserConsts.SEX);
            if (userJson.has(VKApiUserConsts.NICKNAME))
                user.nickname = userJson.getString(VKApiUserConsts.NICKNAME);
            user.photo_max_orig = userJson.getString(VKApiUserConsts.PHOTO_MAX_ORIG);
            user.online = userJson.getInt(VKApiUserConsts.ONLINE) == 1;
            if (userJson.has(VKApiUserConsts.CITY)) {
                VKApiDatabase database = new VKApiDatabase();
                VKParameters cityParams = new VKParameters();
                cityParams.setValue(VKApiDatabaseConsts.NEED_ALL, 1);
                cityParams.setValue(VKApiDatabaseConsts.CITY_IDS, userJson.getInt(VKApiUserConsts.CITY));
                user.city = database.getCitiesById(cityParams);
            }
            if (userJson.has(VKApiUserConsts.COUNTRY)) {
                VKApiDatabase database = new VKApiDatabase();
                VKParameters countryParams = new VKParameters();
                countryParams.setValue(VKApiDatabaseConsts.NEED_ALL, 1);
                countryParams.setValue(VKApiDatabaseConsts.COUNTRY_IDS, userJson.getInt(VKApiUserConsts.COUNTRY));
                user.country = database.getCountriesById(countryParams);
            }
            if (userJson.has(VKApiUserConsts.BDATE))
                user.bdate = userJson.getString(VKApiUserConsts.BDATE);
            result.add(user);

            LOG.info( user.toString() + "\t\t" + user.bdate  + "\t\t" + user.online() + "\tcountry=" + user.country);
        }
        LOG.info(friendList.toString());
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
