package com.batiaev.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.VKRequest;

/**
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
    public VKRequest createAlbum(VKParameters params) {
        return prepareRequest("createAlbum", params);
    }

    /**
     * https://vk.com/dev/photos.editAlbum
     *
     * You need the following rights to call this method: photos.
     */
    public VKRequest editAlbum(VKParameters params) {
        return prepareRequest("editAlbum", params);
    }
    
    /**
     * https://vk.com/dev/photos.getAlbums
     *
     * This is an open method; it does not require an access_token. 
     */
    public VKRequest getAlbums(VKParameters params) {
        return prepareRequest("getAlbums", params);
    }
    
    /**
     * https://vk.com/dev/photos.get
     *
     * This is an open method; it does not require an access_token. 
     */
    public VKRequest get(VKParameters params) {
        return prepareRequest("get", params);
    }
    
    /**
     * https://vk.com/dev/photos.getAlbumsCount
     *
     * This method doesn't require any specific rights. 
     */
    public VKRequest getAlbumsCount(VKParameters params) {
        return prepareRequest("getAlbumsCount", params);
    }
    
    /**
     * https://vk.com/dev/photos.getProfile
     *
     * This method doesn't require any specific rights. 
     */
    public VKRequest getProfile(VKParameters params) {
        return prepareRequest("getProfile", params);
    }
    
    /**
     * https://vk.com/dev/photos.getById
     *
     * This is an open method; it does not require an access_token. 
     */
    public VKRequest getById(VKParameters params) {
        return prepareRequest("getById", params);
    }
    
    /**
     * https://vk.com/dev/photos.getUploadServer
     *
     * You need the following rights to call this method: photos.
     */
    public VKRequest getUploadServer(VKParameters params) {
        return prepareRequest("getUploadServer", params);
    }
    
    /**
     * https://vk.com/dev/photos.getOwnerPhotoUploadServer
     *
     * This method doesn't require any specific rights. 
     */
    public VKRequest getOwnerPhotoUploadServer(VKParameters params) {
        return prepareRequest("getOwnerPhotoUploadServer", params);
    }
    
    /**
     * https://vk.com/dev/photos.getChatUploadServer
     * 
     * You need the following rights to call this method: messages.
     * This method is available only to standalone-applications. 
     */
    public VKRequest getChatUploadServer(VKParameters params) {
        return prepareRequest("getChatUploadServer", params);
    }
    
    /**
     * https://vk.com/dev/photos.saveOwnerPhoto
     *
     * This method doesn't require any specific rights. 
     */
    public VKRequest saveOwnerPhoto(VKParameters params) {
        return prepareRequest("saveOwnerPhoto", params);
    }
    
    /**
     * https://vk.com/dev/photos.saveWallPhoto
     *
     * This method doesn't require any specific rights. 
     */
    public VKRequest saveWallPhoto(VKParameters params) {
        return prepareRequest("saveWallPhoto", params);
    }
    
    /**
     * https://vk.com/dev/photos.getWallUploadServer
     *
     * You need the following rights to call this method: photos.
     */
    public VKRequest getWallUploadServer(VKParameters params) {
        return prepareRequest("getWallUploadServer", params);
    }
    
    /**
     * https://vk.com/dev/photos.getMessagesUploadServer
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public VKRequest getMessagesUploadServer(VKParameters params) {
        return prepareRequest("getMessagesUploadServer", params);
    }
    
    /**
     * https://vk.com/dev/photos.saveMessagesPhoto
     * 
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public VKRequest saveMessagesPhoto(VKParameters params) {
        return prepareRequest("saveMessagesPhoto", params);
    }
    
    /**
     * https://vk.com/dev/photos.report
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public VKRequest report(VKParameters params) {
        return prepareRequest("report", params);
    }
    
    /**
     * https://vk.com/dev/photos.reportComment
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public VKRequest reportComment(VKParameters params) {
        return prepareRequest("reportComment", params);
    }
    
    /**
     * https://vk.com/dev/photos.search
     *
     * This is an open method; it does not require an access_token. 
     */
    public VKRequest search(VKParameters params) {
        return prepareRequest("search", params);
    }
    
    /**
     * https://vk.com/dev/photos.save
     *
     * You need the following rights to call this method: photos.
     */
    public VKRequest save(VKParameters params) {
        return prepareRequest("save", params);
    }
    
    /**
     * https://vk.com/dev/photos.copy
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public VKRequest copy(VKParameters params) {
        return prepareRequest("copy", params);
    }
    
    /**
     * https://vk.com/dev/photos.edit
     *
     * You need the following rights to call this method: photos. 
     */
    public VKRequest edit(VKParameters params) {
        return prepareRequest("edit", params);
    }
    
    /**
     * https://vk.com/dev/photos.move
     *
     * You need the following rights to call this method: photos. 
     */
    public VKRequest move(VKParameters params) {
        return prepareRequest("move", params);
    }
    
    /**
     * https://vk.com/dev/photos.makeCover
     *
     * You need the following rights to call this method: photos.
     */
    public VKRequest makeCover(VKParameters params) {
        return prepareRequest("makeCover", params);
    }
    
    /**
     * https://vk.com/dev/photos.reorderAlbums
     *
     * You need the following rights to call this method: photos.
     */
    public VKRequest reorderAlbums(VKParameters params) {
        return prepareRequest("reorderAlbums", params);
    }
    
    /**
     * https://vk.com/dev/photos.reorderPhotos
     *
     * You need the following rights to call this method: photos.
     */
    public VKRequest reorderPhotos(VKParameters params) {
        return prepareRequest("reorderPhotos", params);
    }
    
    /**
     * https://vk.com/dev/photos.getAll
     *
     * You need the following rights to call this method: photos.
     */
    public VKRequest getAll(VKParameters params) {
        return prepareRequest("getAll", params);
    }
    
    /**
     * https://vk.com/dev/photos.getUserPhotos
     *
     * This method doesn't require any specific rights. 
     */
    public VKRequest getUserPhotos(VKParameters params) {
        return prepareRequest("getUserPhotos", params);
    }
    
    /**
     * https://vk.com/dev/photos.deleteAlbum
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public VKRequest deleteAlbum(VKParameters params) {
        return prepareRequest("deleteAlbum", params);
    }
    
    /**
     * https://vk.com/dev/photos.delete
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public VKRequest delete(VKParameters params) {
        return prepareRequest("delete", params);
    }
    
    /**
     * https://vk.com/dev/photos.restore
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public VKRequest restore(VKParameters params) {
        return prepareRequest("restore", params);
    }
    
    /**
     * https://vk.com/dev/photos.confirmTag
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public VKRequest confirmTag(VKParameters params) {
        return prepareRequest("confirmTag", params);
    }
    
    /**
     * https://vk.com/dev/photos.getComments
     *
     * You need the following rights to call this method: photos.
     */
    public VKRequest getComments(VKParameters params) {
        return prepareRequest("getComments", params);
    }
    
    /**
     * https://vk.com/dev/photos.getAllComments
     *
     * You need the following rights to call this method: photos.
     */
    public VKRequest getAllComments(VKParameters params) {
        return prepareRequest("getAllComments", params);
    }
    
    /**
     * https://vk.com/dev/photos.createComment
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public VKRequest createComment(VKParameters params) {
        return prepareRequest("createComment", params);
    }
    
    /**
     * https://vk.com/dev/photos.deleteComment
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public VKRequest deleteComment(VKParameters params) {
        return prepareRequest("deleteComment", params);
    }
    
    /**
     * https://vk.com/dev/photos.restoreComment
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public VKRequest restoreComment(VKParameters params) {
        return prepareRequest("restoreComment", params);
    }
    
    /**
     * https://vk.com/dev/photos.editComment
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public VKRequest editComment(VKParameters params) {
        return prepareRequest("editComment", params);
    }
    
    /**
     * https://vk.com/dev/photos.getTags
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public VKRequest getTags(VKParameters params) {
        return prepareRequest("getTags", params);
    }
    
    /**
     * https://vk.com/dev/photos.putTag
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public VKRequest putTag(VKParameters params) {
        return prepareRequest("putTag", params);
    }
    
    /**
     * https://vk.com/dev/photos.removeTag
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public VKRequest removeTag(VKParameters params) {
        return prepareRequest("removeTag", params);
    }
    
    /**
     * https://vk.com/dev/photos.getNewTags
     *
     * You need the following rights to call this method: photos.
     * This method is available only to standalone-applications. 
     */
    public VKRequest getNewTags(VKParameters params) {
        return prepareRequest("getNewTags", params);
    }

    @Override
    protected String getMethodsGroup() {
        return "photos";
    }
}
