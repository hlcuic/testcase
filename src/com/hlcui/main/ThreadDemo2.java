/**
 * 
 */
package com.hlcui.main;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author Administrator
 *
 */
public class ThreadDemo2 {
	public static void main(String[] args) {
		ExecutorService executors = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			executors.execute(new ThreadHolder(i));
		}
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		executors.shutdown();
	}

}

class ThreadHolder implements Runnable {

	private final int id;

	ThreadHolder(int i) {
		this.id = i;
	}

	private static ThreadLocal<Integer> tl = new ThreadLocal<Integer>() {
		Random r = new Random(47);
		public synchronized Integer initialValue() {
			return r.nextInt(100);
		}
	};

	public static void increment() {
		tl.set(tl.get() + 1);
	}

	@Override
	public void run() {
		System.out.println(this);
		ThreadHolder.increment();
		System.out.println(this);
	}
	
	public String toString() {
		return "id:::"+id+", "+tl.get();
	}

}
