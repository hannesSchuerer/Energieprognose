package com.example.demo.services;

import com.example.demo.dao.WeatherDataDao;
import com.example.demo.model.WeatherData;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class WeatherDataService extends Thread implements ApplicationRunner{

	private JSONArray powerDataJson;
	private WeatherDataDao weatherDataDAO;
	private ReadJSON rj;
	private ReadJSON rjPowerG;
	private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	private static final DateFormat dfTime = new SimpleDateFormat("HH:mm:ss");

	@Autowired
	public WeatherDataService(WeatherDataDao weatherDataDAO) {
	        this.weatherDataDAO = weatherDataDAO;
	    }

	    @Override
	    public void run(ApplicationArguments args) throws Exception {
			start();
		}

	    @Override
	    public void run() {
			while (true) {

				try {
					SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
					rj = new ReadJSON("http://api.openweathermap.org/data/2.5/weather?q=Hallein&units=metric&appid=2ca1e7f1b8f1ce750da10a52a8c4a4d1");
					rj.openConnection();
					String weatherDataString = rj.getUrlString();
					JSONObject weatherDataJson = new JSONObject(weatherDataString);

					//powerDataJson = ConsumptionJson.getPowerDataJson();

					WeatherData weatherData = new WeatherData();

					//weatherData.setPowerConsumption(Integer.parseInt(powerDataJson.getJSONObject(powerDataJson.length()-1).getString("wertGesamt")));
					weatherData.setTemperature(weatherDataJson.getJSONObject("main").getDouble("temp"));
					weatherData.setDescription(weatherDataJson.getJSONArray("weather").getJSONObject(0).getString("description"));
					weatherData.setWeather(weatherDataJson.getJSONArray("weather").getJSONObject(0).getString("main"));
					Date sunriseTimeDate = new Date(weatherDataJson.getJSONObject("sys").getLong("sunrise")*1000);
					Date sunsetTimeDate = new Date(weatherDataJson.getJSONObject("sys").getLong("sunset")*1000);
					String sunriseTime = dateFormat.format(sunriseTimeDate);
					String sunsetTime = dateFormat.format(sunsetTimeDate);
					String currentTime = dateFormat.format(System.currentTimeMillis());
					weatherData.setSunriseDate(sunriseTime);
					weatherData.setSunsetDate(sunsetTime);
					weatherData.setCurrentTime(currentTime);
					weatherDataDAO.save(weatherData);

					sleep(ReadFrequenz.time);

				} catch (IOException e) {

				} catch (JSONException e) {

				} catch (InterruptedException e){

				}

			}
		}
}
