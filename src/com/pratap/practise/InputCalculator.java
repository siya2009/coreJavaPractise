package com.pratap.practise;

import java.util.Scanner;

public class InputCalculator {
	public static void main(String[] args) {
		inputThenPrintSumAndAverage();
	}
	
	public static void inputThenPrintSumAndAverage() {
		Scanner scanner = new Scanner(System.in);
		 int sum = 0;
		 long avg = 0;
		 int count = 0;
		
		while(true) {
			boolean isAnInt = scanner.hasNextInt();
			if (isAnInt) {
				int number = scanner.nextInt();
				count++;
				sum += number;
				avg = Math.round((double) sum / count);
			}else {
				break;
			}
		}
		System.out.println("SUM = "+sum+" AVG = "+avg);
		scanner.close();
	}
}
