package com.sharma.strings;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter a string to check if it is a palindrome");
		String str = in.nextLine();

		String reverse = "";
		for ( int i = str.length() - 1; i >= 0; i-- )
			reverse = reverse + str.charAt(i);

		if (str.equals(reverse))
			System.out.println("Entered string is a palindrome.");
		else
			System.out.println("Entered string is not a palindrome.");
	}

}
