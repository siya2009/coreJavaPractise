package com.pratap.practise;

import java.util.Scanner;

public class MinAndMaxInputChng {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
//		boolean first = true;
		
		while (true) {
			System.out.println("Enter the number : ");
			boolean isAnInt = scanner.hasNextInt();
			
			if (isAnInt) {
				int number = scanner.nextInt();
				
//				if (first) {
//					first = false;
//					min = number;
//					max = number;
//				}
				
				if (number > max ) {
					max = number;
				} 
				
				if (number < min) {
					min = number;
				}
				
			}else {
				//System.out.println("Invalid Number");
				break;
			}
		}
		System.out.println("The max number is "+max+" and min is "+min);
		scanner.close();
	}

}
