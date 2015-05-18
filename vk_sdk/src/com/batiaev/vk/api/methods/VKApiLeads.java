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
 * Builds requests for API.leads part
 * 
 * https://vk.com/dev/leads
 */
public class VKApiLeads extends VKApiBase {
	
    /**
     * https://vk.com/dev/leads.complete
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest complete(VKParameters params) {
        return prepareRequest("complete", params);
    }
    
    /**
     * https://vk.com/dev/leads.start
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest start(VKParameters params) {
        return prepareRequest("start", params);
    }

    /**
     * https://vk.com/dev/leads.getStats
     *
     * You need the following rights to call this method: leads.
     */
    public VKRequest getStats(VKParameters params) {
        return prepareRequest("getStats", params);
    }

    /**
     * https://vk.com/dev/leads.getUsers
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest getUsers(VKParameters params) {
        return prepareRequest("getUsers", params);
    }

    /**
     * https://vk.com/dev/leads.checkUser
     *
     * This method doesn't require any specific rights.
     */
    public VKRequest checkUser(VKParameters params) {
        return prepareRequest("checkUser", params);
    }

    /**
     * https://vk.com/dev/leads.metricHit
     *
     * This is an open method; it does not require an access_token.
     */
    public VKRequest metricHit(VKParameters params) {
        return prepareRequest("metricHit", params);
    }

    @Override
    protected String getMethodsGroup() {
        return "leads";
    }
}
