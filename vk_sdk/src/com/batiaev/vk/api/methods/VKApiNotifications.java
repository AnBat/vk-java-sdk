package com.batiaev.vk.api.methods;

/**
 * @author batiaev
 * Created by batiaev on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKParameters;

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
    public String get(VKParameters params) {
        return prepareRequest("get", params).getRequest();
    }
    
    /**
	 * https://vk.com/dev/notifications.markAsViewed
     *
     * You need the following rights to call this method: notifications.
     */
    public String markAsViewed(VKParameters params) {
        return prepareRequest("markAsViewed", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "notifications";
    }
}
