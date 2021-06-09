
//Given two string, Write method to decide if one is permutation of other or not.

package com.pratap.practise.string;


public class PermutationTest1 {
	public static void main(String[] args) {
		String s = "abdc";
		String t = "erdf";
		boolean result = permutation(s, t);
		if(result) {
			System.out.println("It is permutation");
		}else {
			System.out.println("It is not permutation");
		}
	}
	
	
	static String sort(String ss) {
		char[] content = ss.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	
	static boolean permutation(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}
}
