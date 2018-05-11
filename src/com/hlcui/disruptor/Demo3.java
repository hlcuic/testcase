package com.hlcui.disruptor;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import com.lmax.disruptor.LiteBlockingWaitStrategy;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.EventHandlerGroup;
import com.lmax.disruptor.dsl.ProducerType;

public class Demo3 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws InterruptedException {
		long beginTime = System.currentTimeMillis();
		// ��һ������������ring buffer�д���event���ڶ���������ring
		// buffer�Ĵ�С�������������������ߴ�����Ϣ��ʹ�õ��̳߳ء����ĸ������ǵ����߶�������ģʽ������������ǿ�ѡ�ĵȴ����ԡ�
		/*
		 * �������ߵȴ���SequenceBarrier��ʱ��������ѡ�ĵȴ����ԣ���ͬ�ĵȴ��������ӳٺ�CPU��Դ��ռ����������ͬ��
		 * ������Ӧ�ó���ѡ��
		 * 
		 * BusySpinWaitStrategy �� �����ȴ�������Linux Kernelʹ�õ������������ӳٵ�ͬʱ��CPU��Դ��ռ��Ҳ�ࡣ
		 * 
		 * BlockingWaitStrategy �� ʹ����������������CPU��Դ��ռ���٣��ӳٴ�
		 * 
		 * SleepingWaitStrategy ��
		 * �ڶ��ѭ�����Բ��ɹ���ѡ���ó�CPU���ȴ��´ε��ȣ���ε��Ⱥ��Բ��ɹ�������ǰ˯��һ�����뼶���ʱ���ٳ��ԡ�
		 * ���ֲ���ƽ�����ӳٺ�CPU��Դռ�ã����ӳٲ����ȡ�
		 * 
		 * YieldingWaitStrategy ��
		 * �ڶ��ѭ�����Բ��ɹ���ѡ���ó�CPU���ȴ��´ε���ƽ�����ӳٺ�CPU��Դռ�ã����ӳ�Ҳ�ȽϾ��ȡ�
		 * 
		 * PhasedBackoffWaitStrategy �� ������ֲ��Ե��ۺϣ�CPU��Դ��ռ���٣��ӳٴ�
		 */
		// ���ϴ�����Ҫ��������RingBuffer.
		int bufferSize = 1024;
		ExecutorService executor = Executors.newFixedThreadPool(4);
		ThreadFactory threadFactory = Executors.defaultThreadFactory();
		/*
		 * Disruptor<TradeTransaction> disruptor = new
		 * Disruptor<TradeTransaction>(new EventFactory<TradeTransaction>() {
		 * 
		 * @Override public TradeTransaction newInstance() {
		 * //������EventFactory,�¼�����,����ְ����ǲ����������ringBuffer�� return new
		 * TradeTransaction(); } }, bufferSize, executor, ProducerType.SINGLE,
		 * new BusySpinWaitStrategy());
		 */

		// ����ֻ��Ҫʹ�� Person::new
		// ����ȡPerson�๹�캯�������ã�Java���������Զ�����PersonFactory.create������ǩ����ѡ����ʵĹ��캯����
		Disruptor<TradeTransaction> disruptor = new Disruptor<>(TradeTransaction::new, bufferSize, threadFactory,
				ProducerType.SINGLE, new LiteBlockingWaitStrategy());
		// ʹ��disruptor������������C1,C2
		EventHandlerGroup<TradeTransaction> handlerGroup = disruptor.handleEventsWith(new TradeTransactionVasConsumer(),
				new TradeTransactionInDBHandler());

		TradeTransactionJMSNotifyHandler jmsConsumer = new TradeTransactionJMSNotifyHandler();
		// ������C1,C2����֮��ִ��JMS��Ϣ���Ͳ��� Ҳ���������ߵ�C3
		handlerGroup.then(jmsConsumer);

		disruptor.start();// ����
		CountDownLatch latch = new CountDownLatch(1);
		// ������׼��
		executor.submit(new TradeTransactionPublisher(latch, disruptor));
		latch.await();// �ȴ�����������.
		disruptor.shutdown();
		executor.shutdown();

		System.out.println("�ܺ�ʱ:" + (System.currentTimeMillis() - beginTime));
	}

}
