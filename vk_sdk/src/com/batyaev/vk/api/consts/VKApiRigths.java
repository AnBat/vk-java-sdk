package com.batyaev.vk.api.consts;

/**
 * Created by anton on 18/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */
public class VKApiRigths {
    public final static int NOTIFY = 1; //User allowed to send notifications to him/her.
    public final static int FRIENDS = 2; //Access to friends.
    public final static int PHOTOS = 4; //Access to photos.
    public final static int AUDIO = 8; //Access to audios.
    public final static int VIDEO = 16; //Access to videos.
    public final static int OFFERS = 32; //Access to offers (obsolete methods).
    public final static int QUESTIONS = 64; //Access to questions (obsolete methods).
    public final static int PAGES = 128; //Access to wiki pages.
    public final static int LINKS = 256; //Addition of link to the application in the left menu.
    public final static int STATUS = 1024; //Access to user status.
    public final static int NOTES = 2048; //Access to user notes.
    public final static int MESSAGES = 4096; //Access to advanced methods for messaging. (for Standalone applications)
    public final static int WALL = 8192; //Access to standard and advanced methods for the wall. Note that this access permission is unavailable for sites (it is ignored at attempt of authorization).
    public final static int ADS = 32768; //Access to advanced methods for Ads API.
    public final static int DOCS = 131072; //Access to documents.
    public final static int GROUPS = 262144; //Access to user groups.
    public final static int NOTIFICATIONS = 524288; //Access to notifications about answers to the user.
    public final static int STATS = 1048576; //Access to statistics of user groups and applications where he/she is an administrator.
    public final static int EMAIL = 4194304; //User e-mail access. Available only for sites.
}
