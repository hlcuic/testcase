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
    //������C2�ӵ���Ϣ��ľ����ҵ�� �����߼�  
    @Override  
    public void onEvent(TradeTransaction event, long arg1, boolean arg2) throws Exception {  
         //���������������ҵ���߼��������ǽӵ���Ϣ���ҵ�����߼�  
       // event.setId(UUID.randomUUID().toString());//�����������ID ���Ҵ�ӡ����   
        System.out.println("�ڶ���������C2��������Ϣ ========"+(i++));    
    }  
} 