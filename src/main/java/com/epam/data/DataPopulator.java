package com.epam.data;

import com.epam.util.ThreadUtils;
import com.hazelcast.core.IMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataPopulator {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataPopulator.class);

    public void populateRandomData(IMap<Integer, Integer> distributedMap, int elementsCount) {
        for (int i = 0; i < elementsCount; i++) {
            int key = i;
            int value = (int) Math.pow(key, 2);
            distributedMap.put(key, value);
            LOGGER.info("Put {} : {} into map", key, value);
            ThreadUtils.sleepUnsafe(500);
        }
    }

}
