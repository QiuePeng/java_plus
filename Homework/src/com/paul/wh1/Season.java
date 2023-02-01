package com.paul.wh1;
import java.util.Scanner;
public class Season {

	public static void main(String[] args) {
		System.out.print("Enter month(1~12月):");
		Scanner sca = new Scanner(System.in);
		int month = sca.nextInt();
		
		switch(month) {
			case 3 :
			case 4 :
			case 5 :
				System.out.println("春");
				break;
			case 6 :
			case 7 :
			case 8 :
				System.out.println("夏");
				break;
			case 9 :
			case 10 :
			case 11 :
				System.out.println("秋");
				break;
			case 12 :
			case 1 :
			case 2 :
				System.out.println("冬");
				break;
			default :
				System.out.println("輸入錯誤");
		}
	}
}
