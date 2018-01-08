/**
 * 
 */
package com.hlcui.service;

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
//@Component
public class ApplicationContextService implements ApplicationContextAware{
	
	public static ApplicationContext context;
	
	@Override
	public  void setApplicationContext(ApplicationContext context)
			throws BeansException {
		ApplicationContextService.context = context;
	}
	
	public static ApplicationContext getApplicationContext(){
		return ApplicationContextService.context;
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
