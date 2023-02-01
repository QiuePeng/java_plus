package com.lcpan.m05;

public class test {
	public static void main(String[] args) {
		Employee1 emp = new Employee1();
		emp.setEmpno(111);
		emp.setName("Tom");
		emp.printData();

		//建構子
		Employee1 emp1 = new Employee1(222, "Mary");
		emp1.printData();
	}
}
