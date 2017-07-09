package com.sharma.oopsconcepts;

//Write a program creating an abstract class Shape with properties (noOfSides,area,perimeter) and methods(calculateArea,calculatePerimeter,setSides.
	
abstract class Shape {
	int noOfSides;
	double area;
	double perimeter;
	
	double calculateArea(int r)
	{
		return area;
	}
	
	double calculatePerimeter(int r)
	{
		return perimeter;
	}
	
	void setSides(int sides)
	{
		noOfSides = sides;
	}

	
}
