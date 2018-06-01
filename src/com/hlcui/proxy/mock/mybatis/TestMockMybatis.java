package com.hlcui.proxy.mock.mybatis;

import java.util.Arrays;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

public class TestMockMybatis {
	
	@Test
	public void testMockMybatis(){
		String[] config = {"applicationContext.xml"};
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		System.out.println(context);
		AutoDelegetorInterface demo = context.getBean(AutoDelegetorInterface.class);
		demo.execute();
	}
	
	@Test
	public void testMybatis(){
		SqlSession sqlSession = null;
	}
	
	public static void main(String[] args) {
		String[] arr = StringUtils.tokenizeToStringArray("com.hlcui.dao", ",; \t\n");
		System.out.println(Arrays.toString(arr));
	}
}
