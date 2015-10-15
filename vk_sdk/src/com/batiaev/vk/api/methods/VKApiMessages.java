package com.batiaev.vk.api.methods;

import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.consts.VKApiConst;
import com.batiaev.vk.api.consts.VKApiJsonConst;
import com.batiaev.vk.api.dataTypes.VKChat;
import com.batiaev.vk.api.dataTypes.VKChatList;
import com.batiaev.vk.api.dataTypes.VKMessage;
import com.batiaev.vk.api.dataTypes.VKMessageList;
import com.batiaev.vk.api.system.VkJsonParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author batiaev
 * Created by batiaev on 15/04/15.
 * ---
 *
 * Builds requests for API.messages part
 *
 * <a href="https://vk.com/dev/messages">API messages</a>
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */
public class VKApiMessages extends VKApiBase {

    private static final Logger LOG = LogManager.getLogger(VKApiMessages.class);

    /**
     * <a href="https://vk.com/dev/messages.get">API messages.get()</a>
     *
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return list of required messages
     */
    public VKMessageList get(VKParameters params) {
        JSONObject obj = new JSONObject(prepareRequest(VKApiConst.GET, params).getRequest());

        VKMessageList result = new VKMessageList();
        JSONObject respondJson = obj.getJSONObject(VKApiJsonConst.RESPONSE);

        if (respondJson.has(VKApiConst.COUNT)) result.setTotalCount(respondJson.getInt(VKApiConst.COUNT));
        if (respondJson.has(VKApiConst.UNREAD)) result.setUpreadCount(respondJson.getInt(VKApiConst.UNREAD));

        final JSONArray messageList = respondJson.getJSONArray(VKApiConst.ITEMS);

        for (int i = 0; i < messageList.length(); ++i) {
            VKMessage message = VkJsonParser.parseMessage(messageList.getJSONObject(i));
            result.add(message);
        }
        return result;
    }

    /**
     * <a href="https://vk.com/dev/messages.getDialogs">API messages.getDialogs()</a>
     *
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public VKChatList getDialogs(VKParameters params) {
        JSONObject obj = new JSONObject(prepareRequest("getDialogs", params).getRequest());

        VKChatList result = new VKChatList();
        JSONObject respondJson = obj.getJSONObject(VKApiJsonConst.RESPONSE);

        if (respondJson.has(VKApiConst.COUNT)) result.setTotalCount(respondJson.getInt(VKApiConst.COUNT));
        if (respondJson.has(VKApiConst.UNREAD)) result.setUpreadCount(respondJson.getInt(VKApiConst.UNREAD));

        final JSONArray chatList = respondJson.getJSONArray(VKApiConst.ITEMS);

        for (int i = 0; i < chatList.length(); ++i) {
            VKChat chat = VkJsonParser.parseChat(chatList.getJSONObject(i));
            result.add(chat);
        }
        return result;
    }
    
    /**
     * <a href="https://vk.com/dev/messages.getById">API messages.getById()</a>
     *
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String getById(VKParameters params) {
        return prepareRequest("getById", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/messages.search">API messages.search()</a>
     *
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String search(VKParameters params) {
        return prepareRequest("search", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/messages.getHistory">API messages.getHistory()</a>
     *
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return return list of messages from history with concrete user or chat
     */
    public VKMessageList getHistory(VKParameters params) {
        JSONObject obj = new JSONObject(prepareRequest(VKApiConst.GET_HISTORY, params).getRequest());

        VKMessageList result = new VKMessageList();
        JSONObject respondJson = obj.getJSONObject(VKApiJsonConst.RESPONSE);
        if (respondJson.has(VKApiConst.COUNT)) result.setTotalCount(respondJson.getInt(VKApiConst.COUNT));
        if (respondJson.has(VKApiConst.UNREAD)) result.setUpreadCount(respondJson.getInt(VKApiConst.UNREAD));

        final JSONArray messageList = respondJson.getJSONArray(VKApiConst.ITEMS);
        for (int i = 0; i < messageList.length(); ++i) {
            VKMessage message = VkJsonParser.parseMessage(messageList.getJSONObject(i));
            result.add(message);
        }
        return result;
    }
    
    /**
     * <a href="https://vk.com/dev/messages.send">API messages.send()</a>
     *
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String send(VKParameters params) {
        return prepareRequest("send", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/messages.delete">API messages.delete()</a>
     *
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String delete(VKParameters params) {
        return prepareRequest("delete", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/messages.deleteDialog">API messages.deleteDialog()</a>
     *
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String deleteDialog(VKParameters params) {
        return prepareRequest("deleteDialog", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/messages.restore">API messages.restore()</a>
     *
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String restore(VKParameters params) {
        return prepareRequest("restore", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/messages.markAsRead">API messages.markAsRead()</a>
     *
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String markAsRead(VKParameters params) {
        return prepareRequest("markAsRead", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/messages.markAsImportant">API messages.markAsImportant()</a>
     *
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String markAsImportant(VKParameters params) {
        return prepareRequest("markAsImportant", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/messages.getLongPollServer">API messages.getLongPollServer()</a>
     *
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String getLongPollServer(VKParameters params) {
        return prepareRequest("getLongPollServer", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/messages.getLongPollHistory">API messages.getLongPollHistory()</a>
     *
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String getLongPollHistory(VKParameters params) {
        return prepareRequest("getLongPollHistory", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/messages.getChat">API messages.getChat()</a>
     *
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String getChat(VKParameters params) {
        return prepareRequest("getChat", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/messages.createChat">API messages.createChat()</a>
     *
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String createChat(VKParameters params) {
        return prepareRequest("createChat", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/messages.editChat">API messages.editChat()</a>
     *
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String editChat(VKParameters params) {
        return prepareRequest("editChat", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/messages.getChatUsers">API messages.getChatUsers()</a>
     *
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String getChatUsers(VKParameters params) {
        return prepareRequest("getChatUsers", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/messages.setActivity">API messages.setActivity()</a>
     *
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String setActivity(VKParameters params) {
        return prepareRequest("setActivity", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/messages.searchDialogs">API messages.searchDialogs()</a>
     *
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String searchDialogs(VKParameters params) {
        return prepareRequest("searchDialogs", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/messages.addChatUser">API messages.addChatUser()</a>
     *
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String addChatUser(VKParameters params) {
        return prepareRequest("addChatUser", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/messages.removeChatUser">API messages.removeChatUser()</a>
     *
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String removeChatUser(VKParameters params) {
        return prepareRequest("removeChatUser", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/messages.getLastActivity">API messages.getLastActivity()</a>
     *
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String getLastActivity(VKParameters params) {
        return prepareRequest("getLastActivity", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/messages.setChatPhoto">API messages.setChatPhoto()</a>
     *
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String setChatPhoto(VKParameters params) {
        return prepareRequest("setChatPhoto", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/messages.deleteChatPhoto">API messages.deleteChatPhoto()</a>
     *
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String deleteChatPhoto(VKParameters params) {
        return prepareRequest("deleteChatPhoto", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "messages";
    }
}
