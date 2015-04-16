package com.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;

/**
 * Builds requests for API.places part
 * 
 * https://vk.com/dev/places
 */
public class VKApiPlaces extends VKApiBase {

    /**
     * https://vk.com/dev/places.add
     *
     * This method doesn't require any specific rights.
     */
    public VKRequest add(VKParameters params) {
        return prepareRequest("add", params);
    }

    /**
     * https://vk.com/dev/places.getById
     *
     * This method doesn't require any specific rights. 
     */
    public VKRequest getById(VKParameters params) {
        return prepareRequest("getById", params);
    }

    /**
     * https://vk.com/dev/places.search
     *
     * This method doesn't require any specific rights. 
     */
    public VKRequest search(VKParameters params) {
        return prepareRequest("search", params);
    }

    /**
     * https://vk.com/dev/places.checkin
     *
     * You need the following rights to call this method: wall. (Read more on rights)
     * This method is available only to standalone-applications.  
     */
    public VKRequest checkin(VKParameters params) {
        return prepareRequest("checkin", params);
    }

    /**
     * https://vk.com/dev/places.getCheckins
     *
     * This method doesn't require any specific rights. 
     */
    public VKRequest getCheckins(VKParameters params) {
        return prepareRequest("getCheckins", params);
    }

    /**
     * https://vk.com/dev/places.getTypes
     *
     * This method doesn't require any specific rights. 
     */
    public VKRequest getTypes(VKParameters params) {
        return prepareRequest("getTypes", params);
    }
}
