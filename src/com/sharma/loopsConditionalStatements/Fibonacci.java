package com.sharma.loopsConditionalStatements;

import java.util.Scanner;

//Write a program that prints a fibonaci series that is a sequence of numbers like0 1 1 2 3 5 8.You can vary the number of elements to be printed meaning you can print 10 numbers or 15 or 20 or any desired number

public class Fibonacci {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers you want to see for fibonacci series");
		int num = scan.nextInt();
		 
		int n1 = 0, n2 = 1, n3;
		System.out.print(n1+" "+n2);
		for(int i=0; i<num; i++){
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
		
		
		
	}

}
