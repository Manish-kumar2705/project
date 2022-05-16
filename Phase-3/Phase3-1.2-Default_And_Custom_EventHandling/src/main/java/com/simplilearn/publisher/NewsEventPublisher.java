package com.simplilearn.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import com.simplilearn.events.NewsEvent;

@Component
public class NewsEventPublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.publisher = applicationEventPublisher;
	}
	
	
	public void publish() {
		NewsEvent ne = new NewsEvent(this);
		publisher.publishEvent(ne);
	}
}