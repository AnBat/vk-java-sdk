package com.batiaev.vk.api;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.annotation.Rights;
import com.batiaev.vk.common.consts.VKApiJsonConst;
import com.batiaev.vk.common.consts.VKApiRigths;
import com.batiaev.vk.common.entity.VKCity;
import com.batiaev.vk.common.entity.VKCountry;
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
        return execute("getCountries", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/database.getRegions">API database.getRegions()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(value = VKApiRigths.OPEN_METHOD)
    public String getRegions(VKParameters params) {
        return execute("getRegions", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/database.getStreetsById">API database.getStreetsById()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(value = VKApiRigths.OPEN_METHOD)
    public String getStreetsById(VKParameters params) {
        return execute("getStreetsById", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/database.getCountriesById">API database.getCountriesById()</a>
     * @param params method parameters
     * @return VKCountry with required id
     */
    @Rights(value = VKApiRigths.OPEN_METHOD)
    public VKCountry getCountriesById(VKParameters params) {
        VKCountry country = new VKCountry();

        int countryId = Integer.parseInt(params.value(VKApiJsonConst.COUNTRY_IDS));
        if (VkLocalCache.hastCountry(countryId)) {
            country.setId(countryId);
            country.setName(VkLocalCache.getCountry(countryId));
        } else {
            String respond = execute("getCountriesById", params).toString();

            LOG.info(respond);

            JSONObject obj = new JSONObject(respond);
            final JSONArray countryList = obj.getJSONArray(VKApiJsonConst.RESPONSE);

            if (countryList.length() == 0) return country;

            JSONObject countryJson = countryList.getJSONObject(0);

            country.setId(countryJson.getInt(VKApiJsonConst.CID));
            country.setName(countryJson.getString(VKApiJsonConst.NAME));

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
        return execute("getCities", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/database.getCitiesById">API database.getCitiesById()</a>
     * @param params method parameters
     * @return city with required id
     */
    @Rights(value = VKApiRigths.OPEN_METHOD)
    public VKCity getCitiesById(VKParameters params) {
        VKCity city = new VKCity();
        int cityId = Integer.parseInt(params.value(VKApiJsonConst.CITY_IDS));
        city.setId(cityId);

        if (VkLocalCache.hastCity(cityId)) {
            city.setName(VkLocalCache.getCity(cityId));
        } else {
            String respond = execute("getCitiesById", params).toString();

            LOG.info(respond);

            JSONObject obj = new JSONObject(respond);
            final JSONArray cityList = obj.getJSONArray(VKApiJsonConst.RESPONSE);

            if (cityList.length() == 0) return city;

            JSONObject cityJson = cityList.getJSONObject(0);

            city.setId(cityJson.getInt(VKApiJsonConst.CID));
            city.setName(cityJson.getString(VKApiJsonConst.NAME));

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
        return execute("getUniversities", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/database.getSchools">API database.getSchools()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(value = VKApiRigths.OPEN_METHOD)
    public String getSchools(VKParameters params) {
        return execute("getSchools", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/database.getSchoolClasses">API database.getSchoolClasses()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(value = VKApiRigths.OPEN_METHOD)
    public String getSchoolClasses(VKParameters params) {
        return execute("getSchoolClasses", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/database.getFaculties">API database.getFaculties()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(value = VKApiRigths.OPEN_METHOD)
    public String getFaculties(VKParameters params) {
        return execute("getFaculties", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/database.getChairs">API database.getChairs()</a>
     * @param params method parameters
     * @return String with json respond
     */
    @Rights(value = VKApiRigths.OPEN_METHOD)
    public String getChairs(VKParameters params) {
        return execute("getChairs", params).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "database";
    }
}
