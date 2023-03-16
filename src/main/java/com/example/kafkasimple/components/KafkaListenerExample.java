package com.example.kafkasimple.components;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListenerExample {
    Logger logger = LoggerFactory.getLogger(KafkaListenerExample.class);

    @KafkaListener(topics = "reflectoring-1", groupId = "myGroup")
    public void listenerOne(String data) {
        logger.info("Listener 1 - " + data);
    }

    @KafkaListener(topics = "reflectoring-2", groupId = "myGroup2")
    public void listenerTwo(String data) {
        logger.info("Listener 2 - " + data);
    }

    @KafkaListener(
            topics = {"reflectoring-1, reflectoring-2"},
            groupId = "myGroup3",
            containerFactory = "kafkaListenerContainerFactory"
    )
    public void commonListenerForMultipleTopics (String message) {
        logger.info("MultipleTopicListener - {}", message);
    }

}
