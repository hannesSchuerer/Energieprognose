package com.spring.forecast.api.service;

import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.InputStreamSource;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.spring.forecast.api.dto.DisplayLocation;
import com.spring.forecast.api.dto.WeatherInfo;
import com.spring.forecast.api.dto.WeatherResponse;
import com.spring.forecast.api.exception.advice.WeatherException;
import com.spring.forecast.api.mail.MailUtil;
import com.spring.forecast.api.util.RestUtil;

@Service
@PropertySource("classpath:application.properties")
public class WeatherService {
	@Autowired
	private RestUtil restUtil;
	@Autowired
	private MailUtil mailUtil;
	@Value("${inlineImage}")
	String templateMailBodyImageVal;
	InputStreamSource imageSource = null;

	public WeatherResponse getCurrentWeather(String location) throws WeatherException {
		return restUtil.getWeatherInfo(location);
	}

	public String sendMail(String toMail, DisplayLocation userLocation, WeatherInfo weather) throws Exception {
		MultipartFile image = getImageContent();
		return mailUtil.sendEmail(toMail, userLocation.getCity() + " Weather Report", image, imageSource, userLocation,
				weather);
	}

	private MultipartFile getImageContent() throws Exception {
		InputStream imageIs = null;
		byte[] imageByteArray = null;
		MultipartFile multipartFile = null;
		imageIs = this.getClass().getClassLoader().getResourceAsStream("templates/" + templateMailBodyImageVal);
		imageByteArray = IOUtils.toByteArray(imageIs);
		multipartFile = new MockMultipartFile(imageIs.getClass().getName(), imageIs.getClass().getName(), "image/jpeg",
				imageByteArray);
		imageSource = new ByteArrayResource(imageByteArray);
		return multipartFile;
	}
}
