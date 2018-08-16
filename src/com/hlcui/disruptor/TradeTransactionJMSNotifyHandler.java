package com.hlcui.disruptor;

import com.lmax.disruptor.EventHandler;

public class TradeTransactionJMSNotifyHandler implements EventHandler<TradeTransaction> {
	
	private int i;

	@Override
	public void onEvent(TradeTransaction arg0, long arg1, boolean arg2) throws Exception {
		System.out.println("C3========" + i++);
	}

}