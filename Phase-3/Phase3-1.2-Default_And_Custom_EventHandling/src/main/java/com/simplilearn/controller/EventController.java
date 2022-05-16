package com.simplilearn.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.simplilearn.publisher.NewsEventPublisher;

@Controller
public class EventController {

	
	@Autowired
	NewsEventPublisher publisher;
	
	@GetMapping("/toi/publish")
	public String publishEventObject() {
		publisher.publish();
		return "hello";
	}
}