package com.example.demo.controller;

import java.net.URI;
import java.net.URISyntaxException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.services.ExampleClient;

@Controller
public class TestController {
	@RequestMapping("/")
	public String main(ModelMap model) throws URISyntaxException
	{
		ExampleClient c = new ExampleClient(new URI("ws://10.210.0.240:8000"));
		c.setConnectionLostTimeout(0);
		c.connect();
		
		model.put("loder", c.data);
		System.out.println(c.data);
		return "welcome";
	}
	
}
