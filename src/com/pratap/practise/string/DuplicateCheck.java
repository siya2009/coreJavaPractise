package com.pratap.practise.string;

public class DuplicateCheck {
	public static void main(String[] args) {
		String s = "shashi";
		char[] charstr = s.toCharArray();
		System.out.println("The string is :"+s);
		System.out.print("Duplicate characters in above string are :");
		for(int i=0; i< s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				if (charstr[i] == charstr[j]) {
					System.out.print(charstr[j]+ " ");
				}
			}
		}
		
	}
}
