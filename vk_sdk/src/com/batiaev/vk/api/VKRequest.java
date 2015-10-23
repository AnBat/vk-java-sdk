package com.batiaev.vk.api;

import com.batiaev.vk.api.consts.VKApiJsonConst;
import com.batiaev.vk.api.system.VkJsonParser;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;

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
    public String method_name;
    public String parameters;
    public final static String BASE_URL = "https://api.vk.com/method/";
    public final static String ACCESS_TOKEN_URL = "https://oauth.vk.com/access_token?";
    public final static String AUTH_URL = "https://oauth.vk.com/authorize?";

    public void setMethodName(String methodName) {
        method_name = methodName;
    }

    public void setParameters(String params) {
        parameters = params;
    }

    public static VKRequest create() {
        return new VKRequest();
    }
    public String getRequest(String methodName, String params) {
//        https://hc.apache.org/httpcomponents-client-4.4.x/httpclient/examples/org/apache/http/examples/client/ClientWithResponseHandler.java /
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String responseBody = "";
        try {
            HttpGet httpget = new HttpGet(BASE_URL + methodName + "?" + params);

            LOG.debug("Executing request " + httpget.getRequestLine());

            // Create a custom response handler
            ResponseHandler<String> responseHandler = response -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 300) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    throw new ClientProtocolException("Unexpected response status: " + status);
                }
            };
            responseBody = httpclient.execute(httpget, responseHandler);
        } catch (ClientProtocolException e) {
            LOG.error("Cannot get information from VK.com or problems in protocol\n");
            e.printStackTrace();
        } catch (IOException e) {
            LOG.error("Cannot get information from VK.com\n");
            e.printStackTrace();
        } finally {
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        JSONObject obj = new JSONObject(responseBody);
        if (obj.has(VKApiJsonConst.ERROR)) {
            VKError error = VkJsonParser.parseError(obj.getJSONObject(VKApiJsonConst.ERROR));
            LOG.error("Error respond: " + error.toString());
            return null;
        }
        return responseBody;
    }

    @Deprecated
    public String getRequest() {
        return getRequest(method_name, parameters);
    }
}
