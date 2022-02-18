package com.ncs.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ncs.model.Greeting;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String sayHello()
	{
		return "Hello!!!";
	}
	
	@GetMapping("/hellouser")
	public String sayHello(@RequestParam String username)
	{
		return "Hello " + username+ "!!!";
	}
	
	@GetMapping("/hello/{username}")
	public String sayHelloByPath(@PathVariable String username)
	{
		return "Hello "+ username+"!!!";
	}
	
	//To pass object from the client side..

	@PostMapping("/greet")
	public Greeting addGreetring(@RequestBody Greeting greet)
	{
		return greet;
	}

	
	// return an object
	@GetMapping("/greet")
	public Greeting sayHelloByObj(@RequestParam String username)
	{
		return new Greeting("Hello", username);
	}


	
	@GetMapping("/hellouserage")
	public String sayHello(@RequestParam String username, @RequestParam int age)
	{
		return "Hello " + username+ "!!!" + "Age: " + age;
	}
	
	@PostMapping("/hello")
	public String sayHelloPost()
	{
		return "Hello POST!!!";
	}
	
	@PutMapping("/hello")
	public String sayHelloPut()
	{
		return "Hello PUT!!!";
	}
	
	@DeleteMapping("/hello")
	public String sayHelloDelete()
	{
		return "Hello DELETE!!!";
	}
	
	@PatchMapping("/hello")
	public String sayHelloPatch()
	{
		return "Hello Patch!!!";
	}
}
