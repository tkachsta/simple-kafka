package com.example.kafkasimple.components;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaSenderExample {

    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public KafkaSenderExample(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message, String topicName) {
        kafkaTemplate.send(topicName, message);
    }


}
