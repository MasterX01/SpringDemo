package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
@RequestMapping({"/hello", ""})
public class HelloWorldController {

	@RequestMapping(value = {"", "/", "/home"})
	public String sayHello() {
		return "Hello From Bridgelabz";
	}
	
	//http://localhost:8080/query?name=Akash
	@RequestMapping(value = {"/query"}, method = RequestMethod.GET)
	public String sayHello(@RequestParam(value = "name") String name) {
		return "Hello " + name + "!";
	}
	
	@GetMapping("/param/{name}")
	public String showHello(@PathVariable String name) {
		return "Hello " + name + " from BridgeLabz.";
	}
	
	@PostMapping("/post")
	public String showHello(@RequestBody User user) {
		return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz.";
	}
	
	@PutMapping("/put/{firstName}")
	public String showHelloByPut(@PathVariable String firstName, @RequestParam(value="lastName") String lastName) {
		return "Welcome "+firstName+" "+lastName+" from BridgeLabz.";
	}
}
