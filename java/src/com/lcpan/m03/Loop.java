package com.lcpan.m03;

public class Loop {
	public static void main(String[] args) {
		// 1加到10
		int n = 1;
		int sum = 0;
		while (n <= 10) {
			sum += n;
			n++;
		}
		System.out.println(sum);

		n = 1;
		sum = 0;
		do {
			sum += n;
			n++;
		} while (n <= 10);
		System.out.println(sum);

		sum = 0;
		for (int i = 1; i <= 10; i++)
			sum += i;
		System.out.println(sum);
		
		// 1到100基數相加
		sum = 0;
		for (int i = 1; i <= 100; i+=2)
			sum += i;
		System.out.println(sum);
		
		// 100加到1
		sum = 0;
		for (int i = 100; i >= 1; i--)
			sum += i;
		System.out.println(sum);
	}
}
