package com.hlcui.jdk.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

/**
 * 1:需要序列化的对象必须实现Serializable接口
 * @author Administrator
 *
 */
public class TestSerializable {
	
	@Test
	public void testSerializable() throws IOException{
		FileOutputStream fis = new FileOutputStream(new File("F:/11.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fis);
		Person per = new Person("jack",1000);
		oos.writeObject(per);
		oos.flush();
		oos.close();
	}
	
	@Test
	public void testDeSerializable() throws Exception{
		FileInputStream fis = new FileInputStream(new File("F:/11.txt"));
		ObjectInputStream oos = new ObjectInputStream(fis);
		Person per = (Person) oos.readObject();
		System.out.println(per);
	}
}
