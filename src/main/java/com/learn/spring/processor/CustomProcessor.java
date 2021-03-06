package com.learn.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Class to only show bean processors in spring
 * 
 * @author Karen
 *
 */
public class CustomProcessor implements BeanPostProcessor {

	/**
	 * As name suggests, called before bean is initialized.
	 */
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In pre processing.. " + beanName);
		return bean;
	}

	/**
	 * As name suggests, called after bean is initialized.
	 */
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In post processing.. " + beanName);
		return bean;
	}

}
