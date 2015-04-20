package com.batyaev.vk.api.dataTypes;

/**
 * Created by anton on 20/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

/**
 * Post object describes a wall post
 */
public class VKPost {

    public int id;
    public int to_id;
    public int from_id;
    public String date;
    public String text;
    public String reply_owner_id;
    public String reply_post_id;
    public String friends_only;
    public String comments;
    public String likes;
    public String reposts;
    public String post_type;
    public String post_source;
    public String attachments;
    public String geo;
    public String signer_id;
    public String copy_post_date;
    public String copy_post_type;
    public String copy_owner_id;
    public String copy_post_id;
    public String copy_text;
}
