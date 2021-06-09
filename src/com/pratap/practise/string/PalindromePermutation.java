package com.pratap.practise.string;

public class PalindromePermutation {
	public static void main(String[] args) {
		System.out.println(canPermutePalindrome("tactcoa"));
	}
	
	public static boolean canPermutePalindrome(String str) {
		int[] char_counts = new int[128];
		for (int i = 0; i < str.length(); i++) {
			char_counts[str.charAt(i)]++;
		}
		
		int count = 0;
		for (int i = 0; i < 128; i++) {
			count += char_counts[i] % 2;
			
		}
		
		return count <= 1;
	}
}
