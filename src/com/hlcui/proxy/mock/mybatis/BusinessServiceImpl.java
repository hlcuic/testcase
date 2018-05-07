package com.hlcui.proxy.mock.mybatis;

import java.lang.reflect.Proxy;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.ClassUtils;

import com.hlcui.annotation.DataProvider;

@DataProvider
public class BusinessServiceImpl implements FactoryBean<Object>, InitializingBean {

	private Object proxy;

	private ClassLoader classLoader;

	private Class<?> clazz;

	public BusinessServiceImpl() {
		this.classLoader = ClassUtils.getDefaultClassLoader();
	}

	@Override
	public Object getObject() throws Exception {
		if (null == proxy) {
			afterPropertiesSet();
		}
		return proxy;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		initProxy();
	}

	public void initProxy() {
		JdkDynamiceAspect aspect = new JdkDynamiceAspect();
		proxy = Proxy.newProxyInstance(classLoader, new Class[] { clazz },aspect);
	}

	@Override
	public Class<?> getObjectType() {
		return this.clazz;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	public void setClazz(Class<?> clazz) {
		this.clazz = clazz;
	}

}
