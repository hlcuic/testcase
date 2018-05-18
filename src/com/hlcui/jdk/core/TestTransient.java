package com.hlcui.jdk.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestTransient {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		User user = new User();
		user.setName("jack");
		user.setSal(20000);
		write(user);
		
		System.out.println("=====natiSeri=====");
		User user1 = read();
		System.out.println(user1);
	}
	
	private static User read(){
		User user = null;
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(new File("1.txt")));
			try {
				user = (User) in.readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return user;
		
	}
	
	private static void write(User user){
		ObjectOutputStream out;
		try {
			out = new ObjectOutputStream(new FileOutputStream(new File("1.txt")));
			out.writeObject(user);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
}
/**
 * 1:Serializable  ���кŶ������ʵ�ָýӿ�
 * 2:serialVersionUID ���л��ͷ����л��İ汾�ű���һ�£������ܷ����л�
 * 3:��transient�ؼ������ε��ֶβ��ܱ����л��������л���ʱ���ò�������
 * 4:����̬static���ε��ֶ�һ���ܹ����л�
 */

class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static transient String name;
	private double sal;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", sal=" + sal + "]";
	}
	
}
