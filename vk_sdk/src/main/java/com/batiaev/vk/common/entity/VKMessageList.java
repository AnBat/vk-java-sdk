/*
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk.common.entity;

import java.util.ArrayList;

/**
 * @author batiaev
 * @see VKMessage
 * @see VkDialog
 * @since 05/07/15
 */
public class VKMessageList extends ArrayList<VKMessage> {
    public int totalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int upreadCount() {
        return upreadCount;
    }

    public void setUpreadCount(int upreadCount) {
        this.upreadCount = upreadCount;
    }

    private int totalCount = 0;
    private int upreadCount = 0;

    public String plainText() {
        StringBuilder builder = new StringBuilder();
        this.forEach(msg -> builder.append(msg.plainText()));
        return builder.toString();
    }

}
