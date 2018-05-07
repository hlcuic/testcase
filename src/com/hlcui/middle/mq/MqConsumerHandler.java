package com.hlcui.middle.mq;

import javax.jms.JMSException;

public class MqConsumerHandler {
	public static void main(String[] args) throws JMSException {
		MqConsumer consumer = new MqConsumer();
		consumer.recieve();
	}
}