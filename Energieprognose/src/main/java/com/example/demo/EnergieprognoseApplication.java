package com.example.demo;

import com.example.demo.dao.WeatherDataDao;
import com.example.demo.model.GeneratingChartData;
import com.example.demo.model.WeatherData;
import com.example.demo.services.WeatherDataService;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

import com.example.demo.model.ConsumptionChartData;

import java.util.Date;
import java.util.List;
import java.util.Optional;

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
