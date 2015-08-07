package com.batiaev.vk.sdk;

import com.batiaev.vk.api.dataTypes.VKUserList;
import com.batiaev.vk.api.system.VkPropertyLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * @author batiaev
 * Created by batiaev on 7/6/15.
 */
public class VkLocalCache {
    private static final Logger LOG = LogManager.getLogger(VkLocalCache.class);

    public static void saveFriendsPage(VKUserList friends, String user_id) {
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
        VkPropertyLoader.setPropertyFileName(user_id + File.separator + "friends");
        friends.forEach(user -> VkPropertyLoader.setProperty(String.valueOf(user.userId()), user.fullName()));
    }

    private static File createCacheFile(String fileName, String user_id) {
        File user_data = user_id.isEmpty() ? new File(System.getProperty("user.home") + File.separator + ".vk_sdk")
                : new File(System.getProperty("user.home") + File.separator + ".vk_sdk" + File.separator + user_id);
        if (!user_data.exists() && !user_data.mkdirs()) LOG.error("Cannot create folder : " + user_data.getAbsolutePath());
        File user_friends = new File(user_data.getPath() + File.separator + fileName);
        try {
            if (!user_friends.exists() && !user_friends.createNewFile()) LOG.error("Cannot create file : " + user_friends.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return user_friends;
    }

    public static Set<Object> getUserIdList() {
        return getKeySet("users");
    }

    public static Collection<Object> getUserNameList() {
        return getValues("users");
    }

    public static String getUser(int id) {
        String fullName = getItem(id, "users");
        return fullName == null ? String.valueOf(id) : fullName;
    }

    public static void setUser(int id, String name) {
        setItem(id, name, "users");
    }

    public static boolean hasUser(int id) {
        return hasItem(id, "users");
    }

    public static String getPhoto(int id) {
        return getItem(id, "photo");
    }

    public static void setPhoto(int id, String name) {
        setItem(id, name, "photo");
    }

    public static boolean hasPhoto(int id) {
        return hasItem(id, "photo");
    }

    public static String getCity(int id) {
        return getItem(id, "city");
    }

    public static void setCity(int id, String name) {
        setItem(id, name, "city");
    }

    public static boolean hastCity(int id) {
        return hasItem(id, "city");
    }

    public static String getCountry(int id) {
        return getItem(id, "country");
    }

    public static void setCountry(int id, String name) {
        setItem(id, name, "country");
    }

    public static boolean hastCountry(int id) {
        return hasItem(id, "country");
    }

    public static Set<Object> getKeySet(String type) {
        VkPropertyLoader.setPropertyFileName(type);
        return VkPropertyLoader.properties().keySet();
    }

    public static Collection<Object> getValues(String type) {
        VkPropertyLoader.setPropertyFileName(type);
        return VkPropertyLoader.properties().values();
    }

    public static String getItem(int id, String type) {
        VkPropertyLoader.setPropertyFileName(type);
        return VkPropertyLoader.getProperty(String.valueOf(id));
    }

    public static void setItem(int id, String name, String type) {
        VkPropertyLoader.setPropertyFileName(type);
        VkPropertyLoader.setProperty(String.valueOf(id), name);
    }

    public static boolean hasItem(int id, String type) {
        VkPropertyLoader.setPropertyFileName(type);
        return VkPropertyLoader.hasProperty(String.valueOf(id));
    }
}
