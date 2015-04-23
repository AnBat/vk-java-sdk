package com.batyaev.vk.api;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batyaev.vk.api.methods.*;

import java.io.IOException;

/**
 * Common interface for VK API
 * 
 * https://vk.com/dev/openapi
 */
public class VKApi extends VKApiBase {

    public static void main(String[] args) throws IOException {
        VKParameters parms = new VKParameters();
        parms.key = "user_id";
        parms.value = "38561327";
        friends().get(parms).getRequest();
    }

    /**
     * https://vk.com/dev/account
     */
    public static VKApiAccount account() {
        return new VKApiAccount();
    }

    /**
     * https://vk.com/dev/ads
     */
    public static VKApiAds ads() {
        return new VKApiAds();
    }

    /**
     * https://vk.com/dev/apps
     */
    public static VKApiApps apps() {
        return new VKApiApps();
    }

    /**
     * https://vk.com/dev/audio
     */
    public static VKApiAudio audio() {
        return new VKApiAudio();
    }

    /**
     * https://vk.com/dev/auth
     */
    public static VKApiAuth auth() {
        return new VKApiAuth();
    }

    /**
     * https://vk.com/dev/board
     */
    public static VKApiBoard board() {
        return new VKApiBoard();
    }

    /**
     * https://vk.com/dev/database
     */
    public static VKApiDatabase database() {
        return new VKApiDatabase();
    }

    /**
     * https://vk.com/dev/docs
     */
    public static VKApiDocs docs() {
        return new VKApiDocs();
    }

    /**
     * https://vk.com/dev/favorites
     */
    public static VKApiFavorites favorites() {
        return new VKApiFavorites();
    }

    /**
     * https://vk.com/dev/friends
     */
    public static VKApiFriends friends() {
        return new VKApiFriends();
    }

    @Override
    protected String getMethodsGroup() {
        return "api";
    }
}
