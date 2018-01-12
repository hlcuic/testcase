
package com.hlcui.jdk.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;
/**
 * 每个线程都有自己的存储空间，线程会把成员变量拷贝到自己的告诉缓存，这样每个线程独立操作自己的
 * 缓存区，而不会影响别的线程,这是另外一种解决线程安全问题的方式
 * @author Administrator
 *
 */
public class TestThreadLocal {

	// 保留变量在线程中的副本
	private ThreadLocal<String> threadLocal = new ThreadLocal<String>();

	@Test
	public void testThreadLocal() {
		ExecutorService executors = Executors.newFixedThreadPool(2);
		executors.execute(new Runnable() {
			@Override
			public void run() {
				threadLocal.set("tom");
				String threadName = Thread.currentThread().getName();
				System.out.println(threadName + ":::" + threadLocal.get());
			}
		});
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		executors.execute(new Runnable() {
			@Override
			public void run() {
				String threadName = Thread.currentThread().getName();
				System.out.println(threadName + ":::" + threadLocal.get());
			}
		});

		executors.shutdown();
	}

}
