package com.batiaev.vk.api;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */

import com.batiaev.vk.api.methods.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Common interface for VK API
 * 
 * https://vk.com/dev/openapi
 */
public class VKApi extends VKApiBase {

    private static final Logger LOG = LogManager.getLogger(VKApi.class);

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

    /**
     * https://vk.com/dev/gifts
     */
    public static VKApiGifts gifts() {
        return new VKApiGifts();
    }

    /**
     * https://vk.com/dev/groups
     */
    public static VKApiGroups groups() {
        return new VKApiGroups();
    }

    /**
     * https://vk.com/dev/leads
     */
    public static VKApiLeads leads() {
        return new VKApiLeads();
    }

    /**
     * https://vk.com/dev/likes
     */
    public static VKApiLikes likes() {
        return new VKApiLikes();
    }

    /**
     * https://vk.com/dev/messages
     */
    public static VKApiMessages messages() {
        return new VKApiMessages();
    }

    /**
     * https://vk.com/dev/newsfeed
     */
    public static VKApiNews newsfeed() {
        return new VKApiNews();
    }

    /**
     * https://vk.com/dev/notes
     */
    public static VKApiNotes notes() {
        return new VKApiNotes();
    }

    /**
     * https://vk.com/dev/notifications
     */
    public static VKApiNotifications notifications() {
        return new VKApiNotifications();
    }

    /**
     * https://vk.com/dev/orders
     */
    public static VKApiOrders orders() {
        return new VKApiOrders();
    }

    /**
     * https://vk.com/dev/pages
     */
    public static VKApiPages pages() {
        return new VKApiPages();
    }

    /**
     * https://vk.com/dev/photos
     */
    public static VKApiPhotos photos() {
        return new VKApiPhotos();
    }

    /**
     * https://vk.com/dev/places
     */
    public static VKApiPlaces places() {
        return new VKApiPlaces();
    }

    /**
     * https://vk.com/dev/polls
     */
    public static VKApiPolls polls() {
        return new VKApiPolls();
    }

    /**
     * https://vk.com/dev/search
     */
    public static VKApiSearch search() {
        return new VKApiSearch();
    }

    /**
     * https://vk.com/dev/secure
     */
    public static VKApiSecure secure() {
        return new VKApiSecure();
    }

    /**
     * https://vk.com/dev/stats
     */
    public static VKApiStats stats() {
        return new VKApiStats();
    }

    /**
     * https://vk.com/dev/status
     */
    public static VKApiStatus status() {
        return new VKApiStatus();
    }

    /**
     * https://vk.com/dev/storage
     */
    public static VKApiStorage storage() {
        return new VKApiStorage();
    }

    /**
     * https://vk.com/dev/users
     */
    public static VKApiUsers users() {
        return new VKApiUsers();
    }

    /**
     * https://vk.com/dev/utils
     */
    public static VKApiUtils utils() {
        return new VKApiUtils();
    }

    /**
     * https://vk.com/dev/video
     */
    public static VKApiVideo video() {
        return new VKApiVideo();
    }

    /**
     * https://vk.com/dev/wall
     */
    public static VKApiWall wall() {
        return new VKApiWall();
    }

    /**
     * https://vk.com/dev/widgets
     */
    public static VKApiWidgets widgets() {
        return new VKApiWidgets();
    }

    @Override
    protected String getMethodsGroup() {
        return "api";
    }
}
