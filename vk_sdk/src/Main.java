import com.batiaev.vk.api.VKApi;
import com.batiaev.vk.api.VKAuthorization;
import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.dataTypes.VKMessageList;
import com.batiaev.vk.api.dataTypes.VKUserList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

/**
 * Created by anton on 28/06/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */
public class Main {
    private static final Logger LOG = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws IOException {
        VKAuthorization authorization = new VKAuthorization();

        VKParameters params = new VKParameters();
        params.setValue("user_id", VKAuthorization.userId());
        params.setValue("order", "hints");
        params.setValue("fields", "uid, first_name, last_name, nickname, sex, online, bdate, city, country," +
                "timezone, photo_max_orig, rate, contacts, education");

        VKUserList friends = VKApi.friends().get(params);
//
//        saveFriends(friends, params.value("user_id"));
//        friends.forEach(user -> {
//            VKParameters userParams = new VKParameters();
//            userParams.setValue("user_id", String.valueOf(user.user_id));
//            userParams.setValue("order", "hints");
//            userParams.setValue("fields", "uid, first_name, last_name, photo_max_orig");
//
//            VKUserList friendsList = VKApi.friends().get(userParams);
//            try {
//                saveFriends(friendsList, userParams.value("user_id"));
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        });
        LOG.info("=======================");
        VKParameters parameters = new VKParameters();
        parameters.setValue("access_token", VKAuthorization.accessToken());
        LOG.info(VKApi.places().getTypes(parameters).getRequest());
        LOG.info("=======================");
        parameters = new VKParameters();
        parameters.setValue("out", 0);
        parameters.setValue("count", 20);
        parameters.setValue("time_offset", 0);
        parameters.setValue("filters", 4);
        parameters.setValue("access_token", VKAuthorization.accessToken());
        VKMessageList messages = VKApi.messages().get(parameters);
    }

    private static void saveFriends(VKUserList friends, String user_id) throws IOException {
        String cache_dir = System.getProperty("user.home") + File.separator + ".vk_sdk";
        File user_data = new File(cache_dir + File.separator + user_id);
        user_data.mkdirs();
        File user_friends = new File(user_data.getPath() + File.separator + "friends.html");
        try {
            user_friends.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

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
    }
}
