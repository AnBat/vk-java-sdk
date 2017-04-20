/*
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk.api;

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.annotation.Rights;
import com.batiaev.vk.common.consts.VKApiRigths;

/**
 * Builds requests for API.board part
 * <p>
 * https://vk.com/dev/board
 *
 * @author batiaev
 * @since 17/04/15
 */
public class VKApiBoard extends VKApiBase {

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/board.getTopics">API board.getTopics()</a>
     */
    @Rights(value = VKApiRigths.OPEN_METHOD)
    public String getTopics(VKParameters params) {
        return execute(getUrl("getTopics", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/board.getComments">API board.getComments()</a>
     */
    @Rights(value = VKApiRigths.OPEN_METHOD)
    public String getComments(VKParameters params) {
        return execute(getUrl("getComments", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/board.addTopic">API board.addTopic()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String addTopic(VKParameters params) {
        return execute(getUrl("addTopic", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/board.addComment">API board.addComment()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String addComment(VKParameters params) {
        return execute(getUrl("addComment", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/board.deleteTopic">API board.deleteTopic()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String deleteTopic(VKParameters params) {
        return execute(getUrl("deleteTopic", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/board.editTopic">API board.editTopic()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String editTopic(VKParameters params) {
        return execute(getUrl("editTopic", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/board.editComment">API board.editComment()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String editComment(VKParameters params) {
        return execute(getUrl("editComment", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/board.restoreComment">API board.restoreComment()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String restoreComment(VKParameters params) {
        return execute(getUrl("restoreComment", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/board.deleteComment">API board.deleteComment()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String deleteComment(VKParameters params) {
        return execute(getUrl("deleteComment", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/board.openTopic">API board.openTopic()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String openTopic(VKParameters params) {
        return execute(getUrl("openTopic", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/board.closeTopic">API board.closeTopic()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String closeTopic(VKParameters params) {
        return execute(getUrl("closeTopic", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/board.fixTopic">API board.fixTopic()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String fixTopic(VKParameters params) {
        return execute(getUrl("fixTopic", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/board.unfixTopic">API board.unfixTopic()</a>
     */
    @Rights(value = VKApiRigths.GROUPS, standAloneOnly = true)
    public String unfixTopic(VKParameters params) {
        return execute(getUrl("unfixTopic", params)).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "board";
    }
}
