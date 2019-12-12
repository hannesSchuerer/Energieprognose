package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/")
	public String main(ModelMap model)
	{
		model.put("loder", 1);
		
		return "welcome";
	}
	
}
