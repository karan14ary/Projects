package com.hibernate.project2.Hibernateproject2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bike {
@Id
int b_id;
String name;
String color;
public Bike() {
	super();
	// TODO Auto-generated constructor stub
}
public Bike(int b_id, String name, String color) {
	super();
	this.b_id = b_id;
	this.name = name;
	this.color = color;
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

}
