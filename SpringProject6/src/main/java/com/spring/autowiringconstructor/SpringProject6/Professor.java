package com.spring.autowiringconstructor.SpringProject6;

public class Professor {
	int p_id;
	String name;
	String subject;
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Professor(int p_id, String name, String subject) {
		super();
		this.p_id = p_id;
		this.name = name;
		this.subject = subject;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Professor [p_id=" + p_id + ", name=" + name + ", subject=" + subject + "]";
	}


}
