package com.batiaev.vk.api.methods;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.annotation.Rights;
import com.batiaev.vk.api.consts.VKApiDatabaseConsts;
import com.batiaev.vk.api.consts.VKApiJsonConst;
import com.batiaev.vk.api.consts.VKApiRigths;
import com.batiaev.vk.api.dataTypes.VKCity;
import com.batiaev.vk.api.dataTypes.VKCountry;
import com.batiaev.vk.sdk.VkLocalCache;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author anbat
 * Builds requests for API.database part
 * 
 * https://vk.com/dev/database
 */
public class VKApiDatabase extends VKApiBase {
    private static final Logger LOG = LogManager.getLogger(VKApiDatabase.class);

    /**
     * <a href="https://vk.com/dev/database.getCountries">API database.getCountries()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(value = VKApiRigths.OPEN_METHOD)
    public String getCountries(VKParameters params) {
        return prepareRequest("getCountries", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/database.getRegions">API database.getRegions()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(value = VKApiRigths.OPEN_METHOD)
    public String getRegions(VKParameters params) {
        return prepareRequest("getRegions", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/database.getStreetsById">API database.getStreetsById()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(value = VKApiRigths.OPEN_METHOD)
    public String getStreetsById(VKParameters params) {
        return prepareRequest("getStreetsById", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/database.getCountriesById">API database.getCountriesById()</a>
     * @param params method parameters
     * @return VKCountry with required id
     */
    @Rights(value = VKApiRigths.OPEN_METHOD)
    public VKCountry getCountriesById(VKParameters params) {
        VKCountry country = new VKCountry();

        int countryId = Integer.parseInt(params.value(VKApiDatabaseConsts.COUNTRY_IDS));
        if (VkLocalCache.hastCountry(countryId)) {
            country.setId(countryId);
            country.setName(VkLocalCache.getCountry(countryId));
        } else {
            String respond = prepareRequest("getCountriesById", params).getRequest();

            LOG.info(respond);

            JSONObject obj = new JSONObject(respond);
            final JSONArray countryList = obj.getJSONArray(VKApiJsonConst.RESPONSE);

            if (countryList.length() == 0) return country;

            JSONObject countryJson = countryList.getJSONObject(0);

            country.setId(countryJson.getInt(VKApiDatabaseConsts.CID));
            country.setName(countryJson.getString(VKApiDatabaseConsts.NAME));

            VkLocalCache.setCountry(country.id(), country.name());
        }
        return country;
    }

    /**
     * <a href="https://vk.com/dev/database.getCities">API database.getCities()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(value = VKApiRigths.OPEN_METHOD)
    public String getCities(VKParameters params) {
        return prepareRequest("getCities", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/database.getCitiesById">API database.getCitiesById()</a>
     * @param params method parameters
     * @return city with required id
     */
    @Rights(value = VKApiRigths.OPEN_METHOD)
    public VKCity getCitiesById(VKParameters params) {
        VKCity city = new VKCity();
        int cityId = Integer.parseInt(params.value(VKApiDatabaseConsts.CITY_IDS));
        city.setId(cityId);

        if (VkLocalCache.hastCity(cityId)) {
            city.setName(VkLocalCache.getCity(cityId));
        } else {
            String respond = prepareRequest("getCitiesById", params).getRequest();

            LOG.info(respond);

            JSONObject obj = new JSONObject(respond);
            final JSONArray cityList = obj.getJSONArray(VKApiJsonConst.RESPONSE);

            if (cityList.length() == 0) return city;

            JSONObject cityJson = cityList.getJSONObject(0);

            city.setId(cityJson.getInt(VKApiDatabaseConsts.CID));
            city.setName(cityJson.getString(VKApiDatabaseConsts.NAME));

            VkLocalCache.setCity(city.id(), city.name());
        }

        return city;
    }

    /**
     * <a href="https://vk.com/dev/database.getUniversities">API database.getUniversities()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(value = VKApiRigths.OPEN_METHOD)
    public String getUniversities(VKParameters params) {
        return prepareRequest("getUniversities", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/database.getSchools">API database.getSchools()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(value = VKApiRigths.OPEN_METHOD)
    public String getSchools(VKParameters params) {
        return prepareRequest("getSchools", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/database.getSchoolClasses">API database.getSchoolClasses()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(value = VKApiRigths.OPEN_METHOD)
    public String getSchoolClasses(VKParameters params) {
        return prepareRequest("getSchoolClasses", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/database.getFaculties">API database.getFaculties()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(value = VKApiRigths.OPEN_METHOD)
    public String getFaculties(VKParameters params) {
        return prepareRequest("getFaculties", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/database.getChairs">API database.getChairs()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(value = VKApiRigths.OPEN_METHOD)
    public String getChairs(VKParameters params) {
        return prepareRequest("getChairs", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "database";
    }
}
