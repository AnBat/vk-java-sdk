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
 * Builds requests for API.widgets part
 * 
 * https://vk.com/dev/widgets
 */
public class VKApiWidgets extends VKApiBase {
	
    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/widgets.getComments
     *
     * This is an open method; it does not require an access_token. 
     */
    public String getComments(VKParameters params) {
        return prepareRequest("getComments", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * https://vk.com/dev/widgets.getPages
     *
     * This is an open method; it does not require an access_token. 
     */
    public String getPages(VKParameters params) {
        return prepareRequest("getPages", params).getRequest();
    }

    @Override
    protected String getMethodsGroup() {
        return "widgets";
    }

}
