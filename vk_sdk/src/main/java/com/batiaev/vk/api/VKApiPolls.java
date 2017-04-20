/*
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk.api;

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.consts.VkApiMethods;

/**
 * Builds requests for API.polls part
 * <p>
 * https://vk.com/dev/polls
 *
 * @author batiaev
 * @since 17/04/15
 */
public class VKApiPolls extends VKApiBase {

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/polls.getById
     * <p>
     * You need the following rights to call this method: wall.
     */
    public String getById(VKParameters params) {
        return execute(getUrl(VkApiMethods.GET_BY_ID, params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/places.addVote
     * <p>
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
     * <p>
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
     * <p>
     * This method doesn't require any specific rights.
     */
    public String getVoters(VKParameters params) {
        return execute(getUrl("getVoters", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/places.create
     * <p>
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
     * <p>
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
