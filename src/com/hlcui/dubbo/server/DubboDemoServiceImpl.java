package com.hlcui.dubbo.server;

public class DubboDemoServiceImpl implements DubboDemoService{

	@Override
	public String sayHello(String name) {
		return "Hello world!";
	}

}
