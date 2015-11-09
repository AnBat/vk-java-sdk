package com.batiaev.vk.api.dataTypes;

/**
 * @author batiaev
 * Created by batyaev on 7/20/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */
public class VkPhotoAttachment extends VkMessageAttachment {
    /**
     * photo ID
     */
    private long pid;
    /**
     *  ID of photo owner;
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
