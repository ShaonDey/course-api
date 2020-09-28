package com.shaondey.springbootstarter.home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/index")
	public String sayHello() {
		return "Hello World";
	}

}
