package com.bridgelabge.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***********************************************************************************************************
 * @author Rupeshp007
 * date:28/12/2019
 * @version 1.0
 * Purpose: Compny Bean which is dependent on the Employee Bean it takes object from container and calls the 
 * 			Employee class methods.
 * 
 * example of Constructore injection 
 * 
 * prints data of Employee like name salary id and designationS
 * 
 ***********************************************************************************************************************************************************/

@SuppressWarnings("resource")
public class Company 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("constuctorinj.xml");
		
		System.out.println("Eployee\tId\tSalary\t\tDesignation");
		
		Employee employee1=context.getBean("employee",Employee.class);
		employee1.displayEmployeeInfo();
		
		Employee employee2=context.getBean("employee2",Employee.class);
		employee2.displayEmployeeInfo();
		
		System.out.println("-------------------------------------------");
		
		System.out.println("Name\tSalary");
		
		Employee salary=context.getBean("salary",Employee.class);
		salary.displayEmployeeSalary();
		
		Employee salary2=context.getBean("salary2",Employee.class);
		salary2.displayEmployeeSalary();
	}
}
