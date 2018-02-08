
package com.hlcui.jdk.core;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

/**
 * ÿ���̶߳����Լ��Ĵ洢�ռ䣬�̻߳�ѳ�Ա�����������Լ��ĸ��߻��棬����ÿ���̶߳��������Լ���
 * ��������������Ӱ�����߳�,��������һ�ֽ���̰߳�ȫ����ķ�ʽ
 * 
 * @author Administrator
 *
 */
public class TestThreadLocal {

	// �����������߳��еĸ���
	private ThreadLocal<String> threadLocal = new ThreadLocal<String>();

	private ThreadLocal<Map<String, String>> threadLocalMap = new ThreadLocal<Map<String, String>>() {
		public Map<String, String> initialValue() {
			return new HashMap<String, String>();
		}
	};

	@Test
	public void testThreadLocal2() {
		Thread t1 = new Thread(new MyRun1());
		Thread t2 = new Thread(new MyRun2());
		t1.start();
		t2.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(threadLocalMap);
	}

	class MyRun1 implements Runnable {

		@Override
		public void run() {
			threadLocalMap.get().put("1", "1");
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + ":::" + threadLocalMap.get().get("1"));
		}

	}

	class MyRun2 implements Runnable {

		@Override
		public void run() {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + ":::" + threadLocalMap.get().get("1"));
		}

	}

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
