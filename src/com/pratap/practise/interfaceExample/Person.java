package com.pratap.practise.interfaceExample;

import java.util.ArrayList;
import java.util.List;

public class Person implements Isaveable {
	private String name;
	private String age;
	private String address;
	
	
	public Person(String name, String age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}


	@Override
	public List<String> saveObject() {
		List<String> values = new ArrayList<String>();
		values.add(0, this.name);
		values.add(1, this.age);
		values.add(2, this.address);
		return values;
	}


	@Override
	public void retriveObject(List<String> savedValue) {
		if (savedValue != null && savedValue.size() > 0) {
			this.name = savedValue.get(0);
			this.age = savedValue.get(1);
			this.address = savedValue.get(2);
		}
		
	}
	
	
	
	
}
