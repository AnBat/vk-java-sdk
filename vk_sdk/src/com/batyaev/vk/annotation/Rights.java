package com.batyaev.vk.annotation;

import com.batyaev.vk.api.consts.VKApiRigths;

/**
 * Created by anton on 18/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batyaev.com
 */

public @interface Rights {
    int[] value() default {};
}
