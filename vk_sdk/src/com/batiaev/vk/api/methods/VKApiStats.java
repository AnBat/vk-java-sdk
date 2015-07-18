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
 * @author batiaev
 *
 * Builds requests for API.stats part
 * 
 * https://vk.com/dev/stats
 */
public class VKApiStats extends VKApiBase {

    /**
     * https://vk.com/dev/stats.get
     *
     * This method doesn't require any specific rights.
     */
    public String get(VKParameters params) {
        return prepareRequest("get", params).getRequest();
    }

    /**
     * https://vk.com/dev/stats.trackVisitor
     *
     * This method is available only to standalone-applications.
     */
    public String trackVisitor(VKParameters params) {
        return prepareRequest("trackVisitor", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "stats";
    }
}
