package com.hlcui.spring.initOrder;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringInit {
	
	@Test
	public void testSpringInitOrder(){
		String[] config = {"applicationContext.xml"};
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
	}
}
