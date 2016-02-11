package com.batiaev.vk.api;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.annotation.Rights;
import com.batiaev.vk.common.consts.VKApiRigths;

/**
 * @author batiaev
 *
 * Builds requests for API.favorites part
 * 
 * https://vk.com/dev/favorites
 */
public class VKApiFavorites extends VKApiBase {
	
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/fave.getUsers">API fave.getUsers()</a>
     */
    @Rights(value = VKApiRigths.FRIENDS, standAloneOnly = true)
    public String getUsers(VKParameters params) {
        return execute("getUsers", params).toString();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/fave.getPhotos">API fave.getPhotos()</a>
     */
    @Rights(value = VKApiRigths.FRIENDS, standAloneOnly = true)
    public String getPhotos(VKParameters params) {
        return execute("getPhotos", params).toString();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/fave.getPosts">API fave.getPosts()</a>
     */
    @Rights(value = VKApiRigths.FRIENDS, standAloneOnly = true)
    public String getPosts(VKParameters params) {
        return execute("getPosts", params).toString();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/fave.getVideos">API fave.getVideos()</a>
     */
    @Rights(value = VKApiRigths.FRIENDS, standAloneOnly = true)
    public String getVideos(VKParameters params) {
        return execute("getVideos", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/fave.getLinks">API fave.getLinks()</a>
     */
    @Rights(value = VKApiRigths.FRIENDS, standAloneOnly = true)
    public String getLinks(VKParameters params) {
        return execute("getLinks", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/fave.addUser">API fave.addUser()</a>
     */
    @Rights(value = VKApiRigths.FRIENDS, standAloneOnly = true)
    public String addUser(VKParameters params) {
        return execute("addUser", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/fave.removeUser">API fave.removeUser()</a>
     */
    @Rights(value = VKApiRigths.FRIENDS, standAloneOnly = true)
    public String removeUser(VKParameters params) {
        return execute("removeUser", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/fave.addGroup">API fave.addGroup()</a>
     */
    @Rights(value = VKApiRigths.FRIENDS, standAloneOnly = true)
    public String addGroup(VKParameters params) {
        return execute("addGroup", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/fave.removeGroup">API fave.removeGroup()</a>
     */
    @Rights(value = VKApiRigths.FRIENDS, standAloneOnly = true)
    public String removeGroup(VKParameters params) {
        return execute("removeGroup", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/fave.addLink">API fave.addLink()</a>
     */
    @Rights(value = VKApiRigths.FRIENDS, standAloneOnly = true)
    public String addLink(VKParameters params) {
        return execute("addLink", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/fave.removeLink">API fave.removeLink()</a>
     */
    @Rights(value = VKApiRigths.FRIENDS, standAloneOnly = true)
    public String removeLink(VKParameters params) {
        return execute("removeLink", params).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "farovites";
    }
}
