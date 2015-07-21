package com.batiaev.vk.api.methods;

/**
 * @author batiaev
 * Created by batiaev on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */

import com.batiaev.vk.api.VKParameters;

/**
 * Builds requests for API.notes part
 *
 * @see <a href="https://vk.com/dev/notes">API notes()</a>
 */
public class VKApiNotes extends VKApiBase {
	
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/newsfeed.get">API newsfeed.get()</a>
     *
     * You need the following rights to call this method: notes.
     */
    public String get(VKParameters params) {
        return prepareRequest("get", params).getRequest();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/newsfeed.getById">API newsfeed.getById()</a>
     *
     * You need the following rights to call this method: notes.
     */
    public String getById(VKParameters params) {
        return prepareRequest("getById", params).getRequest();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/newsfeed.getFriendsNotes">API newsfeed.getFriendsNotes()</a>
     *
     * You need the following rights to call this method: notes.
     */
    public String getFriendsNotes(VKParameters params) {
        return prepareRequest("getFriendsNotes", params).getRequest();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/newsfeed.add">API newsfeed.add()</a>
     *
     * You need the following rights to call this method: notes.
     */
    public String add(VKParameters params) {
        return prepareRequest("add", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/newsfeed.edit">API newsfeed.edit()</a>
     *
     * You need the following rights to call this method: notes.
     */
    public String edit(VKParameters params) {
        return prepareRequest("edit", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/newsfeed.delete">API newsfeed.delete()</a>
     *
     * You need the following rights to call this method: notes.
     */
    public String delete(VKParameters params) {
        return prepareRequest("delete", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/newsfeed.getComments">API newsfeed.getComments()</a>
     *
     * You need the following rights to call this method: notes.
     */
    public String getComments(VKParameters params) {
        return prepareRequest("getComments", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/newsfeed.createComment">API newsfeed.createComment()</a>
     *
     * You need the following rights to call this method: notes.
     * This method is available only to standalone-applications.
     */
    public String createComment(VKParameters params) {
        return prepareRequest("createComment", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/newsfeed.editComment">API newsfeed.editComment()</a>
     *
     * You need the following rights to call this method: notes.
     * This method is available only to standalone-applications.
     */
    public String editComment(VKParameters params) {
        return prepareRequest("editComment", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/newsfeed.deleteComment">API newsfeed.deleteComment()</a>
     *
     * You need the following rights to call this method: notes.
     * This method is available only to standalone-applications.
     */
    public String deleteComment(VKParameters params) {
        return prepareRequest("deleteComment", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/newsfeed.restoreComment">API newsfeed.restoreComment()</a>
     *
     * You need the following rights to call this method: notes.
     * This method is available only to standalone-applications.
     */
    public String restoreComment(VKParameters params) {
        return prepareRequest("restoreComment", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "notes";
    }
}
