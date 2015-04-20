package com.batyaev.vk.api.dataTypes;

/**
 * Created by anton on 20/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

/**
 * A note object describes a note
 * API version 5.0 and higher
 */
public class VKNotes {

    public int id;
    public int user_id;
    public String title;
    public String text;
    public int date;
    public String comments;
    public int read_comments;

}
