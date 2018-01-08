/**
 * 
 */
package com.hlcui.proxy.mock.mybatis;

import java.beans.Introspector;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;

@Component
public class MockMybatisDelegator implements BeanDefinitionRegistryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		GenericBeanDefinition  beanDefinition = generateBeanDefinition();
		beanDefinition.getPropertyValues().add("clazz",AutoDelegetorInterface.class);
		registry.registerBeanDefinition(beanDefinitionName(beanDefinition), beanDefinition);
	}
	
	private GenericBeanDefinition generateBeanDefinition() {
		GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
		beanDefinition.setBeanClass(BusinessServiceImpl.class);
		return beanDefinition;
	}
	
	protected String beanDefinitionName(GenericBeanDefinition beanDefinition){
		String shortName = ClassUtils.getShortName(beanDefinition.getBeanClass());
		return Introspector.decapitalize(shortName);
	}

}
