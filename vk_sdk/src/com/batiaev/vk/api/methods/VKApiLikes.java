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
 * Builds requests for API.likes part
 *
 * @see <a href="https://vk.com/dev/likes">API likes</a>
 */
public class VKApiLikes extends VKApiBase {
	
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/likes.getList">API likes.getList()</a>
     *
     * This is an open method; it does not require an access_token. 
     */
    public String getList(VKParameters params) {
        return prepareRequest("getList", params).getRequest();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/likes.add">API likes.add()</a>
     *
     * You need the following rights to call this method: wall. (Read more on rights)
     * This method is available only to standalone-applications. 
     */
    public String add(VKParameters params) {
        return prepareRequest("add", params).getRequest();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/likes.delete">API likes.delete()</a>
     *
     * You need the following rights to call this method: wall. (Read more on rights)
     * This method is available only to standalone-applications.  
     */
    public String delete(VKParameters params) {
        return prepareRequest("delete", params).getRequest();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/likes.isLiked">API likes.isLiked()</a>
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
