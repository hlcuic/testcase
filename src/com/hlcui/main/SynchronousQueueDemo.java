/**
 * 
 */
package com.hlcui.main;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author Administrator
 *
 */
public class SynchronousQueueDemo {
	
	private SynchronousQueue queue = new SynchronousQueue();
	
	public void put() {
		try {
			queue.put("fdsf");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public Object take() {
		try {
			return queue.take();
		} catch (InterruptedException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void main(String[] args) {
		final SynchronousQueueDemo demo = new SynchronousQueueDemo();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				demo.put();
			}
			
		}).start();
		
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("ฯ๛ทัฃบ"+demo.take());
			}
			
		}).start();
		
	}
}
