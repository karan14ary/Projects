package com.spring.autowiringusingAnnotation.SpringProject7;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	@Autowired
	Driver dr;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(Driver dr) {
		super();
		this.dr = dr;
	}

	public Driver getDr() {
		return dr;
	}

	public void setDr(Driver dr) {
		this.dr = dr;
	}

	@Override
	public String toString() {
		return "Car [dr=" + dr + "]";
	}

}
