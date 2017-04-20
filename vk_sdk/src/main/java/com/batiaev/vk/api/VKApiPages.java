/*
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk.api;

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.consts.VkApiMethods;

/**
 * Builds requests for API.pages part
 *
 * @author batiaev
 * @see <a href="https://vk.com/dev/pages">API pages</a>
 * @since 17/04/15
 */
public class VKApiPages extends VKApiBase {

    /**
     * <a href="https://vk.com/dev/pages.get">API pages.get()</a>
     *
     * @param params method parameters
     * @return String with json respond
     * <p>
     * You need the following rights to call this method: pages.
     */
    public String get(VKParameters params) {
        return execute(getUrl(VkApiMethods.GET, params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/pages.save">API pages.save()</a>
     *
     * @param params method parameters
     * @return String with json respond
     * <p>
     * You need the following rights to call this method: pages.
     */
    public String save(VKParameters params) {
        return execute(getUrl(VkApiMethods.SAVE, params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/pages.saveAccess">API pages.saveAccess()</a>
     *
     * @param params method parameters
     * @return String with json respond
     * <p>
     * You need the following rights to call this method: pages.
     */
    public String saveAccess(VKParameters params) {
        return execute(getUrl("saveAccess", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/pages.getHistory">API pages.getHistory()</a>
     *
     * @param params method parameters
     * @return String with json respond
     * <p>
     * You need the following rights to call this method: pages.
     */
    public String getHistory(VKParameters params) {
        return execute(getUrl(VkApiMethods.GET_HISTORY, params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/pages.getTitles">API pages.getTitles()</a>
     *
     * @param params method parameters
     * @return String with json respond
     * <p>
     * You need the following rights to call this method: pages.
     */
    public String getTitles(VKParameters params) {
        return execute(getUrl("getTitles", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/pages.getVersion">API pages.getVersion()</a>
     *
     * @param params method parameters
     * @return String with json respond
     * <p>
     * This method doesn't require any specific rights.
     */
    public String getVersion(VKParameters params) {
        return execute(getUrl("getVersion", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/pages.parseWiki">API pages.parseWiki()</a>
     *
     * @param params method parameters
     * @return String with json respond
     * <p>
     * This method doesn't require any specific rights.
     */
    public String parseWiki(VKParameters params) {
        return execute(getUrl("parseWiki", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/pages.clearCache">API pages.clearCache()</a>
     *
     * @param params method parameters
     * @return String with json respond
     * <p>
     * This is an open method; it does not require an access_token.
     */
    public String clearCache(VKParameters params) {
        return execute(getUrl("clearCache", params)).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "pages";
    }
}
