package com.hlcui.proxy.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.hlcui.dao.DataDao;
import com.hlcui.model.TraderVo;

public class TestTransaction {

	@Test
	public void testTransaction() {
		String[] config = { "applicationContext.xml" };
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		DataDao dao = (DataDao) context.getBean("dataDao");
		TraderVo vo = new TraderVo();
		vo.setName("tom1");
		System.out.println(dao.insertData(vo));
	}

	@Test
	public void testString() {
		String s = "";
		for (int i = 0; i < 10; i++) {
			s += i;
		}
		System.out.println(s);
	}

	@Test
	public void testClone() throws CloneNotSupportedException {
		Object obj = clone();
		System.out.println(obj);
	}

	@Test
	public void test1() {
//		List<String> list1 = Arrays.asList("1", "2");
//		// list.add("3");
//		// List li = list.subList(0, 1);
//		// li.remove(0);
//		System.out.println(list1);

		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		for (String item : list) {
			if ("1".equals(item)) {
				list.remove(item);
			}
		}
		System.out.println(list);
	}
	
	@Test
	public void testExecutors(){
		Executors.newFixedThreadPool(3);
		Executors.newSingleThreadExecutor();
	}
}
