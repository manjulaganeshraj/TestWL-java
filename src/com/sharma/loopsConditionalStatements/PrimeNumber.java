package com.sharma.loopsConditionalStatements;

import java.util.Scanner;

// Write a program  to check if a given number is prime or not.

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = scan.nextInt();

		int count=0;
		
		for(int i=2; i<=a/2; i++){
			if(a%i == 0){
				count=count+1;
			}
		}
			if(count==0){
				System.out.println("The number is prime");
			}else
			System.out.println("The number is not prime");
	}

}
