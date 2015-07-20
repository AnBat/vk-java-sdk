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
 */
public class VkAttachment {
    enum Type {
        Photo,
        Posted_photo,
        Video,
        Audio,
        Doc,
        Graffiti,
        Url,
        Note,
        App,
        Poll,
        Page
    }

    protected Type type;
    private String value;

    public Type type() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
