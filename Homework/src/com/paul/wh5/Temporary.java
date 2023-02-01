package com.paul.wh5;

public class Temporary extends Allowance {
	
	public void getMonthSalary() {
		super.basedate();
		int MonthSalary = super.getTimes() * 168;
		System.out.println("臨時員工當月薪資 : " + MonthSalary + "\n");
	}
	
}
