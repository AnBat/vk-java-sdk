package com.batiaev.vk.api.dataTypes;

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
 * @see VKPost
 */
public class VKComment {

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int fromId() {
        return from_id;
    }

    public void setFromId(int from_id) {
        this.from_id = from_id;
    }

    public int date() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String text() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int replyToUid() {
        return reply_to_uid;
    }

    public void setReplyToUid(int reply_to_uid) {
        this.reply_to_uid = reply_to_uid;
    }

    public int replyToCid() {
        return reply_to_cid;
    }

    public void setReplyToCid(int reply_to_cid) {
        this.reply_to_cid = reply_to_cid;
    }

    public List<String> attachments() {
        return attachments;
    }

    public void setAttachments(List<String> attachments) {
        this.attachments = attachments;
    }

    private int id;
    private int from_id;
    private int date;
    private String text;
    private int reply_to_uid;
    private int reply_to_cid;
    private List<String> attachments;

}
