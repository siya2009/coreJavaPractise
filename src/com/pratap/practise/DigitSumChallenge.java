package com.pratap.practise;

public class DigitSumChallenge {
	public static void main(String[] args) {
		System.out.println(sumDigit(125));
	}
	
	public static int sumDigit(int number) {
		if (number < 10) {
			return -1;
		}
		
		int sum =0;
		
		while (number > 0) {
			int digit = number % 10;
			System.out.println("digit "+digit);
			sum = sum + digit;
			System.out.println("sum is "+sum);
			number = number / 10;
			System.out.println("number is "+number);
		}
		return sum;
	}
}
