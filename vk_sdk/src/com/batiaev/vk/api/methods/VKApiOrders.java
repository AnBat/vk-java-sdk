package com.batiaev.vk.api.methods;

import com.batiaev.vk.api.VKParameters;

/**
 * @author batiaev
 * Created by batiaev on 15/04/15.
 *
 * Builds requests for API.orders part
 *
 * <a href="https://vk.com/dev/orders">API orders</a>
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */
public class VKApiOrders extends VKApiBase {

    /**
     * <a href="https://vk.com/dev/orders.get">API orders.get()</a>
     * @param params method parameters
     * @return String with json respond
     *
     * This is a server method. It may only be called from your server. Read more »
     * This method doesn't require any specific rights. 
     */
    public String get(VKParameters params) {
        return prepareRequest("get", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/orders.getById">API orders.getById()</a>
     * @param params method parameters
     * @return String with json respond
     *
     * This is a server method. It may only be called from your server. Read more »
     * This method doesn't require any specific rights. 
     */
    public String getById(VKParameters params) {
        return prepareRequest("getById", params).getRequest();
    }

    /**
     * <a href="https://vk.com/dev/orders.changeState">API orders.changeState()</a>
     * @param params method parameters
     * @return String with json respond
     *
     * This is a server method. It may only be called from your server. Read more »
     * This method doesn't require any specific rights. 
     */
    public String changeState(VKParameters params) {
        return prepareRequest("changeState", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "orders";
    }
}
