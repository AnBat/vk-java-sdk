package com.batiaev.vk.common.entity;

/**
 * Abstract attachment class
 *
 * @author batiaev
 * @since 11/9/15
 */
public abstract class VkAttachment extends VkObject {
    protected String type;
    protected String json;

    public String type() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String value) {
        this.json = value;
    }
}
