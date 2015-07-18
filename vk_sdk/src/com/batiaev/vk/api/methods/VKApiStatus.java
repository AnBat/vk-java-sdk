package com.batiaev.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKParameters;

/**
 * @author batiaev
 *
 * Builds requests for API.status part
 * 
 * https://vk.com/dev/status
 */
public class VKApiStatus extends VKApiBase {
	
    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/status.get
     *
     * You need the following rights to call this method: status. (Read more on rights)
     */
    public String get(VKParameters params) {
        return prepareRequest("get", params).getRequest();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/status.set
     *
     * You need the following rights to call this method: status. (Read more on rights)
     * This method is available only to standalone-applications. 
     */
    public String set(VKParameters params) {
        return prepareRequest("set", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "status";
    }
}
