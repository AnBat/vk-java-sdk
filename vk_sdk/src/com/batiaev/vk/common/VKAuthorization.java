package com.batiaev.vk.common;

import com.batiaev.vk.common.consts.VKApiConst;
import com.batiaev.vk.common.system.VkCache;
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

import java.awt.*;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author batiaev
 * Created by batiaev on 7/3/15.
 */
public class VKAuthorization {
    private static final Logger LOG = LogManager.getLogger(VKAuthorization.class);

    private static final String BASE_URL = "https://oauth.vk.com/";
    private static final String vk_api_version = VKApiVersion.Latest;
    private static VkCache cache;

    public static String secureCode() {
        if (cache == null) loadCache();
        return cache.getProperty("vk.app.secure_code");
    }

    public static String appId() {
        if (cache == null) loadCache();
        return cache.getProperty("vk.app.id");
    }

    public static String userId() {
        if (cache == null) loadCache();
        return cache.getProperty("vk.user.id");
    }

    public static String userEmail() {
        if (cache == null) loadCache();
        return cache.getProperty("vk.user.email");
    }

    public static String userPassword() {
        if (cache == null) loadCache();
        return cache.getProperty("vk.user.password");
    }

    public static String accessToken() {
        if (cache == null) loadCache();
        return cache.getProperty("vk.access_token");
    }

    public String serverAuth() {
        if (cache == null) loadCache();

        String requestUrl = BASE_URL + "access_token?" +
                            "client_id=" + cache.getProperty("vk.app.id") +
                            "&client_secret=" + cache.getProperty("vk.app.secure_code") +
                            "&v=" + vk_api_version +
                            "&grant_type=client_credentials";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String responseBody = "";
        ResponseHandler<String> responseHandler = response -> {
            int status = response.getStatusLine().getStatusCode();
            if (status >= 200 && status < 300) {
                HttpEntity entity = response.getEntity();
                return entity != null ? EntityUtils.toString(entity) : null;
            } else {
                throw new ClientProtocolException("Unexpected response status: " + status);
            }
        };
        HttpGet httpget = new HttpGet(requestUrl);

        LOG.info("Executing request: " + httpget.getRequestLine());
        try {
            responseBody = httpclient.execute(httpget, responseHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }

        JSONObject obj = new JSONObject(responseBody);
        cache.setProperty("vk.access_token", obj.getString(VKApiConst.ACCESS_TOKEN));
        LOG.error(responseBody + "\n" + cache.getProperty("vk.access_token"));
        return cache.getProperty("vk.access_token");
    }

    public String clientAuth() {
        String redirect_uri = BASE_URL + "blank.html";
        String scope = "notify,friends,photos,audio,video,docs,notes,pages,status,offers,questions,wall,groups,messages,email,notifications,stats,ads,offline";
        String display = "popup";
        String response_type = "token";
        String requestUrl = BASE_URL + "authorize?" +
                "client_id=" + cache.getProperty("vk.app.id") +
                "&scope=" + scope +
                "&redirect_uri=" + redirect_uri +
                "&display=" + display +
                "&v=" + vk_api_version +
                "&response_type=" + response_type;

        //open default browser
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI(requestUrl));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        } else {
            Runtime runtime = Runtime.getRuntime();
            try {
                runtime.exec("xdg-open " + requestUrl);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    public static void loadCache() {
        cache = new VkCache("secure");
    }
}
