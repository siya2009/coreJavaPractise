package com.pratap.practise.string;

public class SortingString {

	public static void main(String[] args) {
		String[] str = {"hello","how","are","you"};
		StringBuilder stb = new StringBuilder();
		System.out.println(stb.capacity());
		
		for (int i = 0; i < str.length; i++) {
			for (int j = i+1; j < str.length; j++) {
				if ((str[j].compareTo(str[i]) < 0)) {
					String c = str[i];
					str[i] = str[j];
					str[j] = c;
				}
			}
			
			System.out.print(str[i]+" ");
		}

	}

}
