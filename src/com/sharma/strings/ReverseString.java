package com.sharma.strings;

import java.util.Scanner;
// Write a program to reverse a string.Donot use StringBuffer/StringBuilder inbuilt reverse function.
public class ReverseString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.nextLine();
		
		String revstr = "";
		for(int i=str.length()-1; i>0; i--){
			
			revstr += str.charAt(i);
		}
		
		System.out.println(revstr);
	}

}
