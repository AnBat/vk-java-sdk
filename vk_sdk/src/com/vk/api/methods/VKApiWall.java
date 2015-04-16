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
 * Builds requests for API.wall part
 * 
 * https://vk.com/dev/wall
 */
public class VKApiWall extends VKApiBase {
	
    public VKRequest get(VKParameters params) {
		return prepareRequest("get", params);
    }

    public VKRequest getById(VKParameters params) {
		return prepareRequest("get", params);
    }

    public VKRequest savePost(VKParameters params) {
        return prepareRequest("savePost", params);
    }


    public VKRequest post(VKParameters parameters) {
        return prepareRequest("post", parameters);
    }

    public VKRequest repost(VKParameters params) {
        return prepareRequest("repost", params);
    }

    public VKRequest getReposts(VKParameters params) {
        return prepareRequest("getReposts", params);
    }

    public VKRequest edit(VKParameters params) {
        return prepareRequest("edit", params);
    }

    public VKRequest delete(VKParameters params) {
        return prepareRequest("delete", params);
    }

    public VKRequest restore(VKParameters params) {
        return prepareRequest("restore", params);
    }

    public VKRequest getComments(VKParameters params) {
        return prepareRequest("getComments", params, VKRequest.HttpMethod.GET, VKCommentArray.class);
    }

    public VKRequest addComment(VKParameters params) {
        return prepareRequest("addComment", params);
    }

    public VKRequest editComment(VKParameters params) {
        return prepareRequest("editComment", params);
    }

    public VKRequest deleteComment(VKParameters params) {
        return prepareRequest("deleteComment", params);
    }

    public VKRequest restoreComment(VKParameters params) {
        return prepareRequest("restoreComment", params);
    }

    public VKRequest reportPost(VKParameters params) {
        return prepareRequest("reportPost", params);
    }

    public VKRequest reportComment(VKParameters params) {
        return prepareRequest("reportComment", params);
    }

    @Override
    protected String getMethodsGroup() {
        return "wall";
    }
}
