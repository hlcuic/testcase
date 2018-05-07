package com.hlcui.middle.mq;

import javax.jms.JMSException;

public class MqProducerHandler {

	public static void main(String[] args) throws JMSException {
		MqProducer producer = new MqProducer();
		producer.sendMessage();
		producer.getSession().commit();
	}

}
