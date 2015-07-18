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
 * Builds requests for API.audio part
 */
public class VKApiAudio extends VKApiBase {
    
    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/audio.get
     *
     * You need the following rights to call this method: audio.
     */
    public String get(VKParameters params) {
        return prepareRequest("get", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/audio.getById
     *
     * You need the following rights to call this method: audio.
     */
    public String getById(VKParameters params) {
        return prepareRequest("getById", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/audio.getLyrics
     *
     * You need the following rights to call this method: audio.
     */
    public String getLyrics(VKParameters params) {
        return prepareRequest("getLyrics", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/audio.search
     *
     * You need the following rights to call this method: audio.
     */
    public String search(VKParameters params) {
        return prepareRequest("search", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/audio.getUploadServer
     *
     * You need the following rights to call this method: audio.
     */
    public String getUploadServer(VKParameters params) {
        return prepareRequest("getUploadServer", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/audio.save
     *
     * You need the following rights to call this method: audio.
     */
    public String save(VKParameters params) {
        return prepareRequest("save", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/audio.add
     *
     * You need the following rights to call this method: audio.
     */
    public String add(VKParameters params) {
        return prepareRequest("add", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/audio.delete
     *
     * You need the following rights to call this method: audio.
     */
    public String delete(VKParameters params) {
        return prepareRequest("delete", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/audio.edit
     *
     * You need the following rights to call this method: audio.
     */
    public String edit(VKParameters params) {
        return prepareRequest("edit", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/audio.reorder
     *
     * You need the following rights to call this method: audio.
     */
    public String reorder(VKParameters params) {
        return prepareRequest("reorder", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/audio.restore
     *
     * You need the following rights to call this method: audio.
     */
    public String restore(VKParameters params) {
        return prepareRequest("restore", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/audio.getAlbums
     *
     * You need the following rights to call this method: audio.
     */
    public String getAlbums(VKParameters params) {
        return prepareRequest("getAlbums", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/audio.addAlbum
     *
     * You need the following rights to call this method: audio.
     */
    public String addAlbum(VKParameters params) {
        return prepareRequest("addAlbum", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/audio.editAlbum
     *
     * You need the following rights to call this method: audio.
     */
    public String editAlbum(VKParameters params) {
        return prepareRequest("editAlbum", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/audio.deleteAlbum
     *
     * You need the following rights to call this method: audio.
     */
    public String deleteAlbum(VKParameters params) {
        return prepareRequest("deleteAlbum", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/audio.moveToAlbum
     *
     * You need the following rights to call this method: audio.
     */
    public String moveToAlbum(VKParameters params) {
        return prepareRequest("moveToAlbum", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/audio.setBroadcast
     *
     * You need the following rights to call this method: audio.
     */
    public String setBroadcast(VKParameters params) {
        return prepareRequest("setBroadcast", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/audio.getBroadcastList
     *
     * You need the following rights to call this method: audio.
     */
    public String getBroadcastList(VKParameters params) {
        return prepareRequest("getBroadcastList", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/audio.getRecommendations
     *
     * You need the following rights to call this method: audio.
     */
    public String getRecommendations(VKParameters params) {
        return prepareRequest("getRecommendations", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/audio.getPopular
     *
     * You need the following rights to call this method: audio.
     */
    public String getPopular(VKParameters params) {
        return prepareRequest("getPopular", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/audio.getCount
     *
     * You need the following rights to call this method: audio.
     */
    public String getCount(VKParameters params) {
        return prepareRequest("getCount", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "audio";
    }
}
