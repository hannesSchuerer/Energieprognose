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

    @Column(name = "TIME", nullable = true)
    private String currentTime;

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
}