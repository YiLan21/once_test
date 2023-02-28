package com.example.once_test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.once_test.resository.AssociateCompanyDetailEditDao;

@SpringBootTest
class OnceTestApplicationTests {
	@Autowired
	private AssociateCompanyDetailEditDao associateCompanyDetailEditDao;

	@Test
	void contextLoads() {
	}

}
