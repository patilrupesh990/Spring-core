package com.bridgelabz.ioccontainer;

public class HP implements Computer
{
	@Override
	public void getspecification() 
	{
		System.out.println("CPU \t HDD \t RAM\tGraphics");
		System.out.println("intl i7\t2TB \t 8GB\t6GB");
	}

	@Override
	public void getprice() 
	{
		System.out.println("Name\tPrice");
		System.out.println("HP\t85000Rs.");

	}
}
