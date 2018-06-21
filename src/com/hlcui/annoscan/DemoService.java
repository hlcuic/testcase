package com.hlcui.annoscan;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
	
	@PostConstruct
	private void init(){
		System.out.println("====init DemoService====");
	}
}
