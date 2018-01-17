package com.hlcui.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/**
 * 对于同一个表的insert或者update操作必须保证原子性，如果多个请求过来时，可以把多个请求放入队列，
 * 然后依次处理，下一个必须等待上一个处理结束才可以进行，可以考虑使用future.get()方法
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
				//使用future.get()可以阻塞线程，必须等待上一个请求执行完，返回结果下一个线程才可以继续
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
						throw new RuntimeException("服务器忙！");
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
