package com.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.vk.api.VKParameters;
import com.vk.api.VKRequest;

import java.util.Locale;

/**
 * Basic class for all API-requests builders (parts)
 */
public abstract class VKApiBase {
    /**
     * Selected methods group
     */

    protected abstract String getMethodsGroup();

    protected VKRequest prepareRequest(String methodName, VKParameters methodParameters) {
        return prepareRequest(methodName, methodParameters, VKRequest.HttpMethod.GET);
    }

    protected VKRequest prepareRequest(String methodName, VKParameters methodParameters,
                             VKRequest.HttpMethod httpMethod) {
        return prepareRequest(methodName, methodParameters, httpMethod, (VKParser)null);
    }

    protected VKRequest prepareRequest(String methodName, VKParameters methodParameters,
                             VKRequest.HttpMethod httpMethod,
                             Class<? extends VKApiModel> modelClass) {
        return new VKRequest(String.format(Locale.US, "%s.%s", getMethodsGroup(), methodName),
                methodParameters, httpMethod, modelClass);
    }
    protected VKRequest prepareRequest(String methodName, VKParameters methodParameters,
                             VKRequest.HttpMethod httpMethod,
                             VKParser responseParser) {
        VKRequest result = new VKRequest(String.format(Locale.US, "%s.%s", getMethodsGroup(), methodName),
                methodParameters, httpMethod);
        result.setResponseParser(responseParser);
        return result;
    }


}
