package com.pratap.practise.array;

import java.util.Scanner;

public class MinimumElement {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] array1 = readIntegers(5);
		int minimumNumber = findMin(array1);
		System.out.println("The minimum number in the array is "+minimumNumber);
	}

	public static int[] readIntegers(int count) {
		System.out.println("Enter the " + count + " integer value.\r");
		int[] number = new int[count];

		for (int i = 0; i < number.length; i++) {
			number[i] = scanner.nextInt();
		}
		
		return number;
	}
	
	public static int findMin(int[] array) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		
		return min;
	}
}
