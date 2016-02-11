package com.batiaev.vk.common.entity;

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

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int ownerId() {
        return owner_id;
    }

    public void setOwnerId(int to_id) {
        this.owner_id = to_id;
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

    public int replyOwnerId() {
        return reply_owner_id;
    }

    public void setReplyOwnerId(int reply_owner_id) {
        this.reply_owner_id = reply_owner_id;
    }

    public int replyPostId() {
        return reply_post_id;
    }

    public void setReplyPostId(int reply_post_id) {
        this.reply_post_id = reply_post_id;
    }

    public int friendsOnly() {
        return friends_only;
    }

    public void setFriendsOnly(int friends_only) {
        this.friends_only = friends_only;
    }

    public String comments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String likes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String reposts() {
        return reposts;
    }

    public void setReposts(String reposts) {
        this.reposts = reposts;
    }

    public String postType() {
        return post_type;
    }

    public void setPostType(String post_type) {
        this.post_type = post_type;
    }

    public String postSource() {
        return post_source;
    }

    public void setPostSource(String post_source) {
        this.post_source = post_source;
    }

    public String attachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }

    public String geo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }

    public String signerId() {
        return signer_id;
    }

    public void setSignerId(String signer_id) {
        this.signer_id = signer_id;
    }

    public String copyPostDate() {
        return copy_post_date;
    }

    public void setCopyPostDate(String copy_post_date) {
        this.copy_post_date = copy_post_date;
    }

    public String copyPostType() {
        return copy_post_type;
    }

    public void setCopyPostType(String copy_post_type) {
        this.copy_post_type = copy_post_type;
    }

    public int copyOwnerId() {
        return copy_owner_id;
    }

    public void setCopyOwnerId(int copy_owner_id) {
        this.copy_owner_id = copy_owner_id;
    }

    public int copyPostId() {
        return copy_post_id;
    }

    public void setCopyPostId(int copy_post_id) {
        this.copy_post_id = copy_post_id;
    }

    public String copyText() {
        return copy_text;
    }

    public void setCopyText(String copy_text) {
        this.copy_text = copy_text;
    }

    public boolean isCanPin() {
        return can_pin;
    }

    public void setCanPin(boolean can_pin) {
        this.can_pin = can_pin;
    }

    public boolean isPinned() {
        return is_pinned;
    }

    public void setIsPinned(boolean is_pinned) {
        this.is_pinned = is_pinned;
    }

    public String getCopyHistory() {
        return copy_history;
    }

    public void setCopyHistory(String copy_history) {
        this.copy_history = copy_history;
    }

    private int id;
    private int owner_id;
    private int from_id;
    private int date;
    private String text;
    private int reply_owner_id;
    private int reply_post_id;
    private int friends_only;
    private String comments;
    private String likes;
    private String reposts;
    private String post_type;
    private String post_source;
    private String attachments;
    private String geo;
    private String signer_id;
    private String copy_history;
    private String copy_post_date;
    private String copy_post_type;
    private int copy_owner_id;
    private int copy_post_id;
    private String copy_text;
    private boolean can_pin;
    private boolean is_pinned;
}
