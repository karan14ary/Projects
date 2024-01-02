package com.hibernate.project4.OneToOneBiDirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student3 {
	@Id
	int rollNo;
	String  name;
	int age;
	@OneToOne
	Bike2 bk;
	public Student3() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student3(int rollNo, String name, int age, Bike2 bk) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.bk = bk;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Bike2 getBk() {
		return bk;
	}
	public void setBk(Bike2 bk) {
		this.bk = bk;
	}

}