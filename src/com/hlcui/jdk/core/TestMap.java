package com.hlcui.jdk.core;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestMap {
	public static void main(String[] args) {
		//1:��HashMap������õķ���ǰ������(�����),Ч�ʱȽϵͣ��̰߳�ȫ
		Map<Object, Object> map1 = Collections.synchronizedMap(new HashMap<>());
		//2:hashtable���з������涼��synchronized���������̰߳�ȫ������Ч�ʵ�
		Map<String,String> map2 = new Hashtable<>();
		//3:ά��һ��Ƭ�����飬���ʲ�ͬ��Ƭ�����飬���Բ�����������ͬ��Ƭ�Σ���ͬ������
		Map<String,String> map3 = new ConcurrentHashMap<>();
		System.out.println("".hashCode());
		System.out.println(8&7);
	}
	
}
