package com.pratap.practise.string;

public class UniqueChar {
	public static void main(String[] args) {
		String str = "Whatyoudoing";
		boolean result = isUniqueChars(str);
		if (result) {
			System.out.println("String has unique character");
		}else {
			System.out.println("String do not have unique character");
		}
		
	}

	static boolean isUniqueChars(String str) {
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
