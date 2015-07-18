package com.batiaev.vk.api.methods;

/**
 * @author batiaev
 * Created by batiaev on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKParameters;

/**
 * Builds requests for API.notes part
 * 
 * https://vk.com/dev/notes
 */
public class VKApiNotes extends VKApiBase {
	
    /**
	 * https://vk.com/dev/notes.get
     *
     * You need the following rights to call this method: notes.
     */
    public String get(VKParameters params) {
        return prepareRequest("get", params).getRequest();
    }
    
    /**
	 * https://vk.com/dev/notes.getById
     *
     * You need the following rights to call this method: notes.
     */
    public String getById(VKParameters params) {
        return prepareRequest("getById", params).getRequest();
    }
    
    /**
	 * https://vk.com/dev/notes.getFriendsNotes
     *
     * You need the following rights to call this method: notes.
     */
    public String getFriendsNotes(VKParameters params) {
        return prepareRequest("getFriendsNotes", params).getRequest();
    }
    
    /**
	 * https://vk.com/dev/notes.add
     *
     * You need the following rights to call this method: notes.
     */
    public String add(VKParameters params) {
        return prepareRequest("add", params).getRequest();
    }

    /**
     * https://vk.com/dev/notes.edit
     *
     * You need the following rights to call this method: notes.
     */
    public String edit(VKParameters params) {
        return prepareRequest("edit", params).getRequest();
    }

    /**
     * https://vk.com/dev/notes.delete
     *
     * You need the following rights to call this method: notes.
     */
    public String delete(VKParameters params) {
        return prepareRequest("delete", params).getRequest();
    }

    /**
     * https://vk.com/dev/notes.getComments
     *
     * You need the following rights to call this method: notes.
     */
    public String getComments(VKParameters params) {
        return prepareRequest("getComments", params).getRequest();
    }

    /**
     * https://vk.com/dev/notes.createComment
     *
     * You need the following rights to call this method: notes.
     * This method is available only to standalone-applications.
     */
    public String createComment(VKParameters params) {
        return prepareRequest("createComment", params).getRequest();
    }

    /**
     * https://vk.com/dev/notes.editComment
     *
     * You need the following rights to call this method: notes.
     * This method is available only to standalone-applications.
     */
    public String editComment(VKParameters params) {
        return prepareRequest("editComment", params).getRequest();
    }

    /**
     * https://vk.com/dev/notes.deleteComment
     *
     * You need the following rights to call this method: notes.
     * This method is available only to standalone-applications.
     */
    public String deleteComment(VKParameters params) {
        return prepareRequest("deleteComment", params).getRequest();
    }

    /**
     * https://vk.com/dev/notes.restoreComment
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
