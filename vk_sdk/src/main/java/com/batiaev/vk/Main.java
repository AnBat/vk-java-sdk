/*
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * https://batiaev.com
 */
package com.batiaev.vk;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @author batiaev
 * @since 28/06/15
 */
@Slf4j
public class Main {

    public static void main(String[] args) throws IOException {
        log.error("\n==========\n" +
                "Vk Java SDK\n" +
                "Now supported following methods: \n" +
                " - messages.get()\n" +
                " - messages.getHistory()\n" +
                " - friends.get()\n" +
                " - friends.getRequests()\n" +
                " - users.get()\n" +
                "\n" +
                "Another methods return string with JSON respond\n" +
                "==========");
    }
}
