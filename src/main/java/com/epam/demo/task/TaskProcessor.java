package com.epam.demo.task;

import com.epam.event.Event;
import com.epam.util.ThreadUtils;
import com.hazelcast.core.IQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TaskProcessor {

    private static final Logger LOGGER = LoggerFactory.getLogger(TaskProcessor.class);

    public void process(IQueue<Event> events) {
        while (true) {
            ThreadUtils.sleepUnsafe(1000);
            LOGGER.info("Polling queue...");
            if (!events.isEmpty()) {
                events.poll().process();
            }
        }
    }
}
