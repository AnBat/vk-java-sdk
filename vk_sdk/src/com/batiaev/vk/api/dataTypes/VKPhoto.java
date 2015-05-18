package com.batiaev.vk.api.dataTypes;

/**
 * Created by anton on 19/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

/**
 * Photo object describes a photo
 */
public class VKPhoto {

    public int pid; //Photo ID.
    public int aid; //Photo album ID.
    public int owner_id; //ID of the user or community that owns the photo.
    public String src; //URL of image with maximum size 130x130px.
    public String src_big; //URL of image with maximum size 604x604px.
    public String src_small; //URL of image with maximum size 75x75px.
    public String src_xbig; //URL of image with maximum size 807x807px.
    public String src_xxbig; //URL of image with maximum size 1280x1024px.
    public String src_xxxbig; //URL of image with maximum size 2560x2048px.
    public int width; //Width (in pixels) of the original photo.
    public int height; //Height (in pixels) of the original photo.
    public String text; //Text describing the photo.
    public int created; //in Unix time

}
