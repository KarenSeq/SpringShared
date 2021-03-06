package com.learn.spring.model;

import lombok.Data;

/**
 * Inventory POJO
 * 
 * @author Karen
 *
 */
@Data
public class Inventory {

	private int id;

	private String name;

	private Double price;
	
	private String remarks;
	
	private Book bookDetails;
	
	private String registration;
	
	private String address;
	
}
