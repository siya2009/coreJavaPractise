package com.pratap.practise.linkedList;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Customer customer = new Customer("Pratap", 50.44);
		Customer anotherCustomer;
		anotherCustomer = customer;
		anotherCustomer.setBalance(12.33);
		System.out.println("Balance for customer "+ customer.getName() +" and balance "+customer.getBalance());
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(1);
		intList.add(3);
		intList.add(4);
		
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(i +": "+intList.get(i));
		}
		
		intList.add(1, 2);
		
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(i +": "+intList.get(i));
		}
		
	}
}
