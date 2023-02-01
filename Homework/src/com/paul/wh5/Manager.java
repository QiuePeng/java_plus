package com.paul.wh5;

public class Manager extends Allowance {
	
	public void getMonthSalary() {
		super.basedate();
		int MonthSalary = super.getSalary() + 
							super.getLunch() + 
							super.getBonus() +
							super.getTransport();
		System.out.println("主管當月薪資 : " + MonthSalary + "\n");
	}
	
}
