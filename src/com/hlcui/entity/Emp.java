/**
 * 
 */
package com.hlcui.entity;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author Administrator
 * spring����������ʵ����bean����ʼ��������˳�����ȹ��췽��
 * ����postContructor����InitializingBean��afterPropertiesSet(),
 * ��xml��init-method
 */
public class Emp implements InitializingBean{
	
	private String name;
	
	private int age;
	
	public Emp(){
		System.out.println("Emp constructor.....");
	}
	
	public void init(){
		System.out.println("Emp  init-method...init");
	}
	
	@PostConstruct
	public void reload(){
		System.out.println("Emp @PostConstruct...");
	}
	
	public Emp(String name, int age) {
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
		return "Emp[name="+name+",age="+age+"]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Emp InitializingBean....afterPropertiesSet");
	}
	
}
