package com.lcpan.m04;

public class ThreeArgsMethod {

    public static void main(String[] args) {
    	int sum = 0;
        int[][][] arr = {{{2, 6}, {1, 4}}, {{3, 5}, {6, 7}}};
        
        
        
        for (int i = 0; i < arr.length; i++) //layer
        	for (int j= 0; j < arr[i].length; j++) //row
        		for (int k = 0; k < arr[i][j].length; k++) //col
        			sum += arr[i][j][k];
        System.out.println("sum =" + sum);
    }
}
