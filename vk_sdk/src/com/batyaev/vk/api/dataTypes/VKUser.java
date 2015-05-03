package com.batyaev.vk.api.dataTypes;

/**
 * Created by anton on 13/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import java.lang.String;

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
     * User sex. One of three values is returned:
     * 1 — female;
     * 2 — male;
     * 0 — not specified.
     */
    public int sex = 0;

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
     * URL of default square photo of the user with 50 pixels in width.
     */
    public String photo_50 = "http://vk.com/images/camera_c.gif";

    /**
     * URL of default square photo of the user with 100 pixels in width.
     */
    public String photo_100 = "http://vk.com/images/camera_b.gif";

    /**
     * URL of default square photo of the user with 200 pixels in width.
     */
    public String photo_200 = "http://vk.com/images/camera_a.gif";

    /**
     * Returns URL of user's photo of maximum size. Can be returned a photo both 400 and 200 pixels in width.
     * In case user does not have a photo, http://vk.com/images/camera_a.gif is returned.
     */
    public String photo_max_orig = "http://vk.com/images/camera_a.gif";

    /**
     * {@link #photo_50}, {@link #photo_100}, {@link #photo_200} included here in Photo Sizes format.
     */

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
