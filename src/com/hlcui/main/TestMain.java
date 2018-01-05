/**
 * 
 */
package com.hlcui.main;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author Administrator
 *
 */
public class TestMain {
	public static void main(String[] args) {
		Runnable r1 = new MyRun("线程1");
		Runnable r2 = new MyRun("线程2");
		new Thread(r1).start();
		new Thread(r2).start();
	}
}

class MyRun implements Runnable{
	
	private static AtomicBoolean exist = new AtomicBoolean(false);
	
	private String name;
	
	MyRun(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		if(exist.compareAndSet(false,true)){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			doOperate();
			exist.set(false);
		}
	}
	
	private void doOperate(){
		System.out.println(name+" entering...");
		try {
			System.out.println(name+" working...");
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+" leaving");
	}
	
}
