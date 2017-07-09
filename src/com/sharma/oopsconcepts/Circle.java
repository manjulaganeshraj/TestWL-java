package com.sharma.oopsconcepts;

public class Circle extends Shape implements ShapeConstants {


	@Override
	 double calculateArea(int r) {

		System.out.println("Area of circle ");
		return pi*r*r;
	}

	@Override
	 double calculatePerimeter(int r) {

		System.out.println("Perimeter of circle");
		return 2*pi*r;
	}

	@Override
	void setSides(int sides) {
		System.out.println("Number of sides "+sides);
		super.setSides(sides);
	}

	public static void main(String[] args) {
		
		Circle c = new Circle();
		System.out.println(c.calculateArea(4));
		System.out.println(c.calculatePerimeter(5));
		c.setSides(1);
		
	}
}
