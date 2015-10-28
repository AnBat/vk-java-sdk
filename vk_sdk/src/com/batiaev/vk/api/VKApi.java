package com.batiaev.vk.api;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */

import com.batiaev.vk.api.consts.VKApiConst;
import com.batiaev.vk.api.consts.VKApiJsonConst;
import com.batiaev.vk.api.methods.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;

/**
 * Common interface for VK API
 * 
 * https://vk.com/dev/openapi
 */
public class VKApi extends VKApiBase {
    private static final Logger LOG = LogManager.getLogger(VKApi.class);

    /**
     * @return Vk Api for account methods
     * https://vk.com/dev/account
     */
    public static VKApiAccount account() {
        return new VKApiAccount();
    }

    /**
     * @return Vk Api for ads methods
     * https://vk.com/dev/ads
     */
    public static VKApiAds ads() {
        return new VKApiAds();
    }

    /**
     * @return Vk Api for apps methods
     * https://vk.com/dev/apps
     */
    public static VKApiApps apps() {
        return new VKApiApps();
    }

    /**
     * @return Vk Api for audio methods
     * https://vk.com/dev/audio
     */
    public static VKApiAudio audio() {
        return new VKApiAudio();
    }

    /**
     * @return Vk Api for auth methods
     * https://vk.com/dev/auth
     */
    public static VKApiAuth auth() {
        return new VKApiAuth();
    }

    /**
     * @return Vk Api for board methods
     * https://vk.com/dev/board
     */
    public static VKApiBoard board() {
        return new VKApiBoard();
    }

    /**
     * @return Vk Api for database methods
     * https://vk.com/dev/database
     */
    public static VKApiDatabase database() {
        return new VKApiDatabase();
    }

    /**
     * @return Vk Api for docs methods
     * https://vk.com/dev/docs
     */
    public static VKApiDocs docs() {
        return new VKApiDocs();
    }

    /**
     * @return Vk Api for favorites methods
     * https://vk.com/dev/favorites
     */
    public static VKApiFavorites favorites() {
        return new VKApiFavorites();
    }

    /**
     * @return Vk Api for friends methods
     * https://vk.com/dev/friends
     */
    public static VKApiFriends friends() {
        return new VKApiFriends();
    }

    /**
     * @return Vk Api for gifts methods
     * https://vk.com/dev/gifts
     */
    public static VKApiGifts gifts() {
        return new VKApiGifts();
    }

    /**
     * @return Vk Api for groups methods
     * https://vk.com/dev/groups
     */
    public static VKApiGroups groups() {
        return new VKApiGroups();
    }

    /**
     * @return Vk Api for leads methods
     * https://vk.com/dev/leads
     */
    public static VKApiLeads leads() {
        return new VKApiLeads();
    }

    /**
     * @return Vk Api for likes methods
     * https://vk.com/dev/likes
     */
    public static VKApiLikes likes() {
        return new VKApiLikes();
    }

    /**
     * @return Vk Api for messages methods
     * https://vk.com/dev/messages
     */
    public static VKApiMessages messages() {
        return new VKApiMessages();
    }

    /**
     * @return Vk Api for newsfeed methods
     * https://vk.com/dev/newsfeed
     */
    public static VKApiNews newsfeed() {
        return new VKApiNews();
    }

    /**
     * @return Vk Api for notes methods
     * https://vk.com/dev/notes
     */
    public static VKApiNotes notes() {
        return new VKApiNotes();
    }

    /**
     * @return Vk Api for notifications methods
     * https://vk.com/dev/notifications
     */
    public static VKApiNotifications notifications() {
        return new VKApiNotifications();
    }

    /**
     * @return Vk Api for orders methods
     * https://vk.com/dev/orders
     */
    public static VKApiOrders orders() {
        return new VKApiOrders();
    }

    /**
     * @return Vk Api for pages methods
     * https://vk.com/dev/pages
     */
    public static VKApiPages pages() {
        return new VKApiPages();
    }

    /**
     * @return Vk Api for photos methods
     * https://vk.com/dev/photos
     */
    public static VKApiPhotos photos() {
        return new VKApiPhotos();
    }

    /**
     * @return Vk Api for places methods
     * https://vk.com/dev/places
     */
    public static VKApiPlaces places() {
        return new VKApiPlaces();
    }

    /**
     * @return Vk Api for polls methods
     * https://vk.com/dev/polls
     */
    public static VKApiPolls polls() {
        return new VKApiPolls();
    }

    /**
     * @return Vk Api for search methods
     * https://vk.com/dev/search
     */
    public static VKApiSearch search() {
        return new VKApiSearch();
    }

    /**
     * @return Vk Api for secure methods
     * https://vk.com/dev/secure
     */
    public static VKApiSecure secure() {
        return new VKApiSecure();
    }

    /**
     * @return Vk Api for stats methods
     * https://vk.com/dev/stats
     */
    public static VKApiStats stats() {
        return new VKApiStats();
    }

    /**
     * @return Vk Api for status methods
     * https://vk.com/dev/status
     */
    public static VKApiStatus status() {
        return new VKApiStatus();
    }

    /**
     * @return Vk Api for storage methods
     * https://vk.com/dev/storage
     */
    public static VKApiStorage storage() {
        return new VKApiStorage();
    }

    /**
     * @return Vk Api for users methods
     * https://vk.com/dev/users
     */
    public static VKApiUsers users() {
        return new VKApiUsers();
    }

    /**
     * @return Vk Api for utils methods
     * https://vk.com/dev/utils
     */
    public static VKApiUtils utils() {
        return new VKApiUtils();
    }

    /**
     * @return Vk Api for video methods
     * https://vk.com/dev/video
     */
    public static VKApiVideo video() {
        return new VKApiVideo();
    }

    /**
     * @return Vk Api for wall methods
     * https://vk.com/dev/wall
     */
    public static VKApiWall wall() {
        return new VKApiWall();
    }

    /**
     * @return Vk Api for widgets methods
     * https://vk.com/dev/widgets
     */
    public static VKApiWidgets widgets() {
        return new VKApiWidgets();
    }

    /**
     * A universal method for calling a sequence of other methods while saving and filtering interim results.
     * This method doesn't require any specific rights.
     * @param params code to execution
     *               Algorithm code in VKScript — a format similar to JavaSсript or ActionScript
     *               and assuming compatibility with ECMAScript.
     *               Separate operators by semicolons. Terminate the algorithm with the command return %expression%.
     * @return result
     */
    public static String execute(VKParameters params) {
        String respond = VKRequest.create().getRequest("execute", params.toString());
        if (respond == null) return null;

        JSONObject obj = new JSONObject(respond);
        return obj.toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "api";
    }
}
