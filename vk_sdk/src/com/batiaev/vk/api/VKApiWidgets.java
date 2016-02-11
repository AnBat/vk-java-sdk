package com.batiaev.vk.api;

/**
 * Created by batiaev on 15/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */

import com.batiaev.vk.common.VKParameters;

/**
 * @author batiaev
 * Builds requests for API.widgets part
 *
 * @see <a href="https://vk.com/dev/widgets">API widgets</a>
 */
public class VKApiWidgets extends VKApiBase {
	
    /**
     * <a href="https://vk.com/dev/widgets.getComments">API widgets.getComments()</a>
     *
     * This is an open method; it does not require an access_token.
     * @param params method parameters
     * @return String with json respond
     */
    public String getComments(VKParameters params) {
        return execute("getComments", params).toString();
    }

    /**
     * <a href="https://vk.com/dev/widgets.getPages">API widgets.getPages()</a>
     *
     * This is an open method; it does not require an access_token.
     * @param params method parameters
     * @return String with json respond
     */
    public String getPages(VKParameters params) {
        return execute("getPages", params).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "widgets";
    }

}
