/**
 * 
 */
package com.hlcui.test;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Test;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.hlcui.entity.Car;
import com.hlcui.entity.Emp;
import com.hlcui.service.IcustBusinessService;
import com.sun.corba.se.pept.transport.Connection;

/**
 * @author Administrator
 *
 */
public class TestDemo {
	
	@SuppressWarnings("resource")
	@Test
	public void testCreateInstance(){
//		BeanFactory.class
//		BeanDefinition.class
//		AbstractXmlApplicationContext.class
//		FileSystemXmlApplicationContext.class
		String[] conf = {"applicationContext.xml"};
		ApplicationContext context = new ClassPathXmlApplicationContext(conf);
//		IcustBusinessService service =  (IcustBusinessService) context.getBean("custBusinessServiceImpl");
//		System.out.println(service.getClass().getName());
//		for(Method m:service.getClass().getDeclaredMethods()){
//			System.out.println(m.getName());
//		}
//		System.out.println("ÊÇ·ñjdk´úÀí£º"+AopUtils.isJdkDynamicProxy(service));
//		System.out.println(Proxy.isProxyClass(service.getClass()));
//		System.out.println(AopUtils.getTargetClass(service));
//		service.handler();
	}
	
	@Test
	public void testXmlBeanFactory() {
		Resource resource = new ClassPathResource("applicationContext.xml");
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions(resource);
		Emp emp = (Emp)beanFactory.getBean("emp");
		System.out.println(emp);
		System.out.println(beanFactory);
	}
	
	@Test
	public void testFileSystemXmlApplicationContext() {
		String config = "D:\\workspace2\\testcase\\bin\\applicationContext.xml";
//		@SuppressWarnings("resource")
//		AbstractAutowireCapableBeanFactory
		if(Boolean.FALSE){
			
		}
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(config);
		Emp emp = (Emp)context.getBean("emp");
		System.out.println(emp);
	}
	
	@Test
	public void testFileSystemXmlApplicationContextClassPath() {
		String config = "classpath:applicationContext.xml";
		@SuppressWarnings("resource")
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(config);
		Object emp = context.getBean("car");
		System.out.println(emp);
	}
	
}
