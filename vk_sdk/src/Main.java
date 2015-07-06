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
//        VkLocalCache.saveFriends(friends, params.value("user_id"));

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
}
