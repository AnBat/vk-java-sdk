package com.batiaev.vk.api;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.consts.VkApiMethods;

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
        return execute(getUrl(VkApiMethods.GET, params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/video.edit">API video.edit()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String edit(VKParameters params) {
        return execute(getUrl(VkApiMethods.EDIT, params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/video.add">API video.add()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String add(VKParameters params) {
        return execute(getUrl(VkApiMethods.ADD, params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/video.save">API video.save()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String save(VKParameters params) {
        return execute(getUrl(VkApiMethods.SAVE, params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/video.delete">API video.delete()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String delete(VKParameters params) {
        return execute(getUrl(VkApiMethods.DELETE, params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/video.restore">API video.restore()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String restore(VKParameters params) {
        return execute(getUrl("restore", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/video.search">API video.search()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String search(VKParameters params) {
        return execute(getUrl(VkApiMethods.SEARCH, params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/video.getUserVideos">API video.getUserVideos()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String getUserVideos(VKParameters params) {
        return execute(getUrl("getUserVideos", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/video.getAlbums">API video.getAlbums()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String getAlbums(VKParameters params) {
        return execute(getUrl("getAlbums", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/video.getAlbumById">API video.getAlbumById()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String getAlbumById(VKParameters params) {
        return execute(getUrl("getAlbumById", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/video.addAlbum">API video.addAlbum()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String addAlbum(VKParameters params) {
        return execute(getUrl("addAlbum", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/video.editAlbum">API video.editAlbum()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String editAlbum(VKParameters params) {
        return execute(getUrl("editAlbum", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/video.deleteAlbum">API video.deleteAlbum()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String deleteAlbum(VKParameters params) {
        return execute(getUrl("deleteAlbum", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/video.reorderAlbums">API video.reorderAlbums()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String reorderAlbums(VKParameters params) {
        return execute(getUrl("reorderAlbums", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/video.addToAlbum">API video.addToAlbum()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String addToAlbum(VKParameters params) {
        return execute(getUrl("addToAlbum", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/video.removeFromAlbum">API video.removeFromAlbum()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String removeFromAlbum(VKParameters params) {
        return execute(getUrl("removeFromAlbum", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/video.getAlbumsByVideo">API video.getAlbumsByVideo()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String getAlbumsByVideo(VKParameters params) {
        return execute(getUrl("getAlbumsByVideo", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/video.getComments">API video.getComments()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String getComments(VKParameters params) {
        return execute(getUrl("getComments", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/video.createComment">API video.createComment()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String createComment(VKParameters params) {
        return execute(getUrl("createComment", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/video.deleteComment">API video.deleteComment()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String deleteComment(VKParameters params) {
        return execute(getUrl("deleteComment", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/video.restoreComment">API video.restoreComment()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String restoreComment(VKParameters params) {
        return execute(getUrl("restoreComment", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/video.editComment">API video.editComment()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String editComment(VKParameters params) {
        return execute(getUrl("editComment", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/video.getTags">API video.getTags()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String getTags(VKParameters params) {
        return execute(getUrl("getTags", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/video.putTag">API video.putTag()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String putTag(VKParameters params) {
        return execute(getUrl("putTag", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/video.removeTag">API video.removeTag()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String removeTag(VKParameters params) {
        return execute(getUrl("removeTag", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/video.getNewTags">API video.getNewTags()</a>
     *
     * You need the following rights to call this method: video.
     * @param params method parameters
     * @return String with json respond
     */
    public String getNewTags(VKParameters params) {
        return execute(getUrl("getNewTags", params)).toString();
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
        return execute(getUrl("report", params)).toString();
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
        return execute(getUrl("reportComment", params)).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "video";
    }
}
