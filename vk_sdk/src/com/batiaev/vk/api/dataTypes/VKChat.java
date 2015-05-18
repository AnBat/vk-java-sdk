package com.batiaev.vk.api.dataTypes;

/**
 * Created by anton on 20/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import java.util.List;

/**
 * Chat object describes a chat
 * API version 5.0 and higher
 */
public class VKChat {

    public int id;
    public String type;
    public String title;
    public int admin_id;
    public List<String> users;

}
