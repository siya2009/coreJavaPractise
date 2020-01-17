package com.pratap.practise.autoboxingEx;

public class Main {
public static void main(String[] args) {
	Bank bank = new Bank("Bank of America");
	
	bank.addBranch("Phoenix");
	bank.addCustomer("Phoenix", "Shashi", 50.05);
	bank.addCustomer("Phoenix", "Nid", 100.32);
	bank.addCustomer("Phoenix", "Abh", 130.57);
	
	bank.addBranch("Scotsdale");
	bank.addCustomer("Scotsdale", "Rahul", 150.54);
	
	
	bank.addCustomerTransaction("Phoenix", "Shashi", 44.22);
	bank.addCustomerTransaction("Phoenix", "Shashi", 12.24);
	bank.addCustomerTransaction("Phoenix", "Shashi", 1.65);
	
	bank.listCustomers("Phoenix", false);
}
}
