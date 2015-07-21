package com.batiaev.vk.api.methods;

/**
 * Created by batiaev on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */

import com.batiaev.vk.api.VKParameters;

/**
 * @author batiaev
 *
 * Builds requests for API.pages part
 *
 * @see <a href="https://vk.com/dev/pages">API pages</a>
 */
public class VKApiPages extends VKApiBase {

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/pages.get">API pages.get()</a>
     *
     * You need the following rights to call this method: pages.
     */
    public String get(VKParameters params) {
        return prepareRequest("get", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/pages.save">API pages.save()</a>
     *
     * You need the following rights to call this method: pages.
     */
    public String save(VKParameters params) {
        return prepareRequest("save", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/pages.saveAccess">API pages.saveAccess()</a>
     *
     * You need the following rights to call this method: pages.
     */
    public String saveAccess(VKParameters params) {
        return prepareRequest("saveAccess", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/pages.getHistory">API pages.getHistory()</a>
     *
     * You need the following rights to call this method: pages.
     */
    public String getHistory(VKParameters params) {
        return prepareRequest("getHistory", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/pages.getTitles">API pages.getTitles()</a>
     *
     * You need the following rights to call this method: pages.
     */
    public String getTitles(VKParameters params) {
        return prepareRequest("getTitles", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/pages.getVersion">API pages.getVersion()</a>
     *
     * This method doesn't require any specific rights.
     */
    public String getVersion(VKParameters params) {
        return prepareRequest("getVersion", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/pages.parseWiki">API pages.parseWiki()</a>
     *
     * This method doesn't require any specific rights.
     */
    public String parseWiki(VKParameters params) {
        return prepareRequest("parseWiki", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/pages.clearCache">API pages.clearCache()</a>
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
