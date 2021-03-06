package com.learn.spring.model;

import lombok.Data;

@Data
public class AutowiringExample1 {

	private AutowiringExample2 autowiringExample2;
	
	private String id;
}
