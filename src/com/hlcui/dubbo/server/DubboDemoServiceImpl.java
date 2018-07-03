package com.hlcui.dubbo.server;

import org.springframework.stereotype.Service;

@Service
public class DubboDemoServiceImpl implements DubboDemoService{
	public String sayHello(String name){
		return "hello "+name;
	}
}
