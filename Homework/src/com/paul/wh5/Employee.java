package com.paul.wh5;

public class Employee {
	
	private String name;
	private String sex;
	private String hiredate;
	private String phone;
	private String email;
	private int salary;
	private int times;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getTimes() {
		return times;
	}
	public void setTimes(int times) {
		this.times = times;
	}
	
	public void basedate() {
		System.out.println("姓名 : " + name);
		System.out.println("性別 : " + sex);
		System.out.println("入職日 : " + hiredate);
		System.out.println("電話 : " + phone);
		System.out.println("信箱 : " + email);
	}
	
	
	
}
