package SpringSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello to Everyone";
	}
	@GetMapping("/login")
	public String login() {
		return "Successfully,Welcome to the another page";
	}
	@GetMapping("/admin")
	public String  admin() {
		return "This page is only for admin";
	}
	
	
}
