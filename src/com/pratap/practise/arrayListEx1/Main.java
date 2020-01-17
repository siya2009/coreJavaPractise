package com.pratap.practise.arrayListEx1;

import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static MobilePhone mobilePhone = new MobilePhone("602 451 6080");
	public static void main(String[] args) {
	
		boolean quite = false;
		startPhone();
		printActions();
		while (!quite) {
			System.out.println("\nEnter action: (6 to show available actions)");
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch (action) {
			case 0:
				System.out.println("\nshutting down...");
				quite = true;
				break;
			
			case 1:
			mobilePhone.printContacts();
			break;
			
			case 2:
				addNewContact();
				break;
				
			case 3:
				updateContact();
				break;

				
			case 4:
				removeContact();
				break;
			
			case 5:
				queryContact();
				break;
				
			case 6:
				printActions();
				break;
				
			default:
				break;
			}
		}
	}
	
	
	private static void addNewContact() {
		System.out.println("Enter the new contact name: ");
		String name = scanner.nextLine();
		System.out.println("Enter the phone number: ");
		String number = scanner.nextLine();
		Contacts contact = Contacts.createContact(name, number);
		if (mobilePhone.addNewContact(contact)) {
			System.out.println("New contact added: Name = "+ name + ", phone = "+number);
		}else {
			System.out.println("Cannot add, "+name+" already on file");
		}
	}
	
	private static void updateContact() {
		System.out.println("Enter the existing contact name: ");
		String name = scanner.nextLine();
		Contacts existingContactRecord = mobilePhone.queryContact(name);
		if (existingContactRecord == null) {
			System.out.println(" contcat not found.");
			return;
		}
		
		System.out.println("Enter the new contact name: ");
		String newName = scanner.nextLine();
		System.out.println("Enter the new phone number: ");
		String newNumber = scanner.nextLine();
		Contacts newContcatRecord = Contacts.createContact(newName, newNumber);
		if (mobilePhone.updateContact(existingContactRecord, newContcatRecord)) {
			System.out.println("Record updated successfully");
		}else {
			System.out.println("error in updating record.");
		}
	}
	
	
	private static void removeContact() {
		System.out.println("Enter the existing contact name: ");
		String name = scanner.nextLine();
		Contacts existingContactRecord = mobilePhone.queryContact(name);
		if (existingContactRecord == null) {
			System.out.println(" contact not found.");
			return;
		}
		
		if(mobilePhone.removeContact(existingContactRecord)) {
			System.out.println("contcat has been deleted");
		}else {
		 System.out.println("Error while deleting");
		}
		
	}
	
	
	private static void queryContact() {
		System.out.println("Enter the existing contact name: ");
		String name = scanner.nextLine();
		Contacts existingContactRecord = mobilePhone.queryContact(name);
		if (existingContactRecord == null) {
			System.out.println(" contcat not found.");
			return;
		}
		
		System.out.println("Name: "+existingContactRecord.getName()+" phone number is "+existingContactRecord.getNumber());
	}
	
	private static void startPhone() {
		System.out.println("Starting phone........");
	}
	
	private static void printActions() {
		System.out.println("\nAvailable action:\npress");
		System.out.println("0 - to shutdown\n"+ 
						   "1 - to print contact\n"+
						   "2 - to add a new contact\n"+
						   "3 - to update an existing contact\n"+
						   "4 - to remove an existing contact\n"+
						   "5 - query if an existing contact exists\n"+
						   "6 - to print a list of avilable actions.\n");
		System.out.println("Choose an action :");
	}
	
}
