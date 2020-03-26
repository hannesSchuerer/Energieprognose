package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Column;

@Entity
@Table(name = "WEATHER_DATA")
public class WeatherData {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    @Column(name = "ID", nullable = false)
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "CURRENT_TIME", nullable = true)
    private Date currentTime;

    @Column(name = "WEATHER", nullable = true)
    private String weather;

    @Column(name = "DESCRIPTION", nullable = true)
    private String description;

    @Column(name = "TEMPERATURE", nullable = true)
    private Double temperature;

    @Temporal(TemporalType.DATE)
    @Column(name = "SUNRISE_DATE", nullable = true)
    private Date sunriseDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "SUNSET_DATE", nullable = true)
    private Date sunsetDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
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

    public Date getSunriseDate() {
        return sunriseDate;
    }

    public void setSunriseDate(Date sunriseDate) {
        this.sunriseDate = sunriseDate;
    }

    public Date getSunsetDate() {
        return sunsetDate;
    }

    public void setSunsetDate(Date sunsetDate) {
        this.sunsetDate = sunsetDate;
    }
}