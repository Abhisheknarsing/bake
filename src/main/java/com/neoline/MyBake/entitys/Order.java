package com.neoline.MyBake.entitys;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data

public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String date;
	
	private String productName;
	
	private String routeName;
	
	 private int quantity;
	
	private float price;
	
	private float amount;
	
	private String status;
	
	private int recordId;
}
