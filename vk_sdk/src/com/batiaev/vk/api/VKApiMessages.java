package com.batiaev.vk.api;

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.consts.VKApiConst;
import com.batiaev.vk.common.consts.VKApiJsonConst;
import com.batiaev.vk.common.consts.VkApiMethods;
import com.batiaev.vk.common.entity.VkChatMessage;
import com.batiaev.vk.common.entity.VkChatList;
import com.batiaev.vk.common.entity.VKMessage;
import com.batiaev.vk.common.entity.VKMessageList;
import com.batiaev.vk.common.system.VkJsonParser;
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

        JSONObject respondJson = execute(VkApiMethods.GET, params);
        if (respondJson == null) return null;

        VKMessageList result = new VKMessageList();

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
    public VkChatList getDialogs(VKParameters params) {

        JSONObject respondJson = execute("getDialogs", params);
        if (respondJson == null) return null;

        VkChatList result = new VkChatList();

        if (respondJson.has(VKApiConst.COUNT)) result.setTotalCount(respondJson.getInt(VKApiConst.COUNT));
        if (respondJson.has(VKApiConst.UNREAD)) result.setUnreadCount(respondJson.getInt(VKApiConst.UNREAD));

        final JSONArray chatList = respondJson.getJSONArray(VKApiConst.ITEMS);

        for (int i = 0; i < chatList.length(); ++i) {
            VkChatMessage chat = VkJsonParser.parseChat(chatList.getJSONObject(i));
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
    public VKMessageList getById(VKParameters params) {

        JSONObject respondJson = execute("getById", params);
        if (respondJson == null) return null;

        VKMessageList result = new VKMessageList();

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
     * <a href="https://vk.com/dev/messages.search">API messages.search()</a>
     *
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String search(VKParameters params) {
        return execute("search", params).toString();
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

        JSONObject respondJson = execute(VkApiMethods.GET_HISTORY, params);
        if (respondJson == null) return null;

        VKMessageList result = new VKMessageList();

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
     * @return ID of the sent message (mid).
     */
    public long send(VKParameters params) {
        JSONObject obj = new JSONObject(executeRaw("send", params));
        return obj.getLong(VKApiJsonConst.RESPONSE);
    }
    
    /**
     * <a href="https://vk.com/dev/messages.delete">API messages.delete()</a>
     *
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return 1
     */
    public String delete(VKParameters params) {
        return execute("delete", params).toString();
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
        return execute("deleteDialog", params).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/messages.restore">API messages.restore()</a>
     *
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return 1
     */
    public String restore(VKParameters params) {
        return execute("restore", params).toString();
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
        return execute("markAsRead", params).toString();
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
        return execute("markAsImportant", params).toString();
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
        return execute("getLongPollServer", params).toString();
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
        return execute("getLongPollHistory", params).toString();
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
        return execute("getChat", params).toString();
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
        return execute("createChat", params).toString();
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
        return execute("editChat", params).toString();
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
        return execute("getChatUsers", params).toString();
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
        return execute("setActivity", params).toString();
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
        return execute("searchDialogs", params).toString();
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
        return execute("addChatUser", params).toString();
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
        return execute("removeChatUser", params).toString();
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
        return execute("getLastActivity", params).toString();
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
        return execute("setChatPhoto", params).toString();
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
        return execute("deleteChatPhoto", params).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "messages";
    }
}
