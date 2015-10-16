package com.batiaev.vk.api.methods;

import com.batiaev.vk.api.VKApi;
import com.batiaev.vk.api.VKAuthorization;
import com.batiaev.vk.api.VKParameters;
import com.batiaev.vk.api.dataTypes.VKUserList;
import jdk.nashorn.internal.AssertsEnabled;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author anbat
 * Created by anbat on 10/16/15.
 */
public class VKApiUsersTest extends TestCase {
    private static VKParameters parameters;
    private static long userId;

    @Before
    public void setUp() {
        VKAuthorization.loadProperties();

        userId = 1;
        parameters = new VKParameters();
        parameters.setValue("user_id", userId);
        parameters.setValue("fields", "first_name, last_name");

    }

    @After
    public void tearDown() {
        // ...
    }

    @Test
    public void testGet() {

        VKUserList users = VKApi.users().get(parameters);
        assertEquals(users.get(0).firstName(), "Pavel");
        assertEquals(users.get(0).lastName(), "Durov");
        assertEquals(users.get(0).userId(), userId);

    }
}