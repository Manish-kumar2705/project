package com.simplilearn.listeners;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AppEventHandler {
	
	
	@EventListener
	public void onContextStarted(ContextStartedEvent contextStartedevent) {
		System.out.println("Context started event received ====");
	}
	
	@EventListener
	public void onContextStarted11(ContextStartedEvent contextStartedevent) {
		System.out.println("Context started event received11 ====");
	}
	
	@EventListener
	public void onContextStarted12(ContextStartedEvent contextStartedevent) {
		System.out.println("Context started event received12 ====");
	}
	
	
	@EventListener
	public void onContextStopeEevent(ContextStoppedEvent contextStartedevent) {
		System.out.println("Context Stopped event received ====");
	}
}
