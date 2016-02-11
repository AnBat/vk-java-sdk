package com.batiaev.vk.api;

/**
 * Created by anton on 17/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.annotation.Rights;
import com.batiaev.vk.common.consts.VKApiRigths;

/**
 * @author batiaev
 *
 * Builds requests for API.docs part
 *
 * @see <a href="https://vk.com/dev/docs">API docs()</a>
 */
public class VKApiDocs extends VKApiBase {
	
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/docs.get">API docs.get()</a>
     */
    @Rights(VKApiRigths.DOCS)
    public String get(VKParameters params) {
        return execute("get", params).toString();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/docs.getById">API docs.getById()</a>
     */
    @Rights(VKApiRigths.DOCS)
    public String getById(VKParameters params) {
        return execute("getById", params).toString();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/docs.getUploadServer">API docs.getUploadServer()</a>
     */
    @Rights(VKApiRigths.DOCS)
    public String getUploadServer(VKParameters params) {
        return execute("getUploadServer", params).toString();
    }
    
    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/docs.getWallUploadServer">API docs.getWallUploadServer()</a>
     */
    @Rights(VKApiRigths.DOCS)
    public String getWallUploadServer(VKParameters params) {
        return execute("getWallUploadServer", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/docs.save">API docs.save()</a>
     */
    @Rights(VKApiRigths.DOCS)
    public String save(VKParameters params) {
        return execute("save", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/docs.delete">API docs.delete()</a>
     */
    @Rights(VKApiRigths.DOCS)
    public String delete(VKParameters params) {
        return execute("delete", params).toString();
    }

    /**
     * @param params method parameters
     * @return String with json respond
     * @see <a href="https://vk.com/dev/docs.add">API docs.add()</a>
     */
    @Rights(VKApiRigths.DOCS)
    public String add(VKParameters params) {
        return execute("add", params).toString();
    }

    @Override
    protected String getMethodsGroup() {
        return "docs";
    }
}
