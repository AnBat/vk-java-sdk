/*
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk.api;

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.consts.VkApiMethods;

/**
 * Builds requests for API.places part
 * <p>
 * https://vk.com/dev/places
 *
 * @author batiaev
 * @since 15/04/15
 */
public class VKApiPlaces extends VKApiBase {
    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/places.add
     * <p>
     * This method doesn't require any specific rights.
     */
    public String add(VKParameters params) {
        return execute(getUrl(VkApiMethods.ADD, params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/places.getById
     * <p>
     * This method doesn't require any specific rights.
     */
    public String getById(VKParameters params) {
        return execute(getUrl(VkApiMethods.GET_BY_ID, params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/places.search
     * <p>
     * This method doesn't require any specific rights.
     */
    public String search(VKParameters params) {
        return execute(getUrl(VkApiMethods.SEARCH, params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/places.checkin
     * <p>
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
     * <p>
     * This method doesn't require any specific rights.
     */
    public String getCheckins(VKParameters params) {
        return execute(getUrl("getCheckins", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/places.getTypes
     * <p>
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
