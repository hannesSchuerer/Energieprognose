package com.spring.forecast.api.exception.advice;

public class WeatherException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2832485022202375249L;

	public WeatherException(String message) {
		super(message);
	}

}
