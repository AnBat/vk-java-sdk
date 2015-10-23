package com.batiaev.vk.api;

import com.batiaev.vk.api.consts.VKApiConst;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

public class VKParameters {
    private HashMap<String, String> values = new HashMap<>();

    public VKParameters() {
        values.put("v", VKApiVersion.v5_34);
        values.put("lang", VKApiLang.en);
        values.put(VKApiConst.ACCESS_TOKEN, VKAuthorization.accessToken());
//        values.put("test_mode", "1");
    }
    public static VKParameters create() {
        return new VKParameters();
    }
    public VKParameters add(String key, String value) {
        values.put(key, value);
        return this;
    }
    public VKParameters add(String key, long value) {
        values.put(key, String.valueOf(value));
        return this;
    }

    public void setValue(String key, String value) {
        values.put(key, value);
    }

    public void setValue(String key, long value) {
        values.put(key, String.valueOf(value));
    }

    public void setValue(String key, int value) {
        values.put(key, String.valueOf(value));
    }

    public void removeValue(String key) {
        values.remove(key);
    }

    public String value(String key) {
        return values.get(key);
    }

    public String toString() {
        final StringBuilder result = new StringBuilder();
        values.keySet().forEach(key -> {
            String value = values.get(key);
            try {
                value = URLEncoder.encode(values.get(key), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            result.append(String.format("%s=%s&", key, value));

        });
        return result.toString().replace(" ", "");
    }
}
