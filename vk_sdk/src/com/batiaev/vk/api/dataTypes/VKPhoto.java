package com.batiaev.vk.api.dataTypes;

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
public class VKPhoto {

    public int id; //Photo ID.
    public int album_id; //Photo album ID.
    public int owner_id; //ID of the user or community that owns the photo.
    public int user_id; //User who post this
    public String photo_75; //URL of image with maximum size 75x75px.
    public String photo_130; //URL of image with maximum size 130x130px.
    public String photo_604; //URL of image with maximum size 604x604px.
    public String photo_807; //URL of image with maximum size 807x807px.
    public String photo_1280; //URL of image with maximum size 1280x1024px.
    public String photo_2560; //URL of image with maximum size 2560x2048px.
    public int width; //Width (in pixels) of the original photo.
    public int height; //Height (in pixels) of the original photo.
    public String text; //Text describing the photo.
    public int date; //in Unix time

}
