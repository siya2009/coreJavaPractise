package com.pratap.practise.bugerApp;

public class DeluxBurger extends Hamburger {

	public DeluxBurger() {
		super("Deluxe Burger", "White", "Bacon & Sausage", 14.51);
		super.addHamburgerAddition1("Chips", 2.75);
		super.addHamburgerAddition2("ColdDrink", 1.81);
	}

	@Override
	public void addHamburgerAddition1(String name, double price) {
		System.out.println("Cannot add additonal item to a deluxe burger");
	}

	@Override
	public void addHamburgerAddition2(String name, double price) {
		System.out.println("Cannot add additonal item to a deluxe burger");
	}

	@Override
	public void addHamburgerAddition3(String name, double price) {
		System.out.println("Cannot add additonal item to a deluxe burger");
	}

	@Override
	public void addHamburgerAddition4(String name, double price) {
		System.out.println("Cannot add additonal item to a deluxe burger");
	}
	
	
	
	
}
