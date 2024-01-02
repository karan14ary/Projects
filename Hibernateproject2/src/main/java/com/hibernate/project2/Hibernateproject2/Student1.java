package com.hibernate.project2.Hibernateproject2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student1 {
	@Id
int rollNo;
String name;
int age;
public Student1() {
	super();
	// TODO Auto-generated constructor stub
}
public Student1(int rollNo, String name, int age) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.age = age;
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

}
