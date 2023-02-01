package com.lcpan.m06_1;

public class Child extends Parent{
	private int field2;
	
	public Child() {
		
	}
	
	public Child(int field, int field2) {
		super(field);
		this.field2 = field2;
		
	}
	
	public int getField2() {
		return field2;
	}
	
	public void setField2(int field2) {
		this.field2 = field2;
	}
	
	public void print() {
		super.print();
		System.out.println("field2 :" +field2);
	}
}
