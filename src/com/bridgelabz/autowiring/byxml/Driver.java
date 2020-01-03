package com.bridgelabz.autowiring.byxml;

public class Driver {
	Car vehical;

	public void setCar(Car car) {
		this.vehical = car;
	}

	public void driving() {
		if (vehical != null) {
			vehical.running();
		} else {
			System.out.println("Car is Stoped");
		}
	}
	
	public Driver() {
	}
	public Driver(Car vehical) {
		super();
		this.vehical = vehical;
	}
}
