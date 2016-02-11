package com.batiaev.vk.common.entity;

import com.batiaev.vk.sdk.VkLocalCache;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author batiaev
 * Created by batiaev on 20/04/15.
 * ---
 * A message object describes a private message
 * API version 5.0 and higher
 * @see VKMessageList
 * @see VkDialog
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */
public class VKMessage extends VkObject {

    public void addAttachment(VkMessageAttachment attachment) {
        attachments.add(attachment);
    }

    public VkMessageAttachment attachment(int index) {
        return attachments.get(index);
    }
    public ArrayList<VkMessageAttachment> attachments() {
        return attachments;
    }

    public void setAttachments(ArrayList<VkMessageAttachment> attachments) {
        this.attachments = attachments;
    }

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int fromId() {
        return from_id;
    }

    public void setFrom_id(int from_id) {
        this.from_id = from_id;
    }

    public long userId() {
        return user_id;
    }

    public void setUserId(long user_id) {
        this.user_id = user_id;
    }

    public Date getDate() {
        return date;
    }

    public String getDate(String format) {
        SimpleDateFormat df = new SimpleDateFormat(format);//"yyyy.MM.dd_HH:mm:ss"
        return df.format(date);
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

    private int id;
    private int from_id;
    private long user_id;
    private Date date;
    private boolean read_state;
    private boolean out;
    private String title;
    private String body;
    private ArrayList<VkMessageAttachment> attachments;
    private ArrayList<VKMessage> fwd_messages;
    private boolean emoji;
    private boolean deleted;

    public VKMessage() {
        attachments = new ArrayList<>();
        fwd_messages = new ArrayList<>();
    }

    public String plainText() {
        return getDate("yyyy.MM.dd HH:mm:ss") + " " + VkLocalCache.getUser(from_id) + " " + body + System.lineSeparator();
    }

}
