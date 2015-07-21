package com.batiaev.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.VKRequest;

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
     * @return prepared request with full method name and parameters
     */
    protected VKRequest prepareRequest(String methodName, VKParameters methodParameters) {

        VKRequest request = new VKRequest();
        request.setMethodName(getMethodsGroup() + "." + methodName);
        request.setParameters(methodParameters.toString());
        return request;
    }
}
