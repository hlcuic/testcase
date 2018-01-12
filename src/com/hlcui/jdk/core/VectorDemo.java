/**
 * 
 */
package com.hlcui.jdk.core;

import java.util.Vector;

/**
 * @author Administrator
 *
 */
public class VectorDemo {
	
	private final Vector<Integer> vector = new Vector<Integer>();
	
	public VectorDemo(){
		for(int i =0;i<100;i++) {
			vector.add(i);
		}
	}
	
	public synchronized void buy() {
		String threadName = Thread.currentThread().getName();
		Integer curEle = vector.firstElement();
		System.out.println(threadName+":::"+curEle);
		vector.remove(curEle);
	}
	
	public static void main(String[] args) {
		final VectorDemo demo = new  VectorDemo();
		for(int i=0;i<5;i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					for(int j=0;j<20;j++) {
						demo.buy();
					}
					
				}
				
			},"t"+i).start();
		}
	}
}
