package com.paul.wh2;
public class PerfectNumber {

	public static void main(String[] args) {
		
		System.out.println("PerFectNumber is:");
		
		int sum = 0;
		
		for (int i =1 ; i <= 100  ; i++) {
			for (int j=1 ; j< i ; j++){ 
				if(i % j ==0) {
					sum += j;
				}
			}
			if(sum == i) {
				System.out.println( i+" ");
			}
			sum = 0;
		}
	}
}