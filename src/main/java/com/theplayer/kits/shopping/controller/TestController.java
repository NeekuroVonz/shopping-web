package com.theplayer.kits.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class TestController {
	
	@GetMapping(value = "/")
	public String home(HttpServletRequest request) {
		request.setAttribute("msg", "Hello Spring Boot");
		return "index";
	}
		
}
