package com.epam;

import com.epam.config.ConfigProvider;
import com.epam.consumer.DataConsumer;
import com.epam.data.DataPopulator;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

public class Main {

    public static void main(String[] args) {

        HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance(ConfigProvider.getDefaultConfig());

        IMap<Integer, Integer> testMap = hazelcastInstance.getMap("TEST");

        DataPopulator dataPopulator = new DataPopulator();

        dataPopulator.populateRandomData(hazelcastInstance.getMap("TEST"), 1000);


        DataConsumer dataConsumer = new DataConsumer();

        dataConsumer.consumeRandomData(testMap, 1000);






    }

}
