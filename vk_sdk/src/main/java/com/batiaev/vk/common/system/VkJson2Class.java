package com.batiaev.vk.common.system;

import com.batiaev.vk.common.consts.VKApiConst;
import com.batiaev.vk.common.consts.VKApiJsonConst;
import com.batiaev.vk.common.consts.VKApiUserConsts;
import com.batiaev.vk.common.entity.*;
import lombok.extern.slf4j.Slf4j;
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
 * @since 2/11/16
 */
@Slf4j
public class VkJson2Class {

    public static VkObject toClass(JSONObject jsonObject, Class type) {
        if (VkError.class.equals(type)) return parseError(jsonObject);
        else if (VKPost.class.equals(type)) return parsePost(jsonObject);
        else if (VKPhoto.class.equals(type)) return parsePhoto(jsonObject);
        else if (VkSticker.class.equals(type)) return parseSticker(jsonObject);
        else if (VKUser.class.equals(type)) return parseUser(jsonObject);
        else if (VKMessage.class.equals(type)) return parseMessage(jsonObject);
        else if (VkMessageAttachment.class.equals(type)) return parseAttachment(jsonObject);
        else if (VkChatMessage.class.equals(type)) return parseChat(jsonObject);

        return null;
    }

    public static JSONObject toJson(VkObject object) {
        return new JSONObject();
    }

    //---

    private static VkError parseError(JSONObject jsonObject) {
        log.debug("Parsing error...");
        VkError error = new VkError();
        error.error_code = jsonObject.getInt(VKApiJsonConst.ERROR_CODE);
        error.error_msg = jsonObject.getString(VKApiJsonConst.ERROR_MSG);
        JSONArray requestParams = jsonObject.getJSONArray(VKApiConst.REQUEST_PARAMS);
        for (int i = 0; i < requestParams.length(); ++i) {
            JSONObject param = requestParams.getJSONObject(i);
            error.request_params.put(param.getString(VKApiConst.KEY), param.getString(VKApiConst.VALUE));
        }
        return error;
    }

    private static VKPost parsePost(JSONObject postJson) {
        log.debug("Parsing post...");
        VKPost post = new VKPost();
        if (postJson.has(VKApiJsonConst.ID)) post.setId(postJson.getInt(VKApiJsonConst.ID));
        if (postJson.has(VKApiJsonConst.OWNER_ID)) post.setOwnerId(postJson.getInt(VKApiJsonConst.OWNER_ID));
        if (postJson.has(VKApiJsonConst.FROM_ID)) post.setFromId(postJson.getInt(VKApiJsonConst.FROM_ID));
        if (postJson.has(VKApiJsonConst.DATE)) post.setDate(postJson.getInt(VKApiJsonConst.DATE));
        if (postJson.has(VKApiJsonConst.TEXT)) post.setText(postJson.getString(VKApiJsonConst.TEXT));
        if (postJson.has(VKApiJsonConst.REPLY_OWNER_ID))
            post.setReplyOwnerId(postJson.getInt(VKApiJsonConst.REPLY_OWNER_ID));
        if (postJson.has(VKApiJsonConst.REPLY_POST_ID))
            post.setReplyPostId(postJson.getInt(VKApiJsonConst.REPLY_POST_ID));
        if (postJson.has(VKApiJsonConst.FRIENDS_ONLY))
            post.setFriendsOnly(postJson.getInt(VKApiJsonConst.FRIENDS_ONLY));
        //FIXME
        return post;
    }

    private static VKPhoto parsePhoto(JSONObject photoJson) {
        log.debug("Parsing photo...");

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
        if (photoJson.has(VKApiJsonConst.PHOTO_1280))
            photo.setPhoto1280(photoJson.getString(VKApiJsonConst.PHOTO_1280));
        if (photoJson.has(VKApiJsonConst.PHOTO_2560))
            photo.setPhoto2560(photoJson.getString(VKApiJsonConst.PHOTO_2560));

        return photo;
    }

