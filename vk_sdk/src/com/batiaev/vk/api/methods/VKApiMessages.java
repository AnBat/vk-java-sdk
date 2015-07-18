package com.batiaev.vk.api.methods;

import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.consts.VKApiConst;
import com.batiaev.vk.api.dataTypes.VKMessage;
import com.batiaev.vk.api.dataTypes.VKMessageList;
import com.batiaev.vk.api.system.VkJsonParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author batiaev
 * Created by anton on 15/04/15.
 * ---
 *
 * Builds requests for API.messages part
 * 
 * https://vk.com/dev/messages
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */
public class VKApiMessages extends VKApiBase {

    private static final Logger LOG = LogManager.getLogger(VKApiMessages.class);
    /**
     * https://vk.com/dev/messages.get
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public VKMessageList get(VKParameters params) {
        JSONObject obj = new JSONObject(prepareRequest(VKApiConst.GET, params).getRequest());

        VKMessageList result = new VKMessageList();
        JSONObject respondJson = obj.getJSONObject(VKApiConst.RESPONSE);
        if (respondJson.has(VKApiConst.COUNT)) result.totalCount = respondJson.getInt(VKApiConst.COUNT);
        if (respondJson.has(VKApiConst.UNREAD)) result.upreadCount = respondJson.getInt(VKApiConst.UNREAD);

        final JSONArray messageList = respondJson.getJSONArray(VKApiConst.ITEMS);

        for (int i = 0; i < messageList.length(); ++i) {
            VKMessage message = VkJsonParser.parseMessage(messageList.getJSONObject(i));
            result.add(message);
        }
        return result;
    }

    /**
     * https://vk.com/dev/messages.getDialogs
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public String getDialogs(VKParameters params) {
        return prepareRequest("getDialogs", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/messages.getById
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public String getById(VKParameters params) {
        return prepareRequest("getById", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/messages.search
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public String search(VKParameters params) {
        return prepareRequest("search", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/messages.getHistory
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public VKMessageList getHistory(VKParameters params) {
        JSONObject obj = new JSONObject(prepareRequest(VKApiConst.GET_HISTORY, params).getRequest());

        VKMessageList result = new VKMessageList();
        JSONObject respondJson = obj.getJSONObject(VKApiConst.RESPONSE);
        if (respondJson.has(VKApiConst.COUNT)) result.totalCount = respondJson.getInt(VKApiConst.COUNT);
        if (respondJson.has(VKApiConst.UNREAD)) result.upreadCount = respondJson.getInt(VKApiConst.UNREAD);

        final JSONArray messageList = respondJson.getJSONArray(VKApiConst.ITEMS);
        for (int i = 0; i < messageList.length(); ++i) {
            VKMessage message = VkJsonParser.parseMessage(messageList.getJSONObject(i));
            result.add(message);
        }
        return result;
    }
    
    /**
     * https://vk.com/dev/messages.send
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public String send(VKParameters params) {
        return prepareRequest("send", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/messages.delete
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public String delete(VKParameters params) {
        return prepareRequest("delete", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/messages.deleteDialog
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public String deleteDialog(VKParameters params) {
        return prepareRequest("deleteDialog", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/messages.restore
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public String restore(VKParameters params) {
        return prepareRequest("restore", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/messages.markAsRead
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public String markAsRead(VKParameters params) {
        return prepareRequest("markAsRead", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/messages.markAsImportant
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public String markAsImportant(VKParameters params) {
        return prepareRequest("markAsImportant", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/messages.getLongPollServer
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public String getLongPollServer(VKParameters params) {
        return prepareRequest("getLongPollServer", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/messages.getLongPollHistory
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public String getLongPollHistory(VKParameters params) {
        return prepareRequest("getLongPollHistory", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/messages.getChat
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public String getChat(VKParameters params) {
        return prepareRequest("getChat", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/messages.createChat
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public String createChat(VKParameters params) {
        return prepareRequest("createChat", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/messages.editChat
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public String editChat(VKParameters params) {
        return prepareRequest("editChat", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/messages.getChatUsers
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public String getChatUsers(VKParameters params) {
        return prepareRequest("getChatUsers", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/messages.setActivity
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public String setActivity(VKParameters params) {
        return prepareRequest("setActivity", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/messages.searchDialogs
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public String searchDialogs(VKParameters params) {
        return prepareRequest("searchDialogs", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/messages.addChatUser
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public String addChatUser(VKParameters params) {
        return prepareRequest("addChatUser", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/messages.removeChatUser
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public String removeChatUser(VKParameters params) {
        return prepareRequest("removeChatUser", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/messages.getLastActivity
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public String getLastActivity(VKParameters params) {
        return prepareRequest("getLastActivity", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/messages.setChatPhoto
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public String setChatPhoto(VKParameters params) {
        return prepareRequest("setChatPhoto", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/messages.deleteChatPhoto
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public String deleteChatPhoto(VKParameters params) {
        return prepareRequest("deleteChatPhoto", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "messages";
    }
}
