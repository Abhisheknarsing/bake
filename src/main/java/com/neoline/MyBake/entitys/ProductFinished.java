package com.neoline.MyBake.entitys;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class ProductFinished {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private Date date;
	
	private String shift;
	
	private String name;
	
	private int quantity;
	
	private String status;
	
	private String teamaLead;
}

