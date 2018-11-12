package com.epam.data;

import com.epam.util.ThreadUtils;
import com.hazelcast.core.IAtomicLong;
import com.hazelcast.core.IMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Stream;

public class DataPopulator {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataPopulator.class);



    public void populateRandomData(IMap<Long, Long> distributedMap) {
        Stream.iterate(0, (i) -> ++i)
            .forEach(i -> {
                putKeySquareIntoMap(i, distributedMap);
            });
    }


    public void populateRandomData(IMap<Long, Long> distributedMap, IAtomicLong atomicLong) {
        while (true) {
            putKeySquareIntoMap(atomicLong.incrementAndGet(), distributedMap);
        }
    }

    private void putKeySquareIntoMap(long key, IMap<Long, Long> distributedMap) {
        long value = (long) Math.pow(key, 2);
        distributedMap.put(key, value);
        LOGGER.info("Put {} : {} into map", key, value);
        //ThreadUtils.sleepUnsafe(10);
    }

}
