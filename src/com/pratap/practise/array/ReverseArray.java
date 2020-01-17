package com.pratap.practise.array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int[] array = getInput(3);
		System.out.println("Array before the reverse "+Arrays.toString(array));
		int[] reverseArray = reverse(array);
		System.out.println("Array after the reverse "+Arrays.toString(reverseArray));
	}
	
	
	public static int[] getInput(int number) {
		int[] nn = new int[number];
		System.out.println("Enter the numbers need to be reverse : ");
		for (int i = 0; i < nn.length; i++) {
			nn[i] = scanner.nextInt();
		}
		
		return nn;
	}
	
	public static int[] reverse(int[] array) {
		int[] array1 = Arrays.copyOf(array, array.length);
		int temp;
		for (int i = 0; i <= array1.length/2; i++) {
			temp = array1[i];
			array1[i] = array1[array1.length - 1 - i];
			array1[array1.length - 1 - i] = temp;
			
			
		}
		System.out.println("Array1 after the reverse "+Arrays.toString(array1));
		return array1;
	}
}
