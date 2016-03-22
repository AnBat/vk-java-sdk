package com.batiaev.vk.common.entity;

/**
 * Created by anton on 13/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author batiaev
 * User object describes a user profile.
 */
public class VKUser extends VkObject implements Serializable {
    /**
     * User ID using in vk.com
     */
    private long user_id;
    /**
     * First name of user.
     */
    private String first_name;

    /**
     * Last name of user.
     */
    private String last_name;

    /**
     * Returns if a profile is deleted or blocked.
     * Gets the value deleted or banned.
     * Keep in mind that in this case no additional fields are returned.
     */
    private String deactivated;

    /**
     * Returns while operating without access_token
     * if a user has set the "Who can see my profile on the Internet" → "Only VK users" privacy setting.
     * Keep in mind that in this case no additional fields are returned.
     */
    private boolean hidden;

    /**
     * Returns 1 if the profile is verified, 0 if not.
     */
    private boolean verified;

    /**
     * Returns 1 if a current user is in the requested user's blacklist.
     */
    private boolean blacklisted;

    /**
     * User sex. One of three values is returned:
     * 1 — female;
     * 2 — male;
     * 0 — not specified.
     */
    private int sex;

    /**
     * User's date of birth.  Returned as DD.MM.YYYY or DD.MM (if birth year is hidden).
     * If the whole date is hidden, no field is returned.
     */
    private Date bdate;

    /**
     * ID of the city specified on user's page in "Contacts" section.
     */
    private VKCity city;

    /**
     * ID of the country specified on user's page in "Contacts" section.
     */
    private VKCountry country;

    /**
     * User's home town.
     */
    private String home_town;

    /**
     * URL of default square photo of the user with 50 pixels in width.
     */
    private String photo_50;

    /**
     * URL of default square photo of the user with 100 pixels in width.
     */
    private String photo_100;

    /**
     * Returns URL of user's photo with 200 pixels in width.
     * In case user does not have a photo, http://vk.com/images/camera_a.gif is returned.
     */
    private String photo_200_orig;

    /**
     * Returns URL of square photo of the user with 200 pixels in width.
     * If the photo was uploaded long time ago,
     * there can be no image of such size and in this case the reply will not include this field.
     */
    private String photo_200;

    /**
     * Returns URL of user's photo with 400 pixels in width.
     * If user does not have a photo of such size, reply will not include this field.
     */
    private String photo_400_orig;

    /**
     * Returns URL of square photo of the user with maximum width.
     * Can be returned a photo both 200 and 100 pixels in width.
     * In case user does not have a photo, http://vk.com/images/camera_b.gif is returned.
     */
    private String photo_max;

    /**
     * Returns URL of user's photo of maximum size. Can be returned a photo both 400 and 200 pixels in width.
     * In case user does not have a photo, http://vk.com/images/camera_a.gif is returned.
     */
    private String photo_max_orig;

    /**
     * User nickname
     */
    private String nickname;

    /**
     * Information whether the user is online.
     */
    private boolean online;

    /**
     * If user utilizes a mobile application or site mobile version, it returns online_mobile as additional.
     */
    private boolean online_mobile;

    /**
     * With that, in case of application, online_app additional field is returned with application ID.
     */
    private String online_app;

    /**
     * Returns a website address from a user profile.
     */
    private String site;
    
    /**
     * 	user time zone. Retuns only while requesting current user info.
     */
    private String timezone;

    /**
     * Creates empty User instance.
     */
    public VKUser() {
        setDefaultValues();
    }

    private void setDefaultValues() {
        user_id = 1;
        first_name = "DELETED";
        last_name = "DELETED";
        sex = 0;
        city = new VKCity();
        country = new VKCountry();
        photo_50 = "http://vk.com/images/camera_c.gif";
        photo_100 = "http://vk.com/images/camera_b.gif";
        photo_200_orig = "http://vk.com/images/camera_a.gif";
        photo_max = "http://vk.com/images/camera_b.gif";
        photo_max_orig = "http://vk.com/images/camera_a.gif";
        nickname = "";
    }

