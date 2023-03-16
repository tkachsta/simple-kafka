package com.example.kafkasimple.services;
import com.example.kafkasimple.components.KafkaListenerExample;
import com.example.kafkasimple.components.KafkaSenderExample;
import org.springframework.stereotype.Service;

@Service
public class SimpleKafkaImpl {

    private final KafkaListenerExample listenerExample;
    private final KafkaSenderExample senderExample;

    public SimpleKafkaImpl(KafkaListenerExample listenerExample,
                           KafkaSenderExample senderExample) {
        this.listenerExample = listenerExample;
        this.senderExample = senderExample;
    }


    public void setupRandomSenderGenerator() {
        for (int i = 0; i < 100; i++) {
            senderExample.sendMessage(String.valueOf(i * 5), "reflectoring-1");
            senderExample.sendMessage(String.valueOf(i * 10), "reflectoring-2");
        }
    }



}
