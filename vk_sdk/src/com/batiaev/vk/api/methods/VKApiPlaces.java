package com.batiaev.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKParameters;

/**
 * Builds requests for API.places part
 * 
 * https://vk.com/dev/places
 */
public class VKApiPlaces extends VKApiBase {
    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/places.add
     *
     * This method doesn't require any specific rights.
     */
    public String add(VKParameters params) {
        return prepareRequest("add", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/places.getById
     *
     * This method doesn't require any specific rights. 
     */
    public String getById(VKParameters params) {
        return prepareRequest("getById", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/places.search
     *
     * This method doesn't require any specific rights. 
     */
    public String search(VKParameters params) {
        return prepareRequest("search", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/places.checkin
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.  
     */
    public String checkin(VKParameters params) {
        return prepareRequest("checkin", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/places.getCheckins
     *
     * This method doesn't require any specific rights. 
     */
    public String getCheckins(VKParameters params) {
        return prepareRequest("getCheckins", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/places.getTypes
     *
     * This method doesn't require any specific rights. 
     */
    public String getTypes(VKParameters params) {
        return prepareRequest("getTypes", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "places";
    }
}
