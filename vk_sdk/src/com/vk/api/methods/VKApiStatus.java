package com.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.vk.api.VKParameters;
import com.vk.api.VKRequest;

/**
 * Builds requests for API.status part
 * 
 * https://vk.com/dev/status
 */
public class VKApiStatus extends VKApiBase {
	
    /**
     * https://vk.com/dev/status.get
     *
     * You need the following rights to call this method: status. (Read more on rights)
     */
    public VKRequest get(VKParameters params) {
        return prepareRequest("get", params);
    }
    
    /**
     * https://vk.com/dev/status.set
     *
     * You need the following rights to call this method: status. (Read more on rights)
     * This method is available only to standalone-applications. 
     */
    public VKRequest set(VKParameters params) {
        return prepareRequest("set", params);
    }
}
