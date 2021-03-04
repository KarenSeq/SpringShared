package com.learn.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Data;

@Data
public class Customer implements InitializingBean, DisposableBean {

	private String name;

	/**
	 * from DisposableBean interface
	 * 
	 * @throws Exception
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("In destroy method of Customer...");

	}

	/**
	 * from InitializingBean interface
	 * 
	 * @throws Exception
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("In after properties set method of Customer...");
	}

}
