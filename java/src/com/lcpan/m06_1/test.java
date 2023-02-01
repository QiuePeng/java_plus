package com.lcpan.m06_1;

public class test {
	
	public static void main(String[] args) {
	
	//
		Parent p = new Parent();
		p.setField(20);
		p.print();
		
		Child c = new Child();
		c.setField(10);
		c.setField2(100);
		c.print();
	
	//
		
		Parent p1 = new Parent(10000);
		p1.print();
		
		Child c1 = new Child(100,2000);
		c1.print();
	}

}
