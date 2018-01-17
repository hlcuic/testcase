package com.hlcui.jdk.core;

import org.junit.Test;

public class TestJdkCore {
	
	@Test
	public void testString(){
		String s = "11";
		System.out.println(s.intern()==s);
	}
}
