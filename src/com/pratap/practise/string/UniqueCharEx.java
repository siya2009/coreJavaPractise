package com.pratap.practise.string;

public class UniqueCharEx {
	public static void main(String[] args) {
		String ss = "abcdef";
		boolean result = isUniqueChars(ss);
		System.out.println(result);
	}
	
	static boolean isUniqueChars(String str) {
		int checker =0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if((checker & (1 << val)) > 0) {
				return false;
			}
			checker |= (1 << val);
		}
		
		return true;
	}
}
