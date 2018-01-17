package com.hlcui.concurrent;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class TestFuture2 {
	public static void main(String[] args) {
		
		Callable<Object> call = new Callable<Object>(){
			@Override
			public Object call() throws Exception {
				return new Random().nextInt(10);
			}
		};
		
		FutureTask<Object> future = new FutureTask<Object>(call);
		new Thread(future).start(); //��������һ���߳�ȥ��ȡ���
		
		try {
			//do some other thing
			Thread.sleep(5000);
			System.out.println(future.get());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


