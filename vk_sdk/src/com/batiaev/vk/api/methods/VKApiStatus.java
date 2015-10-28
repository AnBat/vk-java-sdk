package com.batiaev.vk.api.methods;

/**
 * Created by batiaev on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */

import com.batiaev.vk.api.VKParameters;

/**
 * @author batiaev
 *
 * Builds requests for API.status part
 *
 * <a href="https://vk.com/dev/status">API status</a>
 */
public class VKApiStatus extends VKApiBase {
	
    /**
     * <a href="https://vk.com/dev/status.get">API status.get()</a>
     *
     * You need the following rights to call this method: status. (Read more on rights)
     * @param params method parameters
     * @return String with json respond
     */
    public String get(VKParameters params) {
        return execute("get", params).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/status.set">API status.set()</a>
     *
     * You need the following rights to call this method: status. (Read more on rights)
     * This method is available only to standalone-applications.
     * @param params method parameters
     * @return String with json respond
     */
    public String set(VKParameters params) {
        return execute("set", params).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "status";
    }
}
