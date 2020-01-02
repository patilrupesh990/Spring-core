package com.bridgelabz.ioccontainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("resource")
public class Controller 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("ioc.xml");
		Computer computer=context.getBean("computer",Computer.class);
		computer.getspecification();
		System.out.println("----------------------------------------------");
		computer.getprice();
	}
}
