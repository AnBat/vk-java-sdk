package com.batiaev.vk.demo;

/**
 * @author batiaev
 * @since 10/15/15
 */
public class Main {
    public static void main(String[] args) {

//        String demo = "testApp";
        String demo = "messageLoader";

        switch (demo) {
            case "testApp":
                TestApp.main(args);
            case "messageLoader":
                MessageLoader.main(args);
        }
    }
}
