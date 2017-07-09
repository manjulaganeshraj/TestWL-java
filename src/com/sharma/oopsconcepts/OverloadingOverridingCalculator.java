package com.sharma.oopsconcepts;

public class OverloadingOverridingCalculator extends Calculator {

	public static void main(String[] args) {

		Calculator c =new Calculator();
		System.out.println("Sum of 2 integers from calculator class: "+c.sum(3, 6));
		OverloadingOverridingCalculator ooc = new OverloadingOverridingCalculator();
		System.out.println("Sum of 3 integers: "+ooc.sum(4, 5, 6));
		System.out.println("Sum of two decimal numbers: "+ooc.sum(4.6, 5.4));
		ooc.sum(3, 6.6);
		
	}

	@Override
	int sum(int a, int b){
		
		return a+b ;
	}
	
	int sum(int a, int b, int c){
		
		return a+b+c ;
	}
	
	double sum(double a, double b){
		
		return a+b;
	}
	
	void sum(int a, double b){
		System.out.println("Sum of one integer and one decimal number: "+a+b);
	}
}
