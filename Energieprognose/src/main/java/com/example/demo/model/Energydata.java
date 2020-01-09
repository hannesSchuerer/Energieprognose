package com.example.demo.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Energydata {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long id;
	private Timestamp dateTime;
	private Integer cosPhi;
	private Integer power;
	private Long idFacility;
	
}
