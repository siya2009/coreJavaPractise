package com.pratap.practise.string;

public class OneAway {

	public static void main(String[] args) {
		String str1 = "pale";
		String str2 = "bae";
		
		boolean result;
		if (str1.length() == str2.length()) {
			result = oneEditReplace(str1, str2);
			System.out.println(result);
		} else if (str1.length() + 1 == str2.length()) {
			result = oneEditinsert(str1, str2);
			System.out.println(result);
		} else if (str1.length() - 1 == str2.length()) {
			result = oneEditinsert(str1, str2);
			System.out.println(result);
		}
	}

	static boolean oneEditReplace(String str1, String str2) {
		boolean foundDifference = false;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				if (foundDifference) {
					return false;
				}
				foundDifference = true;
			}

		}
		return true;
	}

	private static boolean oneEditinsert(String str1, String str2) {
		int index1 = 0;
		int index2 = 0;

		while (index2 < str2.length() && index1 < str1.length()) {
			if (str1.charAt(index1) != str2.charAt(index2)) {
				if (index1 != index2) {
					return false;
				}
				index2++;
			} else {
				index1++;
				index2++;
			}
		}

		return true;
	}

}
