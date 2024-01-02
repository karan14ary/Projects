package com.spring.autowiringbyType.SpringProject5;

public class Car {
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
