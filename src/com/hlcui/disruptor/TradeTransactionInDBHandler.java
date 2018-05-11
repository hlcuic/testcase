package com.hlcui.disruptor;

import java.util.UUID;  

import com.lmax.disruptor.EventHandler;  
import com.lmax.disruptor.WorkHandler;  
  
public class TradeTransactionInDBHandler implements EventHandler<TradeTransaction>,WorkHandler<TradeTransaction>{  
	private int i;
    @Override  
    public void onEvent(TradeTransaction event) throws Exception {  
        this.onEvent(event);      
    }  
    //消费者C2接到消息后的具体的业务 处理逻辑  
    @Override  
    public void onEvent(TradeTransaction event, long arg1, boolean arg2) throws Exception {  
         //这里做具体的消费业务逻辑，即就是接到消息后的业务处理逻辑  
       // event.setId(UUID.randomUUID().toString());//随机简单生成下ID 并且打印出来   
        System.out.println("第二个消费者C2消费了消息 ========"+(i++));    
    }  
} 