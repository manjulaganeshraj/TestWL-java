package com.sharma.loopsConditionalStatements;

import java.util.Scanner;

//Write a program print "ping" if a number is divisible by 3,"pong" if a number is divisible by 5, and "ping pong" if number is divisible by both, else print the number.

public class DivisibleBy3And5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
		if(((num%3)==0) && ((num%5)!=0)){
			System.out.println("Ping");
		}else if(((num%5)==0) && ((num%3)!=0)){
			System.out.println("Pong");
		}else if(((num%3)==0) && ((num%5)==0)){
			System.out.println("Ping Pong");
		}else
			System.out.println(num);
		
		
		
		
	}
}
