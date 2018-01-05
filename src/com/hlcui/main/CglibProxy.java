package com.hlcui.main;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {
	
	private Object target;
	
	public CglibProxy(Object target){
		this.target = target;
	}

	private Enhancer enhancer = new Enhancer();

	public Object getProxy(Class<?> clazz) {
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object bean, Method method, Object[] args, MethodProxy methodProxy) 
	throws Throwable {
		System.out.println("before invoke method");
		Object result = method.invoke(target,args);
		System.out.println("after invoke method");
		return result;
	}

}
