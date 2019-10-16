package com.bawei;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-kafka-producer.xml")
public class ProducerTest {

	@Resource
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@Test
	public void sendMsg() {
		kafkaTemplate.sendDefault("key" + System.currentTimeMillis(), "hello kafka");
		System.out.println("发送完毕");
	}
}
