package com.pratap.practise.string;

public class Check {
	public static void main(String[] args) {
		System.out.println(isUniqueChar("ilovecoding"));
	}
	
	public static boolean isUniqueChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
	
}
