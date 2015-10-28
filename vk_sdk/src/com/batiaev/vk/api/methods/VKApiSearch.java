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
 * Builds requests for API.search part
 *
 * <a href="https://vk.com/dev/search">API search</a>
 */
public class VKApiSearch extends VKApiBase {

    /**
     * <a href="https://vk.com/dev/search.getHints">API search.getHints()</a>
     *
     * You need the following rights to call this method: friends and groups.
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String getHints(VKParameters params) {
        return execute("getHints", params).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "search";
    }
}
