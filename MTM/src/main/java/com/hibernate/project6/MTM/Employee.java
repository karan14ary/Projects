package com.hibernate.project6.MTM;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	int e__id;
	String name;
	String team;
	@ManyToMany
	List<Technology>tech;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int e__id, String name, String team, List<Technology> tech) {
		super();
		this.e__id = e__id;
		this.name = name;
		this.team = team;
		this.tech = tech;
	}
	public int getE__id() {
		return e__id;
	}
	public void setE__id(int e__id) {
		this.e__id = e__id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public List<Technology> getTech() {
		return tech;
	}
	public void setTech(List<Technology> tech) {
		this.tech = tech;
	}

}
