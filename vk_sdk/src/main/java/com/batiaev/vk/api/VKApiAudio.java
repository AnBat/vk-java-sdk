/*
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk.api;

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.annotation.Rights;
import com.batiaev.vk.common.consts.VKApiRigths;
import com.batiaev.vk.common.consts.VkApiMethods;

/**
 * Builds requests for API.audio part
 *
 * @author batiaev
 * @since 15/04/15
 */
public class VKApiAudio extends VKApiBase {

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.get">API audio.get()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String get(VKParameters params) {
        return execute(getUrl(VkApiMethods.GET, params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.getById">API audio.getById()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String getById(VKParameters params) {
        return execute(getUrl(VkApiMethods.GET_BY_ID, params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.getLyrics">API audio.getLyrics()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String getLyrics(VKParameters params) {
        return execute(getUrl("getLyrics", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.search">API audio.search()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String search(VKParameters params) {
        return execute(getUrl(VkApiMethods.SEARCH, params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.getUploadServer">API audio.getUploadServer()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String getUploadServer(VKParameters params) {
        return execute(getUrl("getUploadServer", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.save">API audio.save()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String save(VKParameters params) {
        return execute(getUrl(VkApiMethods.SAVE, params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.add">API audio.add()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String add(VKParameters params) {
        return execute(getUrl(VkApiMethods.ADD, params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.delete">API audio.delete()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String delete(VKParameters params) {
        return execute(getUrl(VkApiMethods.DELETE, params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.edit">API audio.edit()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String edit(VKParameters params) {
        return execute(getUrl(VkApiMethods.EDIT, params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.reorder">API audio.reorder()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String reorder(VKParameters params) {
        return execute(getUrl("reorder", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.restore">API audio.restore()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String restore(VKParameters params) {
        return execute(getUrl("restore", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.getAlbums">API audio.getAlbums()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String getAlbums(VKParameters params) {
        return execute(getUrl("getAlbums", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.addAlbum">API audio.addAlbum()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String addAlbum(VKParameters params) {
        return execute(getUrl("addAlbum", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.editAlbum">API audio.editAlbum()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String editAlbum(VKParameters params) {
        return execute(getUrl("editAlbum", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.deleteAlbum">API audio.deleteAlbum()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String deleteAlbum(VKParameters params) {
        return execute(getUrl("deleteAlbum", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.moveToAlbum">API audio.moveToAlbum()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String moveToAlbum(VKParameters params) {
        return execute(getUrl("moveToAlbum", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.setBroadcast">API audio.setBroadcast()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String setBroadcast(VKParameters params) {
        return execute(getUrl("setBroadcast", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.getBroadcastList">API audio.getBroadcastList()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String getBroadcastList(VKParameters params) {
        return execute(getUrl("getBroadcastList", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.getRecommendations">API audio.getRecommendations()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String getRecommendations(VKParameters params) {
        return execute(getUrl("getRecommendations", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.getPopular">API audio.getPopular()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String getPopular(VKParameters params) {
        return execute(getUrl("getPopular", params)).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.getCount">API audio.getCount()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String getCount(VKParameters params) {
        return execute(getUrl("getCount", params)).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "audio";
    }
}
