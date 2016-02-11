package com.batiaev.vk.api;

/**
 * Created by anton on 15/04/15.
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
 * Builds requests for API.audio part
 */
public class VKApiAudio extends VKApiBase {
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.get">API audio.get()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String get(VKParameters params) {
        return execute("get", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.getById">API audio.getById()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String getById(VKParameters params) {
        return execute("getById", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.getLyrics">API audio.getLyrics()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String getLyrics(VKParameters params) {
        return execute("getLyrics", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.search">API audio.search()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String search(VKParameters params) {
        return execute("search", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.getUploadServer">API audio.getUploadServer()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String getUploadServer(VKParameters params) {
        return execute("getUploadServer", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.save">API audio.save()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String save(VKParameters params) {
        return execute("save", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.add">API audio.add()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String add(VKParameters params) {
        return execute("add", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.delete">API audio.delete()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String delete(VKParameters params) {
        return execute("delete", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.edit">API audio.edit()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String edit(VKParameters params) {
        return execute("edit", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.reorder">API audio.reorder()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String reorder(VKParameters params) {
        return execute("reorder", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.restore">API audio.restore()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String restore(VKParameters params) {
        return execute("restore", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.getAlbums">API audio.getAlbums()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String getAlbums(VKParameters params) {
        return execute("getAlbums", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.addAlbum">API audio.addAlbum()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String addAlbum(VKParameters params) {
        return execute("addAlbum", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.editAlbum">API audio.editAlbum()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String editAlbum(VKParameters params) {
        return execute("editAlbum", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.deleteAlbum">API audio.deleteAlbum()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String deleteAlbum(VKParameters params) {
        return execute("deleteAlbum", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.moveToAlbum">API audio.moveToAlbum()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String moveToAlbum(VKParameters params) {
        return execute("moveToAlbum", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.setBroadcast">API audio.setBroadcast()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String setBroadcast(VKParameters params) {
        return execute("setBroadcast", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.getBroadcastList">API audio.getBroadcastList()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String getBroadcastList(VKParameters params) {
        return execute("getBroadcastList", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.getRecommendations">API audio.getRecommendations()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String getRecommendations(VKParameters params) {
        return execute("getRecommendations", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.getPopular">API audio.getPopular()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String getPopular(VKParameters params) {
        return execute("getPopular", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.getCount">API audio.getCount()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String getCount(VKParameters params) {
        return execute("getCount", params).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "audio";
    }
}
