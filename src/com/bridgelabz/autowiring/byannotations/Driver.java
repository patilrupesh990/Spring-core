package com.bridgelabz.autowiring.byannotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Driver {
	Car vehical;

	public Driver() {
	}
	@Autowired
	public Driver(Car vehical) {
		super();
		this.vehical = vehical;
	}

	public void driving() {
		if (vehical != null) {
			vehical.running();
		} else {
			System.out.println("Car is Stoped");
		}
	}

}
