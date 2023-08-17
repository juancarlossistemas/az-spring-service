package com.webapp.service.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
		Assertions.assertTrue(true);
	}

	@Test()
	void countValues() {
		Assertions.assertEquals("5", "5");
	}

}
