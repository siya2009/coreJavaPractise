package com.pratap.practise;

public class NumberOfDaysInMonth {
	public static boolean isLeapYear(int year) {
		if ((year >= 1) && (year <= 9999)) {
			if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
				System.out.println("Leap Year");
				return true;
			} else {
				System.out.println("Not a leap year");
				return false;
			}
		}
		System.out.println("Not a leap year2");
		return false;
	}

	public static int getDaysInMonth(int month, int year) {
		if ((month >= 1 && month <= 12) && (year >= 1 && year <= 9999)) {
			System.out.println("Month is " + month + " Year is " + year);
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("It is 31 ");
				return 31;
			case 2:
				if (isLeapYear(year)) {
					return 29;
				} else {
					return 28;
				}
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("it is 30");
				return 30;
			}

		} else {
			System.out.println("Not correct month or year");
			return -1;
		}

		return -1;
	}
}
