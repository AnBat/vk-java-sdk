package com.batyaev.vk.api.methods;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batyaev.vk.api.VKParameters;
import com.batyaev.vk.api.VKRequest;

/**
 * Builds requests for API.search part
 * 
 * https://vk.com/dev/search
 */
public class VKApiSearch extends VKApiBase {

    /**
     * https://vk.com/dev/search.getHints
     *
     * You need the following rights to call this method: friends and groups.
     * This method is available only to standalone-applications.
     */
    public VKRequest getHints(VKParameters params) {
        return prepareRequest("getHints", params);
    }

    @Override
    protected String getMethodsGroup() {
        return "search";
    }
}
