package com.example.demo;

import com.example.demo.dao.WeatherDataDao;
import com.example.demo.model.GeneratingChartData;
import com.example.demo.model.WeatherData;
import com.example.demo.services.ConsumptionChartService;
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

		Thread consumptionChart = new Thread(new ConsumptionChartData());
		consumptionChart.start();

		Thread generatingChart = new Thread(new GeneratingChartData());
		generatingChart.start();
	}

}
