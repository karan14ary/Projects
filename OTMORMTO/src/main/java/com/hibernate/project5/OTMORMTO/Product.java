package com.hibernate.project5.OTMORMTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Product {
	@Id
	int p_id;
	String p_name;
	int cost;
	@ManyToOne
	Customer cust;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int p_id, String p_name, int cost, Customer cust) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.cost = cost;
		this.cust = cust;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}

}
