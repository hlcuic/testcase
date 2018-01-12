
package com.hlcui.jdk.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;
/**
 * ÿ���̶߳����Լ��Ĵ洢�ռ䣬�̻߳�ѳ�Ա�����������Լ��ĸ��߻��棬����ÿ���̶߳��������Լ���
 * ��������������Ӱ�����߳�,��������һ�ֽ���̰߳�ȫ����ķ�ʽ
 * @author Administrator
 *
 */
public class TestThreadLocal {

	// �����������߳��еĸ���
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
