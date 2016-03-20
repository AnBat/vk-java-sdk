package com.batiaev.vk.api;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.VKRequest;
import com.batiaev.vk.common.consts.VKApiJsonConst;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;

/**
 * Basic class for all API-requests builders (parts)
 */
public abstract class VKApiBase {

    private static final Logger LOG = LogManager.getLogger(VKApiBase.class);
    /**
     * Contain name of methods groups like friends, messages, etc
     */
    protected String methodsGroup = "";
    /**
     * user methodsGroup
     * @return name of methods group
     */
    protected String getMethodsGroup() {
        return methodsGroup;
    }

    /**
     * @param methodName method name in currect group
     * @param methodParameters method parameters required for method
     * @return respond json object or null if any error
     */
    @Deprecated
    protected JSONObject execute(String methodName, VKParameters methodParameters) {
        String url = getUrl(methodName, methodParameters);
        return execute(url);
    }

    protected JSONObject execute(String url) {
        LOG.debug("Execute " + url);

        String respond = VKRequest.create().getRequest(url);
        if (respond == null) return null;

        JSONObject obj = new JSONObject(respond);
        return obj.getJSONObject(VKApiJsonConst.RESPONSE);
    }

    /**
     * @param methodName method name in currect group
     * @param methodParameters method parameters required for method
     * @return respond string with raw json
     */
    @Deprecated
    protected String executeRaw(String methodName, VKParameters methodParameters) {
        return VKRequest.create().getRequest(getMethodsGroup() + "." + methodName, methodParameters.toString());
    }

    protected String executeRaw(String url) {
        return VKRequest.create().getRequest(url);
    }

    protected String getUrl(String methodName, VKParameters methodParameters) {
        return VKRequest.BASE_URL + getMethodsGroup() + "." + methodName + "?" + methodParameters.toString();
    }
}
