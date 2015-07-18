package com.batiaev.vk.api.methods;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKParameters;

/**
 * @author batiaev
 *
 * Builds requests for API.docs part
 * 
 * https://vk.com/dev/docs
 */
public class VKApiDocs extends VKApiBase {
	
    /**
     * @param params method parameters
     * @return String with json respond
	 * https://vk.com/dev/docs.get
     *
     * You need the following rights to call this method: docs.
     */
    public String get(VKParameters params) {
        return prepareRequest("get", params).getRequest();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
	 * https://vk.com/dev/docs.getById
     *
     * You need the following rights to call this method: docs
     */
    public String getById(VKParameters params) {
        return prepareRequest("getById", params).getRequest();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
	 * https://vk.com/dev/docs.getUploadServer
     *
     * You need the following rights to call this method: docs.
     */
    public String getUploadServer(VKParameters params) {
        return prepareRequest("getUploadServer", params).getRequest();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
	 * https://vk.com/dev/docs.getWallUploadServer
     *
     * You need the following rights to call this method: docs.
     */
    public String getWallUploadServer(VKParameters params) {
        return prepareRequest("getWallUploadServer", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/docs.save
     *
     * You need the following rights to call this method: docs.
     */
    public String save(VKParameters params) {
        return prepareRequest("save", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/docs.delete
     *
     * You need the following rights to call this method: docs.
     */
    public String delete(VKParameters params) {
        return prepareRequest("delete", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/docs.add
     *
     * You need the following rights to call this method: docs.
     */
    public String add(VKParameters params) {
        return prepareRequest("add", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "docs";
    }
}
