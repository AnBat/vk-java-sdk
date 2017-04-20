package com.batiaev.vk.sdk;

import com.batiaev.vk.common.VKApi;
import com.batiaev.vk.common.VKAuthorization;
import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.entity.VKUserList;
import com.batiaev.vk.common.system.VkCache;
import lombok.extern.slf4j.Slf4j;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 * @author batiaev
 * @since 7/6/15
 */
@Slf4j
public class VkLocalCache {
    private static HashMap<String, VkCache> caches = new HashMap<>();

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
        friends.forEach(user -> cache("friends").setProperty(String.valueOf(user.userId()), user.fullName()));
    }

    private static File createCacheFile(String fileName, String user_id) {
        File user_data = user_id.isEmpty() ? new File(VKApi.home())
                : new File(VKApi.home() + user_id);
        if (!user_data.exists() && !user_data.mkdirs())
            log.error("Cannot create folder : " + user_data.getAbsolutePath());
        File user_friends = new File(user_data.getPath() + File.separator + fileName);
        try {
            if (!user_friends.exists() && !user_friends.createNewFile())
                log.error("Cannot create file : " + user_friends.getAbsolutePath());
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

    public static String getUser(final long id) {
        String fullName = getItem(id, "users");
        return fullName == null ? String.valueOf(id) : fullName;
    }

    public static void setUser(long id, String name) {
        setItem(id, name, "users");
    }

    public static void setUser(int id, String name) {
        setItem(id, name, "users");
    }

    public static boolean hasUser(long id) {
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
        return cache(type).keySet();
    }

    public static Collection<Object> getValues(String type) {
        return cache(type).values();
    }

    public static String getItem(final long id, String type) {
        return cache(type).getProperty(String.valueOf(id));
    }

    public static String getItem(final int id, String type) {
        return cache(type).getProperty(String.valueOf(id));
    }

    public static void setItem(int id, String name, String type) {
        cache(type).setProperty(String.valueOf(id), name);
    }

    public static void setItem(long id, String name, String type) {
        cache(type).setProperty(String.valueOf(id), name);
    }

    public static boolean hasItem(long id, String type) {
        return cache(type).hasProperty(String.valueOf(id));
    }

    public static boolean hasItem(int id, String type) {
        return cache(type).hasProperty(String.valueOf(id));
    }

    public static void cachingFriends() {
        VKParameters params = new VKParameters();
        params.setValue("user_id", VKAuthorization.userId());
        params.setValue("order", "hints");
        params.setValue("fields", "uid, first_name, last_name, photo_max_orig");
        setUsers(VKApi.friends().get(params));
    }

    public static void setUsers(VKUserList users) {
        users.forEach(user -> cache("users").setProperty(String.valueOf(user.userId()), user.fullName()));

        String root_path = VKApi.home() + VKAuthorization.userId() + File.separator;
        users.forEach(user -> {
            cache("photo").setProperty(String.valueOf(user.userId()), user.photoMaxOrig());

            String fileName = root_path + String.valueOf(user.userId()) + ".jpg";
            File userPhotoFile = new File(fileName);
            if (!userPhotoFile.exists()) {
                try {
                    URL url = new URL(user.photoMaxOrig());
                    BufferedImage image = ImageIO.read(url);

                    ImageIO.write(image, "jpg", userPhotoFile); //same with gif and png formats
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Loaded [" + user.userId() + "] " + user.fullName());
        });
    }

    /**
     * @param name cache name
     * @return cache assigned with name
     */
    public static VkCache cache(String name) {
        if (!caches.containsKey(name)) caches.put(name, new VkCache(name));
        return caches.get(name);
    }
}
