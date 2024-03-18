package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(path = "/hello")
	public String helloWorld()
	{
		return "hello 123s!";
	}
	
	@GetMapping(path = "/user")
	public User getUser()
	{
		return new User("animol","jose","Pala");
	}
}
