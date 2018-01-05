/**
 * 
 */
package com.hlcui.main;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Administrator
 *
 */
public class ConcurrentHashMapDemo {
	
	//private ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
	
	private HashMap<String,Integer> map = new HashMap<String,Integer>();
	
	public void put(String key,Integer value) {
		this.map.put(key, value);
	}
	
	public static void main(String[] args) {
		final ConcurrentHashMapDemo demo = new ConcurrentHashMapDemo();
		ExecutorService  executors = Executors.newFixedThreadPool(5);
		for(int i=0;i<500;i++) {
			final int index = i;
			executors.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName());
					demo.put(index+"",index);
				}
				
			});
		}
		executors.shutdown();
		System.out.println(demo.map);
	}
}
