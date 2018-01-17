/**
 * 
 */
package com.hlcui.jdk.core;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Administrator
 *
 */
public class MyQueue {
	
	private LinkedList<String> list = new LinkedList<String>();
	
	private AtomicInteger auto = new AtomicInteger();
	
	private  int MAX_SIZE;
	
	private final int MIN_SIZE = 0;
	
	private final Object lock = new Object();
	
	public MyQueue(int mAX_SIZE) {
		super();
		MAX_SIZE = mAX_SIZE;
	}
	
	public void put(String good) {
		synchronized (lock) {
			while(list.size()==MAX_SIZE) {
				try {
					//�����������Ʒ�������ﵽ���ޣ���ô�������߳�
					System.out.println("��������");
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			list.add(good);
			auto.incrementAndGet();
			lock.notify();
		}
		
	}
	
	public String take() {
		String s = null;
		synchronized (lock) {
			while(list.size()==MIN_SIZE) {
				try {
					System.out.println("�����ѿ�");
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			s = list.removeFirst();
			auto.decrementAndGet();
			lock.notify();
		}
		return s;
	}
	
	public int size() {
		return list.size();
	}

	public static void main(String[] args) {
		final MyQueue queue = new MyQueue(5);
		for(int i=0;i<5;i++) {
			queue.put(i+"");
		}
		System.out.println("Ŀǰ������Ԫ��������"+queue.size());
		ExecutorService executors = Executors.newFixedThreadPool(2);
		executors.execute(new Runnable() {
			@Override
			public void run() {
				for(int i=10;i<20;i++) {
					queue.put(i+"");
					System.out.println("���Ԫ�أ�"+i+"");
				}
			}
		});
		
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		executors.execute(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<50;i++) {
					System.out.println("ȡ��Ԫ�أ�"+queue.take());
				}
			}
		});
	}
}
