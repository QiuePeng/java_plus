package com.paul.wh2;

public class Amstrong {

	public static void main(String[] args) {
		
		System.out.println("Amstrong 數有 :");
		int sum = 0 ;
		int a,b,c= 0;
		
		for (int i = 100 ; i<=999  ; i++) {
			a = i / 100;
			b = (i % 100) / 10;
			c =(i % 10) / 1;
			
			sum = (a*a*a+b*b*b+c*c*c);
	
			if(sum == i) {
				System.out.println(i);
			}
			sum = 0;
		}
	}

}
