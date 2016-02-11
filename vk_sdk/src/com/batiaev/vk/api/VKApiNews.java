package com.batiaev.vk.api;

/**
 * @author batiaev
 * Created by batiaev on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */

import com.batiaev.vk.common.VKParameters;

/**
 * Builds requests for API.newsfeed part
 *
 * <a href="https://vk.com/dev/newsfeed">API newsfeed</a>
 */
public class VKApiNews extends VKApiBase {

    /**
     * <a href="https://vk.com/dev/newsfeed.get">API newsfeed.get()</a>
     *
     * You need the following rights to call this method: wall and friends.
     * @param params method parameters
     * @return String with json respond
     */
    public String get(VKParameters params) {
        return execute("get", params).toString();
    }
	
    /**
     * <a href="https://vk.com/dev/newsfeed.getRecommended">API newsfeed.getRecommended()</a>
     *
     * You need the following rights to call this method: wall and friends.
     * @param params method parameters
     * @return String with json respond
     */
    public String getRecommended(VKParameters params) {
        return execute("getRecommended", params).toString();
    }
	
    /**
     * <a href="https://vk.com/dev/newsfeed.getComments">API newsfeed.getComments()</a>
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String getComments(VKParameters params) {
        return execute("getComments", params).toString();
    }
	
    /**
     * <a href="https://vk.com/dev/newsfeed.getMentions">API newsfeed.getMentions()</a>
     *
     * You need the following rights to call this method: wall.
     * @param params method parameters
     * @return String with json respond
     */
    public String getMentions(VKParameters params) {
        return execute("getMentions", params).toString();
    }
	
    /**
     * <a href="https://vk.com/dev/newsfeed.getBanned">API newsfeed.getBanned()</a>
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String getBanned(VKParameters params) {
        return execute("getBanned", params).toString();
    }
	
    /**
     * <a href="https://vk.com/dev/newsfeed.addBan">API newsfeed.addBan()</a>
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String addBan(VKParameters params) {
        return execute("addBan", params).toString();
    }
	
    /**
     * <a href="https://vk.com/dev/newsfeed.deleteBan">API newsfeed.deleteBan()</a>
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String deleteBan(VKParameters params) {
        return execute("deleteBan", params).toString();
    }
	
    /**
     * <a href="https://vk.com/dev/newsfeed.ignoreItem">API newsfeed.ignoreItem()</a>
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String ignoreItem(VKParameters params) {
        return execute("ignoreItem", params).toString();
    }
	
    /**
     * <a href="https://vk.com/dev/newsfeed.unignoreItem">API newsfeed.unignoreItem()</a>
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String unignoreItem(VKParameters params) {
        return execute("unignoreItem", params).toString();
    }
	
    /**
     * <a href="https://vk.com/dev/newsfeed.search">API newsfeed.search()</a>
     *
     * This is an open method; it does not require an access_token.
     * @param params method parameters
     * @return String with json respond
     */
    public String search(VKParameters params) {
        return execute("search", params).toString();
    }
	
    /**
     * <a href="https://vk.com/dev/newsfeed.getLists">API newsfeed.getLists()</a>
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String getLists(VKParameters params) {
        return execute("getLists", params).toString();
    }
	
    /**
     * <a href="https://vk.com/dev/newsfeed.saveList">API newsfeed.saveList()</a>
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String saveList(VKParameters params) {
        return execute("saveList", params).toString();
    }
	
    /**
     * <a href="https://vk.com/dev/newsfeed.deleteList">API newsfeed.deleteList()</a>
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String deleteList(VKParameters params) {
        return execute("deleteList", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/newsfeed.unsubscribe">API newsfeed.unsubscribe()</a>
     *
     * You need the following rights to call this method: wall.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String unsubscribe(VKParameters params) {
        return execute("unsubscribe", params).toString();
    }
	
    /**
     * <a href="https://vk.com/dev/newsfeed.getSuggestedSources">API newsfeed.getSuggestedSources()</a>
     *
     * This method doesn't require any specific rights.
     * @param params method parameters
     * @return String with json respond
     */
    public String getSuggestedSources(VKParameters params) {
        return execute("getSuggestedSources", params).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "news";
    }
}
