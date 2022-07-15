package com.theplayer.kits.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.theplayer.kits.shopping.model.Person;
import com.theplayer.kits.shopping.service.PersonService;

@Controller
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
//	@GetMapping("/person")
//	@PostMapping("/person")
	@RequestMapping(value = "/person", method = RequestMethod.GET)
	public String person(Model model) {
		Person p1 = new Person();
		p1.setId(1);
		p1.setName("P1");
		
		model.addAttribute("p", p1);
		
		return "person";
	}
	
	@PostMapping("/person")
	public String personList() {
		return "person-list";
	}
	
}
