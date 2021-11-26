package com.neoline.MyBake.entitys;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class ProductRawProduction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private Date date;
	
	private String swift;
	
	private String name;
	
	private String quantity;
	
	private String status;
	
	private String teamLead;
	
	private float price;

}
