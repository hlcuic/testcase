package com.hlcui.disruptor;

import com.lmax.disruptor.EventHandler;  

public class TradeTransactionJMSNotifyHandler implements EventHandler<TradeTransaction>{  
	private int i;
    //������C3�ӵ���Ϣ���ҵ�����߼�  
    @Override  
    public void onEvent(TradeTransaction arg0, long arg1, boolean arg2) throws Exception {  
        //do send jms message    
        System.out.println("���һ��������C3========"+i++);  
    }  
  
}  