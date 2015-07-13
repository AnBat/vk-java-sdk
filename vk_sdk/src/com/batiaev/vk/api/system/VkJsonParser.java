package com.batiaev.vk.api.system;

import com.batiaev.vk.api.VKError;
import com.batiaev.vk.api.consts.VKApiConst;
import com.batiaev.vk.api.consts.VKApiMessagesConsts;
import com.batiaev.vk.api.consts.VKApiUserConsts;
import com.batiaev.vk.api.dataTypes.VKCity;
import com.batiaev.vk.api.dataTypes.VKCountry;
import com.batiaev.vk.api.dataTypes.VKMessage;
import com.batiaev.vk.api.dataTypes.VKUser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author batiaev
 * Created by batiaev on 09/07/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */
public class VkJsonParser {
    private static final Logger LOG = LogManager.getLogger(VkJsonParser.class);

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
            JSONObject cityJson = userJson.getJSONObject(VKApiUserConsts.CITY);
            VKCity city = new VKCity();
            city.id = cityJson.getInt(VKApiConst.ID);
            city.name = cityJson.getString(VKApiConst.TITLE);
            user.setCity(city);
        }
        if (userJson.has(VKApiUserConsts.COUNTRY)) {
            JSONObject countryJson = userJson.getJSONObject(VKApiUserConsts.COUNTRY);
            VKCountry country = new VKCountry();
            country.id = countryJson.getInt(VKApiConst.ID);
            country.name = countryJson.getString(VKApiConst.TITLE);
            user.setCountry(country);
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

    public static VKMessage parseMessage(JSONObject messageJson) {
        VKMessage message = new VKMessage();

        if (messageJson.has(VKApiMessagesConsts.ID))
            message.id = messageJson.getInt(VKApiMessagesConsts.ID);
        if (messageJson.has(VKApiMessagesConsts.USER_ID))
            message.user_id = messageJson.getInt(VKApiMessagesConsts.USER_ID);
        if (messageJson.has(VKApiMessagesConsts.FROM_ID))
            message.user_id = messageJson.getInt(VKApiMessagesConsts.FROM_ID);
        if (messageJson.has(VKApiMessagesConsts.OUT))
            message.out = messageJson.getInt(VKApiMessagesConsts.OUT) == 1;
        if (messageJson.has(VKApiMessagesConsts.READ_STATE))
            message.read_state = messageJson.getInt(VKApiMessagesConsts.READ_STATE) == 1;
        if (messageJson.has(VKApiMessagesConsts.TITLE))
            message.title = messageJson.getString(VKApiMessagesConsts.TITLE);
        if (messageJson.has(VKApiMessagesConsts.DATE))
            message.date = new Date((long)messageJson.getInt(VKApiMessagesConsts.DATE)*1000);
        if (messageJson.has(VKApiMessagesConsts.BODY))
            message.body = messageJson.getString(VKApiMessagesConsts.BODY);
        if (messageJson.has(VKApiMessagesConsts.EMOJI))
            message.emoji = messageJson.getInt(VKApiMessagesConsts.EMOJI) == 1;
        return message;
    }

    public static VKError parseError(JSONObject errorJson) {
        VKError error = new VKError();
        error.error_code = errorJson.getInt(VKApiConst.ERROR_CODE);
        error.error_msg = errorJson.getString(VKApiConst.ERROR_MSG);
        JSONArray requestParams = errorJson.getJSONArray(VKApiConst.REQUEST_PARAMS);
        for (int i = 0; i < requestParams.length(); ++i) {
            JSONObject param = requestParams.getJSONObject(i);
            error.request_params.put(param.getString(VKApiConst.KEY), param.getString(VKApiConst.VALUE));
        }
        return error;
    }
}
