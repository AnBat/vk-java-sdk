package com.batiaev.vk.api.dataTypes;

import java.util.Date;
import java.util.List;

/**
 * @author batiaev
 * Created by batiaev on 20/04/15.
 * ---
 * A message object describes a private message
 * API version 5.0 and higher
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */
public class VKMessage {

    public int id;
    public int from_id;
    public int user_id;
    public Date date;
    public boolean read_state;
    public boolean out;
    public String title;
    public String body;
    public List<String> attachments;
    public List<String> fwd_messages;
    public boolean emoji;
    public boolean deleted;
    //Additional fields for group chat only
    public int chat_id;
    public List<String> chat_active;
    public String users_count;
    public int admin_id;
    public String photo_50;
    public String photo_100;
    public String photo_200;

}
