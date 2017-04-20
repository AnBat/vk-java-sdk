package com.batiaev.vk.api;

import com.batiaev.vk.common.VKApi;
import com.batiaev.vk.common.VKParameters;
import com.batiaev.vk.common.entity.VKUserList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author anbat
 * @since 10/16/15
 */
public class VKApiUsersTest extends TestCase {
    private static VKParameters parameters;
    private static long userId;

    @Before
    public void setUp() {
        userId = 1;
        parameters = new VKParameters(false);
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
        assertNotNull(users);
        assertNotNull(users.get(0));
        assertEquals(users.get(0).firstName(), "Pavel");
        assertEquals(users.get(0).lastName(), "Durov");
        assertEquals(users.get(0).userId(), userId);

    }
}