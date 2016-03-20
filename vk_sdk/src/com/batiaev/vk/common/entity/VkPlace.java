package com.batiaev.vk.common.entity;

/**
 * @author batiaev
 *
 * Created by batiaev on 7/18/15.
 */
public class VkPlace extends AbstractEntity {

    private int id;
    private String name;

    public VkPlace() {
        id = -1;
        name = "";
    }

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
