package com.batiaev.vk.sdk;

import com.batiaev.vk.api.dataTypes.VKUserList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.HashMap;

/**
 * @author batiaev
 * Created by batiaev on 7/6/15.
 */
public class VkLocalCache {
    private static final Logger LOG = LogManager.getLogger(VkLocalCache.class);

    public static HashMap<Integer, String> userCache = null;

    public static void saveFriends(VKUserList friends, String user_id) {
        //generate html file
        FileWriter writer = null;
        try {
            writer = new FileWriter(createCacheFile("friends.html", user_id), false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (writer == null) return;
        try {
            writer.write("<html>\n<head>\n<meta charset=\"utf-8\">\n<title>Friends</title>\n</head>\n<body>\n<table>\n<tr>\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        final int[] index = {0};
        final FileWriter finalWriter = writer;
        friends.forEach(user -> {
            try {
                finalWriter.write("<td><img src=\"" + user.photoMaxOrig().replaceAll("\\/", "/")
                        + "\" style=\"width:128px;height:128px;\"></img></br>" + user.userId() + "<br/>"
                        + user.firstName() + " " + user.lastName() + "</td>\n");
                ++index[0];
                if (index[0] % 10 == 0) finalWriter.write("</tr><tr>\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        try {
            writer.write("</tr>\n</table>\n</body>\n</html");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //generate properties file
        FileWriter propWriter = null;
        try {
            propWriter = new FileWriter(createCacheFile("friends.properties", user_id), false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (propWriter == null) return;
        final int[] propIndex = {0};
        final FileWriter finalPropWriter = propWriter;
        friends.forEach(user -> {
            try {
                finalPropWriter.write(user.userId() + " = " + user.fullName() + "\n");
                ++propIndex[0];
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        try {
            propWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void save() {
        FileWriter writer = null;
        try {
            writer = new FileWriter(createCacheFile("users.properties"), false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        final FileWriter finalWriter = writer;
        if (finalWriter == null) return;
        userCache.keySet().forEach(key -> {
            try {
                finalWriter.write(key + " = " + userCache.get(key) + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        try {
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void load() {
        //FIXME
    }

    private static File createCacheFile(String fileName) {
        return createCacheFile(fileName, "");
    }

    private static File createCacheFile(String fileName, String user_id) {
        File user_data = user_id.isEmpty() ? new File(System.getProperty("user.home") + File.separator + ".vk_sdk")
                : new File(System.getProperty("user.home") + File.separator + ".vk_sdk" + File.separator + user_id);
        if (!user_data.mkdirs()) LOG.error("Cannot create folder : " + user_data.getAbsolutePath());
        File user_friends = new File(user_data.getPath() + File.separator + fileName);
        try {
            if (!user_friends.createNewFile()) LOG.error("Cannot create file : " + user_friends.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return user_friends;
    }
}
