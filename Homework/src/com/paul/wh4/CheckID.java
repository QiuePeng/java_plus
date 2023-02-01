package com.paul.wh4;
import java .util.Scanner;

public class CheckID {
	
	public static boolean isID(String ID) {

		if (ID.length() == 10) {
			if (ID.charAt(0) >= 'A' && ID.charAt(0) <= 'Z') {
				if (ID.charAt(1) =='1' || ID.charAt(1) =='2') {
					for (int i = 3 ; i < 10 ; i++) {
						if (ID.charAt(i) >= '0' && ID.charAt(i) <= '9') {
							return true;
						}
					}
				}
				return false;
			}
			return false;
		}
		return false;
	}
	
	
	
	public static boolean check(String ID) {
		int [] az = {10,11,12,13,14,15,16,17,34,18,19,20,21,22,35,23,24,25,26,27,28,29,32,30,31,33};
		int id2 = az[ID.charAt(0) - 'A'];
		int first = (id2 / 10) + (id2 % 10) * 9;
		
		int n = 8;
		int p = 0;
		int sum = 0;
		for (int i = 1 ; i < 9 ; i++) {
			int value = (ID.charAt(i) - 48) * n;
			n--;
			p += value;
		}
		 sum = 10 - (( p + first ) % 10);
		System.out.println("驗證碼: " + sum);
		if(sum == (ID.charAt(9) -48)) {
			return true;
		}
		return false;
	}	
		
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("請輸入身分證 :");
		String id = s.next();
		id = id.toUpperCase();
		
		if (check(id) == true) {
			System.out.println("身分證正確");
		}
		else {
			System.out.println("身分證錯誤" + id);
		}
		s.close();
	}

}
