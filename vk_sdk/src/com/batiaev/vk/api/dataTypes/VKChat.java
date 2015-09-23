package com.batiaev.vk.api.dataTypes;

/**
 * Created by anton on 20/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */
import com.batiaev.vk.api.VKAuthorization;
import com.batiaev.vk.sdk.VkLocalCache;

import java.util.List;

/**
 * Chat object describes a chat
 * API version 5.0 and higher
 */
public class VKChat {

    static final String DEFAULT_NAME = " ... ";
    private String title;
    private String body;
    private int chat_id;
    private List<Integer> chat_active;
    private int users_count;
    private int admin_id;
    private VKMessage message;

    public VKChat() {
        message = new VKMessage();
    }

    public String title() {
        return title.equals(DEFAULT_NAME) ? VkLocalCache.getUser(message.user_id) : title;
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

    public int chatId() {
        return chat_id;
    }

    public void setChatId(int chatId) {
        chat_id = chatId;
    }

    public int userCount() {
        return users_count;
    }

    public void setUserCount(int userCount) {
        users_count = userCount;
    }

    public int adminId() {
        return admin_id;
    }

    public void setAdminId(int adminId) {
        admin_id = adminId;
    }
}
