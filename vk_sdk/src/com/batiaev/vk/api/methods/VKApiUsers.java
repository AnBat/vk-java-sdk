package com.batiaev.vk.api.methods;

/**
 * Created by anton on 13/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.consts.VKApiConst;
import com.batiaev.vk.api.dataTypes.VKUserList;
import com.batiaev.vk.api.system.VkJsonParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Builds requests for API.users part
 * 
 * https://vk.com/dev/users
 */
public class VKApiUsers extends VKApiBase {
    private static final Logger LOG = LogManager.getLogger(VKApiUsers.class);

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/users.get
     *
     * This is an open method; it does not require an access_token.
     *
     */
    public VKUserList get(VKParameters params) {
        JSONObject obj = new JSONObject(prepareRequest(VKApiConst.GET, params).getRequest());

        final JSONArray friendList = obj.getJSONArray(VKApiConst.RESPONSE);
        VKUserList result = new VKUserList();
        for (int i = 0; i < friendList.length(); ++i) {
            JSONObject userJson = friendList.getJSONObject(i);
            result.add(VkJsonParser.parseUser(userJson));
        }
        return result;
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/users.search
     *
     * This method doesn't require any specific rights.
     *
     */
    public String search(VKParameters params) {
        return prepareRequest("search", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/users.isAppUser
     *
     * This method doesn't require any specific rights.
     */
    public String isAppUser(VKParameters params) {
        return prepareRequest("isAppUser", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/users.getSubscriptions
     *
     * This is an open method; it does not require an access_token.
     */
    public String getSubscriptions(VKParameters params) {
        return prepareRequest("getSubscriptions", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/users.getFollowers
     *
     * This is an open method; it does not require an access_token.
     */
    public String getFollowers(VKParameters params) {
        return prepareRequest("getFollowers", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     *
     * https://vk.com/dev/users.report
     * Created on 29.01.14.
     *
     * This method is available only to standalone-applications.
     */
    public String report(VKParameters params) {
        return prepareRequest("report", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/users.getNearby
     *
     * This method is available only to standalone-applications.
     */
    public String getNearby(VKParameters params) {
        return prepareRequest("getNearby", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "users";
    }
}
