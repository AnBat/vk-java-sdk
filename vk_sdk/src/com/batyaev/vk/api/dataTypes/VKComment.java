package com.batyaev.vk.api.dataTypes;

/**
 * Created by anton on 20/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import java.util.List;

/**
 * Comment object describes a comment
 * API version 5.0 and higher
 */
public class VKComment {

    public int id;
    public int from_id;
    public int date;
    public String text;
    public int reply_to_uid;
    public int reply_to_cid;
    public List<String> attachments;

}
