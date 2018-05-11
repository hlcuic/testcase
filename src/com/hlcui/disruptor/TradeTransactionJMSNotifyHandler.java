package com.hlcui.disruptor;

import com.lmax.disruptor.EventHandler;  

public class TradeTransactionJMSNotifyHandler implements EventHandler<TradeTransaction>{  
	private int i;
    //消费者C3接到消息后的业务处理逻辑  
    @Override  
    public void onEvent(TradeTransaction arg0, long arg1, boolean arg2) throws Exception {  
        //do send jms message    
        System.out.println("最后一个消费者C3========"+i++);  
    }  
  
}  