package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EnergyPrognosis {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long id;
	private Date prognosedTimestamp;
	private Integer power;
	private Date lastPrognosis;
	private Integer cosphi;
	private Integer idFacility;
}
