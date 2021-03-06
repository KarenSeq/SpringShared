package com.learn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.spring.model.AutowiringExample1;
import com.learn.spring.model.Customer;
import com.learn.spring.model.Inventory;
import com.learn.spring.model.JavaCollection;
import com.learn.spring.model.Vendor;

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

		System.out.println("------------------------------------------------------------\n");
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

		System.out.println("------------------------------------------------------------\n");
		Customer customerRemarks = (Customer) context.getBean("customerRemarks");
		System.out.println("***Bean Definition Inheritance Example**** " + customerRemarks.getRemarks() + "\n");

		Vendor vendorRemarks = (Vendor) context.getBean("vendorRemarks");
		System.out.println(
				"***Bean Definition Inheritance by Abstract Example**** " + vendorRemarks.getRemarks2() + "\n");

		System.out.println("------------------------------------------------------------\n");
		Inventory inventoryInnerBean = (Inventory) context.getBean("outerBean");
		inventoryInnerBean.getBookDetails();
		System.out.println("***Inner bean*** " + inventoryInnerBean.getBookDetails().getAuthor() + "\n");

		System.out.println("------------------------------------------------------------\n");
		JavaCollection listInjectionBean = (JavaCollection) context.getBean("listInjection");
		System.out.println("List of addresses: " + listInjectionBean.getAddressList());

		JavaCollection setInjectionBean = (JavaCollection) context.getBean("setInjection");
		System.out.println("Set of addresses: " + setInjectionBean.getAddressSet());

		JavaCollection mapInjectionBean = (JavaCollection) context.getBean("mapInjection");
		System.out.println("Map of addresses: " + mapInjectionBean.getAddressMap());

		JavaCollection propInjectionBean = (JavaCollection) context.getBean("propInjection");
		System.out.println("Prop of addresses: " + propInjectionBean.getAddressProp());
		System.out.println("------------------------------------------------------------\n");

		Inventory inventoryRegistration = (Inventory) context.getBean("inventoryRegistration");
		System.out.println("Inventory Registration: " + inventoryRegistration.getRegistration());
		Inventory inventoryAddress = (Inventory) context.getBean("inventoryAddress");
		System.out.println("Inventory address: " + inventoryAddress.getAddress());
		System.out.println("------------------------------------------------------------\n");

		AutowiringExample1 autoWiringByName = (AutowiringExample1) context.getBean("autoWiringByName");
		System.out.println("Autowiring by name: " + autoWiringByName.getAutowiringExample2().getName());

		AutowiringExample1 autoWiringByType = (AutowiringExample1) context.getBean("autoWiringByType");
		System.out.println("Autowiring by type: " + autoWiringByType.getAutowiringExample2().getName());

		AutowiringExample1 autoWiringByConstructor = (AutowiringExample1) context.getBean("autoWiringByType");
		System.out.println("Autowiring by constructor: " + autoWiringByConstructor.getAutowiringExample2().getName());

		System.out.println("------------------------------------------------------------\n");
		((ConfigurableApplicationContext) context).close();
	}

}
