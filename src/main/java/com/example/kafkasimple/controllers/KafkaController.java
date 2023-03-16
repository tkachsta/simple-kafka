package com.example.kafkasimple.controllers;

import com.example.kafkasimple.services.SimpleKafkaImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class KafkaController {

    private final SimpleKafkaImpl kafkaImpl;

    public KafkaController(SimpleKafkaImpl kafkaImpl) {
        this.kafkaImpl = kafkaImpl;
    }
    @GetMapping("/test-kafka-sender")
    public ResponseEntity<?> testKafkaSender() {
        kafkaImpl.setupRandomSenderGenerator();
        return (ResponseEntity<?>) ResponseEntity.ok();
    }

}
