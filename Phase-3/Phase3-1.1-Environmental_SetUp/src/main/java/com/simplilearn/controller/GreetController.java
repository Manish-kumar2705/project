package com.simplilearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetController {

	@GetMapping("/greet")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name,  Model model) {
		
		System.out.println("Controller invoked, do business logic here...");
		model.addAttribute("name",name);
		
		return "hello";
	}
}
