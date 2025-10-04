package com.example.producer.demo.producer;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {


	@InjectMocks
	kafkaProducerService kafkaProducerService;

	@Test
	void contextLoads() {
	}

	@Test
	void sendMessage(){
		kafkaProducerService.sendMessage("Sachin");
	}
}
