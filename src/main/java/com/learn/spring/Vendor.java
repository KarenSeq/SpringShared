package com.learn.spring;

import lombok.Data;

@Data
public class Vendor {

	private String name;

	/**
	 * Method to setup a bean. Called immediately after bean instantiation. Should
	 * be a void method with name as specified in init-method property in .xml file.
	 * The method should be in the bean class.
	 */
	public void initExample() {
		System.out.println("In init method...");
	}

	/**
	 * Method to teardown a bean. Called just before a bean is removed from the
	 * context. Should be a void method with name as specified in destroy-method.
	 * property in .xml file. The method should be in the bean class.
	 */
	public void destroyExample() {
		System.out.println("In destroy method...");
	}

}
