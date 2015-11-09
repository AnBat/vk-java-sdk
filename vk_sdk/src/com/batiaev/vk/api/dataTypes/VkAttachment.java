package com.batiaev.vk.api.dataTypes;

/**
 * @author batiaev
 * Abstract attachment class
 * Created by batiaev on 11/9/15.
 */
public abstract class VkAttachment {
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
