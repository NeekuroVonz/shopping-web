package com.theplayer.kits.shopping.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(Exception.class)
	public String allException(Exception ex) {
		ex.printStackTrace();
		return "null-pointer";
	}
	
}
