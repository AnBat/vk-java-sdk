import com.batiaev.vk.api.VKApi;
import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.dataTypes.VKUserList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

/**
 * Created by anton on 28/06/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */
public class Main {
    private static final Logger LOG = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws IOException {
        VKParameters params = new VKParameters();
        params.setValue("user_id", "38561327");
        params.setValue("order", "hints");
        params.setValue("fields", "uid, first_name, last_name, nickname, sex, online, bdate, city, country," +
                "timezone, photo_max_orig, rate, contacts, education");

        VKUserList friends = VKApi.friends().get(params);

        LOG.info("=======================");
        LOG.info(VKApi.places().getTypes(new VKParameters()).getRequest());
    }
}
