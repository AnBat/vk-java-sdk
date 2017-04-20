package com.batiaev.vk.common.entity;

import java.util.ArrayList;

/**
 * @author batiaev
 * @since 10/23/15
 */
public class VkChat extends AbstractEntity {
    /**
     * chat ID, positive number
     */
    private long id;
    /**
     * type of chat, String
     */
    private String type;
    /**
     * chat title, String
     */
    private String title;
    /**
     * ID of the chat starter, positive number
     */
    private long admin_id;
    /**
     * list of chat participants' IDs.
     */
    private ArrayList<Long> users;

    public VkChat() {
        users = new ArrayList<>();
    }

    public ArrayList<Long> users() {
        return users;
    }

    public void setUsers(ArrayList<Long> users) {
        this.users = users;
    }

    public long id() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String type() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String title() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long adminId() {
        return admin_id;
    }

    public void setAdminId(long admin_id) {
        this.admin_id = admin_id;
    }
}
