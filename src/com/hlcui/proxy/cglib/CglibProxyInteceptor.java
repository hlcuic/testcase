package com.hlcui.proxy.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CglibProxyInteceptor implements MethodInterceptor{

	@Override
	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy)
	throws Throwable {
		System.out.println("before invoke method......");
		Object result = methodProxy.invokeSuper(proxy, args);
		System.out.println("after invoke method......");
		return result;
	}

}
