package com.bridgelabge.setternjection;


/***********************************************************************************************************
 * @author Rupeshp007
 * date:28/12/2019
 * @version 1.0
 * Purpose: Student Bean which is dependency class it contains the Dependencies like Student's name,id,course and contains
 * 			setter methods of all dependencies which is used to inject values to dependencies
 * 
 * 
 ***********************************************************************************************************************************************************/


public class Student 
{
	private String studentName;
	private String id;
	private String course;
	/**To setStudent Name*/
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	/**To setStudent Id */

	public void setId(String id) {
		this.id = id;
	}
	
	/**To setStudent Course*/

	public void setCourse(String course) {
		this.course = course;
	}
	
	/**To displayStudentInfo*/

	public void displayStudentInfo()
	{
		System.out.println(studentName+" \t "+id+"\t"+course);
	}
	
}
