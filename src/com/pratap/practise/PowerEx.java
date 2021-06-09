package com.pratap.practise;

public class PowerEx {
	public static void main(String[] args) {
		powerOf2(4);
	}
	
	
	static int powerOf2(int n) {
		if(n < 1) {
			return 0;
		}else if(n == 1) {
			return 1;
		}else {
			int prev = powerOf2(n/2);
			int curr = prev * 2;
			System.out.println(curr);
			return curr;
		}
	}
}
