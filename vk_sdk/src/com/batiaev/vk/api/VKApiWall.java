package com.batiaev.vk.api;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.common.VKParameters;

/**
 * @author batiaev
 *
 * Builds requests for API.wall part
 * 
 * https://vk.com/dev/wall
 */
public class VKApiWall extends VKApiBase {

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.get
     *
     * This is an open method; it does not require an access_token.
     */
    public String get(VKParameters params) {
		return execute("get", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.search
     *
     * This is an open method; it does not require an access_token.
     */
    public String search(VKParameters params) {
		return execute("search", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.getById
     *
     * This is an open method; it does not require an access_token.
     */
    public String getById(VKParameters params) {
        return execute("getById", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.post
     *
     * You need the following rights to call this method: wall.
     * This method is only available to Standalone-apps and web clients using the confirmation window.
     */
    public String post(VKParameters params) {
        return execute("post", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.repost
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String repost(VKParameters params) {
        return execute("repost", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.getReposts
     *
     * This is an open method; it does not require an access_token.
     */
    public String getReposts(VKParameters params) {
        return execute("getReposts", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.edit
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String edit(VKParameters params) {
        return execute("edit", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.delete
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String delete(VKParameters params) {
        return execute("delete", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.restore
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String restore(VKParameters params) {
        return execute("restore", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.pin
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String pin(VKParameters params) {
        return execute("pin", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.unpin
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String unpin(VKParameters params) {
        return execute("unpin", params).toString();
    }


    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.getComments
     *
     * This is an open method; it does not require an access_token.
     * Your app needs the following rights to access data on a user's behalf: wall.
     */
    public String getComments(VKParameters params) {
        return execute("getComments", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.addComment
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String addComment(VKParameters params) {
        return execute("addComment", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.editComment
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String editComment(VKParameters params) {
        return execute("editComment", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.deleteComment
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String deleteComment(VKParameters params) {
        return execute("deleteComment", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.restoreComment
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String restoreComment(VKParameters params) {
        return execute("restoreComment", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.reportPost
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     */
    public String reportPost(VKParameters params) {
        return execute("reportPost", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/wall.reportComment
     *
     * This is an open method; it does not require an access_token.
     */
    public String reportComment(VKParameters params) {
        return execute("reportComment", params).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "wall";
    }
}
