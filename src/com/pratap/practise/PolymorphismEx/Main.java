package com.pratap.practise.PolymorphismEx;

class Car {
	String name;
	boolean engine;
	int cylinder;
	int wheels;
	int door;
	
	public Car(String name, int cylinder) {

		this.name = name;
		this.engine = true;
		this.cylinder = cylinder;
		this.wheels = 4;
		this.door = 4;
	}

	public String getName() {
		return name;
	}

	
	public int getCylinder() {
		return cylinder;
	}

	public String startEngine() {
		return "car => startEngine()";
	}
	
	public String accelerate() {
		return "accelereated => accelerate()";
	}
	
	public String breake() {
		return "Break => break()";
	}
	
}


class ToyotaCamary extends Car{

	public ToyotaCamary(String name, int cylinder) {
		super(name, cylinder);
		
	}

	@Override
	public String startEngine() {
		return "ToyotaCamary car => startEngine()";
	}

	@Override
	public String accelerate() {
		return "ToyotaCamary car => accelerate()";
	}

	@Override
	public String breake() {
		return "ToyotaCamary car => break()";
	}
	
	
	
}

public class Main {
	public static void main(String[] args) {
		Car car = new Car("BaseCar", 2);
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.breake());
		
		ToyotaCamary camary = new ToyotaCamary("LE", 4);
		System.out.println(camary.startEngine());
		System.out.println(camary.accelerate());
		System.out.println(camary.breake());
		
	}
}
