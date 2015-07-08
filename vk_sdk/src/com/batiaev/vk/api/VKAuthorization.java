package com.batiaev.vk.api;

import com.batiaev.vk.api.consts.VKApiConst;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.Properties;

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
        loadProperties();
//        serverAuth();
        clientAuth();
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
        //1. Opening OAuth Authorization Dialog
        //2. Providing Access Permissions
        //3. Receiving "access_token"

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

//        CloseableHttpClient httpclient = HttpClients.createDefault();
//
//        String responseBody = "";
//        ResponseHandler<String> responseHandler = response -> {
//            int status = response.getStatusLine().getStatusCode();
//            System.out.println("## Respond: " + response.toString());
//            if (status >= 200 && status < 300) {
//                HttpEntity entity = response.getEntity();
//                return entity != null ? EntityUtils.toString(entity) : null;
//            } else {
//                throw new ClientProtocolException("Unexpected response status: " + status);
//            }
//        };
//
//        HttpPost post = new HttpPost(requestUrl);
//        String login = null;
//        String pass = null;
//        try {
//            login = URLEncoder.encode(userEmail(), "UTF-8");
//            pass = URLEncoder.encode(userPassword(), "UTF-8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        HttpResponse resp = null;
//        try {
//            responseBody = httpclient.execute(post, responseHandler);
//        } catch (IOException e1) {
//            e1.printStackTrace();
//        }
//        System.out.println("## Request: " + requestUrl);
//        System.out.println("## Respond body: " + responseBody);
//        post.abort();
//        String tempIpH = responseBody.substring(responseBody.indexOf("ip_h") + 6);
//        String tempLgH = responseBody.substring(responseBody.indexOf("lg_h") + 6);
//        String tempTo = responseBody.substring(responseBody.indexOf("name=\"to\"") + 9);
//        String ip_h = tempIpH.substring(tempIpH.indexOf("value=") + 7, tempIpH.indexOf("/>") - 2);
//        String lg_h = tempLgH.substring(tempLgH.indexOf("value=") + 7, tempLgH.indexOf("/>") - 2);
//        String to = tempTo.substring(tempTo.indexOf("value=") + 7, tempTo.indexOf("--\">"));
//        //Second request
//        String postRequest = "https://login.vk.com/?act=login&soft=1&utf8=1&_origin=oauth.vk.com"+
//                "&ip_h"+ip_h+
//                "&lg_h="+lg_h+
//                "&to" + to +
//                "&email="+login+
//                "&pass="+pass;
//        System.out.println(postRequest);
//        post = new HttpPost(postRequest);
//        try {
//            resp = httpclient.execute(post);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("## Respond 2 : " + resp.toString());
//        post.abort();
        return "";
    }

    public void loadProperties() {

        Properties prop = new Properties();
        String propFileName = "secure.properties";

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

        try {
            if (inputStream != null) prop.load(inputStream);
            else throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
        } catch (IOException e) {
            e.printStackTrace();
        }

        setUserId(prop.getProperty("vk.user.id"));
        setUserEmail(prop.getProperty("vk.user.email"));
        setUserPassword(prop.getProperty("vk.user.password"));
        setAppId(prop.getProperty("vk.app.id"));
        setSecureCode(prop.getProperty("vk.app.secure_code"));
        setAccessToken(prop.getProperty("vk.access_token"));
    }
}
