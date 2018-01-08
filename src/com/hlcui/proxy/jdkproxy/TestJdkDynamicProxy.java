package com.hlcui.proxy.jdkproxy;

import java.lang.reflect.Proxy;

import org.junit.Before;
import org.junit.Test;
import org.springframework.util.ClassUtils;

public class TestJdkDynamicProxy {
	
	private ClassLoader classLoader;
	
	Class<?>[] interfaces = new Class[1];
	
	@Before
	public void setup(){
		classLoader = ClassUtils.getDefaultClassLoader();
		interfaces[0] = JdkProxyInterface.class;
	}
	
	@Test
	public void testJdkDynamicProxy(){
		JdkProxyInterface target = new JdkProxyServiceImpl();
		Object proxy = createProxy(target);
		JdkProxyInterface demo = (JdkProxyInterface)proxy;
		demo.sayHello();
	}
	
	private Object createProxy(Object target){
		JdkProxyInteceptor inteceptor = new JdkProxyInteceptor(target);
		Object proxy = Proxy.newProxyInstance(classLoader, interfaces, inteceptor);
		return proxy;
	}
}
