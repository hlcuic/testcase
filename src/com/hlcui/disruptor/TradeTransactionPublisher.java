package com.hlcui.disruptor;

import java.util.concurrent.CountDownLatch;

import com.lmax.disruptor.EventTranslator;
import com.lmax.disruptor.dsl.Disruptor;  
//����һ�����������¼� ���࣬���ڷ���Ҫ�������Ϣ  
public class TradeTransactionPublisher implements Runnable {  
    Disruptor<TradeTransaction> disruptor;    
    private CountDownLatch latch;  
  //�����߷���10����Ϣ
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
            System.out.println("�����߳ɹ���Ringbuffer�з�����һ����Ϣ");  
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