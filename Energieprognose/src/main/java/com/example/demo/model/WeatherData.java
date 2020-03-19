package com.example.demo.model;

import java.sql.Time;
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
@Table(name = "WEATHERDATA")
public class WeatherData {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    @Column(name = "ID", nullable = false)
    private Long id;

    @Temporal(TemporalType.TIME)
    @Column(name = "CURRENT_TIME", nullable = true)
    private Time currentTime;

    @Column(name = "WEATHER", nullable = true)
    private String weather;

    @Column(name = "DESCRIPTION", nullable = true)
    private String description;

    @Column(name = "TEMPERATURE", nullable = true)
    private Integer temperature;

    @Temporal(TemporalType.TIME)
    @Column(name = "SUNRISE_DATE", nullable = true)
    private Time sunriseDate;

    @Temporal(TemporalType.TIME)
    @Column(name = "SUNSET_DATE", nullable = true)
    private Time sunsetDate;
}