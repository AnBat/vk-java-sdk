/*
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk.api;

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.consts.VKApiJsonConst;
import com.batiaev.vk.common.consts.VkApiMethods;
import com.batiaev.vk.common.entity.VKUser;
import com.batiaev.vk.common.entity.VKUserList;
import com.batiaev.vk.common.system.VkJson2Class;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Builds requests for API.users part
 * <p>
 * https://vk.com/dev/users
 *
 * @author batiaev
 * @since 13/04/15
 */
public class VKApiUsers extends VKApiBase {

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/users.get
     * <p>
     * This is an open method; it does not require an access_token.
     */
    public VKUserList get(VKParameters params) {
        String url = getUrl(VkApiMethods.GET, params);

        JSONObject obj = new JSONObject(executeRaw(url));
        final JSONArray friendList = obj.getJSONArray(VKApiJsonConst.RESPONSE);
        VKUserList result = new VKUserList();
        for (int i = 0; i < friendList.length(); ++i) {
            JSONObject userJson = friendList.getJSONObject(i);
            result.add((VKUser) VkJson2Class.toClass(userJson, VKUser.class));
        }
        return result;
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/users.search
     * <p>
     * This method doesn't require any specific rights.
     */
    public String search(VKParameters params) {
        return execute(getUrl(VkApiMethods.SEARCH, params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/users.isAppUser
     * <p>
     * This method doesn't require any specific rights.
     */
    public String isAppUser(VKParameters params) {
        return execute(getUrl("isAppUser", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/users.getSubscriptions
     * <p>
     * This is an open method; it does not require an access_token.
     */
    public String getSubscriptions(VKParameters params) {
        return execute(getUrl("getSubscriptions", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/users.getFollowers
     * <p>
     * This is an open method; it does not require an access_token.
     */
    public String getFollowers(VKParameters params) {
        return execute(getUrl("getFollowers", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * <p>
     * https://vk.com/dev/users.report
     * Created on 29.01.14.
     * <p>
     * This method is available only to standalone-applications.
     */
    public String report(VKParameters params) {
        return execute(getUrl("report", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/users.getNearby
     * <p>
     * This method is available only to standalone-applications.
     */
    public String getNearby(VKParameters params) {
        return execute(getUrl("getNearby", params)).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "users";
    }
}
