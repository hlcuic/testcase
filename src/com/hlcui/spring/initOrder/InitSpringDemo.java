package com.hlcui.spring.initOrder;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
/**
 * spring容器启动，初始化顺序如下：
invoke constructor InitSpringDemo......
postProcessBeforeInitialization...initSpringDemo
invoke @PostConstruct method......
invoke initMethod afterPropertiesSet......
invoke xml init-method .......
postProcessAfterInitialization...initSpringDemo
先调用构造方法实例化对象——再调用BeanPostProcessor后置处理器预留方法，postProcessBeforeInitialization，通过此方法我们可以
对spring容器维护的bean实例进行修改操作——再@PostConstruct标注的初始化方法——再调用实现InitializingBean接口实现afterPropertiesSet
方法——再调用spring容器xml中配置的init-method属性方法——调用BeanPostProcessor后置处理器的postProcessAfterInitialization方法
一般情况下，我们使用此方法比较多，待bean处理化完成后再做修改
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
