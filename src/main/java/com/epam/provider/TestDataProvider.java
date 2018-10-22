package com.epam.provider;

import java.util.UUID;

public class TestDataProvider {

    public static String getRandomString() {
        return UUID.randomUUID().toString();
    }


}
