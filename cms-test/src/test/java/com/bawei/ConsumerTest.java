package com.bawei;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext cpac = 
				new ClassPathXmlApplicationContext("classpath:spring-kafka-consumer.xml");
	}

}
