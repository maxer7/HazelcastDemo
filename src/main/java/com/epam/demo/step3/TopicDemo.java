package com.epam.demo.step3;

import com.epam.topic.News;
import com.epam.topic.NewsListener;
import com.hazelcast.core.ITopic;

public class TopicDemo {

    public void show(ITopic<News> newsTopic) {
        newsTopic.addMessageListener(new NewsListener());
    }

}
