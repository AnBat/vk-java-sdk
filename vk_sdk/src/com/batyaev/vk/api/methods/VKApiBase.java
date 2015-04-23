package com.batyaev.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batyaev.vk.api.VKParameters;
import com.batyaev.vk.api.VKRequest;

/**
 * Basic class for all API-requests builders (parts)
 */
public abstract class VKApiBase {

    protected abstract String getMethodsGroup();

    protected VKRequest prepareRequest(String methodName, VKParameters methodParameters) {
        VKRequest request = new VKRequest();
        request.setMethodName(getMethodsGroup() + "." + methodName);
        request.setParameters(methodParameters.toString());
        return request;
    }
}
