package com.hlcui.disruptor;

import java.util.concurrent.CountDownLatch;

import com.lmax.disruptor.EventTranslator;
import com.lmax.disruptor.dsl.Disruptor;  
//创建一个发送消费事件 的类，用于发送要处理的消息  
public class TradeTransactionPublisher implements Runnable {  
    Disruptor<TradeTransaction> disruptor;    
    private CountDownLatch latch;  
  //生产者发送10条消息
    private static int LOOP=10;   
      
    public TradeTransactionPublisher(CountDownLatch latch,Disruptor<TradeTransaction> disruptor) {    
        this.disruptor=disruptor;    
        this.latch=latch;    
    }    
    
    @Override  
    public void run() {  
        // TODO Auto-generated method stub  
		TradeTransactionEventTranslator tradeTransloator=new TradeTransactionEventTranslator();    
        for(int i=0;i<LOOP;i++){    
            System.out.println("生产者成功向Ringbuffer中发送了一条消息");  
            disruptor.publishEvent(tradeTransloator);    
        }    
        latch.countDown();    
    }    
    }  


class TradeTransactionEventTranslator implements EventTranslator{

	@Override
	public void translateTo(Object arg0, long arg1) {
		
	}
	
}