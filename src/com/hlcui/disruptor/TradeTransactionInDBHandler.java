package com.hlcui.disruptor;

import com.lmax.disruptor.EventHandler;  
import com.lmax.disruptor.WorkHandler;  
  
public class TradeTransactionInDBHandler implements EventHandler<TradeTransaction>,WorkHandler<TradeTransaction>{  
	private int i;
    @Override  
    public void onEvent(TradeTransaction event) throws Exception {  
        this.onEvent(event);      
    }  
    @Override  
    public void onEvent(TradeTransaction event, long arg1, boolean arg2) throws Exception {  
       // event.setId(UUID.randomUUID().toString());
        System.out.println("========"+(i++));    
    }  
} 