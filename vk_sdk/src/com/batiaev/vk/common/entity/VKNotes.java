package com.batiaev.vk.common.entity;

/**
 * @author batiaev
 * Created by anton on 20/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

/**
 * A note object describes a note
 * API version 5.0 and higher
 * @see VKDoc
 */
public class VKNotes {

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int userId() {
        return user_id;
    }

    public void setUserId(int user_id) {
        this.user_id = user_id;
    }

    public String title() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String text() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int date() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String comments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int readComments() {
        return read_comments;
    }

    public void setReadComments(int read_comments) {
        this.read_comments = read_comments;
    }

    private int id;
    private int user_id;
    private String title;
    private String text;
    private int date;
    private String comments;
    private int read_comments;

}
