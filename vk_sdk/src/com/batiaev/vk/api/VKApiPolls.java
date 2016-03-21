package com.batiaev.vk.api;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.consts.VkApiMethods;

/**
 * @author batiaev
 *
 * Builds requests for API.polls part
 * 
 * https://vk.com/dev/polls
 */
public class VKApiPolls extends VKApiBase {

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/polls.getById
     *
     * You need the following rights to call this method: wall.
     */
    public String getById(VKParameters params) {
        return execute(getUrl(VkApiMethods.GET_BY_ID, params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/places.addVote
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String addVote(VKParameters params) {
        return execute(getUrl("addVote", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/places.deleteVote
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String deleteVote(VKParameters params) {
        return execute(getUrl("deleteVote", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/places.getVoters
     *
     * This method doesn't require any specific rights.
     */
    public String getVoters(VKParameters params) {
        return execute(getUrl("getVoters", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/places.create
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String create(VKParameters params) {
        return execute(getUrl(VkApiMethods.CREATE, params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/places.edit
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String edit(VKParameters params) {
        return execute(getUrl(VkApiMethods.EDIT, params)).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "polls";
    }
}
