package com.batyaev.vk.api;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

public class VKRequest {

    private static final Logger LOG = LogManager.getLogger(VKRequest.class);
    //    https://api.vk.com/method/METHOD_NAME?PARAMETERS&access_token=ACCESS_TOKEN
    public String access_token;
    public String method_name;
    public String parameters;
    public final static String BASE_URL = "https://api.vk.com/method/";

    public void setAccessToken(String accessToken) {
        access_token = accessToken;
    }

    public void setMethodName(String methodName) {
        method_name = methodName;
    }

    public void setParameters(String params) {
        parameters = params;
    }

    public String getRequest(String methodName, String params) throws IOException {
        method_name = methodName;
        parameters = params;
        return getRequest();
    }

    public String getRequest() throws IOException {
//        https://hc.apache.org/httpcomponents-client-4.4.x/httpclient/examples/org/apache/http/examples/client/ClientWithResponseHandler.java /
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String responseBody = "";
        try {
            HttpGet httpget = new HttpGet(BASE_URL + method_name + "?" + parameters);

            LOG.info("Executing request " + httpget.getRequestLine());

            // Create a custom response handler
            ResponseHandler<String> responseHandler = new ResponseHandler<String>() {

                @Override
                public String handleResponse(
                        final HttpResponse response) throws IOException {
                    int status = response.getStatusLine().getStatusCode();
                    if (status >= 200 && status < 300) {
                        HttpEntity entity = response.getEntity();
                        return entity != null ? EntityUtils.toString(entity) : null;
                    } else {
                        throw new ClientProtocolException("Unexpected response status: " + status);
                    }
                }

            };
            responseBody = httpclient.execute(httpget, responseHandler);
        } finally {
            httpclient.close();
        }

        return responseBody;
    }

    public String postRequest(String methodName, String params) throws IOException {
        method_name = methodName;
        parameters = params;
        return postRequest();
    }

    public String postRequest() throws IOException {

        return "";
    }
}
