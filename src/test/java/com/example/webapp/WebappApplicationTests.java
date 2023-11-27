package com.example.webapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.SpringVersion;

@SpringBootTest
class WebappApplicationTests {

	@Test
	void contextLoads() {
		assertEquals("6.1.1", SpringVersion.getVersion());
	}

}
