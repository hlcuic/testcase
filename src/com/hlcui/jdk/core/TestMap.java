package com.hlcui.jdk.core;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestMap {
	public static void main(String[] args) {
		//1:在HashMap对象调用的方法前加上锁(代码块),效率比较低，线程安全
		Map<Object, Object> map1 = Collections.synchronizedMap(new HashMap<>());
		//2:hashtable所有方法上面都有synchronized锁，所以线程安全，但是效率低
		Map<String,String> map2 = new Hashtable<>();
		//3:维护一个片段数组，访问不同的片段数组，可以并发，访问相同的片段，会同步阻塞
		Map<String,String> map3 = new ConcurrentHashMap<>();
		System.out.println("".hashCode());
		System.out.println(8&7);
	}
	
}
