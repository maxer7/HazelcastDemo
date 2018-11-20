package com.epam.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubTask implements Task {

    private static final Logger LOGGER = LoggerFactory.getLogger(SubTask.class);

    private final int a;
    private final int b;

    public SubTask(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void process() {
        LOGGER.info("Sub of {} and {} is {}", a, b , a-b);
    }
}
