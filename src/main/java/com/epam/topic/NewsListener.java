package com.epam.topic;

import com.hazelcast.core.Message;
import com.hazelcast.core.MessageListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewsListener implements MessageListener<News> {

    private static final Logger LOGGER = LoggerFactory.getLogger(NewsListener.class);

    @Override
    public void onMessage(Message<News> message) {
        LOGGER.debug("From {}. Message {}", message.getPublishingMember().getAddress(), message.getMessageObject());
    }


}
