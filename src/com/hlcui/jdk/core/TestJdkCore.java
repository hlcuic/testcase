package com.hlcui.jdk.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

public class TestJdkCore {

	@Test
	public void testString() {
		String s1 = "11";
		String s2 = new String(s1);
		System.out.println(s1 == s2);// b
		System.out.println(s1.equals(s2));
	}
	
	/**
	 * JUNIT线程退出后，子线程也结束执行
	 */
	@Test
	public void testThread(){
		ExecutorService service = Executors.newFixedThreadPool(20);
		long start = System.currentTimeMillis();
		for(int i=0;i<1000;i++){
			final int a = i;
			service.execute(new Runnable(){
				@Override
				public void run() {
					System.out.println("======="+Thread.currentThread().getName()+"======="+a);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			});
		}
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		service.shutdown();
		long end = System.currentTimeMillis();
		System.out.println("total cost "+(end-start)+"ms");
	}

	/**
	 * main线程退出后，子线程还在继续执行
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(20);
		long start = System.currentTimeMillis();
		for(int i=0;i<1000;i++){
			final int a = i;
			service.execute(new Runnable(){
				@Override
				public void run() {
					System.out.println("======="+Thread.currentThread().getName()+"======="+a);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			});
		}
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		service.shutdown();
		long end = System.currentTimeMillis();
		System.out.println("total cost "+(end-start)+"ms");
	}

}
