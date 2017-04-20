package com.batiaev.vk.common.system;

import com.batiaev.vk.common.VKApi;
import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Properties;
import java.util.Set;

/**
 * @author batiaev
 * @since 10/29/15
 */
@Slf4j
public class VkCache extends Properties {

    private String name;

    public VkCache(String name) {
        this.name = VKApi.home() + name + ".properties";
        File file = new File(this.name);
        if (!file.exists()) {
            log.debug("File " + this.name + " doesn't exist. File will created.");
            try {
                final boolean isCreated = file.createNewFile();
                if (!isCreated) log.error("File creation error");
            } catch (IOException e) {
                e.printStackTrace();
            } catch (SecurityException e) {
                log.error("You didn't have permissions to create file here!");
            }
        } else loadProperties();
    }

    public void loadProperties() {

        File file = new File(name);
        if (!file.exists()) {
            log.warn("Property file '" + name + "' not found.");
            return;
        }
        try {
            Set<PosixFilePermission> perms = Files.getPosixFilePermissions(file.toPath());
            String correctPermissions = "rw-------";
            if (!PosixFilePermissions.toString(perms).equals(correctPermissions)) {
                Files.setPosixFilePermissions(file.toPath(), PosixFilePermissions.fromString(correctPermissions));
                log.info("Setup '600' permissions for file " + name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            load(new FileInputStream(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void save() {
        File file = new File(name);
        try {
            OutputStream out = new FileOutputStream(file);
            store(out, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object setProperty(String key, String value) {
        Object result = super.put(key, value);
        save();
        return result;
    }

    public boolean hasProperty(String key) {
        return containsKey(key);
    }
}
