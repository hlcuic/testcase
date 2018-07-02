package com.hlcui.dubbo.server;

public class DubboDemoServiceImpl implements DubboDemoService{
	public String sayHello(String name){
		return "hello "+name;
	}
}
