package com.hlcui.proxy.cglib;

import org.junit.Before;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
/**
 * ����û��ʵ���κνӿڵ��࣬����������д�������ʹ��CGLIB����CGLIB�����ԭ�������ɱ�������
 * �����࣬���б�������ķ�����������Ҫ��̬���������
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
