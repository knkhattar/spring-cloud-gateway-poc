package com.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app1")
public class FirstController {

	@GetMapping("/service1")
	public String test() {
		return "Hello from service1";
	}
}
