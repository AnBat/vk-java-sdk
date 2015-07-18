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
 * Builds requests for API.video part
 * 
 * https://vk.com/dev/video
 */
public class VKApiVideo extends VKApiBase {

    /**
     * https://vk.com/dev/video.get
     *
     * You need the following rights to call this method: video.
     */
    public String get(VKParameters params) {
        return prepareRequest("get", params).getRequest();
    }

    /**
     * https://vk.com/dev/video.edit
     *
     * You need the following rights to call this method: video.
     */
    public String edit(VKParameters params) {
        return prepareRequest("edit", params).getRequest();
    }

    /**
     * https://vk.com/dev/video.add
     *
     * You need the following rights to call this method: video.
     */
    public String add(VKParameters params) {
        return prepareRequest("add", params).getRequest();
    }

    /**
     * https://vk.com/dev/video.save
     *
     * You need the following rights to call this method: video.
     */
    public String save(VKParameters params) {
        return prepareRequest("save", params).getRequest();
    }

    /**
     * https://vk.com/dev/video.delete
     *
     * You need the following rights to call this method: video.
     */
    public String delete(VKParameters params) {
        return prepareRequest("delete", params).getRequest();
    }

    /**
     * https://vk.com/dev/video.restore
     *
     * You need the following rights to call this method: video.
     */
    public String restore(VKParameters params) {
        return prepareRequest("restore", params).getRequest();
    }

    /**
     * https://vk.com/dev/video.search
     *
     * You need the following rights to call this method: video.
     */
    public String search(VKParameters params) {
        return prepareRequest("search", params).getRequest();
    }

    /**
     * https://vk.com/dev/video.getUserVideos
     *
     * You need the following rights to call this method: video.
     */
    public String getUserVideos(VKParameters params) {
        return prepareRequest("getUserVideos", params).getRequest();
    }

    /**
     * https://vk.com/dev/video.getAlbums
     *
     * You need the following rights to call this method: video.
     */
    public String getAlbums(VKParameters params) {
        return prepareRequest("getAlbums", params).getRequest();
    }

    /**
     * https://vk.com/dev/video.getAlbumById
     *
     * You need the following rights to call this method: video.
     */
    public String getAlbumById(VKParameters params) {
        return prepareRequest("getAlbumById", params).getRequest();
    }

    /**
     * https://vk.com/dev/video.addAlbum
     *
     * You need the following rights to call this method: video.
     */
    public String addAlbum(VKParameters params) {
        return prepareRequest("addAlbum", params).getRequest();
    }

    /**
     * https://vk.com/dev/video.editAlbum
     *
     * You need the following rights to call this method: video.
     */
    public String editAlbum(VKParameters params) {
        return prepareRequest("editAlbum", params).getRequest();
    }

    /**
     * https://vk.com/dev/video.deleteAlbum
     *
     * You need the following rights to call this method: video.
     */
    public String deleteAlbum(VKParameters params) {
        return prepareRequest("deleteAlbum", params).getRequest();
    }

    /**
     * https://vk.com/dev/video.reorderAlbums
     *
     * You need the following rights to call this method: video.
     */
    public String reorderAlbums(VKParameters params) {
        return prepareRequest("reorderAlbums", params).getRequest();
    }

    /**
     * https://vk.com/dev/video.addToAlbum
     *
     * You need the following rights to call this method: video.
     */
    public String addToAlbum(VKParameters params) {
        return prepareRequest("addToAlbum", params).getRequest();
    }

    /**
     * https://vk.com/dev/video.removeFromAlbum
     *
     * You need the following rights to call this method: video.
     */
    public String removeFromAlbum(VKParameters params) {
        return prepareRequest("removeFromAlbum", params).getRequest();
    }

    /**
     * https://vk.com/dev/video.getAlbumsByVideo
     *
     * You need the following rights to call this method: video.
     */
    public String getAlbumsByVideo(VKParameters params) {
        return prepareRequest("getAlbumsByVideo", params).getRequest();
    }

    /**
     * https://vk.com/dev/video.getComments
     *
     * You need the following rights to call this method: video.
     */
    public String getComments(VKParameters params) {
        return prepareRequest("getComments", params).getRequest();
    }

    /**
     * https://vk.com/dev/video.createComment
     *
     * You need the following rights to call this method: video.
     */
    public String createComment(VKParameters params) {
        return prepareRequest("createComment", params).getRequest();
    }

    /**
     * https://vk.com/dev/video.deleteComment
     *
     * You need the following rights to call this method: video.
     */
    public String deleteComment(VKParameters params) {
        return prepareRequest("deleteComment", params).getRequest();
    }

    /**
     * https://vk.com/dev/video.restoreComment
     *
     * You need the following rights to call this method: video.
     */
    public String restoreComment(VKParameters params) {
        return prepareRequest("restoreComment", params).getRequest();
    }

    /**
     * https://vk.com/dev/video.editComment
     *
     * You need the following rights to call this method: video.
     */
    public String editComment(VKParameters params) {
        return prepareRequest("editComment", params).getRequest();
    }

    /**
     * https://vk.com/dev/video.getTags
     *
     * You need the following rights to call this method: video.
     */
    public String getTags(VKParameters params) {
        return prepareRequest("getTags", params).getRequest();
    }

    /**
     * https://vk.com/dev/video.putTag
     *
     * You need the following rights to call this method: video.
     */
    public String putTag(VKParameters params) {
        return prepareRequest("putTag", params).getRequest();
    }

    /**
     * https://vk.com/dev/video.removeTag
     *
     * You need the following rights to call this method: video.
     */
    public String removeTag(VKParameters params) {
        return prepareRequest("removeTag", params).getRequest();
    }

    /**
     * https://vk.com/dev/video.getNewTags
     *
     * You need the following rights to call this method: video.
     */
    public String getNewTags(VKParameters params) {
        return prepareRequest("getNewTags", params).getRequest();
    }

    /**
     * https://vk.com/dev/video.report
     *
     * You need the following rights to call this method: video.
     * This method is available only to standalone-applications.
     */
    public String report(VKParameters params) {
        return prepareRequest("report", params).getRequest();
    }

    /**
     * https://vk.com/dev/video.reportComment
     *
     * You need the following rights to call this method: video.
     * This method is available only to standalone-applications.
     */
    public String reportComment(VKParameters params) {
        return prepareRequest("reportComment", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "video";
    }
}
