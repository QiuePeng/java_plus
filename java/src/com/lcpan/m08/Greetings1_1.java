package com.lcpan.m08;

public class Greetings1_1 {
	public static void main(String[] args) {
		String[] greetings = { "Hello", "Hi! ", "Good" };
		try {
			for (int i = 0; i <= greetings.length; i++)
				System.out.println(greetings[i]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of index bound!");
		}

		System.out.println("Program end!");
	}
}
