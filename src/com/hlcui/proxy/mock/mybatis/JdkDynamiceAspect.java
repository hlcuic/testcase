package com.hlcui.proxy.mock.mybatis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkDynamiceAspect implements InvocationHandler{
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(Object.class.isAssignableFrom(method.getDeclaringClass().getClass())){
			return method.invoke(this, args);
		}
		doService();
		return null;
	}
	
	private void doService(){
		System.out.println("================invoke authDelegetor interface=================");
		System.out.println("================invoke authDelegetor interface=================");
		System.out.println("================invoke authDelegetor interface=================");
	}

}
