package com.paul.wh2;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		int ref=0;
		
		System.out.println("輸入一正整數 :");
		int num = sca.nextInt();
		
		System.out.print("所有質數為 :");
		
		
		for (int i = 2 ; i < num ; i++) { //2~num
			for(int j = 2 ; j<i ; j++) { 
				if(i % j ==0) 
					ref =1;//不是質數
				} 
			 if(ref==0) {
			 System.out.print(i+" ");
			 }
		}
	}
}

