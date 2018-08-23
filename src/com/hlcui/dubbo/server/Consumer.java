package com.hlcui.dubbo.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-consumer.xml"});
        context.start();
        // Obtaining a remote service proxy
        DubboDemoService demoService = (DubboDemoService)context.getBean("demoService");
        // Executing remote methods
        System.out.println("---------------------------");
        new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<10;i++){
					System.out.println("==============================================================");
					String hello = demoService.sayHello("world");
			        // Display the call result
			     System.out.println(hello);
			     try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				 
			}
        	
        }).start();
        Thread.sleep(Long.MAX_VALUE);
       
    }
}