package com.batiaev.vk.api.dataTypes;

/**
 * Created by anton on 20/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */
import com.batiaev.vk.sdk.VkLocalCache;

import java.util.ArrayList;

/**
 * Chat object describes a chat
 * API version 5.0 and higher
 * @see VkChatList
 * @see VKMessage
 */
public class VkChatMessage extends VKMessage {

    //Additional fields for group chat only
    private int chat_id;
    private ArrayList<String> chat_active;
    private int users_count;
    private int admin_id;
    private String photo_50;
    private String photo_100;
    private String photo_200;

    static final String DEFAULT_NAME = " ... ";

    public VkChatMessage() {
        chat_active = new ArrayList<>();
        chat_id = -1;
    }

    @Override
    public String title() {
        return super.title().equals(DEFAULT_NAME) ? VkLocalCache.getUser((int)userId()) : super.title();
    }

    public int chatId() {
        return chat_id;
    }

    public void setChatId(int chat_id) {
        this.chat_id = chat_id;
    }

    public ArrayList<String> chatActive() {
        return chat_active;
    }

    public void setChatActive(ArrayList<String> chat_active) {
        this.chat_active = chat_active;
    }

    public int usersCount() {
        return users_count;
    }

    public void setUsersCount(int users_count) {
        this.users_count = users_count;
    }

    public int adminId() {
        return admin_id;
    }

    public void setAdminId(int admin_id) {
        this.admin_id = admin_id;
    }

    public String photo50() {
        return photo_50;
    }

    public void setPhoto50(String photo_50) {
        this.photo_50 = photo_50;
    }

    public String photo100() {
        return photo_100;
    }

    public void setPhoto100(String photo_100) {
        this.photo_100 = photo_100;
    }

    public String photo200() {
        return photo_200;
    }

    public void setPhoto200(String photo_200) {
        this.photo_200 = photo_200;
    }
}
