package com.hlcui.concurrent;

import java.util.ArrayList;
import java.util.List;
/**
 * 这里启动10个线程，访问count对象的increase方法，如果线程安全的情况下，加到最后的结果应该是100000，但是多次尝试，
 * 结果都是小于100000，所以count类是线程不安全的类
 * 解决方法：
 * 1：在increase方法上面加锁synchronized,经过多次尝试，可以解决线程安全问题，运行结果100000
 * 2：在可能出现线程安全的代码出加锁，尽量减少代码加锁范围，提供程序运行效率,运行结果也是100000，可以解决线程安全问题
 * 3:加锁机制可以保证方法执行的原子性,实例对象被创建在主内存(堆内存)，线程操作实例对象时，会把堆内存中的对象拷贝到被分配
 * 的副内存中，然后操作副内存，操作完成后，在将副内存拷贝到主内存，替换调主内存中的对象
 * @author Administrator
 *
 */
public class ThreadSafe {
	public static void main(String[] args) {
		List<Thread> threadList = new ArrayList<Thread>();
		final Count count = new Count(0);
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
					for (int j = 0; j < 10000; j++) {
						count.increase();
					}
				}
			});
			thread.start();
			threadList.add(thread);
		}
		while (true) {
			if (allThreadisOver(threadList)) {
				break;
			}
		}
		System.out.println(count.get());
	}

	private static boolean allThreadisOver(List<Thread> threadList) {
		for (Thread t : threadList) {
			if (t.isAlive()) {
				return false;
			}
		}
		return true;
	}
}

class Count {

	private int num;

	public Count(int num) {
		this.num = num;
	}
	
	public synchronized boolean increase() {
		num++;
		return true;
	}

//	public boolean increase() {
//		synchronized(this){
//			num++;
//		}
//		return true;
//	}

	public int get() {
		return num;
	}
}
