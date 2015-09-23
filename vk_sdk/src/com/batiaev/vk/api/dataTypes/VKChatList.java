package com.batiaev.vk.api.dataTypes;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author batiaev
 * Created by batiaev on 05/07/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */
public class VKChatList extends ArrayList<VKChat> {
    public int totalCount = 0;
    public int upreadCount = 0;

    public void removeAll() {
        removeAll(this);
    }
}
