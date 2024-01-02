package com.hibernate.project3.OneToOneUnidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Student2 {
	@Id
int rollNo;
String name;
int age;
@OneToOne
Bike1 bk;
public Student2() {
	super();
	// TODO Auto-generated constructor stub
}
public Student2(int rollNo, String name, int age, Bike1 bk) {
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
public Bike1 getBk() {
	return bk;
}
public void setBk(Bike1 bk) {
	this.bk = bk;
}

}
