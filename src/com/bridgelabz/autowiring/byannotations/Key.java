package com.bridgelabz.autowiring.byannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Key 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("autowireannotaion.xml");
		Driver driver=context.getBean("driver",Driver.class);
		driver.driving();
		
		
	}
}
