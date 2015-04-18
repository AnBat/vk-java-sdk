package com.batyaev.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batyaev.vk.api.VKParameters;
import com.batyaev.vk.api.VKRequest;

/**
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
    public VKRequest get(VKParameters params) {
        return prepareRequest("get", params);
    }

    /**
     * https://vk.com/dev/video.edit
     *
     * You need the following rights to call this method: video.
     */
    public VKRequest edit(VKParameters params) {
        return prepareRequest("edit", params);
    }

    /**
     * https://vk.com/dev/video.add
     *
     * You need the following rights to call this method: video.
     */
    public VKRequest add(VKParameters params) {
        return prepareRequest("add", params);
    }

    /**
     * https://vk.com/dev/video.save
     *
     * You need the following rights to call this method: video.
     */
    public VKRequest save(VKParameters params) {
        return prepareRequest("save", params);
    }

    /**
     * https://vk.com/dev/video.delete
     *
     * You need the following rights to call this method: video.
     */
    public VKRequest delete(VKParameters params) {
        return prepareRequest("delete", params);
    }

    /**
     * https://vk.com/dev/video.restore
     *
     * You need the following rights to call this method: video.
     */
    public VKRequest restore(VKParameters params) {
        return prepareRequest("restore", params);
    }

    /**
     * https://vk.com/dev/video.search
     *
     * You need the following rights to call this method: video.
     */
    public VKRequest search(VKParameters params) {
        return prepareRequest("search", params);
    }

    /**
     * https://vk.com/dev/video.getUserVideos
     *
     * You need the following rights to call this method: video.
     */
    public VKRequest getUserVideos(VKParameters params) {
        return prepareRequest("getUserVideos", params);
    }

    /**
     * https://vk.com/dev/video.getAlbums
     *
     * You need the following rights to call this method: video.
     */
    public VKRequest getAlbums(VKParameters params) {
        return prepareRequest("getAlbums", params);
    }

    /**
     * https://vk.com/dev/video.getAlbumById
     *
     * You need the following rights to call this method: video.
     */
    public VKRequest getAlbumById(VKParameters params) {
        return prepareRequest("getAlbumById", params);
    }

    /**
     * https://vk.com/dev/video.addAlbum
     *
     * You need the following rights to call this method: video.
     */
    public VKRequest addAlbum(VKParameters params) {
        return prepareRequest("addAlbum", params);
    }

    /**
     * https://vk.com/dev/video.editAlbum
     *
     * You need the following rights to call this method: video.
     */
    public VKRequest editAlbum(VKParameters params) {
        return prepareRequest("editAlbum", params);
    }

    /**
     * https://vk.com/dev/video.deleteAlbum
     *
     * You need the following rights to call this method: video.
     */
    public VKRequest deleteAlbum(VKParameters params) {
        return prepareRequest("deleteAlbum", params);
    }

    /**
     * https://vk.com/dev/video.reorderAlbums
     *
     * You need the following rights to call this method: video.
     */
    public VKRequest reorderAlbums(VKParameters params) {
        return prepareRequest("reorderAlbums", params);
    }

    /**
     * https://vk.com/dev/video.addToAlbum
     *
     * You need the following rights to call this method: video.
     */
    public VKRequest addToAlbum(VKParameters params) {
        return prepareRequest("addToAlbum", params);
    }

    /**
     * https://vk.com/dev/video.removeFromAlbum
     *
     * You need the following rights to call this method: video.
     */
    public VKRequest removeFromAlbum(VKParameters params) {
        return prepareRequest("removeFromAlbum", params);
    }

    /**
     * https://vk.com/dev/video.getAlbumsByVideo
     *
     * You need the following rights to call this method: video.
     */
    public VKRequest getAlbumsByVideo(VKParameters params) {
        return prepareRequest("getAlbumsByVideo", params);
    }

    /**
     * https://vk.com/dev/video.getComments
     *
     * You need the following rights to call this method: video.
     */
    public VKRequest getComments(VKParameters params) {
        return prepareRequest("getComments", params);
    }

    /**
     * https://vk.com/dev/video.createComment
     *
     * You need the following rights to call this method: video.
     */
    public VKRequest createComment(VKParameters params) {
        return prepareRequest("createComment", params);
    }

    /**
     * https://vk.com/dev/video.deleteComment
     *
     * You need the following rights to call this method: video.
     */
    public VKRequest deleteComment(VKParameters params) {
        return prepareRequest("deleteComment", params);
    }

    /**
     * https://vk.com/dev/video.restoreComment
     *
     * You need the following rights to call this method: video.
     */
    public VKRequest restoreComment(VKParameters params) {
        return prepareRequest("restoreComment", params);
    }

    /**
     * https://vk.com/dev/video.editComment
     *
     * You need the following rights to call this method: video.
     */
    public VKRequest editComment(VKParameters params) {
        return prepareRequest("editComment", params);
    }

    /**
     * https://vk.com/dev/video.getTags
     *
     * You need the following rights to call this method: video.
     */
    public VKRequest getTags(VKParameters params) {
        return prepareRequest("getTags", params);
    }

    /**
     * https://vk.com/dev/video.putTag
     *
     * You need the following rights to call this method: video.
     */
    public VKRequest putTag(VKParameters params) {
        return prepareRequest("putTag", params);
    }

    /**
     * https://vk.com/dev/video.removeTag
     *
     * You need the following rights to call this method: video.
     */
    public VKRequest removeTag(VKParameters params) {
        return prepareRequest("removeTag", params);
    }

    /**
     * https://vk.com/dev/video.getNewTags
     *
     * You need the following rights to call this method: video.
     */
    public VKRequest getNewTags(VKParameters params) {
        return prepareRequest("getNewTags", params);
    }

    /**
     * https://vk.com/dev/video.report
     *
     * You need the following rights to call this method: video.
     * This method is available only to standalone-applications.
     */
    public VKRequest report(VKParameters params) {
        return prepareRequest("report", params);
    }

    /**
     * https://vk.com/dev/video.reportComment
     *
     * You need the following rights to call this method: video.
     * This method is available only to standalone-applications.
     */
    public VKRequest reportComment(VKParameters params) {
        return prepareRequest("reportComment", params);
    }

    @Override
    protected String getMethodsGroup() {
        return "video";
    }
}
