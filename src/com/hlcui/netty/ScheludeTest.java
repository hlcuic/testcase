package com.hlcui.netty;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheludeTest {
	public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.scheduleAtFixedRate(new MyRun(),1000L,3000L, TimeUnit.MILLISECONDS);
	}
}

class MyRun implements Runnable{

	@Override
	public void run() {
		System.out.println("hello world!");
	}
	
}
