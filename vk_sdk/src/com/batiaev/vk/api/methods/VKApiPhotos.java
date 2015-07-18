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
 * Builds requests for API.photos part
 * 
 * https://vk.com/dev/photos
 */
public class VKApiPhotos extends VKApiBase {

    /**
     * https://vk.com/dev/photos.createAlbum
     *
     * You need the following rights to call this method: photos.
     */
    public String createAlbum(VKParameters params) {
        return prepareRequest("createAlbum", params).getRequest();
    }

    /**
     * https://vk.com/dev/photos.editAlbum
     *
     * You need the following rights to call this method: photos.
     */
    public String editAlbum(VKParameters params) {
        return prepareRequest("editAlbum", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.getAlbums
     *
     * This is an open method; it does not require an access_token. 
     */
    public String getAlbums(VKParameters params) {
        return prepareRequest("getAlbums", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.get
     *
     * This is an open method; it does not require an access_token. 
     */
    public String get(VKParameters params) {
        return prepareRequest("get", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.getAlbumsCount
     *
     * This method doesn't require any specific rights. 
     */
    public String getAlbumsCount(VKParameters params) {
        return prepareRequest("getAlbumsCount", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.getProfile
     *
     * This method doesn't require any specific rights. 
     */
    public String getProfile(VKParameters params) {
        return prepareRequest("getProfile", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.getById
     *
     * This is an open method; it does not require an access_token. 
     */
    public String getById(VKParameters params) {
        return prepareRequest("getById", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.getUploadServer
     *
     * You need the following rights to call this method: photos.
     */
    public String getUploadServer(VKParameters params) {
        return prepareRequest("getUploadServer", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.getOwnerPhotoUploadServer
     *
     * This method doesn't require any specific rights. 
     */
    public String getOwnerPhotoUploadServer(VKParameters params) {
        return prepareRequest("getOwnerPhotoUploadServer", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.getChatUploadServer
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public String getChatUploadServer(VKParameters params) {
        return prepareRequest("getChatUploadServer", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.saveOwnerPhoto
     *
     * This method doesn't require any specific rights. 
     */
    public String saveOwnerPhoto(VKParameters params) {
        return prepareRequest("saveOwnerPhoto", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.saveWallPhoto
     *
     * This method doesn't require any specific rights. 
     */
    public String saveWallPhoto(VKParameters params) {
        return prepareRequest("saveWallPhoto", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.getWallUploadServer
     *
     * You need the following rights to call this method: photos.
     */
    public String getWallUploadServer(VKParameters params) {
        return prepareRequest("getWallUploadServer", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.getMessagesUploadServer
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public String getMessagesUploadServer(VKParameters params) {
        return prepareRequest("getMessagesUploadServer", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.saveMessagesPhoto
     * 
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public String saveMessagesPhoto(VKParameters params) {
        return prepareRequest("saveMessagesPhoto", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.report
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public String report(VKParameters params) {
        return prepareRequest("report", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.reportComment
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public String reportComment(VKParameters params) {
        return prepareRequest("reportComment", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.search
     *
     * This is an open method; it does not require an access_token. 
     */
    public String search(VKParameters params) {
        return prepareRequest("search", params).getRequest();
    }

    /**
     * https://vk.com/dev/photos.save
     *
     * You need the following rights to call this method: photos.
     */
    public String save(VKParameters params) {
        return prepareRequest("save", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.copy
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public String copy(VKParameters params) {
        return prepareRequest("copy", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.edit
     *
     * You need the following rights to call this method: photos. 
     */
    public String edit(VKParameters params) {
        return prepareRequest("edit", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.move
     *
     * You need the following rights to call this method: photos. 
     */
    public String move(VKParameters params) {
        return prepareRequest("move", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.makeCover
     *
     * You need the following rights to call this method: photos.
     */
    public String makeCover(VKParameters params) {
        return prepareRequest("makeCover", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.reorderAlbums
     *
     * You need the following rights to call this method: photos.
     */
    public String reorderAlbums(VKParameters params) {
        return prepareRequest("reorderAlbums", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.reorderPhotos
     *
     * You need the following rights to call this method: photos.
     */
    public String reorderPhotos(VKParameters params) {
        return prepareRequest("reorderPhotos", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.getAll
     *
     * You need the following rights to call this method: photos.
     */
    public String getAll(VKParameters params) {
        return prepareRequest("getAll", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.getUserPhotos
     *
     * This method doesn't require any specific rights. 
     */
    public String getUserPhotos(VKParameters params) {
        return prepareRequest("getUserPhotos", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.deleteAlbum
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public String deleteAlbum(VKParameters params) {
        return prepareRequest("deleteAlbum", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.delete
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public String delete(VKParameters params) {
        return prepareRequest("delete", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.restore
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public String restore(VKParameters params) {
        return prepareRequest("restore", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.confirmTag
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public String confirmTag(VKParameters params) {
        return prepareRequest("confirmTag", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.getComments
     *
     * You need the following rights to call this method: photos.
     */
    public String getComments(VKParameters params) {
        return prepareRequest("getComments", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.getAllComments
     *
     * You need the following rights to call this method: photos.
     */
    public String getAllComments(VKParameters params) {
        return prepareRequest("getAllComments", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.createComment
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public String createComment(VKParameters params) {
        return prepareRequest("createComment", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.deleteComment
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public String deleteComment(VKParameters params) {
        return prepareRequest("deleteComment", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.restoreComment
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public String restoreComment(VKParameters params) {
        return prepareRequest("restoreComment", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.editComment
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public String editComment(VKParameters params) {
        return prepareRequest("editComment", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.getTags
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public String getTags(VKParameters params) {
        return prepareRequest("getTags", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.putTag
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public String putTag(VKParameters params) {
        return prepareRequest("putTag", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.removeTag
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public String removeTag(VKParameters params) {
        return prepareRequest("removeTag", params).getRequest();
    }
    
    /**
     * https://vk.com/dev/photos.getNewTags
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public String getNewTags(VKParameters params) {
        return prepareRequest("getNewTags", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "photos";
    }
}
