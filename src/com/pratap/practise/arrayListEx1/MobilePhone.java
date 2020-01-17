package com.pratap.practise.arrayListEx1;

import java.util.ArrayList;

public class MobilePhone {
	private String name;
	private ArrayList<Contacts> contact;

	public MobilePhone(String name) {
		this.name = name;
		this.contact = new ArrayList<Contacts>();
	}

	public boolean addNewContact(Contacts cc) {
		if (findContact(cc.getName()) > 0) {
			System.out.println(" Contact is already on file");
			return false;
		}

		contact.add(cc);

		return true;
	}

	public boolean updateContact(Contacts oldContact, Contacts newContact) {
		int findPosition = findContact(oldContact);
		if (findPosition < 0) {
			System.out.println(oldContact.getName() + " was not found.");
			return false;
		}else if (findContact(newContact.getName()) != -1) {
			System.out.println("Contcat with name "+newContact.getName()+" already exists");
			return false;
		}

		this.contact.set(findPosition, newContact);
		System.out.println(oldContact.getName() + " , was replaced by " + newContact.getName());
		return true;
	}

	public boolean removeContact(Contacts con) {
		int findPosition = findContact(con);
		if (findPosition < 0) {
			System.out.println(con.getName() + " was not found.");
			return false;
		}

		this.contact.remove(findPosition);
		System.out.println(con.getName() + ", was deleted.");
		return true;
	}

	private int findContact(Contacts con) {
		return this.contact.indexOf(con);
	}

	private int findContact(String name) {
		for (int i = 0; i < contact.size(); i++) {
			Contacts cc = this.contact.get(i);
			if (cc.getName().equalsIgnoreCase(name)) {
				return i;
			}
		}

		return -1;
	}

	public String queryContact(Contacts contact) {
		if (findContact(contact) > 0) {
			return contact.getName();
		}

		return null;
	}
	
	public Contacts queryContact(String name) {
		int position = findContact(name);
		if (position > 0) {
			return contact.get(position);
		}
		
		return null;
	}

	public void printContacts() {
		System.out.println("Contact list");
		for (int i = 0; i < contact.size(); i++) {
			System.out
					.println((i + 1) + "." + this.contact.get(i).getName() + " -> " + this.contact.get(i).getNumber());
		}
	}
}
