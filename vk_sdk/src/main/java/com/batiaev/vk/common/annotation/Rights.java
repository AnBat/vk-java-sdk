/*
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk.common.annotation;

/**
 * @author batiaev
 * @since 18/04/15
 */

public @interface Rights {
    int[] value() default {};

    boolean standAloneOnly() default false;
}
