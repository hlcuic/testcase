package com.hlcui.middle.mq;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class MqConsumer {
	
	private ConnectionFactory connectionFactory;
	
	private Connection connection;
	
	private Session session;
	
	private Destination destination;
	
	private MessageConsumer consumer;
	
	public MqConsumer() throws JMSException{
		this.connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER,
				ActiveMQConnection.DEFAULT_PASSWORD, "tcp://localhost:61616");
		this.connection = connectionFactory.createConnection();
		connection.start();
		this.session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);
		this.destination = session.createQueue("FirstQueue1");
		this.consumer = session.createConsumer(destination);
	}
	
	public void recieve() throws JMSException{
		while (true) {
			TextMessage message = (TextMessage) consumer.receive(100000);
			if (null != message) {
				System.out.println("收到消息" + message.getText());
			}
		}
	}

}
