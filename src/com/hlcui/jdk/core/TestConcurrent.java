package com.hlcui.jdk.core;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.xml.bind.JAXB;

import org.junit.Test;

public class TestConcurrent {

	@Test
	public void test1() {

		final Station station = new Station(1000);

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 400; i++) {
					station.buy();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + ":剩余票数：" + station.getCount());
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 400; i++) {
					station.buy();
					System.out.println(Thread.currentThread().getName() + ":剩余票数：" + station.getCount());
				}
			}
		});

		t1.start();
		t2.start();

	}

	@Test
	public void testUnsafeThread() {
		final UnsafeThread demo = new UnsafeThread();
		ExecutorService service = Executors.newFixedThreadPool(20);
		for (int i = 0; i < 200; i++) {
			service.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println(demo.getNext());
				}
			});
		}

	}

//	@Test
//	public void testThreadYield() {
//		Thread t1 = new Thread(new MyThread());
//		Thread t2 = new Thread(new MyThread());
//		t1.start();
//		t2.start();
//	}

	public static void main(String[] args) {
		CountDownLatch count = new CountDownLatch(20);
		long start = System.currentTimeMillis();
		System.out.println("=============start============");
		Thread t1 = new Thread(new MyThread(count),"aaaaaaa");
		Thread t2 = new Thread(new MyThread(count));
		Thread t3 = new Thread(new MyThread(count));
		Thread t4 = new Thread(new MyThread(count));
		Thread t5 = new Thread(new MyThread(count));
		Thread t6 = new Thread(new MyThread(count));
		Thread t7 = new Thread(new MyThread(count));
		Thread t8 = new Thread(new MyThread(count));
		Thread t9 = new Thread(new MyThread(count));
		Thread t11 = new Thread(new MyThread(count));
		Thread t12 = new Thread(new MyThread(count));
		Thread t13 = new Thread(new MyThread(count));
		Thread t14 = new Thread(new MyThread(count));
		Thread t15 = new Thread(new MyThread(count));
		Thread t16 = new Thread(new MyThread(count));
		Thread t17 = new Thread(new MyThread(count));
		Thread t18 = new Thread(new MyThread(count));
		Thread t19 = new Thread(new MyThread(count));
		Thread t20 = new Thread(new MyThread(count));
		Thread t10 = new Thread(new MyThread(count));
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		t11.start();
		t12.start();
		t13.start();
		t14.start();
		t15.start();
		t16.start();
		t17.start();
		t18.start();
		t19.start();
		t20.start();
		try {
			count.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("=============end============\n"+(System.currentTimeMillis()-start)+"ms");
	}

}

class MyThread implements Runnable {
	private CountDownLatch count;
	
	public MyThread(CountDownLatch count) {
		super();
		this.count = count;
	}

	@Override
	public void run() {
		System.out.println("当前线程：" + Thread.currentThread().getName());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		count.countDown();
	}

}

class UnsafeThread {
	private int value;

	public synchronized int getNext() {
		return value++;
	}
}

class Station {

	private int ticketCount;

	public Station(int ticketCount) {
		this.ticketCount = ticketCount;
	}

	public void buy() {
		ticketCount--;
	}

	public int getCount() {
		return ticketCount;
	}

}
