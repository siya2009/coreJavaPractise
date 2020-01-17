package com.pratap.practise.classEx;

public class PersonMain {
	public static void main(String[] args) {
		Person person = new Person();
		person.setFirstName("");
		person.setLastName("");
		person.setAge(10);
		System.out.println("fullName= "+person.getFullName());
		System.out.println("teen= "+person.isTeen());
		person.setFirstName("Shashi");
		person.setAge(18);
		System.out.println("fullName= "+person.getFullName());
		System.out.println("teen= "+person.isTeen());
		person.setLastName("Singh");
		System.out.println("fullName= "+person.getFullName());
		
	}
}
