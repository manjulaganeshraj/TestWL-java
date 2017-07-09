package com.sharma.oopsconcepts;

public class ShapeConstantsInterface implements ShapeConstants {



	static double area(int r){
		System.out.println("Area of circle");
		return pi*r*r;
		
	}
	
	static double perimeter(int r){
		System.out.println("Perimeter of circle");
		return 2*pi*r;
	}
	
	public static void main(String[] args) {
		System.out.println(area(5));
		System.out.println(perimeter(5));
	}

}

