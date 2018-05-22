package com.hlcui.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.springframework.util.CollectionUtils;

/**
 * 对于同一个表的insert或者update操作必须保证原子性，如果多个请求过来时，可以把多个请求放入队列，
 * 然后依次处理，下一个必须等待上一个处理结束才可以进行，可以考虑使用future.get()方法
 * 
 * @author Administrator
 *
 */
public class TestFuture1 {

	public static void main(String[] args) {
		ExecutorService executorService = null;
		try {
			executorService = getExecutorService();
			long start = System.currentTimeMillis();
			List<FutureTask<Object>> list = new ArrayList<>();
			for (int i = 0; i < 15; i++) {
				Object result = executorService.submit(new MyTask(i));
				@SuppressWarnings("unchecked")
				FutureTask<Object> future = (FutureTask<Object>) result;
				System.out.println("======================" + i);
				// 使用future.get()可以阻塞线程，必须等待上一个请求执行完，返回结果下一个线程才可以继续
				// System.out.println(future.get());
				list.add(future);
			}
			/**
			 * 执行结果封装在future中，如果某个future中的数据还没有查询回来，则会阻塞
			 */
			if (!CollectionUtils.isEmpty(list)) {
				for (FutureTask<Object> task : list) {
					System.out.println((Integer) task.get());
				}
			}
			System.out.println("耗时：" + (System.currentTimeMillis() - start) + "ms");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			executorService.shutdown();
		}

	}

	/**
	 * coreThreadNum: 核心线程数10 个，平常线程池维护线程数量 maxThreadNum :
	 * 最大线程数15个，当任务增加频率大于处理速度时，就会新增5个线程来处理请求
	 */
	private static final int coreThreadNum = 10;

	private static final int maxThreadNum = 15;

	public static ExecutorService getExecutorService() {
		return new ThreadPoolExecutor(coreThreadNum, maxThreadNum, 0L, TimeUnit.MILLISECONDS,
				new ArrayBlockingQueue<Runnable>(5), new RejectedExecutionHandler() {
					@Override
					public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
						throw new RuntimeException("服务器忙,请稍后重试！");
					}
				});
	}

}

class MyTask implements Callable<Object> {

	private int num;

	public MyTask(int num) {
		this.num = num;
	}

	@Override
	public Object call() throws Exception {
		try {
			if (10 == num) {
				Thread.sleep(4000);
			} else {
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "..........");
		return num;
	}

}
