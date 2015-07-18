package com.batiaev.vk.api.dataTypes;

/**
 * @author batiaev
 * Created by batiaev on 19/04/15.
 *
 * Video object describes video file
 * API version 5.0 and higher
 * @see <a href="https://vk.com/dev/video_object">API: video object</a>
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */
public class VKVideo {

    /**
     * Video ID
     */
    public int id;
    /**
     * ID of the user or community that owns the video.
     */
    public int owner_id;
    /**
     * Video title.
     */
    public String title;
    /**
     * Description of the video.
     */
    public String description;
    /**
     * Duration of the video, in seconds.
     */
    public int duration;
    /**
     * String with video+vid key.
     */
    public String link;
    /**
     * URL of the video cover image with the size of 130x98px.
     */
    public String photo_130;
    /**
     * URL of the video cover image with the size of 320x240px.
     */
    public String photo_320;
    /**
     * URL of the video cover image with the size of 640x480px (if available).
     */
    public String photo_640;
    /**
     * Date (in Unix time) the video was created.
     */
    public int date;
    /**
     * Date (in Unix time) the video was added by user or group.
     */
    public int adding_date;
    /**
     * Number of times the video has been viewed.
     */
    public int views;
    /**
     * URL of the page with a player that can be used to play the video in the browser.
     * Flash and HTML5 video players are supported;
     * the player is always zoomed to fit the window size.
     */
    public String player;
}

