package com.batiaev.vk.api.dataTypes;

import java.util.*;

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

    public void addAttachment(VkAttachment attachment) {
        attachments.add(attachment);
    }

    public VkAttachment attachment(int index) {
        return attachments.get(index);
    }
    public ArrayList<VkAttachment> attachments() {
        return attachments;
    }

    public void setAttachments(ArrayList<VkAttachment> attachments) {
        this.attachments = attachments;
    }

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int fromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int userId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isRead() {
        return read_state;
    }

    public void setReadState(boolean read_state) {
        this.read_state = read_state;
    }

    public boolean isOut() {
        return out;
    }

    public void setOut(boolean out) {
        this.out = out;
    }

    public String title() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String body() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public VKMessage fwdMessage(int index) {
        return fwd_messages.get(index);
    }

    public void addFwdMessage(VKMessage message) {
        fwd_messages.add(message);
    }

    public ArrayList<VKMessage> fwdMessages() {
        return fwd_messages;
    }

    public void setFwdMessages(ArrayList<VKMessage> fwd_messages) {
        this.fwd_messages = fwd_messages;
    }

    public boolean hasEmoji() {
        return emoji;
    }

    public void setEmoji(boolean emoji) {
        this.emoji = emoji;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
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

    public String usersCount() {
        return users_count;
    }

    public void setUsersCount(String users_count) {
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

    private int id;
    private int fromId;
    private int userId;
    private Date date;
    private boolean read_state;
    private boolean out;
    private String title;
    private String body;
    private ArrayList<VkAttachment> attachments;
    private ArrayList<VKMessage> fwd_messages;
    private boolean emoji;
    private boolean deleted;
    //Additional fields for group chat only
    private int chat_id;
    private ArrayList<String> chat_active;
    private String users_count;
    private int admin_id;
    private String photo_50;
    private String photo_100;
    private String photo_200;

    public VKMessage() {
        attachments = new ArrayList<>();
        fwd_messages = new ArrayList<>();
        chat_active = new ArrayList<>();
    }
}
