package com.example.demo.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EnergyPrognosis {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long id;
	private Timestamp prognosedTimestamp;
	private Integer power;
	private Timestamp lastPrognosis;
	private Integer cosphi;
	private Integer idFacility;
}
