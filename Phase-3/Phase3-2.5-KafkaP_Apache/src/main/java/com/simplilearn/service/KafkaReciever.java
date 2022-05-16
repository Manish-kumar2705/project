package com.simplilearn.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaReciever {

	@KafkaListener(topics="Simplilearn", groupId="group1")
	public void consume(String message) {
		System.out.println("Consumed message:"+message);
	}
	
	@KafkaListener(topics="Simplilearn", groupId="group2")
	public void consume111(String message) {
		System.out.println("Consumed message111:"+message);
	}
	@KafkaListener(topics="Simplilearn", groupId="group3")
	public void consume222(String message) {
		System.out.println("Consumed message222:"+message);
	}
}
