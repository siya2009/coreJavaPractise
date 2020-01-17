package com.pratap.practise;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse=0;
        int nn = number;
        while (number != 0) {
            int lastDigit = number % 10;
            number = number / 10;
            reverse = reverse + lastDigit;
            reverse *=  10;
        }

        if (reverse/10 == nn){
            return true;
        } else
        {
            return false;
        }

    }
    
    public static void main(String[] args) {
		boolean value = isPalindrome(123);
		System.out.println("The number is "+value);
	}

}
