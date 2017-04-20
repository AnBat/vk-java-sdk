/*
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk.api;

import com.batiaev.vk.common.VKParameters;

/**
 * Builds requests for API.widgets part
 *
 * @author batiaev
 * @see <a href="https://vk.com/dev/widgets">API widgets</a>
 * @since 15/04/15
 */
public class VKApiWidgets extends VKApiBase {

    /**
     * <a href="https://vk.com/dev/widgets.getComments">API widgets.getComments()</a>
     * <p>
     * This is an open method; it does not require an access_token.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String getComments(VKParameters params) {
        return execute(getUrl("getComments", params)).toString();
    }

    /**
     * <a href="https://vk.com/dev/widgets.getPages">API widgets.getPages()</a>
     * <p>
     * This is an open method; it does not require an access_token.
     *
     * @param params method parameters
     * @return String with json respond
     */
    public String getPages(VKParameters params) {
        return execute(getUrl("getPages", params)).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "widgets";
    }

}
