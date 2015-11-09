package com.batiaev.vk.api.dataTypes;

/**
 * Created by anton on 20/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

/**
 * Information about media attachments in posts is returned as attachments array with elements,
 * each containing type field and an object with a field set defined by attachment type.
 * @see <a href="http://vk.com/dev/attachments_m">Types of attachments()</a>
 * @see VKMessage
 * @see VKPost
 * @see VkPhotoAttachment
 */
public class VkMessageAttachment extends VkAttachment {
    public static final String Photo = "photo";
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
