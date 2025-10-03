package com.consumer.consumer;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsumerApplicationTests {

	@InjectMocks
	kafkaConsumerService kafkaCOnsumerService;

	@Test
	void contextLoads() {
	}

	@Test
	void getMessage(){
		kafkaCOnsumerService.consume("Hello");
	}

}
