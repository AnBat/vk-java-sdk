package com.batiaev.vk.api.methods;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.VKRequest;

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
    public VKRequest get(VKParameters params) {
        return prepareRequest("get", params);
    }
    
    /**
	 * https://vk.com/dev/notes.getById
     *
     * You need the following rights to call this method: notes.
     */
    public VKRequest getById(VKParameters params) {
        return prepareRequest("getById", params);
    }
    
    /**
	 * https://vk.com/dev/notes.getFriendsNotes
     *
     * You need the following rights to call this method: notes.
     */
    public VKRequest getFriendsNotes(VKParameters params) {
        return prepareRequest("getFriendsNotes", params);
    }
    
    /**
	 * https://vk.com/dev/notes.add
     *
     * You need the following rights to call this method: notes.
     */
    public VKRequest add(VKParameters params) {
        return prepareRequest("add", params);
    }

    /**
     * https://vk.com/dev/notes.edit
     *
     * You need the following rights to call this method: notes.
     */
    public VKRequest edit(VKParameters params) {
        return prepareRequest("edit", params);
    }

    /**
     * https://vk.com/dev/notes.delete
     *
     * You need the following rights to call this method: notes.
     */
    public VKRequest delete(VKParameters params) {
        return prepareRequest("delete", params);
    }

    /**
     * https://vk.com/dev/notes.getComments
     *
     * You need the following rights to call this method: notes.
     */
    public VKRequest getComments(VKParameters params) {
        return prepareRequest("getComments", params);
    }

    /**
     * https://vk.com/dev/notes.createComment
     *
     * You need the following rights to call this method: notes.
     * This method is available only to standalone-applications.
     */
    public VKRequest createComment(VKParameters params) {
        return prepareRequest("createComment", params);
    }

    /**
     * https://vk.com/dev/notes.editComment
     *
     * You need the following rights to call this method: notes.
     * This method is available only to standalone-applications.
     */
    public VKRequest editComment(VKParameters params) {
        return prepareRequest("editComment", params);
    }

    /**
     * https://vk.com/dev/notes.deleteComment
     *
     * You need the following rights to call this method: notes.
     * This method is available only to standalone-applications.
     */
    public VKRequest deleteComment(VKParameters params) {
        return prepareRequest("deleteComment", params);
    }

    /**
     * https://vk.com/dev/notes.restoreComment
     *
     * You need the following rights to call this method: notes.
     * This method is available only to standalone-applications.
     */
    public VKRequest restoreComment(VKParameters params) {
        return prepareRequest("restoreComment", params);
    }

    @Override
    protected String getMethodsGroup() {
        return "notes";
    }
}
