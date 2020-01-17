package com.pratap.practise.IncapsulationEx2;

public class Printer {
	private String printerModel;
	private int tonerLevel = 100;
	private int numberofPages;
	private boolean duplexPrinter;
	
	public Printer(String printerModel, int tonerLevel, boolean duplexPrinter) {
		this.printerModel = printerModel;
		this.tonerLevel = tonerLevel;
		if (tonerLevel > -1 && tonerLevel <= 100) {
			this.tonerLevel = tonerLevel;
		} else {
			this.tonerLevel = -1;
		}
		
		this.numberofPages = 0;
		this.duplexPrinter = duplexPrinter;
	}
	


	public int getNumberofPages() {
		return numberofPages;
	}



	public int addToner(int tonerAmount) {
		if (tonerAmount >= -1 && tonerAmount <= 100) {
			if (this.tonerLevel + tonerAmount > 100) {
				return -1;
			}
			this.tonerLevel += tonerAmount;
			return this.tonerLevel;
			
		}else {
			return -1;
		}
	}
	
	public int printPages(int pages) {
		int pagesToPrint = pages;
		if(this.duplexPrinter) {
			pagesToPrint /= 2;
			System.out.println("printing in duplex mode");
		}
		
		this.numberofPages += pagesToPrint;
		return pagesToPrint;
	}
	
}
