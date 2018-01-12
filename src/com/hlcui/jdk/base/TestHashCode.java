package com.hlcui.jdk.base;

import java.io.Serializable;

import org.junit.Test;

/**
 * ��дequalsͬʱ��дhashcode,���ܱ�֤�Ƚ϶������ݵ���ȷ��
 * ���ֻ��дequals������дhashcode����ô�п������������������ȣ�����hashcode��ͬ��
 * ��������������
 * @author Administrator
 *
 */
public class TestHashCode {

	@Test
	public void testHashCode() {
		Person p1 = new Person("jack", 1000);
		Person p2 = new Person("jack", 1000);
		System.out.println(p1.equals(p2));
	}

}

class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;

	private double salary;

	public Person(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", salary=" + salary + "]";
	}
	
}
