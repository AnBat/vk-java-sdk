package com.batiaev.vk.common.entity;

/**
 * @author batiaev
 * Created by batiaev on 19/04/15.
 *
 * A doc object describes a document
 * API version 5.0 and higher
 * @see <a href="https://vk.com/dev/doc">API: doc object</a>
 * @see VKNotes
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */
public class VKDoc extends AbstractEntity {

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

    public int size() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String ext() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String url() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String photo100() {
        return photo_100;
    }

    public void setPhoto100(String photo_100) {
        this.photo_100 = photo_100;
    }

    public String photo130() {
        return photo_130;
    }

    public void setPhoto130(String photo_130) {
        this.photo_130 = photo_130;
    }

    /**
     * Document ID.
     */
    private int id;
    /**
     * ID of the user who uploaded the document.
     */
    private int owner_id;
    /**
     * Document title.
     */
    private String title;
    /**
     * Document size (in bytes).
     */
    private int size;
    /**
     * Document extension.
     */
    private String ext;
    /**
     * Document URL for uploading.
     */
    private String url;
    /**
     * URL of the 100x75px image (if the file is graphical).
     */
    private String photo_100;
    /**
     * URL of the 130x100px image (if the file is graphical).
     */
    private String photo_130;
}

