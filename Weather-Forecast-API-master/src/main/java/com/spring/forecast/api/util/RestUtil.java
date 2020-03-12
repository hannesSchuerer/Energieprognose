package com.spring.forecast.api.util;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.forecast.api.dto.WeatherResponse;
import com.spring.forecast.api.exception.advice.WeatherException;

@Component
public class RestUtil {

	private RestTemplate template;
	ObjectMapper mapper = null;
	HttpHeaders headers = null;

	private static String API_KEY = "8d2d7acbf163f320";

	@PostConstruct
	public void init() {
		template = new RestTemplate();
		mapper = new ObjectMapper();
		headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		template.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		template.getMessageConverters().add(new StringHttpMessageConverter());
	}

	public WeatherResponse getWeatherInfo(String location) throws WeatherException {
		String URL = "http://api.wunderground.com/api/" + API_KEY + "/conditions/q/CA/" + location + ".json";
		String result = template.getForObject(URL, String.class);
		// System.out.println(result);
		WeatherResponse response = null;
		try {
			response = mapper.readValue(result, WeatherResponse.class);
		} catch (IOException e) {
			throw new WeatherException("Weather Forecast Service Failed..Try Again !");
		}
		return response;
	}
}
