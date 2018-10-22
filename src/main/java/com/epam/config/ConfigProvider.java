package com.epam.config;

import com.hazelcast.config.Config;

public class ConfigProvider {

    public static Config getDefaultConfig() {
        Config config = new Config();
        config.setProperty("hazelcast.logging.type", "slf4j");
        return config;
    }

}
