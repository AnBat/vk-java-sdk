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
     * <a href="https://vk.com/dev/pages.get">API pages.get()</a>
     * @param params method parameters
     * @return String with json respond
     *
     * You need the following rights to call this method: pages.
     */
    public String get(VKParameters params) {
        return execute("get", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/pages.save">API pages.save()</a>
     * @param params method parameters
     * @return String with json respond
     *
     * You need the following rights to call this method: pages.
     */
    public String save(VKParameters params) {
        return execute("save", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/pages.saveAccess">API pages.saveAccess()</a>
     * @param params method parameters
     * @return String with json respond
     *
     * You need the following rights to call this method: pages.
     */
    public String saveAccess(VKParameters params) {
        return execute("saveAccess", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/pages.getHistory">API pages.getHistory()</a>
     * @param params method parameters
     * @return String with json respond
     *
     * You need the following rights to call this method: pages.
     */
    public String getHistory(VKParameters params) {
        return execute("getHistory", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/pages.getTitles">API pages.getTitles()</a>
     * @param params method parameters
     * @return String with json respond
     *
     * You need the following rights to call this method: pages.
     */
    public String getTitles(VKParameters params) {
        return execute("getTitles", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/pages.getVersion">API pages.getVersion()</a>
     * @param params method parameters
     * @return String with json respond
     *
     * This method doesn't require any specific rights.
     */
    public String getVersion(VKParameters params) {
        return execute("getVersion", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/pages.parseWiki">API pages.parseWiki()</a>
     * @param params method parameters
     * @return String with json respond
     *
     * This method doesn't require any specific rights.
     */
    public String parseWiki(VKParameters params) {
        return execute("parseWiki", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/pages.clearCache">API pages.clearCache()</a>
     * @param params method parameters
     * @return String with json respond
     *
     * This is an open method; it does not require an access_token.
     */
    public String clearCache(VKParameters params) {
        return execute("clearCache", params).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "pages";
    }
}
