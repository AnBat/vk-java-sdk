package com.batiaev.vk.api.dataTypes;

/**
 * Created by anton on 19/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

/**
 * Group object describes a community
 * @see VKPost
 */
public class VKGroup {

    public int gid;
    public String name;
    public String screen_name;
    public int is_closed; //0 — open, 1 — closed, 2 — private
    public boolean is_admin; //0 — is not the manager, 1 — is the manager

    public int admin_level; //1 — moderator, 2 — editor, 3 — administrator (if is_admin = 1)
    public boolean is_member; //0 — is not а member, 1 — is a member
    public String type;
    public String photo;
    public String photo_medium;
    public String photo_big;
    //Optional fields
    public int city;
    public int country;
    public int place;
    public String description;
    public String wiki_page;
    public int members_count;
    public boolean counters;
    public int start_date;
    public int end_date;
    public boolean can_post; //0 — cannot, 1 — can
    public boolean can_see_all_posts; //0 — cannot be viewed, 1 — can be viewed
    public String activity;
    public String status;
    public String contacts;

}
