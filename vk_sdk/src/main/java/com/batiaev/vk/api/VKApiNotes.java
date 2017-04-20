/*
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk.api;

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.consts.VkApiMethods;

/**
 * Builds requests for API.notes part
 *
 * @author batiaev
 * @see <a href="https://vk.com/dev/notes">API notes()</a>
 * @since 17/04/15
 */
public class VKApiNotes extends VKApiBase {

    /**
     * <a href="https://vk.com/dev/newsfeed.get">API newsfeed.get()</a>
     *
     * @param params method parameters
     * @return String with json respond
     * <p>
     * You need the following rights to call this method: notes.
     */
    public String get(VKParameters params) {
        return execute(getUrl(VkApiMethods.GET, params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.getById">API newsfeed.getById()</a>
     *
     * @param params method parameters
     * @return String with json respond
     * <p>
     * You need the following rights to call this method: notes.
     */
    public String getById(VKParameters params) {
        return execute(getUrl(VkApiMethods.GET_BY_ID, params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.getFriendsNotes">API newsfeed.getFriendsNotes()</a>
     *
     * @param params method parameters
     * @return String with json respond
     * <p>
     * You need the following rights to call this method: notes.
     */
    public String getFriendsNotes(VKParameters params) {
        return execute(getUrl("getFriendsNotes", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.add">API newsfeed.add()</a>
     *
     * @param params method parameters
     * @return String with json respond
     * <p>
     * You need the following rights to call this method: notes.
     */
    public String add(VKParameters params) {
        return execute(getUrl(VkApiMethods.ADD, params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.edit">API newsfeed.edit()</a>
     *
     * @param params method parameters
     * @return String with json respond
     * <p>
     * You need the following rights to call this method: notes.
     */
    public String edit(VKParameters params) {
        return execute(getUrl(VkApiMethods.EDIT, params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.delete">API newsfeed.delete()</a>
     *
     * @param params method parameters
     * @return String with json respond
     * <p>
     * You need the following rights to call this method: notes.
     */
    public String delete(VKParameters params) {
        return execute(getUrl(VkApiMethods.DELETE, params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.getComments">API newsfeed.getComments()</a>
     *
     * @param params method parameters
     * @return String with json respond
     * <p>
     * You need the following rights to call this method: notes.
     */
    public String getComments(VKParameters params) {
        return execute(getUrl("getComments", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.createComment">API newsfeed.createComment()</a>
     *
     * @param params method parameters
     * @return String with json respond
     * <p>
     * You need the following rights to call this method: notes.
     * This method is available only to standalone-applications.
     */
    public String createComment(VKParameters params) {
        return execute(getUrl("createComment", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.editComment">API newsfeed.editComment()</a>
     *
     * @param params method parameters
     * @return String with json respond
     * <p>
     * You need the following rights to call this method: notes.
     * This method is available only to standalone-applications.
     */
    public String editComment(VKParameters params) {
        return execute(getUrl("editComment", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.deleteComment">API newsfeed.deleteComment()</a>
     *
     * @param params method parameters
     * @return String with json respond
     * <p>
     * You need the following rights to call this method: notes.
     * This method is available only to standalone-applications.
     */
    public String deleteComment(VKParameters params) {
        return execute(getUrl("deleteComment", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.restoreComment">API newsfeed.restoreComment()</a>
     *
     * @param params method parameters
     * @return String with json respond
     * <p>
     * You need the following rights to call this method: notes.
     * This method is available only to standalone-applications.
     */
    public String restoreComment(VKParameters params) {
        return execute(getUrl("restoreComment", params)).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "notes";
    }
}
