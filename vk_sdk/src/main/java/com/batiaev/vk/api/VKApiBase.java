/*
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk.api;

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.VKRequest;
import com.batiaev.vk.common.consts.VKApiJsonConst;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;

/**
 * Basic class for all API-requests builders (parts)*
 *
 * @author batiaev
 * @since 15/04/15
 */
public abstract class VKApiBase {

    private static final Logger LOG = LogManager.getLogger(VKApiBase.class);
    /**
     * Contain name of methods groups like friends, messages, etc
     */
    protected String methodsGroup = "";

    /**
     * user methodsGroup
     *
     * @return name of methods group
     */
    protected String getMethodsGroup() {
        return methodsGroup;
    }

    /**
     * @param url api url for get request
     * @return respond json object or null if any error
     */
    protected JSONObject execute(String url) {
        LOG.debug("Execute " + url);

        String respond = VKRequest.create().getRequest(url);
        if (respond == null) return null;

        JSONObject obj = new JSONObject(respond);
        return obj.getJSONObject(VKApiJsonConst.RESPONSE);
    }

    /**
     * @param url api url for get request
     * @return respond string with raw json
     */
    protected String executeRaw(String url) {
        return VKRequest.create().getRequest(url);
    }

    protected String getUrl(String methodName, VKParameters methodParameters) {
        return VKRequest.BASE_URL + getMethodsGroup() + "." + methodName + "?" + methodParameters.toString();
    }
}
