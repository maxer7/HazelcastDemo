package com.epam.executor;

import com.epam.util.ThreadUtils;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.HazelcastInstanceAware;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;


public class SumTask implements Runnable, Serializable, HazelcastInstanceAware {

    private static final Logger LOGGER = LoggerFactory.getLogger(SumTask.class);

    private HazelcastInstance hazelcastInstance;
    private int id;
    private int x;
    private int y;

    public SumTask(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        ThreadUtils.sleepUnsafe(1000);
        LOGGER.info("Task id {}. Result {} + {} = {}", id, x, y, x + y);
    }

    @Override
    public void setHazelcastInstance(HazelcastInstance hazelcastInstance) {
        this.hazelcastInstance = hazelcastInstance;
    }

}
