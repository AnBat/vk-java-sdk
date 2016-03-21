package com.batiaev.vk.api;

/**
 * Created by batiaev on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.consts.VkApiMethods;

/**
 * @author batiaev
 *
 * Builds requests for API.photos part
 *
 * @see <a href="https://vk.com/dev/photos">API photos</a>
 */
public class VKApiPhotos extends VKApiBase {

    /**
     * <a href="https://vk.com/dev/photos.createAlbum">API photos.createAlbum()</a>
     *
     * You need the following rights to call this method: photos.
     * @param params method parameters
     * @return String with json respond
     */
    public String createAlbum(VKParameters params) {
        return execute(getUrl("createAlbum", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/photos.editAlbum">API photos.editAlbum()</a>
     *
     * You need the following rights to call this method: photos.
     * @param params method parameters
     * @return String with json respond
     */
    public String editAlbum(VKParameters params) {
        return execute(getUrl("editAlbum", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.getAlbums">API photos.getAlbums()</a>
     *
     * This is an open method; it does not require an access_token.
     * @param params method parameters
     * @return String with json respond
     */
    public String getAlbums(VKParameters params) {
        return execute(getUrl("getAlbums", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.get">API photos.get()</a>
     *
     * This is an open method; it does not require an access_token.
     * @param params method parameters
     * @return String with json respond
     */
    public String get(VKParameters params) {
        return execute(getUrl(VkApiMethods.GET, params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.getAlbumsCount">API photos.getAlbumsCount()</a>
     *
     * This method doesn't require any specific rights.
     * @param params method parameters
     * @return String with json respond
     */
    public String getAlbumsCount(VKParameters params) {
        return execute(getUrl("getAlbumsCount", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.getProfile">API photos.getProfile()</a>
     *
     * This method doesn't require any specific rights.
     * @param params method parameters
     * @return String with json respond
     */
    public String getProfile(VKParameters params) {
        return execute(getUrl("getProfile", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.getById">API photos.getById()</a>
     *
     * This is an open method; it does not require an access_token.
     * @param params method parameters
     * @return String with json respond
     */
    public String getById(VKParameters params) {
        return execute(getUrl(VkApiMethods.GET_BY_ID, params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.getUploadServer">API photos.getUploadServer()</a>
     *
     * You need the following rights to call this method: photos.
     * @param params method parameters
     * @return String with json respond
     */
    public String getUploadServer(VKParameters params) {
        return execute(getUrl("getUploadServer", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.getOwnerPhotoUploadServer">API photos.getOwnerPhotoUploadServer()</a>
     *
     * This method doesn't require any specific rights.
     * @param params method parameters
     * @return String with json respond
     */
    public String getOwnerPhotoUploadServer(VKParameters params) {
        return execute(getUrl("getOwnerPhotoUploadServer", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.getChatUploadServer">API photos.getChatUploadServer()</a>
     *
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String getChatUploadServer(VKParameters params) {
        return execute(getUrl("getChatUploadServer", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.saveOwnerPhoto">API photos.saveOwnerPhoto()</a>
     *
     * This method doesn't require any specific rights.
     * @param params method parameters
     * @return String with json respond
     */
    public String saveOwnerPhoto(VKParameters params) {
        return execute(getUrl("saveOwnerPhoto", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.saveWallPhoto">API photos.saveWallPhoto()</a>
     *
     * This method doesn't require any specific rights.
     * @param params method parameters
     * @return String with json respond
     */
    public String saveWallPhoto(VKParameters params) {
        return execute(getUrl("saveWallPhoto", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.getWallUploadServer">API photos.getWallUploadServer()</a>
     *
     * You need the following rights to call this method: photos.
     * @param params method parameters
     * @return String with json respond
     */
    public String getWallUploadServer(VKParameters params) {
        return execute(getUrl("getWallUploadServer", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.getMessagesUploadServer">API photos.getMessagesUploadServer()</a>
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String getMessagesUploadServer(VKParameters params) {
        return execute(getUrl("getMessagesUploadServer", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.saveMessagesPhoto">API photos.saveMessagesPhoto()</a>
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String saveMessagesPhoto(VKParameters params) {
        return execute(getUrl("saveMessagesPhoto", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.report">API photos.report()</a>
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String report(VKParameters params) {
        return execute(getUrl("report", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.reportComment">API photos.reportComment()</a>
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String reportComment(VKParameters params) {
        return execute(getUrl("reportComment", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.search">API photos.search()</a>
     *
     * This is an open method; it does not require an access_token.
     * @param params method parameters
     * @return String with json respond
     */
    public String search(VKParameters params) {
        return execute(getUrl(VkApiMethods.SEARCH, params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/photos.save">API photos.save()</a>
     *
     * You need the following rights to call this method: photos.
     * @param params method parameters
     * @return String with json respond
     */
    public String save(VKParameters params) {
        return execute(getUrl(VkApiMethods.SAVE, params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.copy">API photos.copy()</a>
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String copy(VKParameters params) {
        return execute(getUrl("copy", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.edit">API photos.edit()</a>
     *
     * You need the following rights to call this method: photos.
     * @param params method parameters
     * @return String with json respond
     */
    public String edit(VKParameters params) {
        return execute(getUrl(VkApiMethods.EDIT, params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.move">API photos.move()</a>
     *
     * You need the following rights to call this method: photos.
     * @param params method parameters
     * @return String with json respond
     */
    public String move(VKParameters params) {
        return execute(getUrl("move", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.makeCover">API photos.makeCover()</a>
     *
     * You need the following rights to call this method: photos.
     * @param params method parameters
     * @return String with json respond
     */
    public String makeCover(VKParameters params) {
        return execute(getUrl("makeCover", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.reorderAlbums">API photos.reorderAlbums()</a>
     *
     * You need the following rights to call this method: photos.
     * @param params method parameters
     * @return String with json respond
     */
    public String reorderAlbums(VKParameters params) {
        return execute(getUrl("reorderAlbums", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.reorderPhotos">API photos.reorderPhotos()</a>
     *
     * You need the following rights to call this method: photos.
     * @param params method parameters
     * @return String with json respond
     */
    public String reorderPhotos(VKParameters params) {
        return execute(getUrl("reorderPhotos", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.getAll">API photos.getAll()</a>
     *
     * You need the following rights to call this method: photos.
     * @param params method parameters
     * @return String with json respond
     */
    public String getAll(VKParameters params) {
        return execute(getUrl("getAll", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.getUserPhotos">API photos.getUserPhotos()</a>
     *
     * This method doesn't require any specific rights.
     * @param params method parameters
     * @return String with json respond
     */
    public String getUserPhotos(VKParameters params) {
        return execute(getUrl("getUserPhotos", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.deleteAlbum">API photos.deleteAlbum()</a>
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String deleteAlbum(VKParameters params) {
        return execute(getUrl("deleteAlbum", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.delete">API photos.delete()</a>
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String delete(VKParameters params) {
        return execute(getUrl(VkApiMethods.DELETE, params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.restore">API photos.restore()</a>
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String restore(VKParameters params) {
        return execute(getUrl("restore", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.confirmTag">API photos.confirmTag()</a>
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String confirmTag(VKParameters params) {
        return execute(getUrl("confirmTag", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.getComments">API photos.getComments()</a>
     *
     * You need the following rights to call this method: photos.
     * @param params method parameters
     * @return String with json respond
     */
    public String getComments(VKParameters params) {
        return execute(getUrl("getComments", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.getAllComments">API photos.getAllComments()</a>
     *
     * You need the following rights to call this method: photos.
     * @param params method parameters
     * @return String with json respond
     */
    public String getAllComments(VKParameters params) {
        return execute(getUrl("getAllComments", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.createComment">API photos.createComment()</a>
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String createComment(VKParameters params) {
        return execute(getUrl("createComment", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.deleteComment">API photos.deleteComment()</a>
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String deleteComment(VKParameters params) {
        return execute(getUrl("deleteComment", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.restoreComment">API photos.restoreComment()</a>
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String restoreComment(VKParameters params) {
        return execute(getUrl("restoreComment", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.editComment">API photos.editComment()</a>
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String editComment(VKParameters params) {
        return execute(getUrl("editComment", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.getTags">API photos.getTags()</a>
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String getTags(VKParameters params) {
        return execute(getUrl("getTags", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.putTag">API photos.putTag()</a>
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String putTag(VKParameters params) {
        return execute(getUrl("putTag", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.removeTag">API photos.removeTag()</a>
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String removeTag(VKParameters params) {
        return execute(getUrl("removeTag", params)).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.getNewTags">API photos.getNewTags()</a>
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String getNewTags(VKParameters params) {
        return execute(getUrl("getNewTags", params)).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "photos";
    }
}
