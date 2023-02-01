package com.paul.wh1;
import java.util.Scanner;
public class Electricity {

	public static void main(String[] args) {
	Scanner sca = new Scanner(System.in);
	
	
	System.out.println("請輸入用電類型:");
	System.out.println("(1)非營業");
	System.out.println("(2)營業");
	int type = sca.nextInt();
	
	System.out.println("請輸入使用度數:");
	double elect = sca.nextDouble();
	
	double cost;
	
	if (type == 1) {
		if (elect <= 120) {
			cost = elect * 1.63;
			System.out.println("電費:"+ cost);
		}
		else if (elect > 120 && elect <= 330) {
			cost = elect * 2.10;
			System.out.println("電費:"+ cost);
		}
		else if (elect > 330 && elect <= 500) {
			cost = elect * 2.89;
			System.out.println("電費:"+ cost);
		}
		else if (elect > 500 && elect <= 700) {
			cost = elect * 3.94;
			System.out.println("電費:"+ cost);
		}
		else if (elect > 700 && elect <= 1000) {
			cost = elect * 4.60;
			System.out.println("電費:"+ cost);
		}
		else {
			cost = elect * 5.03;
			System.out.println("電費:"+ cost);
		}
	}
	else if (type == 2) {
		if (elect <= 330) {
			cost = elect * 2.12;
			System.out.println("電費:"+ cost);
		}
		else if (elect > 330 && elect <= 700) {
			cost = elect * 2.91;
			System.out.println("電費:"+ cost);
		}
		else if (elect > 700 && elect <= 1500) {
			cost = elect * 3.44;
			System.out.println("電費:"+ cost);
		}
		else {
			cost = elect * 5.05;
			System.out.println("電費:"+ cost);
		}
	}
	}

}
