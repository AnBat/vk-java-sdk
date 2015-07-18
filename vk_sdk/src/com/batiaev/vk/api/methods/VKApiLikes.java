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
    public String getList(VKParameters params) {
        return prepareRequest("getList", params).getRequest();
    }
    
    /**
	 * https://vk.com/dev/likes.add
     *
     * You need the following rights to call this method: wall. (Read more on rights)
     * This method is available only to standalone-applications. 
     */
    public String add(VKParameters params) {
        return prepareRequest("add", params).getRequest();
    }
    
    /**
	 * https://vk.com/dev/likes.delete
     *
     * You need the following rights to call this method: wall. (Read more on rights)
     * This method is available only to standalone-applications.  
     */
    public String delete(VKParameters params) {
        return prepareRequest("delete", params).getRequest();
    }
    
    /**
	 * https://vk.com/dev/likes.isLiked
     *
     * You need the following rights to call this method: wall. (Read more on rights)
     * This method is available only to standalone-applications.  
     */
    public String isLiked(VKParameters params) {
        return prepareRequest("isLiked", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "likes";
    }
}
