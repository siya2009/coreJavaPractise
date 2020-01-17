package com.pratap.practise;

public class EvenNumber {
	public static void main(String[] args) {
		int number = 4;
		int finishNumber = 20;
		int countofEvennumber = 0;
		while (number <= finishNumber) {
			number++;
			if (!isEvenNumber(number)) {
				continue;
			}
			System.out.println("Even number " + number);
			countofEvennumber++;
			if (countofEvennumber >= 5) {
				break;
			}
		}
		
		System.out.println(" Total even number found "+countofEvennumber);

	}

	public static boolean isEvenNumber(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
