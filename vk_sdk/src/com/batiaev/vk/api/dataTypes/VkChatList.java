package com.batiaev.vk.api.dataTypes;

import java.util.ArrayList;

/**
 * @author batiaev
 * Created by batiaev on 05/07/15.
 * ---
 * @see VkChatMessage
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */
public class VkChatList extends ArrayList<VkChatMessage> {
    public int totalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int upreadCount() {
        return upreadCount;
    }

    public void setUnreadCount(int unreadCount) {
        this.upreadCount = unreadCount;
    }

    public void removeAll() {
        removeAll(this);
    }

    private int totalCount = 0;
    private int upreadCount = 0;
}
