package com.hlcui.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkProxyInteceptor implements InvocationHandler{
	
	private Object target;
	
	JdkProxyInteceptor(Object target){
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getDeclaringClass().equals(Object.class)){
			return method.invoke(target, args);
		}
		System.out.println("before invoke method......");
		Object result = method.invoke(target, args);
		System.out.println("after invoke method......");
		return result;
	}

}
