package com.batiaev.vk.api.dataTypes;

/**
 * Created by anton on 13/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * User object describes a user profile.
 */
public class VKUser {

    public long user_id = 1;
    /**
     * First name of user.
     */
    public String first_name = "DELETED";

    /**
     * Last name of user.
     */
    public String last_name = "DELETED";

    /**
     * Returns if a profile is deleted or blocked.
     * Gets the value deleted or banned.
     * Keep in mind that in this case no additional fields are returned.
     */
    public int deactivated;

    /**
     * Returns while operating without access_token
     * if a user has set the "Who can see my profile on the Internet" → "Only VK users" privacy setting.
     * Keep in mind that in this case no additional fields are returned.
     */
    public boolean hidden;

    /**
     * Returns 1 if the profile is verified, 0 if not.
     */
    public boolean verified;

    /**
     * Returns 1 if a current user is in the requested user's blacklist.
     */
    public boolean blacklisted;

    /**
     * User sex. One of three values is returned:
     * 1 — female;
     * 2 — male;
     * 0 — not specified.
     */
    public int sex = 0;

    /**
     * User's date of birth.  Returned as DD.MM.YYYY or DD.MM (if birth year is hidden).
     * If the whole date is hidden, no field is returned.
     */
    public Date bdate;

    /**
     * ID of the city specified on user's page in "Contacts" section.
     */
    public VKCity city = new VKCity();

    /**
     * ID of the country specified on user's page in "Contacts" section.
     */
    public VKCountry country = new VKCountry();

    /**
     * User's home town.
     */
    public String home_town;

    /**
     * URL of default square photo of the user with 50 pixels in width.
     */
    public String photo_50 = "http://vk.com/images/camera_c.gif";

    /**
     * URL of default square photo of the user with 100 pixels in width.
     */
    public String photo_100 = "http://vk.com/images/camera_b.gif";

    /**
     * Returns URL of user's photo with 200 pixels in width.
     * In case user does not have a photo, http://vk.com/images/camera_a.gif is returned.
     */
    public String photo_200_orig = "http://vk.com/images/camera_a.gif";

    /**
     * Returns URL of square photo of the user with 200 pixels in width.
     * If the photo was uploaded long time ago,
     * there can be no image of such size and in this case the reply will not include this field.
     */
    public String photo_200;

    /**
     * Returns URL of user's photo with 400 pixels in width.
     * If user does not have a photo of such size, reply will not include this field.
     */
    public String photo_400_orig;

    /**
     * Returns URL of square photo of the user with maximum width.
     * Can be returned a photo both 200 and 100 pixels in width.
     * In case user does not have a photo, http://vk.com/images/camera_b.gif is returned.
     */
    public String photo_max = "http://vk.com/images/camera_b.gif";

    /**
     * Returns URL of user's photo of maximum size. Can be returned a photo both 400 and 200 pixels in width.
     * In case user does not have a photo, http://vk.com/images/camera_a.gif is returned.
     */
    public String photo_max_orig = "http://vk.com/images/camera_a.gif";

    /**
     * User nickname
     */
    public String nickname = "";

    /**
     * Information whether the user is online.
     */
    public boolean online;

    /**
     * If user utilizes a mobile application or site mobile version, it returns online_mobile as additional.
     */
    public boolean online_mobile;

    /**
     * With that, in case of application, online_app additional field is returned with application ID.
     */
    public String online_app;

    /**
     * Returns a website address from a user profile.
     */
    public String site;
    
    /**
     * 	user time zone. Retuns only while requesting current user info.
     */
    public String timezone;

    public String sex() {
        switch (sex) {
            case 0: return "Not specified";
            case 1: return "Female";
            case 2: return "Male";
        }
        return "Not specified";
    }

    public String birthday() {
        DateFormat format = new SimpleDateFormat("dd.MM");
        DateFormat formatFull = new SimpleDateFormat("dd.MM.yyyy");
        if (bdate == null)
            return "";
        else
            return bdate.getYear() == 1900 ? format.format(bdate) : formatFull.format(bdate);
    }

    public String online() {
        return online ? "Online" : "Offline";
    }

    /**
     * Creates empty User instance.
     */
    public VKUser() {

    }

    private String full_name;

    /**
     * @return full user name
     */
    @Override
    public String toString() {
        if(full_name == null) {
            full_name = first_name + ' ' + last_name;
        }
        return user_id + " : " + full_name;
    }

}
