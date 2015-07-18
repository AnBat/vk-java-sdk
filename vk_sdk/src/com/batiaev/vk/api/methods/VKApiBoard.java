package com.batiaev.vk.api.methods;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKParameters;

/**
 * @author batiaev
 *
 * Builds requests for API.board part
 * 
 * https://vk.com/dev/board
 */
public class VKApiBoard extends VKApiBase {

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/board.getTopics
     *
     * This is an open method; it does not require an access_token.
     */
    public String getTopics(VKParameters params) {
        return prepareRequest("getTopics", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/board.getComments
     *
     * This is an open method; it does not require an access_token.
     */
    public String getComments(VKParameters params) {
        return prepareRequest("getComments", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/board.addTopic
     *
     * You need the following rights to call this method: groups.
     * This method is available only to standalone-applications.
     */
    public String addTopic(VKParameters params) {
        return prepareRequest("addTopic", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/board.addComment
     *
     * You need the following rights to call this method: groups.
     * This method is available only to standalone-applications.
     */
    public String addComment(VKParameters params) {
        return prepareRequest("addComment", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/board.deleteTopic
     *
     * You need the following rights to call this method: groups.
     * This method is available only to standalone-applications.
     */
    public String deleteTopic(VKParameters params) {
        return prepareRequest("deleteTopic", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/board.editTopic
     *
     * You need the following rights to call this method: groups.
     * This method is available only to standalone-applications.
     */
    public String editTopic(VKParameters params) {
        return prepareRequest("editTopic", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/board.editComment
     *
     * You need the following rights to call this method: groups.
     * This method is available only to standalone-applications.
     */
    public String editComment(VKParameters params) {
        return prepareRequest("editComment", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/board.restoreComment
     *
     * You need the following rights to call this method: groups.
     * This method is available only to standalone-applications.
     */
    public String restoreComment(VKParameters params) {
        return prepareRequest("restoreComment", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/board.deleteComment
     *
     * You need the following rights to call this method: groups.
     * This method is available only to standalone-applications.
     */
    public String deleteComment(VKParameters params) {
        return prepareRequest("deleteComment", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/board.openTopic
     *
     * You need the following rights to call this method: groups.
     * This method is available only to standalone-applications.
     */
    public String openTopic(VKParameters params) {
        return prepareRequest("openTopic", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/board.closeTopic
     *
     * You need the following rights to call this method: groups.
     * This method is available only to standalone-applications.
     */
    public String closeTopic(VKParameters params) {
        return prepareRequest("closeTopic", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/board.fixTopic
     *
     * You need the following rights to call this method: groups.
     * This method is available only to standalone-applications.
     */
    public String fixTopic(VKParameters params) {
        return prepareRequest("fixTopic", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/board.unfixTopic
     *
     * You need the following rights to call this method: groups.
     * This method is available only to standalone-applications.
     */
    public String unfixTopic(VKParameters params) {
        return prepareRequest("unfixTopic", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "board";
    }
}
