package com.pratap.practise.IncapsulationEx2;

public class Main {
	public static void main(String[] args) {
		Printer printer = new Printer("HP", 50, true);
		System.out.println("inital page count = "+printer.getNumberofPages());
		int pagesPrinted = printer.printPages(4);
		System.out.println("Pages printed was "+pagesPrinted+" new total print count for printer = "+printer.getNumberofPages());
		pagesPrinted = printer.printPages(2);
		System.out.println("Pages printed was "+pagesPrinted+" new total print count for printer = "+printer.getNumberofPages());
	}
}
