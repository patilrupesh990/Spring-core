package com.bridgelabge.setternjection;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/***********************************************************************************************************
 * @author Rupeshp007
 * date:02/01/2020
 * @version 1.0
 * Purpose: Exam Bean which is dependent on Student class  its contains object from Spring container and it will call methods of Student class
 * 			and will print the informations of Students
 ***********************************************************************************************************************************************************/

public class Exam 
{
	
	public static void main(String[] args)
	{
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("setterinj.xml");
		System.out.println("name\t id\tCourse");

		Student rupesh= context.getBean("rupesh",Student.class);
		rupesh.displayStudentInfo();
		
		Student durga=context.getBean("durga",Student.class);
		durga.displayStudentInfo();
		
		
	}
}
