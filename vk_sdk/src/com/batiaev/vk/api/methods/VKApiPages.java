package com.batiaev.vk.api.methods;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKParameters;

/**
 * @author batiaev
 *
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
    public String get(VKParameters params) {
        return prepareRequest("get", params).getRequest();
    }

    /**
     * https://vk.com/dev/pages.save
     *
     * You need the following rights to call this method: pages.
     */
    public String save(VKParameters params) {
        return prepareRequest("save", params).getRequest();
    }

    /**
     * https://vk.com/dev/pages.saveAccess
     *
     * You need the following rights to call this method: pages.
     */
    public String saveAccess(VKParameters params) {
        return prepareRequest("saveAccess", params).getRequest();
    }

    /**
     * https://vk.com/dev/pages.getHistory
     *
     * You need the following rights to call this method: pages.
     */
    public String getHistory(VKParameters params) {
        return prepareRequest("getHistory", params).getRequest();
    }

    /**
     * https://vk.com/dev/pages.getTitles
     *
     * You need the following rights to call this method: pages.
     */
    public String getTitles(VKParameters params) {
        return prepareRequest("getTitles", params).getRequest();
    }

    /**
     * https://vk.com/dev/pages.getVersion
     *
     * This method doesn't require any specific rights.
     */
    public String getVersion(VKParameters params) {
        return prepareRequest("getVersion", params).getRequest();
    }

    /**
     * https://vk.com/dev/pages.parseWiki
     *
     * This method doesn't require any specific rights.
     */
    public String parseWiki(VKParameters params) {
        return prepareRequest("parseWiki", params).getRequest();
    }

    /**
     * https://vk.com/dev/pages.clearCache
     *
     * This is an open method; it does not require an access_token.
     */
    public String clearCache(VKParameters params) {
        return prepareRequest("clearCache", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "pages";
    }
}
