package com.pratap.practise;

public class Recursion {
	public static void main(String[] args) {
		int[] a = {11, 19, 24, 34, 55, 65, 71, 83, 91};
		int index = binarySearch(a, 0, 8, 65);
		System.out.println("index: " + index);
	}

	// O(log(n))
	public static int binarySearch(int a[], int lower, int higher, int key) {
		if (lower == higher) {
			if (key == a[lower]) {
				return lower;
			} else {
				return -1;
			}
		}

		int mid = (lower + higher)/2;
		if (key == a[mid]) {
			return mid;
		} else if (key > a[mid]) {
			return binarySearch(a, mid+1, higher, key);
		} else {
			return binarySearch(a, lower, mid-1, key);
		}
	}
}
