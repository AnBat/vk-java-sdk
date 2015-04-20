package com.batyaev.vk.api.dataTypes;

/**
 * Created by anton on 19/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

/**
 * A doc object describes a document
 * API version 5.0 and higher
 * @link https://vk.com/dev/doc
 */
public class VKDoc {

    /**
     * Document ID.
     */
    public int id;
    /**
     * ID of the user who uploaded the document.
     */
    public int owner_id;
    /**
     * Document title.
     */
    public String title;
    /**
     * Document size (in bytes).
     */
    public int size;
    /**
     * Document extension.
     */
    public String ext;
    /**
     * Document URL for uploading.
     */
    public String url;
    /**
     * URL of the 100x75px image (if the file is graphical).
     */
    public String photo_100;
    /**
     * URL of the 130x100px image (if the file is graphical).
     */
    public String photo_130;
}

