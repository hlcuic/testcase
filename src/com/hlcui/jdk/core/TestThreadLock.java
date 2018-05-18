package com.hlcui.jdk.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

public class TestThreadLock {
	private static Object lock = new Object();
	
	@Test
	public void testCase() {
		final P p = new P();
		ExecutorService service = Executors.newFixedThreadPool(3);
		service.execute(new Runnable(){
			@Override
			public void run() {
				for(int i =0;i<3;i++){
					synchronized (lock) {
						p.doThis();
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		});
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void test() {
		System.out.println("ddddddd");
	}
}

class P {
	public void doThis() {
		TestThreadLock.test();
	}
}
