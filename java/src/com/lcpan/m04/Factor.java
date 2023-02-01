package com.lcpan.m04;
public class Factor {

	static int factorial(int num) {
		int a = 1;
		for (int i = num; i>=1 ; i--)
			a *=i;
		return a;
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(4));
	}
}