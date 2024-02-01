package com.demo.controller;

import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("sayhello")
	public ModelAndView myFirstAction() {
		String message = "Hello! All the best for Spring MVC!";
		System.out.println("Inside my action now!");
		return new ModelAndView("hello", "mySimpleMessage", message);  // view page name, parameter name for data, data as value
	}
}
