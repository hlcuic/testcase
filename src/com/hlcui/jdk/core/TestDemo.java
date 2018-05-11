package com.hlcui.jdk.core;

public class TestDemo {

	private static final Object lock1 = new Object();
	private static final Object lock2 = new Object();

	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				
				synchronized (lock1) {
					test01();
					synchronized (lock2) {
						test02();
					}
				}
				
				

			}

		},"�߳�1").start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (lock2) {
					test02();
					synchronized(lock1){
						test01();
					}
				}
				
				
				
			}

		},"�߳�2").start();
	}

	private static void test01() {
		System.out.println(Thread.currentThread().getName()+"  ����test01");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"  �ͷ�test01");
	}

	private static void test02() {
		System.out.println(Thread.currentThread().getName()+"  ����test02");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"  �ͷ�test02");
	}

}
