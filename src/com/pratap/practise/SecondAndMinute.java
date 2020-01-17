package com.pratap.practise;

public class SecondAndMinute {
	public static void main(String[] args) {
		String result = getDurationString(65, 45);
		System.out.println("result is "+result);
	}
	
	public static String getDurationString(int minute, int second) {
		if (minute > 0 || (second > 0 || second < 59)) {
			int hour = minute / 60;
			int remainingMinute = minute % 60;
			System.out.println(hour+"h "+remainingMinute+"m "+second+"s");
			return "Success";
		}else {
			return "Invalid value";
		}
	}
}
