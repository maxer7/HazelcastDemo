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



//        // 1 step show map
//
//        IMap<Long, Long> testMap = hazelcastInstance.getMap("demoMap");
//
//        new DataPopulator().populateRandomData(testMap, hazelcastInstance.getAtomicLong("demoAtom"));
//
//        // 3 step run map with atomic long
//        IMap<Integer, Integer> testMap2 = hazelcastInstance.getMap("default");
//
//
//        // 4 lock
//        Stream.iterate(0, i -> ++i)
//            .forEach(i -> {
//                LOGGER.info("Trying to lock...");
//                ILock lock = hazelcastInstance.getLock("demoLock");
//                try {
//                    LOGGER.info("Lock is acquired. Process hard logic...");
//                    ThreadUtils.sleepUnsafe(5000);
//                } finally {
//                    LOGGER.info("Releasing lock...");
//                    lock.unlock();
//                }
//            });
//
//
//
//        // 6 topic twice
//        ITopic<News> newsTopic = hazelcastInstance.getTopic("demoTopic");
//        newsTopic.addMessageListener(new NewsListener());


        // 8 run executor services



//        // 9 demo
//        while (true) {
//            ThreadUtils.sleepUnsafe(1000);
//            LOGGER.info("Polling queue...");
//            IQueue<Event> aDefault = hazelcastInstance.getQueue("demoQueue");
//            if (!aDefault.isEmpty()) {
//                aDefault.poll().process();
//            }
//        }


    }

}
