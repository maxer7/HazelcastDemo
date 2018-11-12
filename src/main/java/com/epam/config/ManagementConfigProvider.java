package com.epam.config;

import com.hazelcast.config.Config;

public class ManagementConfigProvider {

    private static final String CONFIG_URL = "http://localhost:8086/hazelcast-mancenter-3.11.war";

    private static void enableManagementConfig(Config config) {
        config.getManagementCenterConfig().setEnabled(true);
        config.getManagementCenterConfig().setUrl(CONFIG_URL);
    }

}