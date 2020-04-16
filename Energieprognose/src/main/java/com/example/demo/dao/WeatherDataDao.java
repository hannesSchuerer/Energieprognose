package com.example.demo.dao;

import com.example.demo.model.WeatherData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeatherDataDao extends CrudRepository<WeatherData, Long>{
	 
    public List<WeatherData> findBycurrentDateGreaterThan(String currentDate);
    public List<WeatherData> findBycurrentTimeGreaterThan(String currentTime);
    public List<WeatherData> findBypowerConsumptionGreaterThan(Integer powerConsumption);
    public List<WeatherData> findBypowerGenerationGreaterThan(Integer powerGeneration);
    public List<WeatherData> findByweatherGreaterThan(String weather);
    public List<WeatherData> findBydescriptionGreaterThan(String description);
    public List<WeatherData> findBytemperatureGreaterThan(Double temperature);
    public List<WeatherData> findBysunriseDateGreaterThan(String sunriseDate);
    public List<WeatherData> findBysunsetDateGreaterThan(String sunsetDate);
    public List<WeatherData> findBymessageGreaterThan(String message);
	
}
