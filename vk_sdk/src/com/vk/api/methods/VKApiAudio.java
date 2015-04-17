package com.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */
 
import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;

/**
 * Builds requests for API.audio part
 */
public class VKApiAudio extends VKApiBase {
    
    /**
     * https://vk.com/dev/audio.get
     *
     * You need the following rights to call this method: audio.
     */
    public VKRequest get(VKParameters params) {
        return prepareRequest("get", params);
    }

    /**
     * https://vk.com/dev/audio.getById
     *
     * You need the following rights to call this method: audio.
     */
    public VKRequest getById(VKParameters params) {
        return prepareRequest("getById", params);
    }

    /**
     * https://vk.com/dev/audio.getLyrics
     *
     * You need the following rights to call this method: audio.
     */
    public VKRequest getLyrics(VKParameters params) {
        return prepareRequest("getLyrics", params);
    }

    /**
     * https://vk.com/dev/audio.search
     *
     * You need the following rights to call this method: audio.
     */
    public VKRequest search(VKParameters params) {
        return prepareRequest("search", params);
    }

    /**
     * https://vk.com/dev/audio.getUploadServer
     *
     * You need the following rights to call this method: audio.
     */
    public VKRequest getUploadServer(VKParameters params) {
        return prepareRequest("getUploadServer", params);
    }

    /**
     * https://vk.com/dev/audio.save
     *
     * You need the following rights to call this method: audio.
     */
    public VKRequest save(VKParameters params) {
        return prepareRequest("save", params);
    }

    /**
     * https://vk.com/dev/audio.add
     *
     * You need the following rights to call this method: audio.
     */
    public VKRequest add(VKParameters params) {
        return prepareRequest("add", params);
    }

    /**
     * https://vk.com/dev/audio.delete
     *
     * You need the following rights to call this method: audio.
     */
    public VKRequest delete(VKParameters params) {
        return prepareRequest("delete", params);
    }

    /**
     * https://vk.com/dev/audio.edit
     *
     * You need the following rights to call this method: audio.
     */
    public VKRequest edit(VKParameters params) {
        return prepareRequest("edit", params);
    }

    /**
     * https://vk.com/dev/audio.reorder
     *
     * You need the following rights to call this method: audio.
     */
    public VKRequest reorder(VKParameters params) {
        return prepareRequest("reorder", params);
    }

    /**
     * https://vk.com/dev/audio.restore
     *
     * You need the following rights to call this method: audio.
     */
    public VKRequest restore(VKParameters params) {
        return prepareRequest("restore", params);
    }

    /**
     * https://vk.com/dev/audio.getAlbums
     *
     * You need the following rights to call this method: audio.
     */
    public VKRequest getAlbums(VKParameters params) {
        return prepareRequest("getAlbums", params);
    }

    /**
     * https://vk.com/dev/audio.addAlbum
     *
     * You need the following rights to call this method: audio.
     */
    public VKRequest addAlbum(VKParameters params) {
        return prepareRequest("addAlbum", params);
    }

    /**
     * https://vk.com/dev/audio.editAlbum
     *
     * You need the following rights to call this method: audio.
     */
    public VKRequest editAlbum(VKParameters params) {
        return prepareRequest("editAlbum", params);
    }

    /**
     * https://vk.com/dev/audio.deleteAlbum
     *
     * You need the following rights to call this method: audio.
     */
    public VKRequest deleteAlbum(VKParameters params) {
        return prepareRequest("deleteAlbum", params);
    }

    /**
     * https://vk.com/dev/audio.moveToAlbum
     *
     * You need the following rights to call this method: audio.
     */
    public VKRequest moveToAlbum(VKParameters params) {
        return prepareRequest("moveToAlbum", params);
    }

    /**
     * https://vk.com/dev/audio.setBroadcast
     *
     * You need the following rights to call this method: audio.
     */
    public VKRequest setBroadcast(VKParameters params) {
        return prepareRequest("setBroadcast", params);
    }

    /**
     * https://vk.com/dev/audio.getBroadcastList
     *
     * You need the following rights to call this method: audio.
     */
    public VKRequest getBroadcastList(VKParameters params) {
        return prepareRequest("getBroadcastList", params);
    }

    /**
     * https://vk.com/dev/audio.getRecommendations
     *
     * You need the following rights to call this method: audio.
     */
    public VKRequest getRecommendations(VKParameters params) {
        return prepareRequest("getRecommendations", params);
    }

    /**
     * https://vk.com/dev/audio.getPopular
     *
     * You need the following rights to call this method: audio.
     */
    public VKRequest getPopular(VKParameters params) {
        return prepareRequest("getPopular", params);
    }

    /**
     * https://vk.com/dev/audio.getCount
     *
     * You need the following rights to call this method: audio.
     */
    public VKRequest getCount(VKParameters params) {
        return prepareRequest("getCount", params);
    }
}
