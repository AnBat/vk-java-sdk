/*
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk.common;

import com.batiaev.vk.common.consts.VKApiJsonConst;
import com.batiaev.vk.common.entity.VkError;
import com.batiaev.vk.common.system.VkJson2Class;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.IOException;

/**
 * @author batiaev
 * @since 17/04/15
 */
@Slf4j
public class VKRequest {

    //    https://api.vk.com/method/METHOD_NAME?PARAMETERS&access_token=ACCESS_TOKEN
    public final static String BASE_URL = "https://api.vk.com/method/";
    public final static String ACCESS_TOKEN_URL = "https://oauth.vk.com/access_token?";
    public final static String AUTH_URL = "https://oauth.vk.com/authorize?";

    public static VKRequest create() {
        return new VKRequest();
    }

    public String getRequest(String url) {

        String response = doGet(url);
        JSONObject obj = new JSONObject(response);
        if (obj.has(VKApiJsonConst.ERROR)) {
            VkError error = (VkError) VkJson2Class.toClass(obj.getJSONObject(VKApiJsonConst.ERROR), VkError.class);
            if (error != null) log.error("Error respond: " + error.toString());
            return null;
        }
        return response;
    }

    @Deprecated
    public String getRequest(String methodName, String params) {
        String url = BASE_URL + methodName + "?" + params;
        return getRequest(url);
    }

    private String doGet(String url) {
        CloseableHttpClient httpclient = HttpClients.createDefault();

        String responseBody = "";
        try {
            HttpGet httpget = new HttpGet(url);

            log.debug("Executing request " + httpget.getRequestLine());

            // Create a custom response handler
            ResponseHandler<String> responseHandler = response -> {
                int statusCode = response.getStatusLine().getStatusCode();
                String result = null;
                if (statusCode >= 200 && statusCode < 300) {
                    HttpEntity entity = response.getEntity();
                    if (entity != null) result = EntityUtils.toString(entity);
                } else log.error("Cannot get information from VK.com or problems in protocol\n");
                return result;
            };
            responseBody = httpclient.execute(httpget, responseHandler);
        } catch (IOException e) {
            log.error("Cannot get information from VK.com\n");
            e.printStackTrace();
        } finally {
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return responseBody;
    }
}
