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
 * @see <a href="https://vk.com/dev/video">API video</a>
 */
public class VKApiVideo extends VKApiBase {

    /**
     * <a href="https://vk.com/dev/video.get">API video.get()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String get(VKParameters params) {
        return prepareRequest("get", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/video.edit">API video.edit()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String edit(VKParameters params) {
        return prepareRequest("edit", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/video.add">API video.add()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String add(VKParameters params) {
        return prepareRequest("add", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/video.save">API video.save()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String save(VKParameters params) {
        return prepareRequest("save", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/video.delete">API video.delete()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String delete(VKParameters params) {
        return prepareRequest("delete", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/video.restore">API video.restore()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String restore(VKParameters params) {
        return prepareRequest("restore", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/video.search">API video.search()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String search(VKParameters params) {
        return prepareRequest("search", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/video.getUserVideos">API video.getUserVideos()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String getUserVideos(VKParameters params) {
        return prepareRequest("getUserVideos", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/video.getAlbums">API video.getAlbums()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String getAlbums(VKParameters params) {
        return prepareRequest("getAlbums", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/video.getAlbumById">API video.getAlbumById()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String getAlbumById(VKParameters params) {
        return prepareRequest("getAlbumById", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/video.addAlbum">API video.addAlbum()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String addAlbum(VKParameters params) {
        return prepareRequest("addAlbum", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/video.editAlbum">API video.editAlbum()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String editAlbum(VKParameters params) {
        return prepareRequest("editAlbum", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/video.deleteAlbum">API video.deleteAlbum()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String deleteAlbum(VKParameters params) {
        return prepareRequest("deleteAlbum", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/video.reorderAlbums">API video.reorderAlbums()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String reorderAlbums(VKParameters params) {
        return prepareRequest("reorderAlbums", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/video.addToAlbum">API video.addToAlbum()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String addToAlbum(VKParameters params) {
        return prepareRequest("addToAlbum", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/video.removeFromAlbum">API video.removeFromAlbum()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String removeFromAlbum(VKParameters params) {
        return prepareRequest("removeFromAlbum", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/video.getAlbumsByVideo">API video.getAlbumsByVideo()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String getAlbumsByVideo(VKParameters params) {
        return prepareRequest("getAlbumsByVideo", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/video.getComments">API video.getComments()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String getComments(VKParameters params) {
        return prepareRequest("getComments", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/video.createComment">API video.createComment()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String createComment(VKParameters params) {
        return prepareRequest("createComment", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/video.deleteComment">API video.deleteComment()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String deleteComment(VKParameters params) {
        return prepareRequest("deleteComment", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/video.restoreComment">API video.restoreComment()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String restoreComment(VKParameters params) {
        return prepareRequest("restoreComment", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/video.editComment">API video.editComment()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String editComment(VKParameters params) {
        return prepareRequest("editComment", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/video.getTags">API video.getTags()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String getTags(VKParameters params) {
        return prepareRequest("getTags", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/video.putTag">API video.putTag()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String putTag(VKParameters params) {
        return prepareRequest("putTag", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/video.removeTag">API video.removeTag()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String removeTag(VKParameters params) {
        return prepareRequest("removeTag", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/video.getNewTags">API video.getNewTags()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String getNewTags(VKParameters params) {
        return prepareRequest("getNewTags", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/video.report">API video.report()</a>
     *
     * You need the following rights to call this method: video.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String report(VKParameters params) {
        return prepareRequest("report", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/video.reportComment">API video.reportComment()</a>
     *
     * You need the following rights to call this method: video.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String reportComment(VKParameters params) {
        return prepareRequest("reportComment", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "video";
    }
}
