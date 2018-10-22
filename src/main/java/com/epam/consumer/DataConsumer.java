package com.epam.consumer;

import com.epam.util.ThreadUtils;
import com.hazelcast.core.IMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataConsumer.class);

    public void consumeRandomData(IMap<Integer, Integer> distributedMap, int elementsCount) {
        for (int i = 0; i < elementsCount; i++) {
            int key = i;
            LOGGER.debug("Get be key {} in map. Value is {} ", key, distributedMap.get(key));
            ThreadUtils.sleepUnsafe(500);
        }
    }

}
