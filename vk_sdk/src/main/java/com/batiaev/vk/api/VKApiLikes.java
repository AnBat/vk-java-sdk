/*
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk.api;

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.consts.VkApiMethods;

/**
 * Builds requests for API.likes part
 * <p>
 * <a href="https://vk.com/dev/likes">API likes</a>
 *
 * @author batiaev
 * @since 15/04/15
 */
public class VKApiLikes extends VKApiBase {

    /**
     * <a href="https://vk.com/dev/likes.getList">API likes.getList()</a>
     * <p>
     * This is an open method; it does not require an access_token.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String getList(VKParameters params) {
        return execute(getUrl("getList", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/likes.add">API likes.add()</a>
     * <p>
     * You need the following rights to call this method: wall. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String add(VKParameters params) {
        return execute(getUrl(VkApiMethods.ADD, params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/likes.delete">API likes.delete()</a>
     * <p>
     * You need the following rights to call this method: wall. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String delete(VKParameters params) {
        return execute(getUrl(VkApiMethods.DELETE, params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/likes.isLiked">API likes.isLiked()</a>
     * <p>
     * You need the following rights to call this method: wall. (Read more on rights)
     * This method is available only to standalone-applications.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String isLiked(VKParameters params) {
        return execute(getUrl("isLiked", params)).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "likes";
    }
}
