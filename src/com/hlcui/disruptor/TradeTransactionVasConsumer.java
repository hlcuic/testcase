package com.hlcui.disruptor;

import com.lmax.disruptor.EventHandler;  

public class TradeTransactionVasConsumer implements EventHandler<TradeTransaction>{  
  
	private int i;
    //������C1�ӵ���Ϣ���ҵ�����߼�  
    @Override  
    public void onEvent(TradeTransaction arg0, long arg1, boolean arg2) throws Exception {  
        // TODO Auto-generated method stub throws Exception {  
        // do something....  
        System.out.println("��һ��������C1========"+(i++));  
    }    
  
} 