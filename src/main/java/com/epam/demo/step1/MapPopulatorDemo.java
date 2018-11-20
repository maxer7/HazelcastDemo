package com.epam.demo.step1;

import com.epam.util.ThreadUtils;
import com.hazelcast.core.IAtomicLong;
import com.hazelcast.core.IMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Stream;

public class MapPopulatorDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(MapPopulatorDemo.class);

    public void show(IMap<Long, Long> map) {
        Stream.iterate(0L, (i) -> ++i)
            .forEach(i -> {
                putKeySquareIntoMap(i, map);
            });

    }

    public void show(IMap<Long, Long> distributedMap, IAtomicLong atomicLong) {
        while (true) {
            putKeySquareIntoMap(atomicLong.incrementAndGet(), distributedMap);
        }
    }

    private void putKeySquareIntoMap(long key, IMap<Long, Long> distributedMap) {
        long value = (long) Math.pow(key, 2);
        distributedMap.put(key, value);
        LOGGER.info("Put {} : {} into map", key, value);
        ThreadUtils.sleepUnsafe(100);
    }

}
