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
 * ����ͬһ�����insert����update�������뱣֤ԭ���ԣ��������������ʱ�����԰Ѷ�����������У�
 * Ȼ�����δ�����һ������ȴ���һ����������ſ��Խ��У����Կ���ʹ��future.get()����
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
				// ʹ��future.get()���������̣߳�����ȴ���һ������ִ���꣬���ؽ����һ���̲߳ſ��Լ���
				// System.out.println(future.get());
				list.add(future);
			}
			/**
			 * ִ�н����װ��future�У����ĳ��future�е����ݻ�û�в�ѯ�������������
			 */
			if (!CollectionUtils.isEmpty(list)) {
				for (FutureTask<Object> task : list) {
					System.out.println((Integer) task.get());
				}
			}
			System.out.println("��ʱ��" + (System.currentTimeMillis() - start) + "ms");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			executorService.shutdown();
		}

	}

	/**
	 * coreThreadNum: �����߳���10 ����ƽ���̳߳�ά���߳����� maxThreadNum :
	 * ����߳���15��������������Ƶ�ʴ��ڴ����ٶ�ʱ���ͻ�����5���߳�����������
	 */
	private static final int coreThreadNum = 10;

	private static final int maxThreadNum = 15;

	public static ExecutorService getExecutorService() {
		return new ThreadPoolExecutor(coreThreadNum, maxThreadNum, 0L, TimeUnit.MILLISECONDS,
				new ArrayBlockingQueue<Runnable>(5), new RejectedExecutionHandler() {
					@Override
					public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
						throw new RuntimeException("������æ,���Ժ����ԣ�");
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
