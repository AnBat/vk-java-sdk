package com.batiaev.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKParameters;

/**
 * @author batiaev
 *
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
    public String get(VKParameters params) {
		return prepareRequest("get", params).getRequest();
    }

    /**
     * https://vk.com/dev/wall.search
     *
     * This is an open method; it does not require an access_token.
     */
    public String search(VKParameters params) {
		return prepareRequest("search", params).getRequest();
    }

    /**
     * https://vk.com/dev/wall.getById
     *
     * This is an open method; it does not require an access_token.
     */
    public String getById(VKParameters params) {
        return prepareRequest("getById", params).getRequest();
    }

    /**
     * https://vk.com/dev/wall.post
     *
     * You need the following rights to call this method: wall.
     * This method is only available to Standalone-apps and web clients using the confirmation window.
     */
    public String post(VKParameters parameters) {
        return prepareRequest("post", parameters).getRequest();
    }

    /**
     * https://vk.com/dev/wall.repost
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String repost(VKParameters params) {
        return prepareRequest("repost", params).getRequest();
    }

    /**
     * https://vk.com/dev/wall.getReposts
     *
     * This is an open method; it does not require an access_token.
     */
    public String getReposts(VKParameters params) {
        return prepareRequest("getReposts", params).getRequest();
    }

    /**
     * https://vk.com/dev/wall.edit
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String edit(VKParameters params) {
        return prepareRequest("edit", params).getRequest();
    }

    /**
     * https://vk.com/dev/wall.delete
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String delete(VKParameters params) {
        return prepareRequest("delete", params).getRequest();
    }

    /**
     * https://vk.com/dev/wall.restore
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String restore(VKParameters params) {
        return prepareRequest("restore", params).getRequest();
    }

    /**
     * https://vk.com/dev/wall.pin
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String pin(VKParameters params) {
        return prepareRequest("pin", params).getRequest();
    }

    /**
     * https://vk.com/dev/wall.unpin
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String unpin(VKParameters params) {
        return prepareRequest("unpin", params).getRequest();
    }


    /**
     * https://vk.com/dev/wall.getComments
     *
     * This is an open method; it does not require an access_token.
     * Your app needs the following rights to access data on a user's behalf: wall.
     */
    public String getComments(VKParameters params) {
        return prepareRequest("getComments", params).getRequest();
    }

    /**
     * https://vk.com/dev/wall.addComment
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String addComment(VKParameters params) {
        return prepareRequest("addComment", params).getRequest();
    }

    /**
     * https://vk.com/dev/wall.editComment
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String editComment(VKParameters params) {
        return prepareRequest("editComment", params).getRequest();
    }

    /**
     * https://vk.com/dev/wall.deleteComment
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String deleteComment(VKParameters params) {
        return prepareRequest("deleteComment", params).getRequest();
    }

    /**
     * https://vk.com/dev/wall.restoreComment
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String restoreComment(VKParameters params) {
        return prepareRequest("restoreComment", params).getRequest();
    }

    /**
     * https://vk.com/dev/wall.reportPost
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String reportPost(VKParameters params) {
        return prepareRequest("reportPost", params).getRequest();
    }

    /**
     * https://vk.com/dev/wall.reportComment
     *
     * This is an open method; it does not require an access_token.
     */
    public String reportComment(VKParameters params) {
        return prepareRequest("reportComment", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "wall";
    }
}
