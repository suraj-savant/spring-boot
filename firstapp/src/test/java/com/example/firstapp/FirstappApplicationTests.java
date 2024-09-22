package com.example.firstapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class FirstappApplicationTests {

	@Test
	void contextLoads() {
	}

}
