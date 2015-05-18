package com.batiaev.vk.api.methods;

/**
 * Created by anton on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.VKRequest;

/**
 * Builds requests for API.orders part
 * 
 * https://vk.com/dev/orders
 */
public class VKApiOrders extends VKApiBase {

    /**
     * https://vk.com/dev/orders.get
     *
     * This is a server method. It may only be called from your server. Read more »
     * This method doesn't require any specific rights. 
     */
    public VKRequest get(VKParameters params) {
        return prepareRequest("get", params);
    }

    /**
     * https://vk.com/dev/orders.getById
     *
     * This is a server method. It may only be called from your server. Read more »
     * This method doesn't require any specific rights. 
     */
    public VKRequest getById(VKParameters params) {
        return prepareRequest("getById", params);
    }

    /**
     * https://vk.com/dev/orders.changeState
     *
     * This is a server method. It may only be called from your server. Read more »
     * This method doesn't require any specific rights. 
     */
    public VKRequest changeState(VKParameters params) {
        return prepareRequest("changeState", params);
    }

    @Override
    protected String getMethodsGroup() {
        return "orders";
    }
}
