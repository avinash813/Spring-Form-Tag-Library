package com.sample.controller;


import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sample.model.Employee;

@Controller
public class FormController {
	
	@GetMapping("/register")
	public String registerController(@ModelAttribute("empl")Employee emp)
	{
		return "register";
	}
	
	@PostMapping("/details")
	public String resultController(@ModelAttribute("emp")Employee emp) {
		return "result";
		
		
	}
}
