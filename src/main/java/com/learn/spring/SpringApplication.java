package com.learn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Initializing beans by xml configuration
 * 
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

		System.out.println();
		System.out.println("Example for working of singleton scope:");
		// fetches the required bean
		Inventory inventoryName1 = (Inventory) context.getBean("inventoryName");
		inventoryName1.setName("Books");
		System.out.println(inventoryName1.getName());

		Inventory inventoryName2 = (Inventory) context.getBean("inventoryName");
		System.out.println(inventoryName2.getName() + '\n');

		System.out.println("Example for working of prototype scope:");
		Inventory inventoryId1 = (Inventory) context.getBean("inventoryId");
		inventoryId1.setId(1);
		System.out.println(inventoryId1.getId());

		Inventory inventoryId2 = (Inventory) context.getBean("inventoryId");
		System.out.println(inventoryId2.getId() + "\n");

		((ConfigurableApplicationContext) context).close();
	}

}
