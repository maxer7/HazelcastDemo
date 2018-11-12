package com.epam.demo.step2;

import com.epam.util.ThreadUtils;
import com.hazelcast.core.ILock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Stream;

public class LockDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(LockDemo.class);

    public void show(ILock lock) {
        Stream.iterate(0, i -> ++i)
            .forEach(i -> {
                LOGGER.info("Trying to lock...");
                try {
                    LOGGER.info("Lock is acquired. Process hard logic...");
                    ThreadUtils.sleepUnsafe(5000);
                } finally {
                    LOGGER.info("Releasing lock...");
                    lock.unlock();
                }
            });
    }

}
