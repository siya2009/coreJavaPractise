package com.pratap.practise.compositionEx;

public class Main {
	public static void main(String[] args) {
		Wall wall1 = new Wall("East");
		Wall wall2 = new Wall("West");
		Wall wall3 = new Wall("North");
		Wall wall4 = new Wall("South");
		
		Ceeling ceeling = new Ceeling(12, 3);
		
		Bed bed = new Bed("Mordern", 4, 3, 2, 1);
		
		Lamp lamp = new Lamp("classic", false, 80);
		
		BedRoom bedroom = new BedRoom("Shashi's Bedroom", wall1, wall2, wall3, wall4, ceeling, bed, lamp);
		bedroom.makeBed();
		
		bedroom.getLamp().turnOn();
	}
}
