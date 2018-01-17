package com.hlcui.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/**
 * ����ͬһ�����insert����update�������뱣֤ԭ���ԣ��������������ʱ�����԰Ѷ�����������У�
 * Ȼ�����δ�����һ������ȴ���һ����������ſ��Խ��У����Կ���ʹ��future.get()����
 * @author Administrator
 *
 */
public class TestFuture1 {

	public static void main(String[] args) {
		ExecutorService executorService = null;
		try {
			executorService = getExecutorService();
			for(int i=0;i<6;i++){
				Object result = executorService.submit(new MyTask(i));
				@SuppressWarnings("unchecked")
				FutureTask<Object> future = (FutureTask<Object>)result;
				System.out.println("======================"+i);
				//ʹ��future.get()���������̣߳�����ȴ���һ������ִ���꣬���ؽ����һ���̲߳ſ��Լ���
				System.out.println(future.get());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			executorService.shutdown();
		}
		
	}
	
	private static final int coreThreadNum = 5;
	
	private static final int maxThreadNum = 10;

	public static ExecutorService getExecutorService() {
		return new ThreadPoolExecutor(coreThreadNum, maxThreadNum, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(5),
				new RejectedExecutionHandler() {
					@Override
					public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
						throw new RuntimeException("������æ��");
					}
				});
	}

}

class MyTask implements Callable<Object>{
	
	private int num;
	
	public MyTask(int num){
		this.num = num;
	}

	@Override
	public Object call() throws Exception {
		try {
			if(3==num){
				Thread.sleep(3000);
			}
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"..........");
		return num;
	}

	 
	
}
