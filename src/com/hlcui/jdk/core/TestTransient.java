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
 * 1:Serializable  序列号对象必须实现该接口
 * 2:serialVersionUID 序列化和反序列化的版本号必须一致，否则不能反序列化
 * 3:被transient关键字修饰的字段不能被序列化，反序列化的时候拿不到数据
 * 4:被静态static修饰的字段一定能够序列化
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
