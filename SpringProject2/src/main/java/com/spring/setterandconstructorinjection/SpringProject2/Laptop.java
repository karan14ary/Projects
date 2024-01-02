package com.spring.setterandconstructorinjection.SpringProject2;

public class Laptop {
int slNo;
String brand;
int price;
public Laptop() {
	super();
	// TODO Auto-generated constructor stub
}
public Laptop(int slNo, String brand, int price) {
	super();
	this.slNo = slNo;
	this.brand = brand;
	this.price = price;
	System.out.println("Constructor Executed");
}
public int getSlNo() {
	
	return slNo;
}
public void setSlNo(int slNo) {
	System.out.println("Setter method executed");
	this.slNo = slNo;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Laptop [slNo=" + slNo + ", brand=" + brand + ", price=" + price + "]";
}

}
