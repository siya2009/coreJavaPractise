package com.pratap.practise.string;

public class StringCompression {
	public static void main(String[] args) {
		String str ="aaabbb";
		String compress = compressString(str);
		System.out.println("compressed string "+compress);
	}

	private static String compressString(String str) {
		String newStr = "";
		int count = 0;
		for(int i=0; i < str.length(); i++) {
			count ++;
			if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
				newStr += ""+str.charAt(i)+count;
				count=0;
			}
		}
		return newStr.length() < str.length() ? newStr : str;
	}
	
}
