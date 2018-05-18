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
 * ʵ��ApplicationContextAware�ӿڣ���дsetApplicationContext()������
 * ��spring����ʵ����bean���֮ǰ�������⵽��ʵ�ָýӿڣ����ע��spring�����Ķ��󣬳���
 * ������󣬿���ͨ��getBean��ȡspring���������bean
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
	//Class<?> Class�����Ϊ��������
	public static <T> T getBean(Class<?> clazz){
		return (T) context.getBean(clazz);
	}
}
