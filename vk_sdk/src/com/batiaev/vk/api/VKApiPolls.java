package com.batiaev.vk.api;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.common.VKParameters;

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
        return execute("getById", params).toString();
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
        return execute("addVote", params).toString();
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
        return execute("deleteVote", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/places.getVoters
     *
     * This method doesn't require any specific rights.
     */
    public String getVoters(VKParameters params) {
        return execute("getVoters", params).toString();
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
        return execute("create", params).toString();
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
        return execute("edit", params).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "polls";
    }
}
