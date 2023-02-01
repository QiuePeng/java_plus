package com.paul.wh2;

public class Interest {

	public static void main(String[] args) {
		
		double costa= 0;
		double costb= 0;
		int year = 0;
		
		while(costa >= 0) {
			year ++;
			costa = 100000*(1 + 0.1 * year); 
			costb = 100000*(Math.pow((1+0.05), year));
			if (costa < costb) {
				System.out.println(year +"年後");
				break;
			}
		}
	}
}
