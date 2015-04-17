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
 * Builds requests for API.widgets part
 * 
 * https://vk.com/dev/widgets
 */
public class VKApiWidgets extends VKApiBase {
	
    /**
     * https://vk.com/dev/widgets.getComments
     *
     * This is an open method; it does not require an access_token. 
     */
    public VKRequest getComments(VKParameters params) {
        return prepareRequest("getComments", params);
    }

    /**
     * https://vk.com/dev/widgets.getPages
     *
     * This is an open method; it does not require an access_token. 
     */
    public VKRequest getPages(VKParameters params) {
        return prepareRequest("getPages", params);
    }

}
