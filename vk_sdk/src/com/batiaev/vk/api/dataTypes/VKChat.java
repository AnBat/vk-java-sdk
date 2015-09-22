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

    static final String DEFAULT_NAME = " ... ";
    private String title;
    private String body;
    private String chat_id;
    private List<Integer> chat_active;
    private int users_count;
    private int admin_id;
    private VKMessage message;

    public VKChat() {
        message = new VKMessage();
    }

    public String title() {
        return title.equals(DEFAULT_NAME) ? "[" + String.valueOf(message.user_id) + "]" : title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(int id) {
        message.id = id;
    }

    public void setUserId(int userId) {
        message.user_id = userId;
    }

    public String body() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
