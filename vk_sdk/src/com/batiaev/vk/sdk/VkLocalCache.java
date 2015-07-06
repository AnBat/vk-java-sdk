package com.batiaev.vk.sdk;

import com.batiaev.vk.api.dataTypes.VKUserList;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by batyaev on 7/6/15.
 */
public class VkLocalCache {
    public static void saveFriends(VKUserList friends, String user_id) throws IOException {
        String cache_dir = System.getProperty("user.home") + File.separator + ".vk_sdk";
        File user_data = new File(cache_dir + File.separator + user_id);
        user_data.mkdirs();
        File user_friends = new File(user_data.getPath() + File.separator + "friends.html");
        try {
            user_friends.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //generate html file
        FileWriter writer = new FileWriter(user_friends, false);
        writer.write("<html>\n<head>\n<meta charset=\"utf-8\">\n<title>Friends</title>\n</head>\n<body>\n<table>\n<tr>\n");
        final int[] index = {0};
        friends.forEach(user -> {
            try {
                writer.write("<td><img src=\"" + user.photo_max_orig.replaceAll("\\/", "/")
                        + "\" style=\"width:128px;height:128px;\"></img></br>" + user.user_id + "<br/>"
                        + user.first_name + " " + user.last_name + "</td>\n");
                ++index[0];
                if (index[0] % 10 == 0)
                    writer.write("</tr><tr>\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        writer.write("</tr>\n</table>\n</body>\n</html");
        writer.close();

        //generate properties file
        File propFriends = new File(user_data.getPath() + File.separator + "friends.properties");
        System.out.print("##### " + propFriends.getAbsolutePath());
        try {
            propFriends.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileWriter propWriter = new FileWriter(propFriends, false);
        final int[] propIndex = {0};
        friends.forEach(user -> {
            try {
                propWriter.write(user.user_id + " = " + user.fullName() + "\n");
                ++propIndex[0];
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        propWriter.close();
    }
}
