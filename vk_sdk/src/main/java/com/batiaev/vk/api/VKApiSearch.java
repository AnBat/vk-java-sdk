/*
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk.api;

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.consts.VkApiMethods;

/**
 * Builds requests for API.search part
 * <p>
 * <a href="https://vk.com/dev/search">API search</a>
 *
 * @author batiaev
 * @since 17/04/15
 */
public class VKApiSearch extends VKApiBase {

    /**
     * <a href="https://vk.com/dev/search.getHints">API search.getHints()</a>
     * <p>
     * You need the following rights to call this method: friends and groups.
     * This method is available only to standalone-applications.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String getHints(VKParameters params) {
        return execute(getUrl("getHints", params)).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return VkApiMethods.SEARCH;
    }
}
