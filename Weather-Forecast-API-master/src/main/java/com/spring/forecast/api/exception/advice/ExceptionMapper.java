package com.spring.forecast.api.exception.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionMapper {

	@ExceptionHandler(WeatherException.class)
	public ModelAndView handelException(WeatherException exception) {
		ModelAndView mav = new ModelAndView("forecast");
		return mav.addObject("errorMessage", exception.getMessage());
	}
}
