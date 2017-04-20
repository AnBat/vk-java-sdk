/*
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk.api;

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.consts.VkApiMethods;

/**
 * Builds requests for API.orders part
 * <p>
 * <a href="https://vk.com/dev/orders">API orders</a>
 *
 * @author batiaev
 * @since 15/04/15
 */
public class VKApiOrders extends VKApiBase {

    /**
     * <a href="https://vk.com/dev/orders.get">API orders.get()</a>
     *
     * @param params method parameters
     * @return String with json respond
     * <p>
     * This is a server method. It may only be called from your server. Read more »
     * This method doesn't require any specific rights.
     */
    public String get(VKParameters params) {
        return execute(getUrl(VkApiMethods.GET, params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/orders.getById">API orders.getById()</a>
     *
     * @param params method parameters
     * @return String with json respond
     * <p>
     * This is a server method. It may only be called from your server. Read more »
     * This method doesn't require any specific rights.
     */
    public String getById(VKParameters params) {
        return execute(getUrl(VkApiMethods.GET_BY_ID, params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/orders.changeState">API orders.changeState()</a>
     *
     * @param params method parameters
     * @return String with json respond
     * <p>
     * This is a server method. It may only be called from your server. Read more »
     * This method doesn't require any specific rights.
     */
    public String changeState(VKParameters params) {
        return execute(getUrl("changeState", params)).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "orders";
    }
}
