package com.hibernate.project4.OneToOneBiDirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Bike2 {
	@Id
	int b_id;
	String name;
	String color;
	@OneToOne
	Student3 s;
	public Bike2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike2(int b_id, String name, String color, Student3 s) {
		super();
		this.b_id = b_id;
		this.name = name;
		this.color = color;
		this.s = s;
	}
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Student3 getS() {
		return s;
	}
	public void setS(Student3 s) {
		this.s = s;
	}

}
