package com.pratap.practise;

public class FirstLastDigitSum {

	public static void main(String[] args) {
		int value = sumFirstAndLastDigit(43);
		System.out.println(" The first and last digit sum is "+value);
	}

	public static int sumFirstAndLastDigit(int number) {
		if (number <= 0) {
			return -1;
		}
		int firstDigit = 0;
		int lastDigit = 0;
		
		lastDigit = number % 10;
		//System.out.println("Last Digit " + lastDigit);
		
		while (number >= 10) {
			
			number = number / 10;
			//System.out.println(number);
		}
		firstDigit = number;
		//System.out.println(" First Digit "+firstDigit);
		return firstDigit + lastDigit;
		
	}
}
