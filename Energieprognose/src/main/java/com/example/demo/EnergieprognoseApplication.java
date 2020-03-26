package com.example.demo;

import com.example.demo.model.GeneratingChartData;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

import com.example.demo.model.ConsumptionChartData;

@SpringBootApplication
public class EnergieprognoseApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EnergieprognoseApplication.class, args);
		ConsumptionChartData object = new ConsumptionChartData();
		object.start();
		GeneratingChartData object2 = new GeneratingChartData();
		object2.start();
	}

}
