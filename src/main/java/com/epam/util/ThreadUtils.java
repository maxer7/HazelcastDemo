package com.epam.util;

public class ThreadUtils {

    public static void sleepUnsafe(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
