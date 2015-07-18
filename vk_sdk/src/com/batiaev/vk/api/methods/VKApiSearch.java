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
 * Builds requests for API.search part
 * 
 * https://vk.com/dev/search
 */
public class VKApiSearch extends VKApiBase {

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/search.getHints
     *
     * You need the following rights to call this method: friends and groups.
     * This method is available only to standalone-applications.
     */
    public String getHints(VKParameters params) {
        return prepareRequest("getHints", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "search";
    }
}
