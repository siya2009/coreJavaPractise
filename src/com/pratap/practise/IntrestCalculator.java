package com.pratap.practise;

public class IntrestCalculator {

	public static void main(String[] args) {
		int amount = 10000;
		for (int i = 2; i <= 8; i++) {
			System.out.println(amount+" at "+i+" %interest = "+calculateInterest(amount, i));
		}
		
		System.out.println("*******************************");
		
		for (int j = 8; j >= 2; j--) {
			System.out.println(amount+" at "+j+" %interest = "+calculateInterest(amount, j));
		}
		
		
		System.out.println("**********************************");
		
		int count = 0;
		for (int i = 10; i <= 50 ; i++) {
			if(isPrime(i)) {
				count ++;
				System.out.println("Number "+i+" is a prime number");
				if (count == 3) {
					System.out.println("Existing the loop");
					break;
				}
			}
		}
		

	}
	
	
	public static double calculateInterest(double amount, double interestRate) {
		return(amount * (interestRate/100));
	}
	
	
	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
