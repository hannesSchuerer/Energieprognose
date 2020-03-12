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
@Table(name = "ENERGYDATA")
public class Energydata {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name = "ID", nullable = false)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_TIME", nullable = true)
	private Date dateTime;
	
	@Column(name = "INTEGER", nullable = true)
	private Integer cosPhi;
	
	@Column(name = "POWER", nullable = true)
	private Integer power;
	
	@Column(name = "IDFACILITY", nullable = true)
	private Long idFacility;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public Integer getCosPhi() {
		return cosPhi;
	}
	public void setCosPhi(Integer cosPhi) {
		this.cosPhi = cosPhi;
	}
	public Integer getPower() {
		return power;
	}
	public void setPower(Integer power) {
		this.power = power;
	}
	public Long getIdFacility() {
		return idFacility;
	}
	public void setIdFacility(Long idFacility) {
		this.idFacility = idFacility;
	}
	
}
