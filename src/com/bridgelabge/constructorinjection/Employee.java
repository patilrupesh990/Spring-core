package com.bridgelabge.constructorinjection;

/***********************************************************************************************************
 * @author Rupeshp007
 * date:02/01/2020
 * @version 1.0
 * Purpose: Employee Bean which is dependency class it contains the Dependencies like Employee's name,id,salary and designation
 * 			and constuctore to initialize the values towards fields ioc will inject dependencies though constructor.
 ***********************************************************************************************************************************************************/

public class Employee 
{
	/*iniizations of dependencies*/
	private String employeeName;
	private String employeeID;
	private double salary;
	private String designation;
	
	
	/***********************************************************************************************************************************************
	 *  Constructore to inject values to Employee bean dependencies
	 *  
	 *  @param SString employeeName, String employeeID, double salary, String designation
	 *******************************************************************************/

	public Employee(String employeeName, String employeeID, double salary, String designation) 
	{
		this.employeeName = employeeName;
		this.employeeID = employeeID;
		this.salary = salary;
		this.designation = designation;
	}
	
	/***********************************************************************************************************************************************
	 *  Constructore to inject values to Employee bean dependencies
	 *  
	 *  @param String employeeName double salary
	 *******************************************************************************/
	
	public Employee(String employeeName, double salary)
	{
		this.employeeName = employeeName;
		this.salary = salary;
	}

	/***********************************************************************************************************************************************
	 *  Method to display total Information of Employee
	 *  
	 *******************************************************************************/

	public void displayEmployeeInfo()
	{
		System.out.println(employeeName+"\t"+employeeID+"\t"+salary+"\t\t"+designation);

	}
	
	/***********************************************************************************************************************************************
	 *  Method to display Salary Information of Employee
	 *  
	 *******************************************************************************/

	
	public void displayEmployeeSalary()
	{
		System.out.println(employeeName+"\t"+salary);

	}
}
