package com.epam;

import com.epam.config.ConfigProvider;
import com.epam.data.DataPopulator;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {


        HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance(ConfigProvider.getDefaultConfig());

        IMap<Integer, Integer> testMap = hazelcastInstance.getMap("default");

        new DataPopulator().populateRandomData(testMap, 1000);


//        HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance(ConfigProvider.getDefaultConfig());
//        IMap<Integer, Integer> testMap = hazelcastInstance.getMap("default");
//
//
//
//        ILock lock = hazelcastInstance.getLock("default");

//
//        ITopic<News> newsTopic = hazelcastInstance.getTopic("default");
//        newsTopic.addMessageListener(new NewsListener());

//        for (int i = 0; i < 100000; i++) {
//
//
//
//            try {
//                LoggerFactory.getLogger(Main.class).info("Trying to lock...");
//                LoggerFactory.getLogger(Main.class).info("Lock is acquired...");
//                LoggerFactory.getLogger(Main.class).info("Process concurrent logic...");
//                ThreadUtils.sleepUnsafe(5000);
//
//            } finally {
//                LoggerFactory.getLogger(Main.class).debug("Releasing lock...");
//                lock.unlock();
//            }
//
//
//
//        }


//        for (int i = 0; i < 100; i++) {
//            newsTopic.publish(new News("Test description " + i, "Facebook"));
//            ThreadUtils.sleepUnsafe(1000);
//        }


//        Populate map
//        new DataPopulator().populateRandomData(testMap, 1000);

        //Consume map
//        new DataConsumer().consumeRandomData(testMap, 1000);


        // Prepare Hazelcast cluster
//        HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance(ConfigProvider.getDefaultConfig());
//        while (true) {
//            ThreadUtils.sleepUnsafe(100);
//            LOGGER.info("Polling queue");
//            IQueue<Event> aDefault = hazelcastInstance.getQueue("default");
//            if (!aDefault.isEmpty()) {
//                aDefault.poll().process();
//            }
//        }
//        for (int i = 0; i < 1000; i++) {
//            LOGGER.info("Submitting task {}", i);
//                hazelcastInstance.getExecutorService("default").execute(new SumTask(i, i , i+1));
//            ThreadUtils.sleepUnsafe(100);
//        }



//        HazelcastInstance instance = Hazelcast.newHazelcastInstance();
//        Hazelcast.setOutOfMemoryHandler(new OutOfMemoryHandler() {
//            @Override
//            public void onOutOfMemory(OutOfMemoryError oom, HazelcastInstance[] hazelcastInstances) {
//                for (HazelcastInstance hazelcastInstance : hazelcastInstances) {
//                    hazelcastInstance.shutdown();
//                }
//                System.err.println("danger!!!");
//            }
//        });
//        IMap<Object, Object> map = instance.getMap("map");
//        while(true) {
//            map.put(System.nanoTime(), new Byte[10000]);
//        }

    }





}
