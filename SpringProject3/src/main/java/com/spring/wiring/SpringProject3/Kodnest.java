package com.spring.wiring.SpringProject3;

public class Kodnest {
	Trainer tr;

	public Kodnest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Kodnest(Trainer tr) {
		super();
		this.tr = tr;
	}

	public Trainer getTr() {
		return tr;
	}

	public void setTr(Trainer tr) {
		this.tr = tr;
	}

	@Override
	public String toString() {
		return "Kodnest [tr=" + tr + "]";
	}


}
