package com.paul.wh1;
import java.util.Scanner;
public class Refund {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		System.out.print("實付金額:");
		int price = sca.nextInt();
		
		System.out.print("應付金額:");
		int refund = sca.nextInt();
		
		
		if (price == refund) {
			System.out.print("不用找錢");
		}
		else if (price > refund) {
			System.out.print("不夠!!");
		}
		else {
			System.out.print(("找1000元 : "+(refund / 1000)+"張")+
							(("找500元 : "+(refund % 1000)/500)+"張")+
							(("找100元 : "+(refund % 1000)/100)+"張")+
							(("找50元 : "+(refund % 1000)/50)+"個")+
							(("找10元 : "+(refund % 1000)/10)+"個")+
							(("找5元 : "+(refund % 1000)/5)+"個")+
							(("找1元 : "+(refund % 1000)/1)+"個"));
		}
	}	
}
