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
     * <a href="https://vk.com/dev/notifications.get">API notifications.get()</a>
     *
     * You need the following rights to call this method: notifications.
     * @param params method parameters
     * @return String with json respond
     */
    public String get(VKParameters params) {
        return execute("get", params).toString();
    }
    
    /**
     * <a href="https://vk.com/dev/notifications.markAsViewed">API notifications.markAsViewed()</a>
     *
     * You need the following rights to call this method: notifications.
     * @param params method parameters
     * @return String with json respond
     */
    public String markAsViewed(VKParameters params) {
        return execute("markAsViewed", params).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "notifications";
    }
}
