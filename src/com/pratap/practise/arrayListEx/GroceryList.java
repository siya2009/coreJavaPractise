package com.pratap.practise.arrayListEx;

import java.util.ArrayList;

public class GroceryList {
	private ArrayList<String> groceryList = new ArrayList<String>();
	
	public void addGroceryItem(String Item) {
		groceryList.add(Item);
	}
	
	public void printGroceryList() {
		System.out.println("You have "+groceryList.size()+" items in your grocery list");
		for (int i = 0; i < groceryList.size(); i++) {
			System.out.println((i+1) + " . "+groceryList.get(i));
		}
	}
	
	public void modifyGroceryItem(String currentItem, String newItem) {
		int position = findItem(currentItem);
		if (position >= 0) {
			modifyGroceryItem(position, newItem);
		}
	}
	
	private void modifyGroceryItem(int position, String newItem) {
		groceryList.set(position, newItem);
		System.out.println(newItem+" has been modified");
	}
	
	
	public void removeGroceryItem(String item) {
		int position = findItem(item);
		if (position >= 0) {
			removeGroceryItem(position);
		}
		System.out.println(item+" has been removed from grocery list");
	}
	
	private void removeGroceryItem(int positon) {
		groceryList.remove(positon);
	}
	
	private int findItem(String searchItem) {
		int position = groceryList.indexOf(searchItem);
		
		return position;
	}
	
	public boolean onFile(String searchItem) {
		int position = findItem(searchItem);
		if (position >= 0) {
			return true;
		}
		
		return false;
	}
}
