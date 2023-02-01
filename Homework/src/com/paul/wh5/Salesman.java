package com.paul.wh5;

public class Salesman extends Allowance {
	
	public void getMonthSalary() {
		super.basedate();
		int MonthSalary =super.getSalary() + 
						super.getSalesbonus() + 
						super.getLunch();
		System.out.println("銷售員當月薪資 : " + MonthSalary + "\n");
	}
	
}
