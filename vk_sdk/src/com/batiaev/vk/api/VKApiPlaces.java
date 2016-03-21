package com.batiaev.vk.api;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.consts.VkApiMethods;

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
        return execute(getUrl(VkApiMethods.ADD, params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/places.getById
     *
     * This method doesn't require any specific rights. 
     */
    public String getById(VKParameters params) {
        return execute(getUrl(VkApiMethods.GET_BY_ID, params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/places.search
     *
     * This method doesn't require any specific rights. 
     */
    public String search(VKParameters params) {
        return execute(getUrl(VkApiMethods.SEARCH, params)).toString();
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
        return execute(getUrl("checkin", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/places.getCheckins
     *
     * This method doesn't require any specific rights. 
     */
    public String getCheckins(VKParameters params) {
        return execute(getUrl("getCheckins", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/places.getTypes
     *
     * This method doesn't require any specific rights. 
     */
    public String getTypes(VKParameters params) {
        return execute(getUrl("getTypes", params)).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "places";
    }
}
