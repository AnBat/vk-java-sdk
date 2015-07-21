package com.batiaev.vk.api.methods;

/**
 * Created by batiaev on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */

import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.VKRequest;

/**
 * @author batiaev
 * Builds requests for API.widgets part
 *
 * @see <a href="https://vk.com/dev/widgets">API widgets</a>
 */
public class VKApiWidgets extends VKApiBase {
	
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/widgets.getComments">API widgets.getComments()</a>
     *
     * This is an open method; it does not require an access_token. 
     */
    public String getComments(VKParameters params) {
        return prepareRequest("getComments", params).getRequest();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/widgets.getPages">API widgets.getPages()</a>
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
