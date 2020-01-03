package com.bridgelabz.autowiring.byxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Key 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("autowiring.xml");
		System.out.println("Autowired type--> byName()");
		Driver driver=context.getBean("driver",Driver.class);
		driver.driving();
		
		
		System.out.println("Autowired type--> byName()");
		Driver drivertype=context.getBean("drivertype",Driver.class);
		drivertype.driving();
		
		System.out.println("Autowired type--> constructore");
		Driver driverconstructore=context.getBean("driverconstructore",Driver.class);
		driverconstructore.driving();
	}
}
