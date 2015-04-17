package com.vk.api.methods;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;

/**
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
    public VKRequest get(VKParameters params) {
        return prepareRequest("get", params);
    }

    /**
     * https://vk.com/dev/stats.trackVisitor
     *
     * This method is available only to standalone-applications.
     */
    public VKRequest trackVisitor(VKParameters params) {
        return prepareRequest("trackVisitor", params);
    }
}
