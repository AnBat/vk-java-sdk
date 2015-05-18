package com.batiaev.vk.api.methods;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.VKRequest;

/**
 * Builds requests for API.pages part
 * 
 * https://vk.com/dev/pages
 */
public class VKApiPages extends VKApiBase {

    /**
     * https://vk.com/dev/pages.get
     *
     * You need the following rights to call this method: pages.
     */
    public VKRequest get(VKParameters params) {
        return prepareRequest("get", params);
    }

    /**
     * https://vk.com/dev/pages.save
     *
     * You need the following rights to call this method: pages.
     */
    public VKRequest save(VKParameters params) {
        return prepareRequest("save", params);
    }

    /**
     * https://vk.com/dev/pages.saveAccess
     *
     * You need the following rights to call this method: pages.
     */
    public VKRequest saveAccess(VKParameters params) {
        return prepareRequest("saveAccess", params);
    }

    /**
     * https://vk.com/dev/pages.getHistory
     *
     * You need the following rights to call this method: pages.
     */
    public VKRequest getHistory(VKParameters params) {
        return prepareRequest("getHistory", params);
    }

    /**
     * https://vk.com/dev/pages.getTitles
     *
     * You need the following rights to call this method: pages.
     */
    public VKRequest getTitles(VKParameters params) {
        return prepareRequest("getTitles", params);
    }

    /**
     * https://vk.com/dev/pages.getVersion
     *
     * This method doesn't require any specific rights.
     */
    public VKRequest getVersion(VKParameters params) {
        return prepareRequest("getVersion", params);
    }

    /**
     * https://vk.com/dev/pages.parseWiki
     *
     * This method doesn't require any specific rights.
     */
    public VKRequest parseWiki(VKParameters params) {
        return prepareRequest("parseWiki", params);
    }

    /**
     * https://vk.com/dev/pages.clearCache
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest clearCache(VKParameters params) {
        return prepareRequest("clearCache", params);
    }

    @Override
    protected String getMethodsGroup() {
        return "pages";
    }
}
