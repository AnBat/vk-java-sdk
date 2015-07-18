import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

/**
 * @author batiaev
 * Created by batiaev on 28/06/15.
 * ---
 * Copyright © 2015. Anton Batiaev. All Rights Reserved.
 * www.batiaev.com
 */
public class Main {
    private static final Logger LOG = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws IOException {
        LOG.error("\n==========\n" +
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
