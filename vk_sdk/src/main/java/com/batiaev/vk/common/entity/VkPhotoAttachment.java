/*
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk.common.entity;

/**
 * @author batiaev
 * @since 7/20/15
 */
public class VkPhotoAttachment extends VkMessageAttachment {
    /**
     * photo ID
     */
    private long pid;
    /**
     * ID of photo owner;
     */
    private long owner_id;
    /**
     * image URL
     */
    private String src;
    /**
     * big size image URL
     */
    private String src_big;

    private VKPhoto photo;

    public VkPhotoAttachment() {
        type = Photo;
        photo = new VKPhoto();
    }

    public VKPhoto photo() {
        return photo;
    }

    public void setPhoto(VKPhoto photo) {
        this.photo = photo;
    }

    @Override
    public String getValue() {
        return photo.photoMax();
    }
}
