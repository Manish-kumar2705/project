package com.simplilearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.service.KafkaSender;

@RestController
public class KafkaWebController {

	@Autowired
	KafkaSender kafkaSender;

	@GetMapping("/produce")
	public String produce(@RequestParam("message") String messsage) {

		kafkaSender.send(messsage);
		return "Message sent to kafka topic successfully!";
	}


}
