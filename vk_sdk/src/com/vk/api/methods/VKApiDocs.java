package com.vk.api.methods;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;

/**
 * Builds requests for API.docs part
 * 
 * https://vk.com/dev/docs
 */
public class VKApiDocs extends VKApiBase {
	
    /**
	 * https://vk.com/dev/docs.get
     *
     * You need the following rights to call this method: docs.
     */
    public VKRequest get(VKParameters params) {
        return prepareRequest("get", params);
    }
    
    /**
	 * https://vk.com/dev/docs.getById
     *
     * You need the following rights to call this method: docs
     */
    public VKRequest getById(VKParameters params) {
        return prepareRequest("getById", params);
    }
    
    /**
	 * https://vk.com/dev/docs.getUploadServer
     *
     * You need the following rights to call this method: docs.
     */
    public VKRequest getUploadServer(VKParameters params) {
        return prepareRequest("getUploadServer", params);
    }
    
    /**
	 * https://vk.com/dev/docs.getWallUploadServer
     *
     * You need the following rights to call this method: docs.
     */
    public VKRequest getWallUploadServer(VKParameters params) {
        return prepareRequest("getWallUploadServer", params);
    }

    /**
     * https://vk.com/dev/docs.save
     *
     * You need the following rights to call this method: docs.
     */
    public VKRequest save(VKParameters params) {
        return prepareRequest("save", params);
    }

    /**
     * https://vk.com/dev/docs.delete
     *
     * You need the following rights to call this method: docs.
     */
    public VKRequest delete(VKParameters params) {
        return prepareRequest("delete", params);
    }

    /**
     * https://vk.com/dev/docs.add
     *
     * You need the following rights to call this method: docs.
     */
    public VKRequest add(VKParameters params) {
        return prepareRequest("add", params);
    }
}
