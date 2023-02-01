package com.lcpan.m06_1;

public class Parent {
	
	private	int field;
	
	public Parent() {
		//Java 會自動補super 
	}
	
	public Parent (int field) {
		this.field = field;
	}
	
	public int getField() {
		return field;
	}
	
	public void setField(int field) {
		this.field = field;
	}
	
	public void print() {
		System.out.println("field : " +field);
	}

}
