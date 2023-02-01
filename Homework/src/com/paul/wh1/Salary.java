package com.paul.wh1;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		System.out.print("輸入工作時數:");
		Scanner sca = new Scanner(System.in);
		int times = sca.nextInt();
		double cost;
		
		if (times <= 60) {
			System.out.println("薪水:"+times*150 +"元");
		}
		else if (times > 60 && times <= 80 ) {
			cost = 60*150+((times-60)*150*1.25);
			System.out.println("薪水:"+(int)cost+ "元");
		}
		else if (times >= 81) {
			cost = 60*150+(20*150*1.25)+((times-80)*150*1.5);
			System.out.println("薪水:"+(int)cost+ "元");
		}
	}

}
