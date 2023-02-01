package com.paul.wh2;
import java.util.Scanner;
public class Password {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		System.out.println("請輸入密碼 :");
		int test = sca.nextInt();
		
		int password = 1111;
		int n = 0;
		int ref = 0;
		
		do {
			
			n++;
			if(test == password && n < 3) {
				n+=2;
				System.out.println("密碼輸入正確，歡迎使用本系統！");
			}
			else if (test != password && n < 3) {
				
				System.out.println("請輸入密碼 :");
				int t = sca.nextInt();
			}
			
			else if (n==3) {
				System.out.println("密碼輸入超過三次！");
			}
				
		} while(n < 3);
	}
}
