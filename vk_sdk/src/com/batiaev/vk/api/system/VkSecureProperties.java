package com.batiaev.vk.api.system;

/**
 * @author batiaev
 * Created by batiaev on 7/22/15.
 */
public class VkSecureProperties {

    private VkCache cache;

    public VkSecureProperties() {
        cache = new VkCache("secure");
    }

    public String secureCode() {
        return cache.getProperty("vk.app.secure_code");
    }

    public String appId() {
        return cache.getProperty("vk.app.id");
    }

    public String userId() {
        return cache.getProperty("vk.user.id");
    }

    public void setUserId(String id) {
        cache.setProperty("vk.user.id", id);
    }

    public String userEmail() {
        return cache.getProperty("vk.user.email");
    }

    public void setUserEmail(String email) {
        cache.setProperty("vk.user.email", email);
    }

    public String userPassword() {
        return cache.getProperty("vk.user.password");
    }

    public void setUserPassword(String pass) {
        cache.setProperty("vk.user.password", pass);
    }

    public String accessToken() {
        return cache.getProperty("vk.access_token");
    }

    public void setAccessToken(String accessToken) {
        cache.setProperty("vk.access_token", accessToken);
    }
}
