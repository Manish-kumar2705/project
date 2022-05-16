package com.simplilearn.listeners;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.simplilearn.events.NewsEvent;

@Component
public class NewsEventListener {

	@EventListener
	public void onNewsEvent(NewsEvent event) {
		System.out.println("News Event object published..");
	}
	
	@EventListener
	public void onNewsEvent1(NewsEvent event) {
		System.out.println("News Event11 object published..");
	}
}
