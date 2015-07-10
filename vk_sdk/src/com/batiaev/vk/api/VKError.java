package com.batiaev.vk.api;

import java.util.HashMap;

/**
 * Created by anton on 19/05/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */
public class VKError {
    public int error_code;
    public String error_msg;
    public HashMap<String, String> request_params;

    public VKError() {
        error_code = 0;
        error_msg = "";
        request_params = new HashMap<>();
    }

    @Override
    public String toString() {
        return error_code + " " + error_msg + " " + request_params.toString();
    }
}
