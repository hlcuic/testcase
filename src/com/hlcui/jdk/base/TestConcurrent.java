package com.hlcui.jdk.base;

import org.junit.Test;

public class TestConcurrent {
	
	@Test
	public void test1() {
		
		final Station station = new Station(1000);
		
		 Thread t1 = new Thread(new Runnable(){
			@Override
			public void run() {
				for(int i=0;i<400;i++){
					station.buy();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+":Ê£ÓàÆ±Êý£º"+station.getCount());
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable(){
			@Override
			public void run() {
				for(int i=0;i<400;i++){
					station.buy();
					System.out.println(Thread.currentThread().getName()+":Ê£ÓàÆ±Êý£º"+station.getCount());
				}
			}
		});
		
		t1.start();
		t2.start();
		
	}
}

class Station{
	
	private int ticketCount;
	
	public Station(int ticketCount){
		this.ticketCount = ticketCount;
	}
	
	public void buy(){
		ticketCount--;
	}
	
	public int getCount(){
		return ticketCount;
	}
	
}
