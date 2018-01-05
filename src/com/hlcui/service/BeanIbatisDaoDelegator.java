/**
 * 
 */
package com.hlcui.service;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

import com.hlcui.entity.Emp;

/**
 * @author Administrator
 *
 */
@Component
public class BeanIbatisDaoDelegator implements BeanDefinitionRegistryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		System.out.println(Arrays.toString(arg0.getBeanDefinitionNames()));
		System.out.println(arg0.getBeanDefinitionCount());
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		GenericBeanDefinition  beanDefinition = createBeanDefinition();
		registry.registerBeanDefinition("emp", beanDefinition);
	}
	
	private GenericBeanDefinition createBeanDefinition() {
		GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
		beanDefinition.setBeanClass(Emp.class);
		return beanDefinition;
	}

}
