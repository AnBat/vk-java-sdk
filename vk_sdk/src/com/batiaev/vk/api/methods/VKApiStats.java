package com.batiaev.vk.api.methods;

/**
 * Created by batiaev on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */

import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.VKRequest;

/**
 * @author batiaev
 *
 * Builds requests for API.stats part
 *
 * @see <a href="https://vk.com/dev/stats">API stats</a>
 */
public class VKApiStats extends VKApiBase {

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/stats.get">API stats.get()</a>
     *
     * This method doesn't require any specific rights.
     */
    public String get(VKParameters params) {
        return prepareRequest("get", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/stats.trackVisitor">API stats.trackVisitor()</a>
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
