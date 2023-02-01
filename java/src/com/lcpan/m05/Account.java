package com.lcpan.m05;

public class Account {
	String accountNo;
	double balance;
	
	public Account(String accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	public void printAccData() {
		System.out.println("帳號 :"+ accountNo);
		System.out.print("餘額 :"+ balance);
	}
	
	public static void main(String[] args) {
		
		Account a = new Account("123456", 50000.0);
		a.printAccData();
	}

}


