
package com.hlcui.kafka.producer;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import com.google.gson.Gson;
import com.hlcui.model.Person;

public class KafkaProvider {

	private final Producer<String, Object> kafkaProducer;

	public final static String TOPIC = "JAVA_TOPIC";
	
	private KafkaProvider() {
		kafkaProducer = createKafkaProducer();
	}

	private Producer<String, Object> createKafkaProducer() {
		Properties props = new Properties();
		props.put("bootstrap.servers", "127.0.0.1:9092");
		props.put("acks", "all");
		props.put("retries", 0);
		props.put("batch.size", 16384);
		props.put("linger.ms", 1);
		props.put("buffer.memory", 33554432);
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer", "org.apache.kafka.common.serialization.ByteArraySerializer");
		Producer<String, Object> kafkaProducer = new KafkaProducer<>(props);
		return kafkaProducer;
	}

	private void produce() {
		for (int i = 1; i < 1000; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String key = String.valueOf("key" + i);
			String data = "hello kafka message:" + key;
			kafkaProducer.send(new ProducerRecord<>(TOPIC, key, data), new Callback() {
				public void onCompletion(RecordMetadata recordMetadata, Exception e) {
					System.out.println("send kafka message end!!!");
				}
			});
			System.out.println(data);
		}
	}
	
	private void produce(Person person) throws UnsupportedEncodingException{
		byte[] data = new Gson().toJson(person).getBytes("UTF-8");
		for(int i=0;i<10;i++){
			kafkaProducer.send(new ProducerRecord<>(TOPIC, data), new Callback() {
				public void onCompletion(RecordMetadata recordMetadata, Exception e) {
					System.out.println("send kafka message end!!!");
				}
			});
		}
		
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
//		new KafkaProvider().produce();
		Person person = new Person();
		person.setName("jack");
		person.setId(1);
		new KafkaProvider().produce(person);
	}
}