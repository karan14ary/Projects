package com.hibernate.project5.OTMORMTO;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	int id;
	String  name;
	int age;
	@OneToMany
	List <Product>prod;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String name, int age, List<Product> prod) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.prod = prod;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public List<Product> getProd() {
		return prod;
	}
	public void setProd(List<Product> prod) {
		this.prod = prod;
	}

}
