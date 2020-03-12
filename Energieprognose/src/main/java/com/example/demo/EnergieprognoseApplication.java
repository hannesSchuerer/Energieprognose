package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

import com.example.demo.model.CanvasjsChartData;

@SpringBootApplication
public class EnergieprognoseApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EnergieprognoseApplication.class, args);
		CanvasjsChartData object = new CanvasjsChartData();
		object.start();
	}

}