    /**
     * @return user_id and full user name
     */
    @Override
    public String toString() {
        return user_id + " : " + fullName();
    }

    public void setValue(String name, Object value) {
        System.out.println("## Set value " + value + " for field " + name);
        try {
            this.getClass().getDeclaredField(name).set(this, value);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public long userId() {
        return user_id;
    }

    public void setUserId(long user_id) {
        this.user_id = user_id;
    }

    public String firstName() {
        return first_name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public String lastName() {
        return last_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public String fullName() {
        return first_name + ' ' + last_name;
    }

    public boolean isDeactivated() {
        return deactivated.isEmpty();
    }

    public String deactivated() {
        return deactivated;
    }

    public void setDeactivated(String deactivated) {
        this.deactivated = deactivated;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(int hidden) {
        this.hidden = hidden == 1;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(int verified) {
        this.verified = verified ==1 ;
    }

    public boolean isBlacklisted() {
        return blacklisted;
    }

    public void setBlacklisted(int blacklisted) {
        this.blacklisted = blacklisted == 1;
    }

    public String sex() {
        switch (sex) {
            case 0: return "Not specified";
            case 1: return "Female";
            case 2: return "Male";
        }
        return "Not specified";
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setSex(String sex) {
        switch (sex) {
            case "Not specified": this.sex = 0;
                break;
            case "Female": this.sex = 1;
                break;
            case "Male": this.sex = 2;
                break;
            default: this.sex = 0;
        }
    }

    public String birthday() {
        DateFormat format = new SimpleDateFormat("dd.MM");
        DateFormat formatFull = new SimpleDateFormat("dd.MM.yyyy");
        if (bdate == null)
            return "";

        Calendar cal = Calendar.getInstance();
        cal.setTime(bdate);
        return cal.get(Calendar.YEAR) == 1900 ? format.format(bdate) : formatFull.format(bdate);
    }

    public Date birthdate() {
        return bdate;
    }

    public void setBirthday(Date bdate) {
        this.bdate = bdate;
    }

    public void setBirthday(int bdate) {
        this.bdate = new Date(bdate);
    }

    public VKCity city() {
        return city;
    }

    public void setCity(VKCity city) {
        this.city = city;
    }

    public VKCountry country() {
        return country;
    }

    public void setCountry(VKCountry country) {
        this.country = country;
    }

    public String hometown() {
        return home_town;
    }

    public void setHometown(String home_town) {
        this.home_town = home_town;
    }

    public String photo50() {
        return photo_50;
    }

    public void setPhoto50(String photo_50) {
        this.photo_50 = photo_50;
    }

    public String photo100() {
        return photo_100;
    }

    public void setPhoto100(String photo_100) {
        this.photo_100 = photo_100;
    }

    public String photo200orig() {
        return photo_200_orig;
    }

    public void setPhoto200orig(String photo_200_orig) {
        this.photo_200_orig = photo_200_orig;
    }

    public String photo200() {
        return photo_200;
    }

    public void setPhoto200(String photo_200) {
        this.photo_200 = photo_200;
    }

    public String photo400orig() {
        return photo_400_orig;
    }

    public void setPhoto400orig(String photo_400_orig) {
        this.photo_400_orig = photo_400_orig;
    }

    public String photoMax() {
        return photo_max;
    }

    public void setPhotoMax(String photo_max) {
        this.photo_max = photo_max;
    }

    public String photoMaxOrig() {
        return photo_max_orig;
    }

    public void setPhotoMaxOrig(String photo_max_orig) {
        this.photo_max_orig = photo_max_orig;
    }

    public String nickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String online() {
        return online ? "Online" : "Offline";
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(int online) {
        this.online = online == 1;
    }

    public boolean isOnlineMobile() {
        return online_mobile;
    }

    public void setOnlineMobile(boolean online_mobile) {
        this.online_mobile = online_mobile;
    }

    public String onlineApp() {
        return online_app;
    }

    public void setOnlineApp(String online_app) {
        this.online_app = online_app;
    }

    public String site() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String timezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

}

