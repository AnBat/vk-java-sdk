package com.batyaev.vk.api.methods;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batyaev.vk.api.VKParameters;
import com.batyaev.vk.api.VKRequest;

/**
 * Builds requests for API.board part
 * 
 * https://vk.com/dev/board
 */
public class VKApiBoard extends VKApiBase {

    /**
     * https://vk.com/dev/board.getTopics
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest getTopics(VKParameters params) {
        return prepareRequest("getTopics", params);
    }

    /**
     * https://vk.com/dev/board.getComments
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest getComments(VKParameters params) {
        return prepareRequest("getComments", params);
    }

    /**
     * https://vk.com/dev/board.addTopic
     *
     * You need the following rights to call this method: groups.
     * This method is available only to standalone-applications.
     */
    public VKRequest addTopic(VKParameters params) {
        return prepareRequest("addTopic", params);
    }

    /**
     * https://vk.com/dev/board.addComment
     *
     * You need the following rights to call this method: groups.
     * This method is available only to standalone-applications.
     */
    public VKRequest addComment(VKParameters params) {
        return prepareRequest("addComment", params);
    }

    /**
     * https://vk.com/dev/board.deleteTopic
     *
     * You need the following rights to call this method: groups.
     * This method is available only to standalone-applications.
     */
    public VKRequest deleteTopic(VKParameters params) {
        return prepareRequest("deleteTopic", params);
    }

    /**
     * https://vk.com/dev/board.editTopic
     *
     * You need the following rights to call this method: groups.
     * This method is available only to standalone-applications.
     */
    public VKRequest editTopic(VKParameters params) {
        return prepareRequest("editTopic", params);
    }

    /**
     * https://vk.com/dev/board.editComment
     *
     * You need the following rights to call this method: groups.
     * This method is available only to standalone-applications.
     */
    public VKRequest editComment(VKParameters params) {
        return prepareRequest("editComment", params);
    }

    /**
     * https://vk.com/dev/board.restoreComment
     *
     * You need the following rights to call this method: groups.
     * This method is available only to standalone-applications.
     */
    public VKRequest restoreComment(VKParameters params) {
        return prepareRequest("restoreComment", params);
    }

    /**
     * https://vk.com/dev/board.deleteComment
     *
     * You need the following rights to call this method: groups.
     * This method is available only to standalone-applications.
     */
    public VKRequest deleteComment(VKParameters params) {
        return prepareRequest("deleteComment", params);
    }

    /**
     * https://vk.com/dev/board.openTopic
     *
     * You need the following rights to call this method: groups.
     * This method is available only to standalone-applications.
     */
    public VKRequest openTopic(VKParameters params) {
        return prepareRequest("openTopic", params);
    }

    /**
     * https://vk.com/dev/board.closeTopic
     *
     * You need the following rights to call this method: groups.
     * This method is available only to standalone-applications.
     */
    public VKRequest closeTopic(VKParameters params) {
        return prepareRequest("closeTopic", params);
    }

    /**
     * https://vk.com/dev/board.fixTopic
     *
     * You need the following rights to call this method: groups.
     * This method is available only to standalone-applications.
     */
    public VKRequest fixTopic(VKParameters params) {
        return prepareRequest("fixTopic", params);
    }

    /**
     * https://vk.com/dev/board.unfixTopic
     *
     * You need the following rights to call this method: groups.
     * This method is available only to standalone-applications.
     */
    public VKRequest unfixTopic(VKParameters params) {
        return prepareRequest("unfixTopic", params);
    }

    @Override
    protected String getMethodsGroup() {
        return "board";
    }
}
