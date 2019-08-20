package com.tedu.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@RequestMapping("/hello/{name}")
	public String test_hello(@PathVariable String name) {
		
		return "spring boot  "+name;
	}
}
