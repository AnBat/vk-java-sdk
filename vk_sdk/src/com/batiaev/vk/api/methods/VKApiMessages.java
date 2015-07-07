package com.batiaev.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKApi;
import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.VKRequest;
import com.batiaev.vk.api.consts.VKApiConst;
import com.batiaev.vk.api.consts.VKApiMessagesConsts;
import com.batiaev.vk.api.dataTypes.VKMessage;
import com.batiaev.vk.api.dataTypes.VKMessageList;
import com.batiaev.vk.api.dataTypes.VKUserList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

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
        final JSONArray messageList = obj.getJSONArray(VKApiConst.RESPONSE);
        VKMessageList result = new VKMessageList();
        int messageCount = messageList.getInt(0);
        LOG.info("Total count of messages: " + messageCount);
        HashMap<Integer, String> userCache = new HashMap<>();
        for (int i = 1; i < messageList.length(); ++i) {
            VKMessage message = new VKMessage();
            JSONObject messageJson = messageList.getJSONObject(i);

            if (messageJson.has(VKApiMessagesConsts.MID))
                message.id = messageJson.getInt(VKApiMessagesConsts.MID);
            if (messageJson.has(VKApiMessagesConsts.UID))
                message.user_id = messageJson.getInt(VKApiMessagesConsts.UID);
            if (messageJson.has(VKApiMessagesConsts.DATE))
                message.date = new Date((long)messageJson.getInt(VKApiMessagesConsts.DATE)*1000);
            if (messageJson.has(VKApiMessagesConsts.BODY))
                message.body = messageJson.getString(VKApiMessagesConsts.BODY);

            result.add(message);

            //get user by ID
            if (!userCache.containsKey(message.user_id)) {
                VKParameters userParams = new VKParameters();
                userParams.setValue("user_id", message.user_id);
                userParams.setValue("fields", "first_name, last_name");
                VKUserList users = VKApi.users().get(userParams);

                userCache.put(message.user_id, users.get(0).fullName());
            }

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            LOG.info(userCache.get(message.user_id) + " " + dateFormat.format(message.date) + " " + message.body);
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
//        if (obj.has(VKApiConst.ERROR)) {
//            //FIXME
//            return new VKMessageList();
//        }
        JSONObject respondJson = obj.getJSONObject(VKApiConst.RESPONSE);
        if (respondJson.has(VKApiConst.COUNT)) {
            int messageCount = respondJson.getInt(VKApiConst.COUNT);
            LOG.info("Total count of messages: " + messageCount);
        }
        if (respondJson.has(VKApiConst.UNREAD)) {
            int messageUnread = respondJson.getInt(VKApiConst.UNREAD);
            LOG.info("Count of unread messages: " + messageUnread);
        }
        final JSONArray messageList = respondJson.getJSONArray(VKApiConst.ITEMS);
        VKMessageList result = new VKMessageList();

        HashMap<Integer, String> userCache = new HashMap<>();
        for (int i = 2; i < messageList.length(); ++i) {
            VKMessage message = new VKMessage();
            JSONObject messageJson = messageList.getJSONObject(i);

            if (messageJson.has(VKApiMessagesConsts.ID))
                message.id = messageJson.getInt(VKApiMessagesConsts.ID);
//            if (messageJson.has(VKApiMessagesConsts.USER_ID))
//                message.user_id = messageJson.getInt(VKApiMessagesConsts.USER_ID);
            if (messageJson.has(VKApiMessagesConsts.FROM_ID))
                message.user_id = messageJson.getInt(VKApiMessagesConsts.FROM_ID);
            if (messageJson.has(VKApiMessagesConsts.DATE))
                message.date = new Date((long)messageJson.getInt(VKApiMessagesConsts.DATE)*1000);
            if (messageJson.has(VKApiMessagesConsts.BODY))
                message.body = messageJson.getString(VKApiMessagesConsts.BODY);
            if (messageJson.has(VKApiMessagesConsts.READ_STATE))
                message.read_state = messageJson.getInt(VKApiMessagesConsts.READ_STATE) == 1;
            if (messageJson.has(VKApiMessagesConsts.OUT))
                message.out = messageJson.getInt(VKApiMessagesConsts.OUT) == 1;
            if (messageJson.has(VKApiMessagesConsts.EMOJI))
                message.emoji = messageJson.getInt(VKApiMessagesConsts.EMOJI) == 1;

            result.add(message);

            //get user by ID
            if (!userCache.containsKey(message.user_id)) {
                VKParameters userParams = new VKParameters();
                userParams.setValue("user_id", message.user_id);
                userParams.setValue("fields", "first_name, last_name");
                VKUserList users = VKApi.users().get(userParams);

                userCache.put(message.user_id, users.get(0).fullName());
            }

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            LOG.info(userCache.get(message.user_id) + " " + dateFormat.format(message.date) + " " + message.body);
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
