package com.sharma.strings;

import java.util.Scanner;

//Write a program to find a substring in a given string and then replace it with another string.
public class ReplaceSubString {

	public static void main(String[] args) {

		/*String str = "Hello World";
		System.out.println(str.replaceAll("He", "She"));*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.nextLine();
		System.out.println("Enter the substring to replace");
		String substr = scan.nextLine();
		System.out.println("Enter the replace word");
		String replaceWord = scan.nextLine();
		int startIval= 0;
		int endIval = 0;
		
		startIval = str.indexOf(substr);
		endIval = startIval+substr.length();
		str = str.substring(0, startIval)+replaceWord+str.substring(endIval);
		System.out.println(str);
	}

}
