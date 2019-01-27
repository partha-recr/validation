package com.rest.webservices.restfulwebservices.unittesting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rest.webservices.restfulwebservices.RestfulWebServicesApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestfulWebServicesApplication.class)
//@TestPropertySource(locations= {"classpath:test-configuration.properties"})
public class UnitTestingApplicationTests {

	@Test
	public void contextLoads() {
	}

}
