package com.spring.forecast.api.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.forecast.api.dto.CurrentObservation;
import com.spring.forecast.api.dto.DisplayLocation;
import com.spring.forecast.api.dto.HeaderResponse;
import com.spring.forecast.api.dto.WeatherInfo;
import com.spring.forecast.api.dto.WeatherResponse;
import com.spring.forecast.api.exception.advice.WeatherException;
import com.spring.forecast.api.service.WeatherService;

@Controller
@RequestMapping("weather/api")
public class WeatherController {

	@Autowired
	private WeatherService service;

	DisplayLocation userLocation = null;
	WeatherInfo weatherInfo = null;

	@RequestMapping(value = "/getWeather")
	public String getWeatherStatus(@RequestParam("location") String location, Model model) throws WeatherException {
		WeatherResponse response = null;
		response = service.getCurrentWeather(location);
		if (response.getCurrentObservation() == null) {
			throw new WeatherException(" There is some issue for Location " + location);
		}
		List<DisplayLocation> locations = new ArrayList<>();
		DisplayLocation displayLocation = response.getCurrentObservation().getDisplayLocation();
		userLocation = displayLocation;
		locations.add(displayLocation);
		model.addAttribute("locations", locations);
		model.addAttribute("responses", getTableHeaders());
		model.addAttribute("weathers", mapWeatherInfo(response));
		return "forecast";
	}

	@RequestMapping("/sendEmail")
	public String notification(@RequestParam("email") String email, Model model) throws WeatherException {
		String message = "";
		try {
			message = service.sendMail(email, userLocation, weatherInfo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new WeatherException("Weather Notification Failure");
		}
		model.addAttribute("message", message);
		return "forecast";
	}

	private List<HeaderResponse> getTableHeaders() {
		List<HeaderResponse> responses = new ArrayList<>();
		HeaderResponse response = new HeaderResponse("City", "State", "Country", "CCD", "Latitude", "Longitude",
				"Elevation", "TimeZone", "Weather", "Temprature", "Temp(F)", "Temp(C)", "Humidity", "Wind", "DewPoint",
				"Update Date", "Time", "View-Web");
		responses.add(response);
		return responses;
	}

	private List<WeatherInfo> mapWeatherInfo(WeatherResponse response) {
		List<WeatherInfo> weatherInfos = new ArrayList<>();
		CurrentObservation observation = response.getCurrentObservation();
		String date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a").format(new Date());
		WeatherInfo info = new WeatherInfo(observation.getLocalTzLong(), observation.getWeather(),
				observation.getTemperatureString(), String.valueOf(observation.getTempF()),
				String.valueOf(observation.getTempC()), observation.getRelativeHumidity(), observation.getWindString(),
				observation.getDewpointString(), observation.getHistoryUrl(), date.split(" ")[0], date.split(" ")[1]);
		weatherInfo = info;
		weatherInfos.add(info);
		return weatherInfos;
	}
}
