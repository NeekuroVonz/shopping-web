package com.theplayer.kits.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class TestController {
	
	@Value("${my.key}")
	private String hello;
	
	@Autowired
	private Environment env;
	
	@GetMapping(value = "/")
	public String home(HttpServletRequest request, Model model) {
		request.setAttribute("msg", "Hello Spring Boot");
		
		model.addAttribute("mod","Long Dau Buoi");
		
		System.out.println(hello);
		System.out.println(env.getProperty("my.key"));
		return "index";
	}
		
}
