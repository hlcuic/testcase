package com.hlcui.middle.mq;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class MqProducer {
	
	private ConnectionFactory connectionFactory;
	
	private Connection connection;
	
	private Session session;
	
	private Destination destination;
	
	private MessageProducer producer;

	public MqProducer() throws JMSException {
		this.connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER,
				ActiveMQConnection.DEFAULT_PASSWORD, "tcp://localhost:61616");
		this.connection = connectionFactory.createConnection();
		connection.start();
		this.session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
		this.destination = session.createQueue("FirstQueue1");
		this.producer = session.createProducer(destination);
		this.producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
	}
	
	public void sendMessage() throws JMSException{
		for(int i=0;i<5;i++){
			TextMessage textMessage = session.createTextMessage("hello world!"+i);
			producer.send(destination, textMessage);
		}
	}

	public ConnectionFactory getConnectionFactory() {
		return connectionFactory;
	}

	public void setConnectionFactory(ConnectionFactory connectionFactory) {
		this.connectionFactory = connectionFactory;
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public MessageProducer getProducer() {
		return producer;
	}

	public void setProducer(MessageProducer producer) {
		this.producer = producer;
	}
	
}
