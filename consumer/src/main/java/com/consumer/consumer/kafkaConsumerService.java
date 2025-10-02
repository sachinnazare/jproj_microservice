package com.consumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkaConsumerService {

    @KafkaListener(topics = "demo-topic", groupId = "consumer-group")
    public void consume(String message) {
        System.out.println("Consumer received: " + message);
    }
}
