package com.bridgelabz.ioccontainer;

public class Lenovo implements Computer
{
	@Override
	public void getspecification() 
	{
		System.out.println("CPU \t HDD \t RAM\tGraphics");
		System.out.println("intl i5\t1TB \t 4GB\t2GB");
	}

	@Override
	public void getprice() 
	{
		System.out.println("Name\tPrice");
		System.out.println("Lenovo\t30000Rs.");

	}
}
