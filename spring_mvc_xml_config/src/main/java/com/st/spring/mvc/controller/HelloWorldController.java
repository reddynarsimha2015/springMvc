package com.st.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
	@RequestMapping(value="/helloworld",method=RequestMethod.GET)
public String helloWorld(Model model) {
	model.addAttribute("name", "Sreenu technology");
	return "helloWorldDynamic";
	
}
}
