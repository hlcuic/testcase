/**
 * 
 */
package com.hlcui.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author Administrator
 *
 */
public class DynamicProxy implements FactoryBean<Object>, InvocationHandler{
	
	private Object target;
	
	private Object proxy;
	
	private ClassLoader loader;
	
	public DynamicProxy(Object target){
		this.target = target;
		this.loader = this.getClass().getClassLoader();
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("«∞÷√...");
		method.invoke(target,args);
		System.out.println("∫Û÷√...");
		return null;
	}

	@Override
	public Object getObject() throws Exception {
		if(proxy==null){
			proxy = initProxy();
		}
		return proxy;
	}
	
	public Object initProxy(){
		Object proxy = null;
		Class<?>[] interfaces = this.target.getClass().getInterfaces();
		if(interfaces!=null&&interfaces.length>0){
			proxy = Proxy.newProxyInstance(loader, interfaces,this);
		}
		return proxy;
	}

	@Override
	public Class<?> getObjectType() {
		return this.target.getClass();
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

}
