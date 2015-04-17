package com.vk.api.methods;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.vk.api.VKParameters;
import com.vk.api.VKRequest;

/**
 * Builds requests for API.notifications part
 * 
 * https://vk.com/dev/notifications
 */
public class VKApiNotifications extends VKApiBase {
	
    /**
	 * https://vk.com/dev/notifications.get
     *
     * You need the following rights to call this method: notifications.
     */
    public VKRequest get(VKParameters params) {
        return prepareRequest("get", params);
    }
    
    /**
	 * https://vk.com/dev/notifications.markAsViewed
     *
     * You need the following rights to call this method: notifications.
     */
    public VKRequest markAsViewed(VKParameters params) {
        return prepareRequest("markAsViewed", params);
    }
}
