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
 * Builds requests for API.likes part
 * 
 * https://vk.com/dev/likes
 */
public class VKApiLikes extends VKApiBase {
	
    /**
	 * https://vk.com/dev/likes.getList
     *
     * This is an open method; it does not require an access_token. 
     */
    public VKRequest getList(VKParameters params) {
        return prepareRequest("getList", params);
    }
    
    /**
	 * https://vk.com/dev/likes.add
     *
     * You need the following rights to call this method: wall. (Read more on rights)
     * This method is available only to standalone-applications. 
     */
    public VKRequest add(VKParameters params) {
        return prepareRequest("add", params);
    }
    
    /**
	 * https://vk.com/dev/likes.delete
     *
     * You need the following rights to call this method: wall. (Read more on rights)
     * This method is available only to standalone-applications.  
     */
    public VKRequest delete(VKParameters params) {
        return prepareRequest("delete", params);
    }
    
    /**
	 * https://vk.com/dev/likes.isLiked
     *
     * You need the following rights to call this method: wall. (Read more on rights)
     * This method is available only to standalone-applications.  
     */
    public VKRequest isLiked(VKParameters params) {
        return prepareRequest("isLiked", params);
    }

    @Override
    protected String getMethodsGroup() {
        return "likes";
    }
}
