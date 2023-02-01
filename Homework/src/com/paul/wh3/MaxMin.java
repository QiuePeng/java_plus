package com.paul.wh3;

public class MaxMin {

	public static void main(String[] args) {
		
		int[] n = {1,2,3,4,5,6,7,8,9,10};
		
		int max = n[0];
		int min = n[0];
		
		for (int i = 0 ; i < n.length ; i++) {
			
			if (max < n[i]) {
				max = n[i];
				
			}
			else if (min > n[i]) {
				min = n[i];
				
			}
		}
		System.out.println("最大值 :" +max);
		System.out.println("最小值 :" +min);
	}

}
