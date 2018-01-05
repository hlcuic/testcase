/**
 * 
 */
package com.hlcui.main;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import org.springframework.util.ClassUtils;

import com.hlcui.entity.RealSubject;
import com.hlcui.entity.SayHello;
import com.hlcui.entity.Subject;
import com.hlcui.service.DynamicProxy;

/**
 * @author Administrator
 * 
 */
public class TestProxy {

	public static void main(String[] args) {
		//test1();
		CglibProxy proxy = new CglibProxy(new SayHello());
		SayHello hello = (SayHello) proxy.getProxy(SayHello.class);
		hello.sayHello();
	}
	
	private static void test1(){
		Subject realSubject = new RealSubject();
		InvocationHandler handler = new DynamicProxy(realSubject);
		Subject subject = (Subject) Proxy.newProxyInstance(ClassUtils.getDefaultClassLoader(), realSubject.getClass().getInterfaces(),
				handler);
		System.out.println(subject.getClass().getName());
		subject.eat();
		subject.sing();
	}
}
