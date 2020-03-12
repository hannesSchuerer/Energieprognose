package com.example.demo.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Messages {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long id;
	private String messageTitle;
	private String messageText;
	private Timestamp dateTime;
	private Integer idFacility;
	
}
