package com.spring.ListSetMapDataMember.SpringProject9;
import java.util.*;
public class Employee {
	List <String>technologies;
	Set<String>projects;
	Map<Integer,String>company;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(List<String> technologies, Set<String> projects, Map<Integer, String> company) {
		super();
		this.technologies = technologies;
		this.projects = projects;
		this.company = company;
	}
	public List<String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}
	public Set<String> getProjects() {
		return projects;
	}
	public void setProjects(Set<String> projects) {
		this.projects = projects;
	}
	public Map<Integer, String> getCompany() {
		return company;
	}
	public void setCompany(Map<Integer, String> company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Employee [technologies=" + technologies + ", projects=" + projects + ", company=" + company + "]";
	}


}
