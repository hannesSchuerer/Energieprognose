package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class EnergieprognoseApplication {


    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
	
	public static void main(String[] args) {
		SpringApplication.run(EnergieprognoseApplication.class, args);
	}

}
