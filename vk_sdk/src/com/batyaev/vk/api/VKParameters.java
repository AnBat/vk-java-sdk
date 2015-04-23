package com.batyaev.vk.api;

import java.util.HashMap;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

public class VKParameters {
    public HashMap<String, String> values = new HashMap<String, String>();

    public String toString() {
        String result = "";
        for (String key : values.keySet()) {
            result += key + "=" + values.get(key) + "&";
        }
        return result;
    }
}
