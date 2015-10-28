package com.batiaev.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.VKRequest;
import com.batiaev.vk.api.consts.VKApiConst;
import com.batiaev.vk.api.consts.VKApiJsonConst;
import com.batiaev.vk.api.dataTypes.VKMessageList;
import org.json.JSONObject;

/**
 * Basic class for all API-requests builders (parts)
 */
public abstract class VKApiBase {

    /**
     * @return name of methods group
     */
    protected abstract String getMethodsGroup();

    /**
     * @param methodName method name in currect group
     * @param methodParameters method parameters required for method
     * @return respond json object or null if any error
     */
    protected JSONObject execute(String methodName, VKParameters methodParameters) {
        String respond = VKRequest.create().getRequest(getMethodsGroup() + "." + methodName, methodParameters.toString());
        if (respond == null) return null;

        JSONObject obj = new JSONObject(respond);
        return obj.getJSONObject(VKApiJsonConst.RESPONSE);
    }

    /**
     * @param methodName method name in currect group
     * @param methodParameters method parameters required for method
     * @return respond string with raw json
     */
    protected String executeRaw(String methodName, VKParameters methodParameters) {
        return VKRequest.create().getRequest(getMethodsGroup() + "." + methodName, methodParameters.toString());
    }
}
