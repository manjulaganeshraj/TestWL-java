package com.sharma.file;
//Scanner: Use this class to input 2 integer numbers and sum them.
import java.util.Scanner;

public class ScannerEg {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 integers to calculate their sum");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a+b;
		System.out.println("The sum is "+c);
		
		
	}

}
