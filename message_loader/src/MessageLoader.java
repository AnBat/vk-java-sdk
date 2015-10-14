import com.batiaev.vk.api.VKApi;
import com.batiaev.vk.api.VKAuthorization;
import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.dataTypes.VKUserList;
import com.batiaev.vk.sdk.VkMessageCache;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author batiaev
 * Created by batiaev on 10/14/15.
 */
public class MessageLoader {
    private static final Logger LOG = LogManager.getLogger(MessageLoader.class);

    public static void main(String[] args) {

        VKAuthorization.loadProperties();
        VKParameters params = new VKParameters();
        params.setValue("user_id", VKAuthorization.userId());
        params.setValue("order", "hints");
        params.setValue("fields", "uid");
        VKUserList friends = VKApi.friends().get(params);
        friends.forEach(vkUser -> {
            VkMessageCache messageCache = new VkMessageCache();
            messageCache.cachingMassages(vkUser.userId());
        });
    }
}
