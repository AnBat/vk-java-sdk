/*
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk.api;

import com.batiaev.vk.common.VKParameters;

/**
 * Builds requests for API.leads part
 * <p>
 * <a href="https://vk.com/dev/leads">API leads</a>
 *
 * @author batiaev
 * @since 17/04/15
 */
public class VKApiLeads extends VKApiBase {

    /**
     * <a href="https://vk.com/dev/leads.complete">API leads.complete()</a>
     * <p>
     * This is an open method; it does not require an access_token.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String complete(VKParameters params) {
        return execute(getUrl("complete", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/leads.start">API leads.start()</a>
     * <p>
     * This is an open method; it does not require an access_token.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String start(VKParameters params) {
        return execute(getUrl("start", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/leads.getStats">API leads.getStats()</a>
     * <p>
     * You need the following rights to call this method: leads.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String getStats(VKParameters params) {
        return execute(getUrl("getStats", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/leads.getUsers">API leads.getUsers()</a>
     * <p>
     * This is an open method; it does not require an access_token.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String getUsers(VKParameters params) {
        return execute(getUrl("getUsers", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/leads.checkUser">API leads.checkUser()</a>
     * <p>
     * This method doesn't require any specific rights.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String checkUser(VKParameters params) {
        return execute(getUrl("checkUser", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/leads.metricHit">API leads.metricHit()</a>
     * <p>
     * This is an open method; it does not require an access_token.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String metricHit(VKParameters params) {
        return execute(getUrl("metricHit", params)).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "leads";
    }
}
