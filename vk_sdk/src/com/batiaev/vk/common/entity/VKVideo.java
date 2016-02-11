package com.batiaev.vk.common.entity;

/**
 * @author batiaev
 * Created by batiaev on 19/04/15.
 *
 * Video object describes video file
 * API version 5.0 and higher
 * <a href="https://vk.com/dev/video_object">API: video object</a>
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */
public class VKVideo {

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int ownerId() {
        return owner_id;
    }

    public void setOwnerId(int owner_id) {
        this.owner_id = owner_id;
    }

    public String title() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String description() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int duration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String link() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String photo130() {
        return photo_130;
    }

    public void setPhoto130(String photo_130) {
        this.photo_130 = photo_130;
    }

    public String photo320() {
        return photo_320;
    }

    public void setPhoto320(String photo_320) {
        this.photo_320 = photo_320;
    }

    public String photo640() {
        return photo_640;
    }

    public void setPhoto640(String photo_640) {
        this.photo_640 = photo_640;
    }

    public int Date() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int addingDate() {
        return adding_date;
    }

    public void setAddingDate(int adding_date) {
        this.adding_date = adding_date;
    }

    public int views() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String player() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    /**
     * Video ID
     */
    private int id;
    /**
     * ID of the user or community that owns the video.
     */
    private int owner_id;
    /**
     * Video title.

     */
    private String title;
    /**
     * Description of the video.
     */
    private String description;
    /**
     * Duration of the video, in seconds.
     */
    private int duration;
    /**
     * String with video+vid key.
     */
    private String link;
    /**
     * URL of the video cover image with the size of 130x98px.
     */
    private String photo_130;
    /**
     * URL of the video cover image with the size of 320x240px.
     */
    private String photo_320;
    /**
     * URL of the video cover image with the size of 640x480px (if available).
     */
    private String photo_640;
    /**
     * Date (in Unix time) the video was created.
     */
    private int date;
    /**
     * Date (in Unix time) the video was added by user or group.
     */
    private int adding_date;
    /**
     * Number of times the video has been viewed.
     */
    private int views;
    /**
     * URL of the page with a player that can be used to play the video in the browser.
     * Flash and HTML5 video players are supported;
     * the player is always zoomed to fit the window size.
     */
    private String player;
}

