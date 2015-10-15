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
    private int currentIndex;

    public static void main(String[] args) {

        MessageLoader loader = new MessageLoader();
        Timer timer = new Timer();
        timer.schedule(loader, 0, 10000); //checker each 10 sec
    }

    public MessageLoader() {
        VKAuthorization.loadProperties();

        VKParameters params = new VKParameters();
        params.setValue("user_id", VKAuthorization.userId());
        params.setValue("order", "hints");
        params.setValue("fields", "uid");
        friends = VKApi.friends().get(params);
        currentIndex = 0;
    }

    @Override
    public void run() {
        LOG.info(String.format("Load messages for %s", friends.get(currentIndex).fullName()));
        VkMessageCache messageCache = new VkMessageCache();
        messageCache.cachingMassages(friends.get(currentIndex).userId());
        currentIndex++;
    }
}
