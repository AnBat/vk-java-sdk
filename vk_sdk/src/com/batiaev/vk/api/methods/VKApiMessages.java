package com.batiaev.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKApi;
import com.batiaev.vk.api.VKError;
import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.VKRequest;
import com.batiaev.vk.api.consts.VKApiConst;
import com.batiaev.vk.api.consts.VKApiMessagesConsts;
import com.batiaev.vk.api.dataTypes.VKMessage;
import com.batiaev.vk.api.dataTypes.VKMessageList;
import com.batiaev.vk.api.dataTypes.VKUserList;
import com.batiaev.vk.api.system.VkJsonParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * Builds requests for API.messages part
 * 
 * https://vk.com/dev/messages
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
        String respond =  prepareRequest(VKApiConst.GET, params).getRequest();
        JSONObject obj = new JSONObject(respond);
        if (obj.has(VKApiConst.ERROR)) {
            VKError error = VkJsonParser.parseError(obj.getJSONObject(VKApiConst.ERROR));
            LOG.error("## error = " + error.toString());
            return null;
        }
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
    public VKMessageList getHistory(VKParameters params) {
        String respond =  prepareRequest(VKApiConst.GET_HISTORY, params).getRequest();
        JSONObject obj = new JSONObject(respond);
        if (obj.has(VKApiConst.ERROR)) {
            VKError error = VkJsonParser.parseError(obj.getJSONObject(VKApiConst.ERROR));
            LOG.error("## error = " + error.toString());
            return null;
        }
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

    @Override
    protected String getMethodsGroup() {
        return "messages";
    }
}
