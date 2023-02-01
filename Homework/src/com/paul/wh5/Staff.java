package com.paul.wh5;

public class Staff extends Allowance{
	
	public void getMonthSalary() {
		int MonthSalary = super.getSalary() + super.getLunch();
		
		super.basedate();
		System.out.println("一般員工薪資 : " + MonthSalary + "\n");
	}
		
}
