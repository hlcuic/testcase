/**
 * 
 */
package com.hlcui.spring.extend.inters;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * 实现ApplicationContextAware接口，重写setApplicationContext()方法，
 * 在spring容器实例化bean完成之前，如果检测到类实现该接口，则会注入spring上下文对象，持有
 * 这个对象，可以通过getBean获取spring管理的所有bean
 */
@Component
public class SpringApplicationContext implements ApplicationContextAware{
	
	public static ApplicationContext context;
	
	@PostConstruct
	private void init(){
		System.out.println("init SpringApplicationContext....s");
	}
	
	@Override
	public  void setApplicationContext(ApplicationContext context)
			throws BeansException {
		SpringApplicationContext.context = context;
	}
	
	public static ApplicationContext getApplicationContext(){
		return SpringApplicationContext.context;
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T getBean(String BeanName){
		return (T) context.getBean(BeanName);
	}
	
	@SuppressWarnings("unchecked")
	//Class<?> Class类可以为任意类型
	public static <T> T getBean(Class<?> clazz){
		return (T) context.getBean(clazz);
	}
}
