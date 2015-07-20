package com.batiaev.vk.api.methods;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.annotation.Rights;
import com.batiaev.vk.api.consts.VKApiRigths;

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
     * @see <a href="https://vk.com/dev/board.getTopics">API board.getTopics()</a>
     */
    @Rights(value = VKApiRigths.OPEN_METHOD)
    public String getTopics(VKParameters params) {
        return prepareRequest("getTopics", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/board.getComments">API board.getComments()</a>
     */
    @Rights(value = VKApiRigths.OPEN_METHOD)
    public String getComments(VKParameters params) {
        return prepareRequest("getComments", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/board.addTopic">API board.addTopic()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String addTopic(VKParameters params) {
        return prepareRequest("addTopic", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/board.addComment">API board.addComment()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String addComment(VKParameters params) {
        return prepareRequest("addComment", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/board.deleteTopic">API board.deleteTopic()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String deleteTopic(VKParameters params) {
        return prepareRequest("deleteTopic", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/board.editTopic">API board.editTopic()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String editTopic(VKParameters params) {
        return prepareRequest("editTopic", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/board.editComment">API board.editComment()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String editComment(VKParameters params) {
        return prepareRequest("editComment", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/board.restoreComment">API board.restoreComment()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String restoreComment(VKParameters params) {
        return prepareRequest("restoreComment", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/board.deleteComment">API board.deleteComment()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String deleteComment(VKParameters params) {
        return prepareRequest("deleteComment", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/board.openTopic">API board.openTopic()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String openTopic(VKParameters params) {
        return prepareRequest("openTopic", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/board.closeTopic">API board.closeTopic()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String closeTopic(VKParameters params) {
        return prepareRequest("closeTopic", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/board.fixTopic">API board.fixTopic()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String fixTopic(VKParameters params) {
        return prepareRequest("fixTopic", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/board.unfixTopic">API board.unfixTopic()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String unfixTopic(VKParameters params) {
        return prepareRequest("unfixTopic", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "board";
    }
}
