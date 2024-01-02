package com.spring.wiring.SpringProject3;

public class Trainer {
	int t_id;
	String name;
	int age;
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainer(int t_id, String name, int age) {
		super();
		this.t_id = t_id;
		this.name = name;
		this.age = age;
	}
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
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
	@Override
	public String toString() {
		return "Trainer [t_id=" + t_id + ", name=" + name + ", age=" + age + "]";
	}

}
