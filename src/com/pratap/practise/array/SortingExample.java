package com.pratap.practise.array;

import java.util.Arrays;
import java.util.Scanner;

public class SortingExample {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] myNumber = getIntegers(5);
		printArray(myNumber);
		int[] array = sortInteger(myNumber);
		for (int i = 0; i < array.length; i++) {
			System.out.println(" Sorted array values "+array[i]);
		}
	}

	public static int[] getIntegers(int number) {
		System.out.println("Enter the " + number + " interger values. \r");
		int[] values = new int[number];

		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}

		return values;
	}

	public static void printArray(int[] number) {
		for (int i = 0; i < number.length; i++) {
			System.out.println("Element " + i + ", typed values was " + number[i]);
		}
	}

	public static int[] sortInteger(int[] array) {
//		int[] sortedArray = new int [array.length];
//		for (int i = 0; i < sortedArray.length; i++) {
//			sortedArray[i] = array[i];
//		}
		
		int[] sortedArray = Arrays.copyOf(array, array.length);
		
		boolean flag = true;
		int temp;
		while (flag) {
			flag = false;
			for (int i = 0; i < sortedArray.length-1; i++) {
				if (sortedArray[i] < sortedArray[i+1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = temp;
					flag = true;
				}
			}
		}
		
		return sortedArray;
	}
}
