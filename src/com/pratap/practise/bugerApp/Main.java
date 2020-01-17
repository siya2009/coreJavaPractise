package com.pratap.practise.bugerApp;

public class Main {
	public static void main(String[] args) {
		Hamburger hamburger = new Hamburger("Basic", "White", "Chicken", 3.5);
		double price = hamburger.itemizedHamburger();
		hamburger.addHamburgerAddition1("Tomato", 0.27);
		hamburger.addHamburgerAddition2("Lettuce", 0.75);
		//hamburger.addHamburgerAddition3("Cheese", 1.12);
		System.out.println("Total burger price is "+hamburger.itemizedHamburger());
		
		
		HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
		healthyBurger.addHamburgerAddition1("Egg", 5.43);
		healthyBurger.addHamburgerAddition2("Lentils", 3.41);
		System.out.println("Total healthy burger price is "+healthyBurger.itemizedHamburger());
		
		DeluxBurger burger = new DeluxBurger();
		burger.addHamburgerAddition1("Should not do this", 51.33);
		burger.itemizedHamburger();
		
		
	}
}
