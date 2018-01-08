package com.hlcui.spring.initOrder;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
/**
 * spring������������ʼ��˳�����£�
invoke constructor InitSpringDemo......
postProcessBeforeInitialization...initSpringDemo
invoke @PostConstruct method......
invoke initMethod afterPropertiesSet......
invoke xml init-method .......
postProcessAfterInitialization...initSpringDemo
�ȵ��ù��췽��ʵ�������󡪡��ٵ���BeanPostProcessor���ô�����Ԥ��������postProcessBeforeInitialization��ͨ���˷������ǿ���
��spring����ά����beanʵ�������޸Ĳ���������@PostConstruct��ע�ĳ�ʼ�����������ٵ���ʵ��InitializingBean�ӿ�ʵ��afterPropertiesSet
���������ٵ���spring����xml�����õ�init-method���Է�����������BeanPostProcessor���ô�������postProcessAfterInitialization����
һ������£�����ʹ�ô˷����Ƚ϶࣬��bean������ɺ������޸�
 * @author Administrator
 *
 */
@Component
public class InitSpringDemo implements InitializingBean{
	
	public InitSpringDemo(){
		System.out.println("invoke constructor InitSpringDemo......");
	}
	
	@PostConstruct
	public void initMethod(){
		System.out.println("invoke @PostConstruct method......");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("invoke initMethod afterPropertiesSet......");
	}
	
	public void init(){
		System.out.println("invoke xml init-method .......");
	}
}
