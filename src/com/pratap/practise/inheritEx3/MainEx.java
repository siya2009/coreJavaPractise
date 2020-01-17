package com.pratap.practise.inheritEx3;

public class MainEx {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5, 10);
		System.out.println("rectangle.width = "+rectangle.getWidth());
		System.out.println("rectangle.lenght = "+rectangle.getLength());
		System.out.println("rectangle.area = "+rectangle.getArea());
		Cuboid cuboid = new Cuboid(5, 10, 5);
		System.out.println("cuboid.widht = "+cuboid.getWidth());
		System.out.println("cuboid.length = "+cuboid.getLength());
		System.out.println("cuboid.area = "+cuboid.getArea());
		System.out.println("cuboid.height = "+cuboid.getHeight());
		System.out.println("cuboid.volume = "+cuboid.getVolume());
	}
}
