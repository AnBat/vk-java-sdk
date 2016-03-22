package com.batiaev.vk.common.entity;

/**
 * Created by batiaev on 19/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */

/**
 * @author batiaev
 * Photo object describes a photo
 */
public class VKPhoto extends VkObject {

    public VKPhoto() {
        photo_75 = "";
        photo_130 = "";
        photo_604 = "";
        photo_807 = "";
        photo_1280 = "";
        photo_2560 = "";
    }

    public String photoMax() {
        if (!photo_2560.isEmpty())
            return photo_2560;
        else if (!photo_1280.isEmpty())
            return photo_1280;
        else if (!photo_807.isEmpty())
            return photo_807;
        else if (!photo_604.isEmpty())
            return photo_604;
        else if (!photo_130.isEmpty())
            return photo_130;
        else if (!photo_75.isEmpty())
            return photo_75;
        else
            return "";
    }

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int albumId() {
        return album_id;
    }

    public void setAlbumId(int album_id) {
        this.album_id = album_id;
    }

    public int ownerId() {
        return owner_id;
    }

    public void setOwnerId(int owner_id) {
        this.owner_id = owner_id;
    }

    public int userId() {
        return user_id;
    }

    public void setUserId(int user_id) {
        this.user_id = user_id;
    }

    public String photo75() {
        return photo_75;
    }

    public void setPhoto75(String photo_75) {
        this.photo_75 = photo_75;
    }

    public String photo130() {
        return photo_130;
    }

    public void setPhoto130(String photo_130) {
        this.photo_130 = photo_130;
    }

    public String photo604() {
        return photo_604;
    }

    public void setPhoto604(String photo_604) {
        this.photo_604 = photo_604;
    }

    public String photo807() {
        return photo_807;
    }

    public void setPhoto807(String photo_807) {
        this.photo_807 = photo_807;
    }

    public String photo1280() {
        return photo_1280;
    }

    public void setPhoto1280(String photo_1280) {
        this.photo_1280 = photo_1280;
    }

    public String photo2560() {
        return photo_2560;
    }

    public void setPhoto2560(String photo_2560) {
        this.photo_2560 = photo_2560;
    }

    public int width() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int height() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String text() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int date() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    /**
     * photo id
     */
    protected int id;
    /**
     * Photo album ID.
     */
    protected int album_id;
    /**
     * ID of the user or community that owns the photo.
     */
    protected int owner_id;
    /**
     * User who post this
     */
    protected int user_id;
    /**
     * URL of image with maximum size 75x75px.
     */
    protected String photo_75;
    /**
     * URL of image with maximum size 130x130px.
     */
    protected String photo_130;
    /**
     * URL of image with maximum size 604x604px.
     */
    protected String photo_604;
    /**
     * URL of image with maximum size 807x807px.
     */
    protected String photo_807;
    /**
     * URL of image with maximum size 1280x1024px.
     */
    protected String photo_1280;
    /**
     * URL of image with maximum size 2560x2048px.
     */
    protected String photo_2560;
    /**
     * Width (in pixels) of the original photo.
     */
    protected int width;
    /**
     * Height (in pixels) of the original photo.
     */
    protected int height;
    /**
     * Text describing the photo.
     */
    protected String text;
    /**
     * in Unix time
     */
    protected int date;

}
