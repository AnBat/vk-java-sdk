package com.batiaev.vk.api;

import com.batiaev.vk.api.consts.VKApiConst;
import com.batiaev.vk.api.system.VkPropertyLoader;
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
import java.nio.file.Files;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

/**
 * @author batiaev
 * Created by batiaev on 7/3/15.
 */
public class VKAuthorization {
    private static final Logger LOG = LogManager.getLogger(VKAuthorization.class);

    private static final String BASE_URL = "https://oauth.vk.com/";
    private static final String vk_api_version = VKApiVersion.Latest;
    private static String vk_user_id = "1";
    private static String vk_user_email = "";
    private static String vk_user_password = "";
    private static String vk_app_id = "";
    private static String vk_secure_code = "";
    private static String vk_access_token = "";

    public VKAuthorization() {
    }

    public static String secureCode() {
        return vk_secure_code;
    }

    public static void setSecureCode(String secureCode) {
        vk_secure_code = secureCode;
    }

    public static String appId() {
        return vk_app_id;
    }

    public static void setAppId(String id) {
        vk_app_id = id;
    }

    public static String userId() {
        return vk_user_id;
    }

    public static void setUserId(String id) {
        vk_user_id = id;
    }

    public static String userEmail() {
        return vk_user_email;
    }

    public static void setUserEmail(String email) {
        vk_user_email = email;
    }

    public static String userPassword() {
        return vk_user_password;
    }

    public static void setUserPassword(String pass) {
        vk_user_password = pass;
    }

    public static String accessToken() {
        return vk_access_token;
    }

    public static void setAccessToken(String accessToken) {
        vk_access_token = accessToken;
    }

    public String serverAuth() {
        String requestUrl = BASE_URL + "access_token?" +
                            "client_id=" + vk_app_id +
                            "&client_secret=" + vk_secure_code +
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
        vk_access_token = obj.getString(VKApiConst.ACCESS_TOKEN);
        LOG.error(responseBody);
        LOG.error(vk_access_token);
        return vk_access_token;
    }

    public String clientAuth() {
        String redirect_uri = BASE_URL + "blank.html";
        String scope = "notify,friends,photos,audio,video,docs,notes,pages,status,offers,questions,wall,groups,messages,email,notifications,stats,ads,offline";
        String display = "popup";
        String response_type = "token";
        String requestUrl = BASE_URL + "authorize?" +
                "client_id=" + vk_app_id +
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

    public static void loadProperties() {
        VkPropertyLoader.loadProperties();

        setUserId(VkPropertyLoader.userId());
        setUserEmail(VkPropertyLoader.userEmail());
        setUserPassword(VkPropertyLoader.userPassword());
        setAppId(VkPropertyLoader.appId());
        setSecureCode(VkPropertyLoader.secureCode());
        setAccessToken(VkPropertyLoader.accessToken());
    }
}
