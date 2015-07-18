package com.batiaev.vk.api.methods;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKParameters;

/**
 * @author batiaev
 *
 * Builds requests for API.leads part
 * 
 * https://vk.com/dev/leads
 */
public class VKApiLeads extends VKApiBase {
	
    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/leads.complete
     *
     * This is an open method; it does not require an access_token.
     */
    public String complete(VKParameters params) {
        return prepareRequest("complete", params).getRequest();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/leads.start
     *
     * This is an open method; it does not require an access_token.
     */
    public String start(VKParameters params) {
        return prepareRequest("start", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/leads.getStats
     *
     * You need the following rights to call this method: leads.
     */
    public String getStats(VKParameters params) {
        return prepareRequest("getStats", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/leads.getUsers
     *
     * This is an open method; it does not require an access_token.
     */
    public String getUsers(VKParameters params) {
        return prepareRequest("getUsers", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/leads.checkUser
     *
     * This method doesn't require any specific rights.
     */
    public String checkUser(VKParameters params) {
        return prepareRequest("checkUser", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/leads.metricHit
     *
     * This is an open method; it does not require an access_token.
     */
    public String metricHit(VKParameters params) {
        return prepareRequest("metricHit", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "leads";
    }
}
