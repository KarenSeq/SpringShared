package com.learn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Initializing beans by xml configuration
 * @author Karen
 *
 */
public class SpringApplication {

	/**
	 * main class to start execution. Creates, initializes and fetches the bean(s)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// ClassPathXmlApplicationContext is a framework API which loads the xml file
		// for creating and initializing objects
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		// fetches the required bean
		Inventory inventory = (Inventory) context.getBean("inventory");

		System.out.println(inventory.getName());
		((ConfigurableApplicationContext) context).close();
	}

}