    private static VKPhoto parseSticker(JSONObject stickerJson) {
        log.debug("Parsing sticker...");

        VkSticker sticker = new VkSticker();
        if (stickerJson.has(VKApiJsonConst.ID)) sticker.setId(stickerJson.getInt(VKApiJsonConst.ID));
        if (stickerJson.has(VKApiJsonConst.HEIGHT)) sticker.setHeight(stickerJson.getInt(VKApiJsonConst.HEIGHT));
        if (stickerJson.has(VKApiJsonConst.WIDTH)) sticker.setWidth(stickerJson.getInt(VKApiJsonConst.WIDTH));
        if (stickerJson.has(VKApiJsonConst.PHOTO_64))
            sticker.setPhoto75(stickerJson.getString(VKApiJsonConst.PHOTO_64));
        if (stickerJson.has(VKApiJsonConst.PHOTO_128))
            sticker.setPhoto130(stickerJson.getString(VKApiJsonConst.PHOTO_128));
        if (stickerJson.has(VKApiJsonConst.PHOTO_256))
            sticker.setPhoto604(stickerJson.getString(VKApiJsonConst.PHOTO_256));
        if (stickerJson.has(VKApiJsonConst.PHOTO_352))
            sticker.setPhoto604(stickerJson.getString(VKApiJsonConst.PHOTO_352));
        if (stickerJson.has(VKApiJsonConst.PHOTO_512))
            sticker.setPhoto604(stickerJson.getString(VKApiJsonConst.PHOTO_512));

        return sticker;
    }

    private static VKUser parseUser(JSONObject userJson) {
        log.debug("Parsing user...");
        VKUser user = new VKUser();

//        userJson.keySet().forEach(key -> user.setValue(String.valueOf(key), userJson.get(String.valueOf(key))));

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

    private static VKMessage parseMessage(JSONObject json) {
        log.debug("Parsing message...");
        VKMessage message = new VKMessage();

        if (json.has(VKApiJsonConst.ID)) message.setId(json.getInt(VKApiJsonConst.ID));
        if (json.has(VKApiJsonConst.USER_ID)) message.setUserId(json.getInt(VKApiJsonConst.USER_ID));
        if (json.has(VKApiJsonConst.FROM_ID)) message.setFrom_id(json.getInt(VKApiJsonConst.FROM_ID));
        if (json.has(VKApiJsonConst.OUT)) message.setOut(json.getInt(VKApiJsonConst.OUT) == 1);
        if (json.has(VKApiJsonConst.READ_STATE)) message.setReadState(json.getInt(VKApiJsonConst.READ_STATE) == 1);
        if (json.has(VKApiJsonConst.TITLE)) message.setTitle(json.getString(VKApiJsonConst.TITLE));
        if (json.has(VKApiJsonConst.DATE)) message.setDate(new Date((long) json.getInt(VKApiJsonConst.DATE) * 1000));
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

    private static VkMessageAttachment parseAttachment(JSONObject attachJSON) {
        log.debug("Parsing attachment...");
        String type = attachJSON.getString(VKApiJsonConst.TYPE);
        switch (type) {
            case VkMessageAttachment.Photo:
                VkPhotoAttachment photoAttach = new VkPhotoAttachment();
                photoAttach.setPhoto((VKPhoto) VkJson2Class.toClass(attachJSON.getJSONObject(VkMessageAttachment.Photo), VKPhoto.class));
                photoAttach.setJson(attachJSON.toString());
                photoAttach.setValue(photoAttach.photo().photoMax());
                return photoAttach;
            case VkMessageAttachment.Wall:
                VkWallAttachment post = new VkWallAttachment();
                post.setPost((VKPost) VkJson2Class.toClass(attachJSON.getJSONObject(VkMessageAttachment.Wall),
                        VKPost.class));
                post.setJson(attachJSON.toString());
                post.setValue(post.post().text());
                return post;
            case VkMessageAttachment.Sticker:
                VkPhotoAttachment stickerAttach = new VkPhotoAttachment();
                stickerAttach.setPhoto((VKPhoto) VkJson2Class.toClass(attachJSON.getJSONObject(VkMessageAttachment.Sticker),
                        VkSticker.class));
                stickerAttach.setJson(attachJSON.toString());
                stickerAttach.setValue(stickerAttach.photo().photoMax());
                return stickerAttach;
            default:
                VkMessageAttachment attach = new VkMessageAttachment();
                attach.setType(type);
                attach.setJson(attachJSON.toString());
                attach.setValue(attachJSON.toString());
                return attach;
        }
    }

    private static VkChatMessage parseChat(JSONObject jsonObject) {
        log.debug("Parsing chat...");

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
