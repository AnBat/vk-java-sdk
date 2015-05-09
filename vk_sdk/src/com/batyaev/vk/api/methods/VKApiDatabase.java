package com.batyaev.vk.api.methods;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batyaev.vk.api.VKParameters;
import com.batyaev.vk.api.VKRequest;
import com.batyaev.vk.api.consts.VKApiConst;
import com.batyaev.vk.api.consts.VKApiDatabaseConsts;
import com.batyaev.vk.api.dataTypes.VKCity;
import com.batyaev.vk.api.dataTypes.VKCountry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

/**
 * Builds requests for API.database part
 * 
 * https://vk.com/dev/database
 */
public class VKApiDatabase extends VKApiBase {
    private static final Logger LOG = LogManager.getLogger(VKRequest.class);

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
    public VKCountry getCountriesById(VKParameters params) throws IOException {

        String respond = prepareRequest("getCountriesById", params).getRequest();

        LOG.info(respond);
        JSONObject obj = new JSONObject(respond);
        final JSONArray countryList = obj.getJSONArray(VKApiConst.RESPONSE);

        VKCountry country = new VKCountry();
        if (countryList.length() == 0)
            return country;

        JSONObject countryJson = countryList.getJSONObject(0);

        country.id = countryJson.getInt(VKApiDatabaseConsts.CID);
        country.name = countryJson.getString(VKApiDatabaseConsts.NAME);

        return country;
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
    public VKCity getCitiesById(VKParameters params) throws IOException {
        String respond = prepareRequest("getCitiesById", params).getRequest();

        LOG.debug(respond);

        JSONObject obj = new JSONObject(respond);
        final JSONArray cityList = obj.getJSONArray(VKApiConst.RESPONSE);

        VKCity city = new VKCity();
        if (cityList.length() == 0)
            return city;

        JSONObject cityJson = cityList.getJSONObject(0);

        city.id = cityJson.getInt(VKApiDatabaseConsts.CID);
        city.name = cityJson.getString(VKApiDatabaseConsts.NAME);

        return city;
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

    @Override
    protected String getMethodsGroup() {
        return "database";
    }
}
