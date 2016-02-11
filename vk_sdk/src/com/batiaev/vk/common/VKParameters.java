package com.batiaev.vk.common;

import com.batiaev.vk.common.consts.VKApiConst;

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

    public VKParameters(boolean withToken) {
        init(withToken);
    }

    public VKParameters() {
        init(true);
    }

    private void init(boolean withToken) {
        values.put("v", VKApiVersion.v5_34);
        values.put("lang", VKApiLang.en);
        if (withToken) values.put(VKApiConst.ACCESS_TOKEN, VKAuthorization.accessToken());
//        values.put("test_mode", "1");
    }

    public static VKParameters create(boolean withToken) {
        return new VKParameters(withToken);
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
                value = URLEncoder.encode(value, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            result.append(String.format("%s=%s&", key, value));
        });
        return result.toString().replace(" ", "");
    }
}
