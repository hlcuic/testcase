package com.hlcui.proxy.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.hlcui.dao.DataDao;
import com.hlcui.model.TraderVo;

public class TestTransaction {
	
	@Test
	public void testTransaction(){
		String[] config = {"applicationContext.xml"};
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		DataDao dao = (DataDao) context.getBean("dataDao");
		TraderVo vo = new TraderVo();
		vo.setName("tom1");
		System.out.println(dao.insertData(vo));
	}
}
