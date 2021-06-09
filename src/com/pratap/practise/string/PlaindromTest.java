// Given a non-empty string s, you may delete at most one character. 
//Judge whether you can make it a palindrome.

package com.pratap.practise.string;

public class PlaindromTest {
	public static void main(String[] args) {
		String ss = "racebcar";
		validPalindrom(ss);
	}
	
	
	static boolean validPalindrom(String ss) {
		for (int i = 0; i < ss.length() / 2; i++) {
			int j = ss.length() - 1 - i;
			if(ss.charAt(i) != ss.charAt(j)) {
				return (isPalindromeRange(ss, i+1, j) ||
                        isPalindromeRange(ss, i, j-1));
			}
		}
		
		return true;
	}


	private static boolean isPalindromeRange(String ss, int i, int j) {
		while(i < j) {
			if(ss.charAt(i) != ss.charAt(j)) return false;
			System.out.println(ss.charAt(i));
			i++;
			j--;
		}
		return true;
	}
	
	
}
