package com.epam.config;

import com.hazelcast.config.Config;

public class ConfigProvider {

    public static Config getDefaultConfig() {
        Config config = new Config();
        config.setProperty("hazelcast.logging.type", "slf4j");
        //enableManagementConfig(config, "http://localhost:8086/hazelcast-mancenter-3.11.war");
        return config;
    }

    private static void enableManagementConfig(Config config, String url) {
        config.getManagementCenterConfig().setEnabled(true);
        config.getManagementCenterConfig().setUrl(url);
    }

}