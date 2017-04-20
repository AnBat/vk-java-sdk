/*
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk.api;

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.consts.VkApiMethods;

/**
 * Builds requests for API.notifications part
 * <p>
 * https://vk.com/dev/notifications
 *
 * @author batiaev
 * @since 17/04/15
 */
public class VKApiNotifications extends VKApiBase {

    /**
     * <a href="https://vk.com/dev/notifications.get">API notifications.get()</a>
     * <p>
     * You need the following rights to call this method: notifications.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String get(VKParameters params) {
        return execute(getUrl(VkApiMethods.GET, params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/notifications.markAsViewed">API notifications.markAsViewed()</a>
     * <p>
     * You need the following rights to call this method: notifications.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String markAsViewed(VKParameters params) {
        return execute(getUrl("markAsViewed", params)).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "notifications";
    }
}
