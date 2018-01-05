/**
 * 
 */
package com.hlcui.entity;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import com.hlcui.entity.Car;

/**
 * @author Administrator
 * 
 */
//@Component("fdsfs")
public class Car implements FactoryBean<Emp>,BeanNameAware,BeanFactoryAware{
	private Emp emp = new Emp();
	private int carId;
	private String description;
	private String features;
	private List<String> others;
	
	public Car() {}
	public Car(int carId, String description, String features,
			List<String> others) {
		super();
		this.carId = carId;
		this.description = description;
		this.features = features;
		this.others = others;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public List<String> getOthers() {
		return others;
	}

	public void setOthers(List<String> others) {
		this.others = others;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", description=" + description
				+ ", features=" + features + ", others=" + others + "]";
	}

	@Override
	public Emp getObject() throws Exception {
		return this.emp;
	}

	@Override
	public Class<?> getObjectType() {
		return this.emp.getClass();
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
	
	@Override
	public void setBeanName(String s) {
		System.out.println(s);
	}
	@Override
	public void setBeanFactory(BeanFactory beanfactory) throws BeansException {
	}
	
}
