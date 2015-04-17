package com.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.vk.api.VKParameters;
import com.vk.api.VKRequest;

/**
 * Builds requests for API.wall part
 * 
 * https://vk.com/dev/wall
 */
public class VKApiWall extends VKApiBase {

    /**
     * https://vk.com/dev/wall.get
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest get(VKParameters params) {
		return prepareRequest("get", params);
    }

    /**
     * https://vk.com/dev/wall.search
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest search(VKParameters params) {
		return prepareRequest("search", params);
    }

    /**
     * https://vk.com/dev/wall.getById
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest getById(VKParameters params) {
        return prepareRequest("getById", params);
    }

    /**
     * https://vk.com/dev/wall.post
     *
     * You need the following rights to call this method: wall.
     * This method is only available to Standalone-apps and web clients using the confirmation window.
     */
    public VKRequest post(VKParameters parameters) {
        return prepareRequest("post", parameters);
    }

    /**
     * https://vk.com/dev/wall.repost
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public VKRequest repost(VKParameters params) {
        return prepareRequest("repost", params);
    }

    /**
     * https://vk.com/dev/wall.getReposts
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest getReposts(VKParameters params) {
        return prepareRequest("getReposts", params);
    }

    /**
     * https://vk.com/dev/wall.edit
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public VKRequest edit(VKParameters params) {
        return prepareRequest("edit", params);
    }

    /**
     * https://vk.com/dev/wall.delete
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public VKRequest delete(VKParameters params) {
        return prepareRequest("delete", params);
    }

    /**
     * https://vk.com/dev/wall.restore
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public VKRequest restore(VKParameters params) {
        return prepareRequest("restore", params);
    }

    /**
     * https://vk.com/dev/wall.pin
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public VKRequest pin(VKParameters params) {
        return prepareRequest("pin", params);
    }

    /**
     * https://vk.com/dev/wall.unpin
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public VKRequest unpin(VKParameters params) {
        return prepareRequest("unpin", params);


    /**
     * https://vk.com/dev/wall.getComments
     *
     * This is an open method; it does not require an access_token.
     * Your app needs the following rights to access data on a user's behalf: wall.
     */
    public VKRequest getComments(VKParameters params) {
        return prepareRequest("getComments", params);
    }

    /**
     * https://vk.com/dev/wall.addComment
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public VKRequest addComment(VKParameters params) {
        return prepareRequest("addComment", params);
    }

    /**
     * https://vk.com/dev/wall.editComment
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public VKRequest editComment(VKParameters params) {
        return prepareRequest("editComment", params);
    }

    /**
     * https://vk.com/dev/wall.deleteComment
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public VKRequest deleteComment(VKParameters params) {
        return prepareRequest("deleteComment", params);
    }

    /**
     * https://vk.com/dev/wall.restoreComment
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public VKRequest restoreComment(VKParameters params) {
        return prepareRequest("restoreComment", params);
    }

    /**
     * https://vk.com/dev/wall.reportPost
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public VKRequest reportPost(VKParameters params) {
        return prepareRequest("reportPost", params);
    }

    /**
     * https://vk.com/dev/wall.reportComment
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest reportComment(VKParameters params) {
        return prepareRequest("reportComment", params);
    }
}
