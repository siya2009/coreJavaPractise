package com.pratap.practise.inheritEx2;

public class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
		if (radius < 0) {
			this.radius = 0;
		}
	}

	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		double area = (this.radius * this.radius * Math.PI);
		return area;
	}
}
