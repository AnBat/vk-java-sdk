package com.batiaev.vk.api.system;

import com.batiaev.vk.api.VKError;
import com.batiaev.vk.api.consts.VKApiConst;
import com.batiaev.vk.api.consts.VKApiJsonConst;
import com.batiaev.vk.api.consts.VKApiUserConsts;
import com.batiaev.vk.api.dataTypes.*;
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

        if (userJson.has(VKApiJsonConst.ID))
            user.setUserId(userJson.getInt(VKApiJsonConst.ID));
        if (userJson.has(VKApiUserConsts.UID))
            user.setUserId(userJson.getInt(VKApiUserConsts.UID));
        if (userJson.has(VKApiUserConsts.FIRST_NAME))
            user.setFirstName(userJson.getString(VKApiUserConsts.FIRST_NAME));
        if (userJson.has(VKApiUserConsts.LAST_NAME))
            user.setLastName(userJson.getString(VKApiUserConsts.LAST_NAME));
        if (userJson.has(VKApiUserConsts.DEACTIVATED))
            user.setDeactivated(userJson.getString(VKApiUserConsts.DEACTIVATED));
        if (userJson.has(VKApiUserConsts.HIDDEN))
            user.setHidden(userJson.getInt(VKApiUserConsts.HIDDEN));
        if (userJson.has(VKApiUserConsts.VERIFIED))
            user.setVerified(userJson.getInt(VKApiUserConsts.VERIFIED));
        if (userJson.has(VKApiUserConsts.BLACKLISTED))
            user.setBlacklisted(userJson.getInt(VKApiUserConsts.BLACKLISTED));
        if (userJson.has(VKApiUserConsts.SEX))
            user.setSex(userJson.getInt(VKApiUserConsts.SEX));
        if (userJson.has(VKApiUserConsts.NICKNAME))
            user.setNickname(userJson.getString(VKApiUserConsts.NICKNAME));
        if (userJson.has(VKApiUserConsts.PHOTO_50))
            user.setPhoto50(userJson.getString(VKApiUserConsts.PHOTO_50));
        if (userJson.has(VKApiUserConsts.PHOTO_100))
            user.setPhoto100(userJson.getString(VKApiUserConsts.PHOTO_100));
        if (userJson.has(VKApiUserConsts.PHOTO_200))
            user.setPhoto200(userJson.getString(VKApiUserConsts.PHOTO_200));
        if (userJson.has(VKApiUserConsts.PHOTO_200_ORIG))
            user.setPhoto200orig(userJson.getString(VKApiUserConsts.PHOTO_200_ORIG));
        if (userJson.has(VKApiUserConsts.PHOTO_400_ORIG))
            user.setPhoto400orig(userJson.getString(VKApiUserConsts.PHOTO_400_ORIG));
        if (userJson.has(VKApiUserConsts.PHOTO_MAX))
            user.setPhotoMax(userJson.getString(VKApiUserConsts.PHOTO_MAX));
        if (userJson.has(VKApiUserConsts.PHOTO_MAX_ORIG))
            user.setPhotoMaxOrig(userJson.getString(VKApiUserConsts.PHOTO_MAX_ORIG));
        if (userJson.has(VKApiUserConsts.ONLINE))
            user.setOnline(userJson.getInt(VKApiUserConsts.ONLINE));
        if (userJson.has(VKApiUserConsts.CITY)) {
            JSONObject cityJson = userJson.getJSONObject(VKApiUserConsts.CITY);
            VKCity city = new VKCity();
            city.setId(cityJson.getInt(VKApiConst.ID));
            city.setName(cityJson.getString(VKApiConst.TITLE));
            user.setCity(city);
        }
        if (userJson.has(VKApiUserConsts.COUNTRY)) {
            JSONObject countryJson = userJson.getJSONObject(VKApiUserConsts.COUNTRY);
            VKCountry country = new VKCountry();
            country.setId(countryJson.getInt(VKApiConst.ID));
            country.setName(countryJson.getString(VKApiConst.TITLE));
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

    public static VKMessage parseMessage(JSONObject json) {
        VKMessage message = new VKMessage();

        if (json.has(VKApiJsonConst.ID)) message.setId(json.getInt(VKApiJsonConst.ID));
        if (json.has(VKApiJsonConst.USER_ID)) message.setUserId(json.getInt(VKApiJsonConst.USER_ID));
        if (json.has(VKApiJsonConst.FROM_ID)) message.setFrom_id(json.getInt(VKApiJsonConst.FROM_ID));
        if (json.has(VKApiJsonConst.OUT)) message.setOut(json.getInt(VKApiJsonConst.OUT) == 1);
        if (json.has(VKApiJsonConst.READ_STATE)) message.setReadState(json.getInt(VKApiJsonConst.READ_STATE) == 1);
        if (json.has(VKApiJsonConst.TITLE)) message.setTitle(json.getString(VKApiJsonConst.TITLE));
        if (json.has(VKApiJsonConst.DATE)) message.setDate(new Date((long)json.getInt(VKApiJsonConst.DATE) * 1000));
        if (json.has(VKApiJsonConst.BODY)) message.setBody(json.getString(VKApiJsonConst.BODY));
        if (json.has(VKApiJsonConst.ATTACHMENTS)) {
            JSONArray attachments = json.getJSONArray(VKApiJsonConst.ATTACHMENTS);
            for (int i = 0; i < attachments.length(); ++i)
                message.addAttachment(parseAttachment(attachments.getJSONObject(i)));
        }
        if (json.has(VKApiJsonConst.FWD_MESSAGES)) {
            JSONArray fwd_messages = json.getJSONArray(VKApiJsonConst.FWD_MESSAGES);
            for (int i = 0; i < fwd_messages.length(); ++i)
                message.addFwdMessage(parseMessage(fwd_messages.getJSONObject(i)));
        }

        if (json.has(VKApiJsonConst.EMOJI))
            message.setEmoji(json.getInt(VKApiJsonConst.EMOJI) == 1);
        return message;
    }
    public static VkAttachment parseAttachment(JSONObject attachJSON) {
        String type = attachJSON.getString(VKApiJsonConst.TYPE);
        switch (type) {
            case VKApiConst.PHOTO:
                VkPhotoAttachment photoAttach = new VkPhotoAttachment();
                photoAttach.setPhoto(parsePhoto(attachJSON.getJSONObject(VKApiConst.PHOTO)));
                photoAttach.setJson(attachJSON.toString());
                photoAttach.setValue(photoAttach.photo().photoMax());
                return photoAttach;
            default:
                VkAttachment attach = new VkAttachment();
                attach.setType(type);
                attach.setJson(attachJSON.toString());
                attach.setValue(attachJSON.toString());
                return attach;
        }
    }

        public static VKError parseError(JSONObject errorJson) {
        VKError error = new VKError();
        error.error_code = errorJson.getInt(VKApiJsonConst.ERROR_CODE);
        error.error_msg = errorJson.getString(VKApiJsonConst.ERROR_MSG);
        JSONArray requestParams = errorJson.getJSONArray(VKApiConst.REQUEST_PARAMS);
        for (int i = 0; i < requestParams.length(); ++i) {
            JSONObject param = requestParams.getJSONObject(i);
            error.request_params.put(param.getString(VKApiConst.KEY), param.getString(VKApiConst.VALUE));
        }
        return error;
    }

    public static VKPhoto parsePhoto(JSONObject photoJson) {

        VKPhoto photo = new VKPhoto();
        if (photoJson.has(VKApiJsonConst.ID)) photo.setId(photoJson.getInt(VKApiJsonConst.ID));
        if (photoJson.has(VKApiJsonConst.USER_ID)) photo.setUserId(photoJson.getInt(VKApiJsonConst.USER_ID));
        if (photoJson.has(VKApiJsonConst.OWNER_ID)) photo.setOwnerId(photoJson.getInt(VKApiJsonConst.OWNER_ID));
        if (photoJson.has(VKApiJsonConst.ALBUM_ID)) photo.setAlbumId(photoJson.getInt(VKApiJsonConst.ALBUM_ID));
        if (photoJson.has(VKApiJsonConst.ALBUM_ID)) photo.setDate(photoJson.getInt(VKApiJsonConst.DATE));
        if (photoJson.has(VKApiJsonConst.ALBUM_ID)) photo.setText(photoJson.getString(VKApiJsonConst.TEXT));
        if (photoJson.has(VKApiJsonConst.HEIGHT)) photo.setHeight(photoJson.getInt(VKApiJsonConst.HEIGHT));
        if (photoJson.has(VKApiJsonConst.WIDTH)) photo.setWidth(photoJson.getInt(VKApiJsonConst.WIDTH));
        if (photoJson.has(VKApiJsonConst.PHOTO_75)) photo.setPhoto75(photoJson.getString(VKApiJsonConst.PHOTO_75));
        if (photoJson.has(VKApiJsonConst.PHOTO_130)) photo.setPhoto130(photoJson.getString(VKApiJsonConst.PHOTO_130));
        if (photoJson.has(VKApiJsonConst.PHOTO_604)) photo.setPhoto604(photoJson.getString(VKApiJsonConst.PHOTO_604));
        if (photoJson.has(VKApiJsonConst.PHOTO_807)) photo.setPhoto807(photoJson.getString(VKApiJsonConst.PHOTO_807));
        if (photoJson.has(VKApiJsonConst.PHOTO_1280)) photo.setPhoto1280(photoJson.getString(VKApiJsonConst.PHOTO_1280));
        if (photoJson.has(VKApiJsonConst.PHOTO_2560)) photo.setPhoto2560(photoJson.getString(VKApiJsonConst.PHOTO_2560));

        return photo;
    }

    public static VkChatMessage parseChat(JSONObject jsonObject) {

        JSONObject json = jsonObject.getJSONObject(VKApiJsonConst.MESSAGE);

        VkChatMessage chat = new VkChatMessage();

        //for chat only
        if (json.has(VKApiJsonConst.ADMIN_ID)) chat.setAdminId(json.getInt(VKApiJsonConst.ADMIN_ID));
        if (json.has(VKApiJsonConst.CHAT_ID)) chat.setChatId(json.getInt(VKApiJsonConst.CHAT_ID));
        if (json.has(VKApiJsonConst.USER_COUNT)) chat.setUsersCount(json.getInt(VKApiJsonConst.USER_COUNT));

        //TODO replace on parseMessage()
        if (json.has(VKApiJsonConst.ID)) chat.setId(json.getInt(VKApiJsonConst.ID));
        if (json.has(VKApiJsonConst.USER_ID)) chat.setUserId(json.getInt(VKApiJsonConst.USER_ID));
        if (json.has(VKApiJsonConst.FROM_ID)) chat.setFrom_id(json.getInt(VKApiJsonConst.FROM_ID));
        if (json.has(VKApiJsonConst.OUT)) chat.setOut(json.getInt(VKApiJsonConst.OUT) == 1);
        if (json.has(VKApiJsonConst.READ_STATE)) chat.setReadState(json.getInt(VKApiJsonConst.READ_STATE) == 1);
        if (json.has(VKApiJsonConst.TITLE)) chat.setTitle(json.getString(VKApiJsonConst.TITLE));
        if (json.has(VKApiJsonConst.DATE)) chat.setDate(new Date((long) json.getInt(VKApiJsonConst.DATE) * 1000));
        if (json.has(VKApiJsonConst.BODY)) chat.setBody(json.getString(VKApiJsonConst.BODY));
        return chat;
    }
}
