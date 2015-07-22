package com.batiaev.vk.api.system;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Properties;
import java.util.Set;

/**
 * @author batiaev
 * Created by batiaev on 7/22/15.
 */
public class VkPropertyLoader {
    private static final Logger LOG = LogManager.getLogger(VkPropertyLoader.class);

    private static Properties props = new Properties();
    private static String defaultFileName = System.getProperty("user.home") + File.separator + ".vk_sdk" + File.separator + "secure.properties";
    private static String propName = defaultFileName;

    public static String propertyName() {
        return propName;
    }

    public static void setPropertyFileName(String fileName) {
        propName = System.getProperty("user.home") + File.separator + ".vk_sdk" + File.separator + fileName + ".properties";
        props.clear();

        File file = new File(propName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Properties properties() {
        return props;
    }

    public static void loadProperties() {
        loadProperties(propName);
    }

    public static void loadProperties(String propPath) {
        if (!propPath.equals(propName)) setPropertyFileName(propPath);

        File file = new File(propPath);
        if (!file.exists()) {
            LOG.error("Property file '" + propPath + "' not found.");
            return;
        }
        Set<PosixFilePermission> perms = null;
        try {
            perms = Files.getPosixFilePermissions(file.toPath());
            if (perms != null) {
                if (perms.contains(PosixFilePermission.GROUP_READ))
                    LOG.error("Wrong permissions for file '" + propPath + "'. It is group readable!");
                if (perms.contains(PosixFilePermission.GROUP_WRITE))
                    LOG.error("Wrong permissions for file '" + propPath + "'. It is group writable!");
                if (perms.contains(PosixFilePermission.GROUP_EXECUTE))
                    LOG.error("Wrong permissions for file '" + propPath + "'. It is group executable!");
                if (perms.contains(PosixFilePermission.OTHERS_READ))
                    LOG.error("Wrong permissions for file '" + propPath + "'. It is others readable!");
                if (perms.contains(PosixFilePermission.OTHERS_WRITE))
                    LOG.error("Wrong permissions for file '" + propPath + "'. It is others writable!");
                if (perms.contains(PosixFilePermission.OTHERS_EXECUTE))
                    LOG.error("Wrong permissions for file '" + propPath + "'. It is others executable!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //set correct permissions
        if (perms != null && !PosixFilePermissions.toString(perms).equals("rw-------")) {
            try {
                Files.setPosixFilePermissions(file.toPath(), PosixFilePermissions.fromString("rw-------"));
                LOG.info("Setup 600 permissions for file " + propPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            props.load(new FileInputStream(propPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveParamChanges() {
        File f = new File(propName);
        OutputStream out = null;
        try {
            out = new FileOutputStream( f );
            props.store(out, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return props.getProperty(key);
    }

    public static void setProperty(String key, String value) {
        props.put(key, value);
        saveParamChanges();
    }

    public static String secureCode() {
        return props.getProperty("vk.app.secure_code");
    }

    public static void setSecureCode(String secureCode) {
        setProperty("vk.app.secure_code", secureCode);
    }

    public static String appId() {
        return props.getProperty("vk.app.id");
    }

    public static void setAppId(String id) {
        setProperty("vk.app.id", id);
    }

    public static String userId() {
        return props.getProperty("vk.user.id");
    }

    public static void setUserId(String id) {
        setProperty("vk.user.id", id);
    }

    public static String userEmail() {
        return props.getProperty("vk.user.email");
    }

    public static void setUserEmail(String email) {
        setProperty("vk.user.email", email);
    }

    public static String userPassword() {
        return props.getProperty("vk.user.password");
    }

    public static void setUserPassword(String pass) {
        setProperty("vk.user.password", pass);
    }

    public static String accessToken() {
        return props.getProperty("vk.access_token");
    }

    public static void setAccessToken(String accessToken) {
        setProperty("vk.access_token", accessToken);
    }
}
