package com.hlcui.proxy.cglib;

import org.junit.Before;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
/**
 * 对于没有实现任何接口的类，如果想对其进行代理，可以使用CGLIB代理，CGLIB代理的原理是生成被代理类
 * 的子类，横切被代理类的方法，切入需要动态加入的内容
 * @author Administrator
 *
 */
public class TestCglibProxy {
	
	private CglibProxyInteceptor inteceptor;
	
	@Before
	public void setup(){
		inteceptor = new CglibProxyInteceptor();
	}
	
	@Test
	public void testCglibProxy(){
		Object proxy = createProxy();
		CglibTargetClassDemo demo = (CglibTargetClassDemo)proxy;
		demo.sayHello();
	}
	
	private Object createProxy(){
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(CglibTargetClassDemo.class);
		enhancer.setCallback(inteceptor);
		return enhancer.create();
	}
}
