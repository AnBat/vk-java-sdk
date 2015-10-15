package com.batiaev.vk.api.methods;

/**
 * Created by batiaev on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */

import com.batiaev.vk.api.VKParameters;

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
        return prepareRequest("createAlbum", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/photos.editAlbum">API photos.editAlbum()</a>
     *
     * You need the following rights to call this method: photos.
     * @param params method parameters
     * @return String with json respond
     */
    public String editAlbum(VKParameters params) {
        return prepareRequest("editAlbum", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.getAlbums">API photos.getAlbums()</a>
     *
     * This is an open method; it does not require an access_token.
     * @param params method parameters
     * @return String with json respond
     */
    public String getAlbums(VKParameters params) {
        return prepareRequest("getAlbums", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.get">API photos.get()</a>
     *
     * This is an open method; it does not require an access_token.
     * @param params method parameters
     * @return String with json respond
     */
    public String get(VKParameters params) {
        return prepareRequest("get", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.getAlbumsCount">API photos.getAlbumsCount()</a>
     *
     * This method doesn't require any specific rights.
     * @param params method parameters
     * @return String with json respond
     */
    public String getAlbumsCount(VKParameters params) {
        return prepareRequest("getAlbumsCount", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.getProfile">API photos.getProfile()</a>
     *
     * This method doesn't require any specific rights.
     * @param params method parameters
     * @return String with json respond
     */
    public String getProfile(VKParameters params) {
        return prepareRequest("getProfile", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.getById">API photos.getById()</a>
     *
     * This is an open method; it does not require an access_token.
     * @param params method parameters
     * @return String with json respond
     */
    public String getById(VKParameters params) {
        return prepareRequest("getById", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.getUploadServer">API photos.getUploadServer()</a>
     *
     * You need the following rights to call this method: photos.
     * @param params method parameters
     * @return String with json respond
     */
    public String getUploadServer(VKParameters params) {
        return prepareRequest("getUploadServer", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.getOwnerPhotoUploadServer">API photos.getOwnerPhotoUploadServer()</a>
     *
     * This method doesn't require any specific rights.
     * @param params method parameters
     * @return String with json respond
     */
    public String getOwnerPhotoUploadServer(VKParameters params) {
        return prepareRequest("getOwnerPhotoUploadServer", params).getRequest();
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
        return prepareRequest("getChatUploadServer", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.saveOwnerPhoto">API photos.saveOwnerPhoto()</a>
     *
     * This method doesn't require any specific rights.
     * @param params method parameters
     * @return String with json respond
     */
    public String saveOwnerPhoto(VKParameters params) {
        return prepareRequest("saveOwnerPhoto", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.saveWallPhoto">API photos.saveWallPhoto()</a>
     *
     * This method doesn't require any specific rights.
     * @param params method parameters
     * @return String with json respond
     */
    public String saveWallPhoto(VKParameters params) {
        return prepareRequest("saveWallPhoto", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.getWallUploadServer">API photos.getWallUploadServer()</a>
     *
     * You need the following rights to call this method: photos.
     * @param params method parameters
     * @return String with json respond
     */
    public String getWallUploadServer(VKParameters params) {
        return prepareRequest("getWallUploadServer", params).getRequest();
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
        return prepareRequest("getMessagesUploadServer", params).getRequest();
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
        return prepareRequest("saveMessagesPhoto", params).getRequest();
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
        return prepareRequest("report", params).getRequest();
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
        return prepareRequest("reportComment", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.search">API photos.search()</a>
     *
     * This is an open method; it does not require an access_token.
     * @param params method parameters
     * @return String with json respond
     */
    public String search(VKParameters params) {
        return prepareRequest("search", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/photos.save">API photos.save()</a>
     *
     * You need the following rights to call this method: photos.
     * @param params method parameters
     * @return String with json respond
     */
    public String save(VKParameters params) {
        return prepareRequest("save", params).getRequest();
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
        return prepareRequest("copy", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.edit">API photos.edit()</a>
     *
     * You need the following rights to call this method: photos.
     * @param params method parameters
     * @return String with json respond
     */
    public String edit(VKParameters params) {
        return prepareRequest("edit", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.move">API photos.move()</a>
     *
     * You need the following rights to call this method: photos.
     * @param params method parameters
     * @return String with json respond
     */
    public String move(VKParameters params) {
        return prepareRequest("move", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.makeCover">API photos.makeCover()</a>
     *
     * You need the following rights to call this method: photos.
     * @param params method parameters
     * @return String with json respond
     */
    public String makeCover(VKParameters params) {
        return prepareRequest("makeCover", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.reorderAlbums">API photos.reorderAlbums()</a>
     *
     * You need the following rights to call this method: photos.
     * @param params method parameters
     * @return String with json respond
     */
    public String reorderAlbums(VKParameters params) {
        return prepareRequest("reorderAlbums", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.reorderPhotos">API photos.reorderPhotos()</a>
     *
     * You need the following rights to call this method: photos.
     * @param params method parameters
     * @return String with json respond
     */
    public String reorderPhotos(VKParameters params) {
        return prepareRequest("reorderPhotos", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.getAll">API photos.getAll()</a>
     *
     * You need the following rights to call this method: photos.
     * @param params method parameters
     * @return String with json respond
     */
    public String getAll(VKParameters params) {
        return prepareRequest("getAll", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.getUserPhotos">API photos.getUserPhotos()</a>
     *
     * This method doesn't require any specific rights.
     * @param params method parameters
     * @return String with json respond
     */
    public String getUserPhotos(VKParameters params) {
        return prepareRequest("getUserPhotos", params).getRequest();
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
        return prepareRequest("deleteAlbum", params).getRequest();
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
        return prepareRequest("delete", params).getRequest();
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
        return prepareRequest("restore", params).getRequest();
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
        return prepareRequest("confirmTag", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.getComments">API photos.getComments()</a>
     *
     * You need the following rights to call this method: photos.
     * @param params method parameters
     * @return String with json respond
     */
    public String getComments(VKParameters params) {
        return prepareRequest("getComments", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/photos.getAllComments">API photos.getAllComments()</a>
     *
     * You need the following rights to call this method: photos.
     * @param params method parameters
     * @return String with json respond
     */
    public String getAllComments(VKParameters params) {
        return prepareRequest("getAllComments", params).getRequest();
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
        return prepareRequest("createComment", params).getRequest();
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
        return prepareRequest("deleteComment", params).getRequest();
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
        return prepareRequest("restoreComment", params).getRequest();
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
        return prepareRequest("editComment", params).getRequest();
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
        return prepareRequest("getTags", params).getRequest();
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
        return prepareRequest("putTag", params).getRequest();
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
        return prepareRequest("removeTag", params).getRequest();
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
        return prepareRequest("getNewTags", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "photos";
    }
}
