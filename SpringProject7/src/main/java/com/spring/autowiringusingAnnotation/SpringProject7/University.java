package com.spring.autowiringusingAnnotation.SpringProject7;

import org.springframework.beans.factory.annotation.Autowired;

public class University {
	@Autowired
	Professor pr;

	public University() {
		super();
		// TODO Auto-generated constructor stub
	}

	public University(Professor pr) {
		super();
		this.pr = pr;
	}

	public Professor getPr() {
		return pr;
	}

	public void setPr(Professor pr) {
		this.pr = pr;
	}

	@Override
	public String toString() {
		return "University [pr=" + pr + "]";
	}


}
