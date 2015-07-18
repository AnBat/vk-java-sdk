package com.batiaev.vk.api.methods;

import com.batiaev.vk.api.VKParameters;

/**
 * @author batiaev
 * Created by batiaev on 15/04/15.
 *
 * Builds requests for API.orders part
 * 
 * https://vk.com/dev/orders
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */
public class VKApiOrders extends VKApiBase {

    /**
     * https://vk.com/dev/orders.get
     *
     * This is a server method. It may only be called from your server. Read more »
     * This method doesn't require any specific rights. 
     */
    public String get(VKParameters params) {
        return prepareRequest("get", params).getRequest();
    }

    /**
     * https://vk.com/dev/orders.getById
     *
     * This is a server method. It may only be called from your server. Read more »
     * This method doesn't require any specific rights. 
     */
    public String getById(VKParameters params) {
        return prepareRequest("getById", params).getRequest();
    }

    /**
     * https://vk.com/dev/orders.changeState
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
