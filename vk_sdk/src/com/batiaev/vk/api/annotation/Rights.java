package com.batiaev.vk.api.annotation;

/**
 * @author batiaev
 * Created by batiaev on 18/04/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */

public @interface Rights {
    int[] value() default {};
    boolean standAloneOnly() default false;
}
