package com.epam;

import com.epam.config.ConfigProvider;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {


        HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance(ConfigProvider.getDefaultConfig());

        //1 step show map
        //new MapPopulatorDemo().show(hazelcastInstance.getMap("demoMap"));

        //2 lock
        //new LockDemo().show(hazelcastInstance.getLock("demoLock"));

        //3 topic
        //new TopicDemo().show(hazelcastInstance.getTopic("demoTopic"));

        //4 executor demo

        // final demo
        //new TaskProcessor().process(hazelcastInstance.getQueue("demoQueue"));
    }

}
