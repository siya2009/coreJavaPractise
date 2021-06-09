package com.pratap.practise;

public class NumberPalindromeExample {
	
	public static int isPalindrome(int n){
		  
	        // Find reverse of n 
	        int rev = 0; 
	        for (int i = n; i > 0; i /= 10) 
	            rev = rev * 10 + i % 10; 
	              
	        // If n and rev are same,  
	        // then n is palindrome 
	        return(n == rev) ? 1 : 0; 
	    } 

	
	
    public static void numberRange(int num1, int num2){
       
    	for (int i = num1; i <= num2; i++) {
			if(isPalindrome(i) == 1) {
				System.out.print(i + " ");
			}
    	}
    	
    }
    
    
    static void countPal(int min, int max) 
    { 
        for (int i = min; i <= max; i++) 
            if (isPalindrome(i)==1) 
                System.out.println(i + " "); 
    } 
    
    
    public static void main(String[] args) {
		 numberRange(100,200);
		 countPal(100, 2000);
	}

}
