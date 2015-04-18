package com.batyaev.vk.api.methods;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batyaev.vk.api.VKParameters;
import com.batyaev.vk.api.VKRequest;

/**
 * Builds requests for API.polls part
 * 
 * https://vk.com/dev/polls
 */
public class VKApiPolls extends VKApiBase {

    /**
     * https://vk.com/dev/polls.getById
     *
     * You need the following rights to call this method: wall.
     */
    public VKRequest getById(VKParameters params) {
        return prepareRequest("getById", params);
    }

    /**
     * https://vk.com/dev/places.addVote
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public VKRequest addVote(VKParameters params) {
        return prepareRequest("addVote", params);
    }

    /**
     * https://vk.com/dev/places.deleteVote
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public VKRequest deleteVote(VKParameters params) {
        return prepareRequest("deleteVote", params);
    }

    /**
     * https://vk.com/dev/places.getVoters
     *
     * This method doesn't require any specific rights.
     */
    public VKRequest getVoters(VKParameters params) {
        return prepareRequest("getVoters", params);
    }

    /**
     * https://vk.com/dev/places.create
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public VKRequest create(VKParameters params) {
        return prepareRequest("create", params);
    }

    /**
     * https://vk.com/dev/places.edit
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public VKRequest edit(VKParameters params) {
        return prepareRequest("edit", params);
    }

    @Override
    protected String getMethodsGroup() {
        return "polls";
    }
}
