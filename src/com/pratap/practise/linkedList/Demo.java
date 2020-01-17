package com.pratap.practise.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Demo {
	public static void main(String[] args) {
		LinkedList<String> placesToVisit = new LinkedList<String>();
		addInOrder(placesToVisit, "NewYork");
		addInOrder(placesToVisit, "Utha");
		addInOrder(placesToVisit, "Florida");
		addInOrder(placesToVisit, "Texas");
		addInOrder(placesToVisit, "Indiana");
		addInOrder(placesToVisit, "Atlantica");
		
		printList(placesToVisit);
		visit(placesToVisit);

	}

	private static void printList(LinkedList<String> linkedList) {
		Iterator<String> it = linkedList.iterator();
		while (it.hasNext()) {
			System.out.println("Now visitng " + it.next());

		}

		System.out.println("=============================");
	}

	private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
		ListIterator<String> li = linkedList.listIterator();

		while (li.hasNext()) {
			int comparison = li.next().compareTo(newCity);
			if (comparison == 0) {
				// equal, do not add.
				System.out.println(newCity + " is already included as a destination");
				return false;
			} else if (comparison > 0) {
				// new city should appear before this one.
				li.previous();
				li.add(newCity);
				return true;

			} else if (comparison < 0) {
				// move to next city
			}

		}

		li.add(newCity);
		return true;
	}
	
	
	private static void visit(LinkedList<String> cities) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean goingForward = true;
		ListIterator<String> listIterator = cities.listIterator();
		
		if (cities.isEmpty()) {
			System.out.println("No cities in the iteneary");
			return;
		}else {
			System.out.println("Now visiting "+listIterator.next());
			printMenu();
			
		}
		
		while (!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			switch (action) {
			case 0:
				System.out.println("Holiday is over");
				quit = true;
				break;
				
			case 1:
				if (!goingForward) {
					if (listIterator.hasNext()) {
						listIterator.next();	
					}
					goingForward = true;
				}
				if (listIterator.hasNext()) {
					System.out.println(" Now visting "+listIterator.next());
				}else {
					System.out.println("Reached to the end of the list.");
					goingForward = false;
				}
				break;
				
			case 2:
				if (goingForward) {
					if (listIterator.hasPrevious()) {
						listIterator.previous();
					}
					goingForward = false;
				}
				if (listIterator.hasPrevious()) {
					System.out.println(" Now visting "+listIterator.previous());
				}else {
					System.out.println("We are at the start of the list.");
					goingForward = true;
				}
				break;

			case 3:
				printMenu();
				break;
			}
		}
	}
	
	private static void printMenu() {
		System.out.println("Available action:\npress ");
		System.out.println("0 - to quit\n"+ 
		                   "1 - go to the next city\n"+
		                   "2 - go to the previous city\n"+
		                   "3 - print the menu options");
	}

}
