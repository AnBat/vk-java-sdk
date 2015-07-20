package com.batiaev.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */
 
import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.annotation.Rights;
import com.batiaev.vk.api.consts.VKApiRigths;

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
        return prepareRequest("get", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.getById">API audio.getById()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String getById(VKParameters params) {
        return prepareRequest("getById", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.getLyrics">API audio.getLyrics()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String getLyrics(VKParameters params) {
        return prepareRequest("getLyrics", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.search">API audio.search()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String search(VKParameters params) {
        return prepareRequest("search", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.getUploadServer">API audio.getUploadServer()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String getUploadServer(VKParameters params) {
        return prepareRequest("getUploadServer", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.save">API audio.save()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String save(VKParameters params) {
        return prepareRequest("save", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.add">API audio.add()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String add(VKParameters params) {
        return prepareRequest("add", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.delete">API audio.delete()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String delete(VKParameters params) {
        return prepareRequest("delete", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.edit">API audio.edit()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String edit(VKParameters params) {
        return prepareRequest("edit", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.reorder">API audio.reorder()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String reorder(VKParameters params) {
        return prepareRequest("reorder", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.restore">API audio.restore()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String restore(VKParameters params) {
        return prepareRequest("restore", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.getAlbums">API audio.getAlbums()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String getAlbums(VKParameters params) {
        return prepareRequest("getAlbums", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.addAlbum">API audio.addAlbum()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String addAlbum(VKParameters params) {
        return prepareRequest("addAlbum", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.editAlbum">API audio.editAlbum()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String editAlbum(VKParameters params) {
        return prepareRequest("editAlbum", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.deleteAlbum">API audio.deleteAlbum()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String deleteAlbum(VKParameters params) {
        return prepareRequest("deleteAlbum", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.moveToAlbum">API audio.moveToAlbum()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String moveToAlbum(VKParameters params) {
        return prepareRequest("moveToAlbum", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.setBroadcast">API audio.setBroadcast()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String setBroadcast(VKParameters params) {
        return prepareRequest("setBroadcast", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.getBroadcastList">API audio.getBroadcastList()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String getBroadcastList(VKParameters params) {
        return prepareRequest("getBroadcastList", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.getRecommendations">API audio.getRecommendations()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String getRecommendations(VKParameters params) {
        return prepareRequest("getRecommendations", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.getPopular">API audio.getPopular()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String getPopular(VKParameters params) {
        return prepareRequest("getPopular", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/audio.getCount">API audio.getCount()</a>
     */
    @Rights(VKApiRigths.AUDIO)
    public String getCount(VKParameters params) {
        return prepareRequest("getCount", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "audio";
    }
}
