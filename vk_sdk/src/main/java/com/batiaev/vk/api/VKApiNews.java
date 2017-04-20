/*
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk.api;

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.consts.VkApiMethods;

/**
 * Builds requests for API.newsfeed part
 * <p>
 * <a href="https://vk.com/dev/newsfeed">API newsfeed</a>
 *
 * @author batiaev
 * @since 15/04/15
 */
public class VKApiNews extends VKApiBase {

    /**
     * <a href="https://vk.com/dev/newsfeed.get">API newsfeed.get()</a>
     * <p>
     * You need the following rights to call this method: wall and friends.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String get(VKParameters params) {
        return execute(getUrl(VkApiMethods.GET, params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.getRecommended">API newsfeed.getRecommended()</a>
     * <p>
     * You need the following rights to call this method: wall and friends.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String getRecommended(VKParameters params) {
        return execute(getUrl("getRecommended", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.getComments">API newsfeed.getComments()</a>
     * <p>
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String getComments(VKParameters params) {
        return execute(getUrl("getComments", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.getMentions">API newsfeed.getMentions()</a>
     * <p>
     * You need the following rights to call this method: wall.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String getMentions(VKParameters params) {
        return execute(getUrl("getMentions", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.getBanned">API newsfeed.getBanned()</a>
     * <p>
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String getBanned(VKParameters params) {
        return execute(getUrl("getBanned", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.addBan">API newsfeed.addBan()</a>
     * <p>
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String addBan(VKParameters params) {
        return execute(getUrl("addBan", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.deleteBan">API newsfeed.deleteBan()</a>
     * <p>
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String deleteBan(VKParameters params) {
        return execute(getUrl("deleteBan", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.ignoreItem">API newsfeed.ignoreItem()</a>
     * <p>
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String ignoreItem(VKParameters params) {
        return execute(getUrl("ignoreItem", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.unignoreItem">API newsfeed.unignoreItem()</a>
     * <p>
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String unignoreItem(VKParameters params) {
        return execute(getUrl("unignoreItem", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.search">API newsfeed.search()</a>
     * <p>
     * This is an open method; it does not require an access_token.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String search(VKParameters params) {
        return execute(getUrl(VkApiMethods.SEARCH, params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.getLists">API newsfeed.getLists()</a>
     * <p>
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String getLists(VKParameters params) {
        return execute(getUrl("getLists", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.saveList">API newsfeed.saveList()</a>
     * <p>
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String saveList(VKParameters params) {
        return execute(getUrl("saveList", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.deleteList">API newsfeed.deleteList()</a>
     * <p>
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String deleteList(VKParameters params) {
        return execute(getUrl("deleteList", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.unsubscribe">API newsfeed.unsubscribe()</a>
     * <p>
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String unsubscribe(VKParameters params) {
        return execute(getUrl("unsubscribe", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.getSuggestedSources">API newsfeed.getSuggestedSources()</a>
     * <p>
     * This method doesn't require any specific rights.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String getSuggestedSources(VKParameters params) {
        return execute(getUrl("getSuggestedSources", params)).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "news";
    }
}
