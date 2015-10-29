import com.batiaev.vk.api.VKApi;
import com.batiaev.vk.api.VKAuthorization;
import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.dataTypes.VKUserList;
import com.batiaev.vk.sdk.VkMessageCache;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author batiaev
 * Created by batiaev on 10/14/15.
 */
public class MessageLoader extends TimerTask {
    private static final Logger LOG = LogManager.getLogger(MessageLoader.class);
    private VKUserList friends;
    private VkMessageCache messageCache;

    public static void main(String[] args) {

//        VkMessageCache messageCache = new VkMessageCache();
//        boolean result = messageCache.cachingMassages(62311368);
//        if (result)
//            LOG.info("Caching messages is finished");

        MessageLoader loader = new MessageLoader();
        loader.run();
    }

    public void run() {
        VKParameters params = VKParameters.create()
                .add("user_id", VKAuthorization.userId())
                .add("order", "hints")
                .add("fields", "uid");
        friends = VKApi.friends().get(params);
        messageCache = new VkMessageCache();

        friends.forEach(friend -> {
            LOG.info(String.format("Load messages for %s", friend.fullName()));
            messageCache.cachingMassages(friend.userId());
        });
    }
}
