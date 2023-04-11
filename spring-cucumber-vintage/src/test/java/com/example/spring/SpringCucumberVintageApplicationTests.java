package com.example.spring;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringCucumberVintageApplicationTests {

	@Autowired
	MathUtil mathUtil;

	@Test
	void contextLoads() {
	}

	@Test
	void sum() {
		Assert.assertEquals(5, mathUtil.sum(2, 3));
	}
}
