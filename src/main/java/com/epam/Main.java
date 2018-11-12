package com.epam;

import com.epam.config.ConfigProvider;
import com.epam.demo.step1.MapPopulatorDemo;
import com.epam.demo.step2.LockDemo;
import com.epam.demo.step3.TopicDemo;
import com.epam.demo.task.TaskProcessor;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {


        HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance(ConfigProvider.getDefaultConfig());

        //1 step show map
        new MapPopulatorDemo().show(hazelcastInstance.getMap("demoMap"));

        //2 lock
        new LockDemo().show(hazelcastInstance.getLock("demoLock"));

        //3 topic
        new TopicDemo().show(hazelcastInstance.getTopic("demoTopic"));

        //4 just run

        //task executor
        new TaskProcessor().process(hazelcastInstance.getQueue("demoQueue"));
    }

}
