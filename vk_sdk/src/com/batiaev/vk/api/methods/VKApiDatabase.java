package com.batiaev.vk.api.methods;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.consts.VKApiConst;
import com.batiaev.vk.api.consts.VKApiDatabaseConsts;
import com.batiaev.vk.api.dataTypes.VKCity;
import com.batiaev.vk.api.dataTypes.VKCountry;
import com.batiaev.vk.sdk.VkLocalCache;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Builds requests for API.database part
 * 
 * https://vk.com/dev/database
 */
public class VKApiDatabase extends VKApiBase {
    private static final Logger LOG = LogManager.getLogger(VKApiDatabase.class);

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/database.getCountries
     *
     * This is an open method; it does not require an access_token.
     */
    public String getCountries(VKParameters params) {
        return prepareRequest("getCountries", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/database.getRegions
     *
     * This is an open method; it does not require an access_token.
     */
    public String getRegions(VKParameters params) {
        return prepareRequest("getRegions", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/database.getStreetsById
     *
     * This is an open method; it does not require an access_token.
     */
    public String getStreetsById(VKParameters params) {
        return prepareRequest("getStreetsById", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return VKCountry with required id
     * https://vk.com/dev/database.getCountriesById
     *
     * This is an open method; it does not require an access_token.
     */
    public VKCountry getCountriesById(VKParameters params) {
        VKCountry country = new VKCountry();

        int countryId = Integer.parseInt(params.value(VKApiDatabaseConsts.COUNTRY_IDS));
        if (VkLocalCache.countriesCashe.containsKey(countryId)) {
            country.id = countryId;
            country.name = VkLocalCache.countriesCashe.get(countryId);
        } else {
            String respond = "";
            respond = prepareRequest("getCountriesById", params).getRequest();

            LOG.info(respond);

            JSONObject obj = new JSONObject(respond);
            final JSONArray countryList = obj.getJSONArray(VKApiConst.RESPONSE);

            if (countryList.length() == 0)
                return country;

            JSONObject countryJson = countryList.getJSONObject(0);

            country.id = countryJson.getInt(VKApiDatabaseConsts.CID);
            country.name = countryJson.getString(VKApiDatabaseConsts.NAME);

            VkLocalCache.countriesCashe.put(country.id, country.name);
        }
        return country;
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/database.getCities
     *
     * This is an open method; it does not require an access_token.
     */
    public String getCities(VKParameters params) {
        return prepareRequest("getCities", params).getRequest();
    }

    /**
     * @param params method parameters
     * https://vk.com/dev/database.getCitiesById
     *
     * This is an open method; it does not require an access_token.
     */
    public VKCity getCitiesById(VKParameters params) {
        VKCity city = new VKCity();
        int cityId = Integer.parseInt(params.value(VKApiDatabaseConsts.CITY_IDS));
        city.id = cityId;

        if (VkLocalCache.citiesCashe.containsKey(cityId)) {
            city.name = VkLocalCache.citiesCashe.get(cityId);
        }
        else {
            String respond = "";
            respond = prepareRequest("getCitiesById", params).getRequest();

            LOG.info(respond);

            JSONObject obj = new JSONObject(respond);
            final JSONArray cityList = obj.getJSONArray(VKApiConst.RESPONSE);

            if (cityList.length() == 0)
                return city;

            JSONObject cityJson = cityList.getJSONObject(0);

            city.id = cityJson.getInt(VKApiDatabaseConsts.CID);
            city.name = cityJson.getString(VKApiDatabaseConsts.NAME);

            VkLocalCache.citiesCashe.put(city.id, city.name);
        }

        return city;
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/database.getUniversities
     *
     * This is an open method; it does not require an access_token.
     */
    public String getUniversities(VKParameters params) {
        return prepareRequest("getUniversities", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/database.getSchools
     *
     * This is an open method; it does not require an access_token.
     */
    public String getSchools(VKParameters params) {
        return prepareRequest("getSchools", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/database.getSchoolClasses
     *
     * This is an open method; it does not require an access_token.
     */
    public String getSchoolClasses(VKParameters params) {
        return prepareRequest("getSchoolClasses", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/database.getFaculties
     *
     * This is an open method; it does not require an access_token.
     */
    public String getFaculties(VKParameters params) {
        return prepareRequest("getFaculties", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/database.getChairs
     *
     * This is an open method; it does not require an access_token.
     */
    public String getChairs(VKParameters params) {
        return prepareRequest("getChairs", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "database";
    }
}
