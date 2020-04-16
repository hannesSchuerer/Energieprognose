package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "Weather_Data")
public class WeatherData {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "DATE", nullable = true)
    private String currentDate;

    @Column(name = "TIME", nullable = true)
    private String currentTime;

    @Column(name = "POWERCONSUMPTION", nullable = true)
    private Integer powerConsumption;

    @Column(name = "POWERGENERATION", nullable = true)
    private Integer powerGeneration;

    @Column(name = "WEATHER", nullable = true)
    private String weather;

    @Column(name = "DESCRIPTION", nullable = true)
    private String description;

    @Column(name = "TEMPERATURE", nullable = true)
    private Double temperature;

    @Column(name = "SUNRISE_DATE", nullable = true)
    private String sunriseDate;

    @Column(name = "SUNSET_DATE", nullable = true)
    private String sunsetDate;

    @Column(name = "MESSAGE", nullable = true)
    private String message;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public String getSunriseDate() {
        return sunriseDate;
    }

    public void setSunriseDate(String sunriseDate) {
        this.sunriseDate = sunriseDate;
    }

    public String getSunsetDate() {
        return sunsetDate;
    }

    public void setSunsetDate(String sunsetDate) {
        this.sunsetDate = sunsetDate;
    }

    public String getCurrentDate() { return currentDate; }

    public void setCurrentDate(String currentDate) { this.currentDate = currentDate; }

    public Integer getPowerConsumption() { return powerConsumption; }

    public void setPowerConsumption(Integer powerConsumption) { this.powerConsumption = powerConsumption; }

    public Integer getPowerGeneration() { return powerGeneration; }

    public void setPowerGeneration(Integer powerGeneration) { this.powerGeneration = powerGeneration; }

    public String getMessage() { return message; }

    public void setMessage(String message) { this.message = message; }
}