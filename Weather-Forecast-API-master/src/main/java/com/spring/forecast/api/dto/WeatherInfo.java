package com.spring.forecast.api.dto;

public class WeatherInfo {
	private String timeZone;
	private String weather;
	private String temp;
	private String temp_f;
	private String temp_c;
	private String humidity;
	private String wind;
	private String dewPoint;
	private String historyURL;
	private String searchDate;
	private String time;

	public String getSearchDate() {
		return searchDate;
	}

	public void setSearchDate(String searchDate) {
		this.searchDate = searchDate;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String getTemp_f() {
		return temp_f;
	}

	public void setTemp_f(String temp_f) {
		this.temp_f = temp_f;
	}

	public String getTemp_c() {
		return temp_c;
	}

	public void setTemp_c(String temp_c) {
		this.temp_c = temp_c;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	public String getWind() {
		return wind;
	}

	public void setWind(String wind) {
		this.wind = wind;
	}

	public String getDewPoint() {
		return dewPoint;
	}

	public void setDewPoint(String dewPoint) {
		this.dewPoint = dewPoint;
	}

	public String getHistoryURL() {
		return historyURL;
	}

	public void setHistoryURL(String historyURL) {
		this.historyURL = historyURL;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public WeatherInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WeatherInfo(String timeZone, String weather, String temp, String temp_f, String temp_c, String humidity,
			String wind, String dewPoint, String historyURL, String searchDate, String time) {
		super();
		this.timeZone = timeZone;
		this.weather = weather;
		this.temp = temp;
		this.temp_f = temp_f;
		this.temp_c = temp_c;
		this.humidity = humidity;
		this.wind = wind;
		this.dewPoint = dewPoint;
		this.historyURL = historyURL;
		this.searchDate = searchDate;
		this.time = time;
	}

}
