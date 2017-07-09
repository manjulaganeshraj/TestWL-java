package com.sharma.loopsConditionalStatements;

import java.util.Scanner;

//Write a program  that accepts input from the command line and then prints them.

public class CommandLinePrint {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter some text");
		String txt = scan.next();
		
		System.out.println("You have entered "+txt);
		
	}

}
