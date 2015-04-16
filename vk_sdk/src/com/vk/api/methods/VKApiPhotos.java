package com.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;

/**
 * Builds requests for API.photos part
 * 
 * https://vk.com/dev/photos
 */
public class VKApiPhotos extends VKApiBase {
    public VKRequest getUploadServer(long albumId) {
        return prepareRequest("getUploadServer", VKUtil.paramsFrom(VKApiConst.ALBUM_ID, String.valueOf(albumId)));
    }

    public VKRequest getUploadServer(long albumId, long groupId) {
        return prepareRequest("getUploadServer", VKUtil.paramsFrom(VKApiConst.ALBUM_ID, albumId, VKApiConst.GROUP_ID, groupId));
    }

    public VKRequest getWallUploadServer() {
        return prepareRequest("getWallUploadServer", null);
    }

    public VKRequest getWallUploadServer(long groupId) {
        return prepareRequest("getWallUploadServer", VKUtil.paramsFrom(VKApiConst.GROUP_ID, groupId));
    }

    public VKRequest getMessagesUploadServer () {
        return prepareRequest("getMessagesUploadServer", null);
    }

    public VKRequest saveWallPhoto(VKParameters params) {
        return prepareRequest("saveWallPhoto", params, VKRequest.HttpMethod.POST, VKPhotoArray.class);

    }

    public VKRequest save(VKParameters params) {
        return prepareRequest("save", params, VKRequest.HttpMethod.POST, VKPhotoArray.class);
    }

    public VKRequest saveMessagesPhoto(VKParameters params) {
        return prepareRequest("saveMessagesPhoto", params, VKRequest.HttpMethod.POST, VKPhotoArray.class);
    }

    @Override
    protected String getMethodsGroup() {
        return "photos";
    }
}
