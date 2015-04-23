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
        
        VKRequest req = new VKRequest();
        req.getRequest("friends.get", "user_id=38561327");
    }
    /**
     * https://vk.com/dev/account
     */
    public VKApiBase account(VKParameters params) {
        return new VKApiAccount();
    }

    /**
     * https://vk.com/dev/ads
     */
    public VKApiBase ads(VKParameters params) {
        return new VKApiAds();
    }

    /**
     * https://vk.com/dev/apps
     */
    public VKApiBase apps(VKParameters params) {
        return new VKApiApps();
    }

    /**
     * https://vk.com/dev/audio
     */
    public VKApiBase audio(VKParameters params) {
        return new VKApiAudio();
    }

    /**
     * https://vk.com/dev/auth
     */
    public VKApiBase auth(VKParameters params) {
        return new VKApiAuth();
    }

    /**
     * https://vk.com/dev/board
     */
    public VKApiBase board(VKParameters params) {
        return new VKApiBoard();
    }

    /**
     * https://vk.com/dev/database
     */
    public VKApiBase database(VKParameters params) {
        return new VKApiDatabase();
    }

    /**
     * https://vk.com/dev/docs
     */
    public VKApiBase docs(VKParameters params) {
        return new VKApiDocs();
    }

    /**
     * https://vk.com/dev/favorites
     */
    public VKApiBase favorites(VKParameters params) {
        return new VKApiFavorites();
    }

    /**
     * https://vk.com/dev/friends
     */
    public VKApiBase friends(VKParameters params) {
        return new VKApiFriends();
    }

    @Override
    protected String getMethodsGroup() {
        return "api";
    }
}
