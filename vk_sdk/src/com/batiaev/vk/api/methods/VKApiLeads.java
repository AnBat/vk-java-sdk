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
 * <a href="https://vk.com/dev/leads">API leads</a>
 */
public class VKApiLeads extends VKApiBase {
	
    /**
     * <a href="https://vk.com/dev/leads.complete">API leads.complete()</a>
     *
     * This is an open method; it does not require an access_token.
     * @param params method parameters
     * @return String with json respond
     */
    public String complete(VKParameters params) {
        return prepareRequest("complete", params).getRequest();
    }
    
    /**
     * <a href="https://vk.com/dev/leads.start">API leads.start()</a>
     *
     * This is an open method; it does not require an access_token.
     * @param params method parameters
     * @return String with json respond
     */
    public String start(VKParameters params) {
        return prepareRequest("start", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/leads.getStats">API leads.getStats()</a>
     *
     * You need the following rights to call this method: leads.
     * @param params method parameters
     * @return String with json respond
     */
    public String getStats(VKParameters params) {
        return prepareRequest("getStats", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/leads.getUsers">API leads.getUsers()</a>
     *
     * This is an open method; it does not require an access_token.
     * @param params method parameters
     * @return String with json respond
     */
    public String getUsers(VKParameters params) {
        return prepareRequest("getUsers", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/leads.checkUser">API leads.checkUser()</a>
     *
     * This method doesn't require any specific rights.
     * @param params method parameters
     * @return String with json respond
     */
    public String checkUser(VKParameters params) {
        return prepareRequest("checkUser", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/leads.metricHit">API leads.metricHit()</a>
     *
     * This is an open method; it does not require an access_token.
     * @param params method parameters
     * @return String with json respond
     */
    public String metricHit(VKParameters params) {
        return prepareRequest("metricHit", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "leads";
    }
}
