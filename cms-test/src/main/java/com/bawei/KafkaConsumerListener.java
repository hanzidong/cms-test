package com.bawei;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;
import org.springframework.stereotype.Component;

@Component("kafkaConsumerListener")
public class KafkaConsumerListener implements MessageListener<String, String>{

	/**
	 * 接收到信息
	 */
	public void onMessage(ConsumerRecord<String, String> msg) {
		System.out.println(msg.key());
		System.out.println(msg.value());
	}

}
