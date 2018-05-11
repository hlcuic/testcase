package com.hlcui.disruptor;

import com.lmax.disruptor.EventHandler;  

public class TradeTransactionVasConsumer implements EventHandler<TradeTransaction>{  
  
	private int i;
    //消费者C1接到消息后的业务处理逻辑  
    @Override  
    public void onEvent(TradeTransaction arg0, long arg1, boolean arg2) throws Exception {  
        // TODO Auto-generated method stub throws Exception {  
        // do something....  
        System.out.println("第一个消费者C1========"+(i++));  
    }    
  
} 