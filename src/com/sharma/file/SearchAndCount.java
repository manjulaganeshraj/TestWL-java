package com.sharma.file;

// Write a program to search for a string in a file and then return the count of number of occurrences of the string
//input1 = Hi. Good Morning. This is a sample input file stream program.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchAndCount {

	public static void main(String[] args) throws FileNotFoundException {

		String word = "Sample";
		File file = new File("C:\\Users\\manju\\Desktop\\WBLInnovapath\\IOFiles\\input1.txt");
		System.out.println(countWord(word, file));
		
	}
	public static int countWord(String word, File file) throws FileNotFoundException {
		int count = 0;
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
		    String nextToken = scanner.next();
		    if (nextToken.equalsIgnoreCase(word))
		    count++;
		}
		return count;
		}
}
