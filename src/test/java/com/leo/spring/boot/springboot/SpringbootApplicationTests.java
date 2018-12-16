package com.leo.spring.boot.springboot;

import com.leo.spring.boot.springboot.service.Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

	@Autowired
	ApplicationContext context;

	@Test
	public void testService() {
		Service service = context.getBean(Service.class);
		service.save();
	}

}

