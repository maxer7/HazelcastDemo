package com.epam.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SumTask implements Task {

    private static final Logger LOGGER = LoggerFactory.getLogger(SumTask.class);

    private final int a;
    private final int b;

    public SumTask(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void process() {
        LOGGER.info("Sum of {} and {} is {}", a, b , a+b);
    }
}
