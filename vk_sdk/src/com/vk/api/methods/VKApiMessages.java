package com.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;

/**
 * Builds requests for API.messages part
 * 
 * https://vk.com/dev/messages
 */
public class VKApiMessages extends VKApiBase {
    
    /**
     * https://vk.com/dev/messages.get
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public VKRequest get(VKParameters params) {
        return prepareRequest("get", params);
    }

    /**
     * https://vk.com/dev/messages.getDialogs
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public VKRequest getDialogs(VKParameters params) {
        return prepareRequest("getDialogs", params);
    }
    
    /**
     * https://vk.com/dev/messages.getById
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public VKRequest getById(VKParameters params) {
        return prepareRequest("getById", params);
    }
    
    /**
     * https://vk.com/dev/messages.search
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public VKRequest search(VKParameters params) {
        return prepareRequest("search", params);
    }
    
    /**
     * https://vk.com/dev/messages.getHistory
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public VKRequest getHistory(VKParameters params) {
        return prepareRequest("getHistory", params);
    }
    
    /**
     * https://vk.com/dev/messages.send
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public VKRequest send(VKParameters params) {
        return prepareRequest("send", params);
    }
    
    /**
     * https://vk.com/dev/messages.delete
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public VKRequest delete(VKParameters params) {
        return prepareRequest("delete", params);
    }
    
    /**
     * https://vk.com/dev/messages.deleteDialog
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public VKRequest deleteDialog(VKParameters params) {
        return prepareRequest("deleteDialog", params);
    }
    
    /**
     * https://vk.com/dev/messages.restore
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public VKRequest restore(VKParameters params) {
        return prepareRequest("restore", params);
    }
    
    /**
     * https://vk.com/dev/messages.markAsRead
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public VKRequest markAsRead(VKParameters params) {
        return prepareRequest("markAsRead", params);
    }
    
    /**
     * https://vk.com/dev/messages.markAsImportant
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public VKRequest markAsImportant(VKParameters params) {
        return prepareRequest("markAsImportant", params);
    }
    
    /**
     * https://vk.com/dev/messages.getLongPollServer
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public VKRequest getLongPollServer(VKParameters params) {
        return prepareRequest("getLongPollServer", params);
    }
    
    /**
     * https://vk.com/dev/messages.getLongPollHistory
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public VKRequest getLongPollHistory(VKParameters params) {
        return prepareRequest("getLongPollHistory", params);
    }
    
    /**
     * https://vk.com/dev/messages.getChat
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public VKRequest getChat(VKParameters params) {
        return prepareRequest("getChat", params);
    }
    
    /**
     * https://vk.com/dev/messages.createChat
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public VKRequest createChat(VKParameters params) {
        return prepareRequest("createChat", params);
    }
    
    /**
     * https://vk.com/dev/messages.editChat
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public VKRequest editChat(VKParameters params) {
        return prepareRequest("editChat", params);
    }
    
    /**
     * https://vk.com/dev/messages.getChatUsers
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public VKRequest getChatUsers(VKParameters params) {
        return prepareRequest("getChatUsers", params);
    }
    
    /**
     * https://vk.com/dev/messages.setActivity
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public VKRequest setActivity(VKParameters params) {
        return prepareRequest("setActivity", params);
    }
    
    /**
     * https://vk.com/dev/messages.searchDialogs
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public VKRequest searchDialogs(VKParameters params) {
        return prepareRequest("searchDialogs", params);
    }
    
    /**
     * https://vk.com/dev/messages.addChatUser
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public VKRequest addChatUser(VKParameters params) {
        return prepareRequest("addChatUser", params);
    }
    
    /**
     * https://vk.com/dev/messages.removeChatUser
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public VKRequest removeChatUser(VKParameters params) {
        return prepareRequest("removeChatUser", params);
    }
    
    /**
     * https://vk.com/dev/messages.getLastActivity
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public VKRequest getLastActivity(VKParameters params) {
        return prepareRequest("getLastActivity", params);
    }
    
    /**
     * https://vk.com/dev/messages.setChatPhoto
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public VKRequest setChatPhoto(VKParameters params) {
        return prepareRequest("setChatPhoto", params);
    }
    
    /**
     * https://vk.com/dev/messages.deleteChatPhoto
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public VKRequest deleteChatPhoto(VKParameters params) {
        return prepareRequest("deleteChatPhoto", params);
    }
}
