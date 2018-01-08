package com.hlcui.proxy.mock.mybatis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMockMybatis {
	
	@Test
	public void testMockMybatis(){
		String[] config = {"applicationContext.xml"};
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		AutoDelegetorInterface demo = context.getBean(AutoDelegetorInterface.class);
		demo.execute();
	}
}
