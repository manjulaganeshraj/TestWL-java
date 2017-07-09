package com.sharma.loopsConditionalStatements;

import java.util.Scanner;

//Write a program  to calculate factorial of a given number. You need to compute the factorial with one logic that uses recursion and another logic without recursion.

public class FactorialFn1And2 {
	
	public static void factorial1(int a){
		
		int fact = 1;
		
		for(int i=1; i<=a; i++){
			fact = fact*i;
		}
		
		System.out.println("Factorial of "+a+" is "+fact);
	}
	
	public  static int factorial2(int a){
		
		int fact=1;
		
		if(a==1){
			return 1;
		}
		
		fact = factorial2(a-1)*a;
		
		return fact;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = scan.nextInt();
		
		factorial1(a);
		
		int f =factorial2(a);
		System.out.println("Factorial of "+a+" is "+f);

	}

}
