package com.example.producer.demo.producer;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	String topic = "demo-topic";

	@Test
	void contextLoads() {
	}

	@Test
	void sendMessage() {
		kafkaTemplate.send(topic, "Sachin");
	}
}
