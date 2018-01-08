/**
 * 
 */
package com.hlcui.service;
import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hlcui.annotation.DataProvider;

/**
 * @author Administrator
 * spring����������ʵ����bean����ʼ��������˳�����ȹ��췽��
 * ����postContructor����InitializingBean��afterPropertiesSet(),
 * ��xml��init-method
 */
//@Service
public class InitBeanService implements InitializingBean{
	
	private String name;
	
	private int age;
	
	public InitBeanService(){
		System.out.println("constructor.....");
	}
	
	public void init(){
		System.out.println("init-method...init");
	}
	
	@PostConstruct
	public void reload(){
		System.out.println("@PostConstruct...");
	}
	
	public InitBeanService(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[name="+name+",age="+age+"]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean....afterPropertiesSet");
	}

	private Object _postProcessAfterInitialization(Object bean){
		if(isProxy(bean)){
			DynamicProxy proxy = new DynamicProxy(bean);
			try {
				return proxy.getObject();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	private boolean isProxy(Object bean){
		boolean flag = false;
		Class<?> clazz = bean.getClass();
		DataProvider dataProvider = clazz.getAnnotation(DataProvider.class);
		if(dataProvider!=null){
			flag = true;
		}
		return flag;
	}

}
