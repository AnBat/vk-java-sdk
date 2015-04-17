package com.vk.api.methods;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.vk.api.VKParameters;
import com.vk.api.VKRequest;

/**
 * Builds requests for API.database part
 * 
 * https://vk.com/dev/database
 */
public class VKApiDatabase extends VKApiBase {

    /**
     * https://vk.com/dev/database.getCountries
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest getCountries(VKParameters params) {
        return prepareRequest("getCountries", params);
    }

    /**
     * https://vk.com/dev/database.getRegions
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest getRegions(VKParameters params) {
        return prepareRequest("getRegions", params);
    }

    /**
     * https://vk.com/dev/database.getStreetsById
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest getStreetsById(VKParameters params) {
        return prepareRequest("getStreetsById", params);
    }

    /**
     * https://vk.com/dev/database.getCountriesById
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest getCountriesById(VKParameters params) {
        return prepareRequest("getCountriesById", params);
    }

    /**
     * https://vk.com/dev/database.getCities
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest getCities(VKParameters params) {
        return prepareRequest("getCities", params);
    }

    /**
     * https://vk.com/dev/database.getCitiesById
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest getCitiesById(VKParameters params) {
        return prepareRequest("getCitiesById", params);
    }

    /**
     * https://vk.com/dev/database.getUniversities
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest getUniversities(VKParameters params) {
        return prepareRequest("getUniversities", params);
    }

    /**
     * https://vk.com/dev/database.getSchools
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest getSchools(VKParameters params) {
        return prepareRequest("getSchools", params);
    }

    /**
     * https://vk.com/dev/database.getSchoolClasses
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest getSchoolClasses(VKParameters params) {
        return prepareRequest("getSchoolClasses", params);
    }

    /**
     * https://vk.com/dev/database.getFaculties
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest getFaculties(VKParameters params) {
        return prepareRequest("getFaculties", params);
    }

    /**
     * https://vk.com/dev/database.getChairs
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest getChairs(VKParameters params) {
        return prepareRequest("getChairs", params);
    }
}
