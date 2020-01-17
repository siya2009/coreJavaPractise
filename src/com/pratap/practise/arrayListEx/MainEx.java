package com.pratap.practise.arrayListEx;

import java.util.Scanner;

public class MainEx {
	
	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();
	public static void main(String[] args) {
		boolean quite = false;
		int choice = 0;
		
		while (!quite) {
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 0:
				printInstructions();
				break;
				
			case 1:
				groceryList.printGroceryList();
				break;
				
			case 2:
				addItems();
				break;
				
			case 3:
				modifyItem();
				break;
				
			case 4:
				removeItem();
				break;
				
			case 5:
				searchForItem();
				break;
			
			case 6:
				quite = true;
				break;
			
			}
		}
	
	}
	
	public static void printInstructions() {
		System.out.println("\nPress ");
		System.out.println("\t 0 - To print choice options. ");
		System.out.println("\t 1 - To print the list of grocery items. ");
		System.out.println("\t 2 - To add the items to the list. ");
		System.out.println("\t 3 - To modify and items in to the list. ");
		System.out.println("\t 4 - To remove an item from the list. ");
		System.out.println("\t 5 - To search an item from the list. ");
		System.out.println("\t 6 - To quite the applications. ");
	}
	
	
	public static void addItems() {
		System.out.print("Enter the grocery item: ");
		groceryList.addGroceryItem(scanner.nextLine());
	}
	
	
	public static void modifyItem() {
		System.out.print("current Item number: ");
		String itemNo = scanner.nextLine();
		System.out.println("Enter the replacement Item: ");
		String newItem = scanner.nextLine();
		groceryList.modifyGroceryItem(itemNo, newItem);
	}
	
	public static void removeItem() {
		System.out.print("Enter the Item name: ");
		String itemNo = scanner.nextLine();
		groceryList.removeGroceryItem(itemNo);
	}
	
	public static void searchForItem() {
		System.out.println("Item for search: ");
		String item = scanner.nextLine();
		if (groceryList.onFile(item)) {
			System.out.println("Found "+ item);
		}else {
			System.out.println(item+"  not on file");
		}
	}
	
}
