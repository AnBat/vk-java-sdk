package com.batiaev.vk.api;

/**
 * @author batiaev
 * Created by batiaev on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */

import com.batiaev.vk.common.VKParameters;

/**
 * Builds requests for API.notes part
 *
 * @see <a href="https://vk.com/dev/notes">API notes()</a>
 */
public class VKApiNotes extends VKApiBase {
	
    /**
     * <a href="https://vk.com/dev/newsfeed.get">API newsfeed.get()</a>
     * @param params method parameters
     * @return String with json respond
     *
     * You need the following rights to call this method: notes.
     */
    public String get(VKParameters params) {
        return execute("get", params).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/newsfeed.getById">API newsfeed.getById()</a>
     * @param params method parameters
     * @return String with json respond
     *
     * You need the following rights to call this method: notes.
     */
    public String getById(VKParameters params) {
        return execute("getById", params).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/newsfeed.getFriendsNotes">API newsfeed.getFriendsNotes()</a>
     * @param params method parameters
     * @return String with json respond
     *
     * You need the following rights to call this method: notes.
     */
    public String getFriendsNotes(VKParameters params) {
        return execute("getFriendsNotes", params).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/newsfeed.add">API newsfeed.add()</a>
     * @param params method parameters
     * @return String with json respond
     *
     * You need the following rights to call this method: notes.
     */
    public String add(VKParameters params) {
        return execute("add", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.edit">API newsfeed.edit()</a>
     * @param params method parameters
     * @return String with json respond
     *
     * You need the following rights to call this method: notes.
     */
    public String edit(VKParameters params) {
        return execute("edit", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.delete">API newsfeed.delete()</a>
     * @param params method parameters
     * @return String with json respond
     *
     * You need the following rights to call this method: notes.
     */
    public String delete(VKParameters params) {
        return execute("delete", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.getComments">API newsfeed.getComments()</a>
     * @param params method parameters
     * @return String with json respond
     *
     * You need the following rights to call this method: notes.
     */
    public String getComments(VKParameters params) {
        return execute("getComments", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.createComment">API newsfeed.createComment()</a>
     * @param params method parameters
     * @return String with json respond
     *
     * You need the following rights to call this method: notes.
     * This method is available only to standalone-applications.
     */
    public String createComment(VKParameters params) {
        return execute("createComment", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.editComment">API newsfeed.editComment()</a>
     * @param params method parameters
     * @return String with json respond
     *
     * You need the following rights to call this method: notes.
     * This method is available only to standalone-applications.
     */
    public String editComment(VKParameters params) {
        return execute("editComment", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.deleteComment">API newsfeed.deleteComment()</a>
     * @param params method parameters
     * @return String with json respond
     *
     * You need the following rights to call this method: notes.
     * This method is available only to standalone-applications.
     */
    public String deleteComment(VKParameters params) {
        return execute("deleteComment", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.restoreComment">API newsfeed.restoreComment()</a>
     * @param params method parameters
     * @return String with json respond
     *
     * You need the following rights to call this method: notes.
     * This method is available only to standalone-applications.
     */
    public String restoreComment(VKParameters params) {
        return execute("restoreComment", params).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "notes";
    }
}
