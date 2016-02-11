package com.batiaev.vk.api;

/**
 * Created by batiaev on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */

import com.batiaev.vk.common.VKParameters;

/**
 * @author batiaev
 *
 * Builds requests for API.likes part
 *
 * <a href="https://vk.com/dev/likes">API likes</a>
 */
public class VKApiLikes extends VKApiBase {
	
    /**
     * <a href="https://vk.com/dev/likes.getList">API likes.getList()</a>
     *
     * This is an open method; it does not require an access_token.
     * @param params method parameters
     * @return String with json respond
     */
    public String getList(VKParameters params) {
        return execute("getList", params).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/likes.add">API likes.add()</a>
     *
     * You need the following rights to call this method: wall. (Read more on rights)
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String add(VKParameters params) {
        return execute("add", params).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/likes.delete">API likes.delete()</a>
     *
     * You need the following rights to call this method: wall. (Read more on rights)
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String delete(VKParameters params) {
        return execute("delete", params).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/likes.isLiked">API likes.isLiked()</a>
     *
     * You need the following rights to call this method: wall. (Read more on rights)
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String isLiked(VKParameters params) {
        return execute("isLiked", params).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "likes";
    }
}
