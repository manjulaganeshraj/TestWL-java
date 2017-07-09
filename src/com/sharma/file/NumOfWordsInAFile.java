package com.sharma.file;

// b. Write a program to count the number of words in a file.
//Hi.Good Morning. This is a sample input file stream program.

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumOfWordsInAFile {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("C:\\Users\\manju\\Desktop\\WBLInnovapath\\IOFiles\\input1.txt");
		try(Scanner sc = new Scanner(new FileInputStream(file))){
		    int count=1;
		    while(sc.hasNext()){
		        sc.next();
		        count++;
		    }
		System.out.println("Number of words: " + count);
		}
	}

}
