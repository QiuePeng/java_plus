package com.paul.wh1;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		
		System.out.print("輸入西元年:");
		int year = sca.nextInt();
		
		if (year % 4 == 0) {
			if (year % 400 == 0) {
				System.out.println("閏年");
			}
			else if (year % 100 == 0) {
				System.out.println("沒閏年");
			}
			else {
				System.out.println("閏年");
			}	
		}
		else {
			System.out.println("沒閏年");
		}
	}
}
