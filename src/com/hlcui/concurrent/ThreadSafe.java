package com.hlcui.concurrent;

import java.util.ArrayList;
import java.util.List;
/**
 * ��������10���̣߳�����count�����increase����������̰߳�ȫ������£��ӵ����Ľ��Ӧ����100000�����Ƕ�γ��ԣ�
 * �������С��100000������count�����̲߳���ȫ����
 * ���������
 * 1����increase�����������synchronized,������γ��ԣ����Խ���̰߳�ȫ���⣬���н��100000
 * 2���ڿ��ܳ����̰߳�ȫ�Ĵ�����������������ٴ��������Χ���ṩ��������Ч��,���н��Ҳ��100000�����Խ���̰߳�ȫ����
 * 3:�������ƿ��Ա�֤����ִ�е�ԭ����,ʵ�����󱻴��������ڴ�(���ڴ�)���̲߳���ʵ������ʱ����Ѷ��ڴ��еĶ��󿽱���������
 * �ĸ��ڴ��У�Ȼ��������ڴ棬������ɺ��ڽ����ڴ濽�������ڴ棬�滻�����ڴ��еĶ���
 * @author Administrator
 *
 */
public class ThreadSafe {
	public static void main(String[] args) {
		List<Thread> threadList = new ArrayList<Thread>();
		final Count count = new Count(0);
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
					for (int j = 0; j < 10000; j++) {
						count.increase();
					}
				}
			});
			thread.start();
			threadList.add(thread);
		}
		while (true) {
			if (allThreadisOver(threadList)) {
				break;
			}
		}
		System.out.println(count.get());
	}

	private static boolean allThreadisOver(List<Thread> threadList) {
		for (Thread t : threadList) {
			if (t.isAlive()) {
				return false;
			}
		}
		return true;
	}
}

class Count {

	private int num;

	public Count(int num) {
		this.num = num;
	}
	
	public synchronized boolean increase() {
		num++;
		return true;
	}

//	public boolean increase() {
//		synchronized(this){
//			num++;
//		}
//		return true;
//	}

	public int get() {
		return num;
	}
}
