package com.paul.wh2;

public class Rabbit {

	public static void main(String[] args) {
		

		for (int i =1 ;  ; i++) {
			if(i%3==1 && i%5==3 && i%7==2) {
				System.out.println("兔子最少有 :" + i + "隻");
				break;
			}
		}
	}
}
