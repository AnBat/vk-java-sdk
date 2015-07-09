package com.batiaev.vk.api.system;

import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.consts.VKApiDatabaseConsts;
import com.batiaev.vk.api.consts.VKApiUserConsts;
import com.batiaev.vk.api.dataTypes.VKUser;
import com.batiaev.vk.api.methods.VKApiDatabase;
import org.json.JSONObject;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * @author batiaev
 * Created by batiaev on 09/07/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */
public class VkJsonParser {
    public static VKUser parseUser(JSONObject userJson) {
        VKUser user = new VKUser();

        if (userJson.has(VKApiUserConsts.UID))
            user.setUserId(userJson.getInt(VKApiUserConsts.UID));
        if (userJson.has(VKApiUserConsts.FIRST_NAME))
            user.setFirstName(userJson.getString(VKApiUserConsts.FIRST_NAME));
        if (userJson.has(VKApiUserConsts.LAST_NAME))
            user.setLastName(userJson.getString(VKApiUserConsts.LAST_NAME));
        if (userJson.has(VKApiUserConsts.SEX))
            user.setSex(userJson.getInt(VKApiUserConsts.SEX));
        if (userJson.has(VKApiUserConsts.NICKNAME))
            user.setNickname(userJson.getString(VKApiUserConsts.NICKNAME));
        if (userJson.has(VKApiUserConsts.PHOTO_MAX_ORIG))
            user.setPhotoMaxOrig(userJson.getString(VKApiUserConsts.PHOTO_MAX_ORIG));
        if (userJson.has(VKApiUserConsts.ONLINE))
            user.setOnline(userJson.getInt(VKApiUserConsts.ONLINE) == 1);
        if (userJson.has(VKApiUserConsts.CITY)) {
            VKApiDatabase database = new VKApiDatabase();
            VKParameters cityParams = new VKParameters();
            cityParams.setValue(VKApiDatabaseConsts.NEED_ALL, 1);
            cityParams.setValue(VKApiDatabaseConsts.CITY_IDS, userJson.getInt(VKApiUserConsts.CITY));
            user.setCity(database.getCitiesById(cityParams));
        }
        if (userJson.has(VKApiUserConsts.COUNTRY)) {
            VKApiDatabase database = new VKApiDatabase();
            VKParameters countryParams = new VKParameters();
            countryParams.setValue(VKApiDatabaseConsts.NEED_ALL, 1);
            countryParams.setValue(VKApiDatabaseConsts.COUNTRY_IDS, userJson.getInt(VKApiUserConsts.COUNTRY));
            user.setCountry(database.getCountriesById(countryParams));
        }
        if (userJson.has(VKApiUserConsts.BDATE)) {
            String bDateString = userJson.getString(VKApiUserConsts.BDATE);

            try {
                DateFormat format = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
                user.setBirthday(format.parse(bDateString));
            } catch (ParseException e) {
                DateFormat format = new SimpleDateFormat("dd.MM", Locale.ENGLISH);
                try {
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(format.parse(bDateString));
                    cal.set(Calendar.YEAR, 0);
                    user.setBirthday(cal.getTime());
                } catch (ParseException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return user;
    }
}
