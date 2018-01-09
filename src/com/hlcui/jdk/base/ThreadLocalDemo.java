/**
 * 
 */
package com.hlcui.jdk.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Administrator
 *
 */
public class ThreadLocalDemo {
	
	//保留变量在线程中的副本
	private ThreadLocal<String> threadLocal = new ThreadLocal<String>();
	
	private void set(String name) {
		threadLocal.set(name);
	}
	
	private String get() {
		return threadLocal.get();
	}
	
	public static void main(String[] args) {
		final ThreadLocalDemo demo = new ThreadLocalDemo();
		
		ExecutorService executors = Executors.newFixedThreadPool(2);
		executors.execute(new Runnable() {
			@Override
			public void run() {
				//demo.set("tom");
				String threadName = Thread.currentThread().getName();
				System.out.println(threadName+":::"+demo.get());
			}
		});
		
		executors.execute(new Runnable() {
			@Override
			public void run() {
				demo.set("jack");
				String threadName = Thread.currentThread().getName();
				System.out.println(threadName+":::"+demo.get());
			}
		});
		
		executors.shutdown();
	}
}
