/*
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk.common.entity;

/**
 * Information about media attachments in posts is returned as attachments array with elements,
 * each containing type field and an object with a field set defined by attachment type.
 *
 * @author batiaev
 * @see <a href="http://vk.com/dev/attachments_m">Types of attachments()</a>
 * @see VKMessage
 * @see VKPost
 * @see VkPhotoAttachment
 * @since 20/04/15
 */
public class VkMessageAttachment extends VkAttachment {
    public static final String Photo = "photo";
    public static final String Sticker = "sticker";
    public static final String Video = "video";
    public static final String Audio = "audio";
    public static final String Document = "document";
    public static final String Wall = "wall";

//    enum Type {
//        Photo,
//        Posted_photo,
//        Video,
//        Audio,
//        Doc,
//        Graffiti,
//        Url,
//        Note,
//        App,
//        Poll,
//        Page
//    }

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
