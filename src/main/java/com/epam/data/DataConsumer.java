package com.epam.data;

import com.epam.util.ThreadUtils;
import com.hazelcast.core.IMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Stream;

public class DataConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataConsumer.class);

    public void consume(IMap<Integer, Integer> distributedMap, int elementsCount) {
        Stream.iterate(0, (i) -> ++i)
            .forEach(i -> {
                int key = i;
                LOGGER.info("Get by key {}. Value is {} ", key, distributedMap.get(key));
                ThreadUtils.sleepUnsafe(500);
            });
    }

}
