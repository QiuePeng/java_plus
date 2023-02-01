package com.lcpan.m05;

public class Employee1 {
	private int empno;
	private String name;

	public Employee1(int empno, String name) {
		this.empno = empno;
		this.name = name;
	}
	
	public Employee1() { //建構子
		
	}
	
	//封裝
	
	public int getEmpno() {
		return empno;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//輸出

	public void printData() {
		System.out.print("Empno = " + empno);
		System.out.println(", Name = " + name);
	}
}
