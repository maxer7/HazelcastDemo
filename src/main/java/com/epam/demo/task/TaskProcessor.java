package com.epam.demo.task;

import com.epam.task.Task;
import com.epam.util.ThreadUtils;
import com.hazelcast.core.IQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TaskProcessor {

    private static final Logger LOGGER = LoggerFactory.getLogger(TaskProcessor.class);

    public void process(IQueue<Task> tasks) {
        while (true) {
            ThreadUtils.sleepUnsafe(500);
            LOGGER.info("Polling queue...Size = {}", tasks.size());
            if (!tasks.isEmpty()) {
                tasks.poll().process();
            }
        }
    }
}
