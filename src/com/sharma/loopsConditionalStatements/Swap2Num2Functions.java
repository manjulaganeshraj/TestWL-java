package com.sharma.loopsConditionalStatements;

import java.util.Scanner;

/*   Write a program that swaps 2 given numbers. You need to have 2 separate functions in the program.
 --> One Function should swap the numbers without any third new variable.
--> Second function should swap the numbers using a third variable.*/

public class Swap2Num2Functions {
	
	public static void swapFn1(int a, int b){
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap the numbers are "+a+" & "+b);
		
	}

	public static void swapFn2(int a , int b){
		 
		int x=0;
		x=a;
		a=b;
		b=x;
		System.out.println("After swap the numbers are "+a+" & "+b);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = scan.nextInt();
		System.out.println("Enter a number");
		int b = scan.nextInt();
		
		System.out.println("Before swap the numbers are "+a+" & "+b);
		
		swapFn1(a, b);
		
		swapFn2(a, b);
		
	}

}
