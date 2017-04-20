/*
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk.common.consts;

/**
 * @author batiaev
 * @since 7/8/15
 */
public class VkApiMessagesParams {
    public final static String USER_ID = "user_id"; //send, getHistory
    public final static String CHAT_ID = "chat_id"; //send, getHistory
    public final static String OFFSET = "offset"; //get, getHistory, getDialogs
    public final static String COUNT = "count"; //get, getHistory, getDialogs
    public final static String START_MESSAGE_ID = "start_message_id"; //getHistory, getDialogs
    public final static String PREVIEW_LENGTH = "preview_length"; //get, getDialogs

    //for messages.send method
    public final static String DOMAIN = "domain";
    public final static String USER_IDS = "user_ids";
    public final static String MESSAGE = "message";
    public final static String GUID = "guid";
    public final static String LAT = "lat";
    public final static String LONG = "long";
    public final static String ATTACHMENT = "attachment";
    public final static String FORWARD_MESSAGES = "forward_messages";
    public final static String STICKER_ID = "sticker_id";

    //for messages.getHistory method
    public final static String REV = "rev";

    //for messages.get method
    public final static String OUT = "out";
    public final static String TIME_OFFSET = "time_offset";
    public final static String FILTERS = "filters";
    public final static String LAST_MESSAGE_ID = "last_message_id";

    //for messages.getDialogs method
    public final static String UNREAD = "unread";
}
