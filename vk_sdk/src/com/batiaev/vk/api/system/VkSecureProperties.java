package com.batiaev.vk.api.system;

import java.io.File;

/**
 * @author batiaev
 * Created by batiaev on 7/22/15.
 */
public class VkSecureProperties extends VkPropertyLoader {

    public VkSecureProperties() {
        setPropertyFileName("secure");
    }
    public String secureCode() {
        return getProperty("vk.app.secure_code");
    }

    public void setSecureCode(String secureCode) {
        setProperty("vk.app.secure_code", secureCode);
    }

    public String appId() {
        return getProperty("vk.app.id");
    }

    public void setAppId(String id) {
        setProperty("vk.app.id", id);
    }

    public String userId() {
        return getProperty("vk.user.id");
    }

    public void setUserId(String id) {
        setProperty("vk.user.id", id);
    }

    public String userEmail() {
        return getProperty("vk.user.email");
    }

    public void setUserEmail(String email) {
        setProperty("vk.user.email", email);
    }

    public String userPassword() {
        return getProperty("vk.user.password");
    }

    public void setUserPassword(String pass) {
        setProperty("vk.user.password", pass);
    }

    public String accessToken() {
        return getProperty("vk.access_token");
    }

    public void setAccessToken(String accessToken) {
        setProperty("vk.access_token", accessToken);
    }
}
